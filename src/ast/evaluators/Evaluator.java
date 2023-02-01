package ast.evaluators;

import ast.*;
import ast.helpers.Date;
import ast.helpers.Time;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.format.DateTimeFormatter;

public class Evaluator implements CalendarVisitor<StringBuilder, Integer> {

    /** valid events that have been declared and can be added to schedule */
    Map<String, Event> events = new HashMap<>();

    /** output of the program
     *  -> time is in 5 min increments
     *  -> String is the event alias, so we can look it up in the events map
     */
    Map<Date, Map<Time, ArrayList<String>>> schedule = new HashMap<>();

    /** events that have been added to the schedule, in a list for convenient lookup validation */
    ArrayList<String> addedEvents = new ArrayList<>();

    /** the dates and times of events that have been set */
    Map<String, Date> setDate = new HashMap<>();
    Map<String, Time> setTime = new HashMap<>();
    @Override
    public Integer visit(StringBuilder errors, Program p) {
        for (Event e: p.getEvents()) {
            e.accept(errors, this);
            if(!errors.isEmpty()) {
                break;
            }
        }
        for (Statement s : p.getStatements()) {
            s.accept(errors,this);
            if(!errors.isEmpty()) {
                break;
            }
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Event e) {
        String alias = e.getAlias();
        Integer minutes = e.getMinutes();
        if (events.containsKey(alias)) {
            errors.append("Attempt to create event with alias ").append(alias).append(" that already exists. ");
        } else {
            if (minutes % 5 != 0) {
                errors.append("Event ").append(alias).append(" has duration ").append(minutes).append(" that is not a multiple of 5. Skipping this event creation. \n");
            } else {
                events.put(alias, e);
            }
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Set s) {
        if (!events.containsKey(s.getAlias())) {
            errors.append("Event with ").append(s.getAlias()).append(" does not exists. \n");
        } else {
           Event event = events.get(s.getAlias());
//           if (!schedule.containsKey(s.getDate())) {
//               Map<Time, ArrayList<String>> map = new HashMap<>();
//               schedule.put(s.getDate(), map);
//               setDate.put(s.getAlias(), s.getDate());
//           }
           Time currentTime = s.getTime();
           Date currentDate = s.getDate();
           for (int i = 0; i < (event.getMinutes() / 5) ; i++) {
               if (!schedule.containsKey(currentDate)) {
                   Map<Time, ArrayList<String>> map = new HashMap<>();
                   schedule.put(currentDate, map);
                   setDate.put(s.getAlias(), currentDate);
               }
               if (!schedule.get(currentDate).containsKey(currentTime)) {
                   ArrayList<String> scheduleList = new ArrayList<>();
                   schedule.get(currentDate).put(currentTime, scheduleList);
               }
               schedule.get(currentDate).get(currentTime).add(s.getAlias());
               currentTime = currentTime.incrementTime();
               Time midnight = new Time(0, 0);
               if (currentTime.equals(midnight)) {
                   currentDate = currentDate.incrementDate();
               }
           }
        }
        addedEvents.add(s.getAlias());
        setTime.put(s.getAlias(), s.getTime());
        events.get(s.getAlias()).setEventTime(s.getTime());
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Repeat r) {
        if (!addedEvents.contains(r.getAlias())) {
            errors.append("Event with ").append(r.getAlias()).append(" has not been set. \n");
        } else {
            Event event = events.get(r.getAlias());
            List<String> timeframe = r.getTimeframe();
            LocalDate currentDate = convertToLocalDate(setDate.get(r.getAlias())).plusDays(1);
            Time currentTime = setTime.get(r.getAlias());
            Time originalTime = setTime.get(r.getAlias());

            while (!currentDate.equals(convertToLocalDate(r.getEndDate()))) {
                String dayOrDate = (dayOrDate(r.getDay(), currentDate).toLowerCase());
                String titleCasedDayOrDate = dayOrDate.substring(0,1).toUpperCase() + dayOrDate.substring(1);
                if (timeframe.contains(titleCasedDayOrDate)) {
                    if (!schedule.containsKey(convertFromLocalDate(currentDate))) {
                        Map<Time, ArrayList<String>> map = new HashMap<>();
                        schedule.put(convertFromLocalDate(currentDate), map);
                    }
                    for (int i = 0; i < (event.getMinutes() / 5) ; i++) {
                        Date convertedDate = convertFromLocalDate(currentDate);
                        Map<Time, ArrayList<String>> times = schedule.get(convertedDate);
                        if (!schedule.get(convertFromLocalDate(currentDate)).containsKey(currentTime)) {
                            ArrayList<String> scheduleList = new ArrayList<>();
                            schedule.get(convertFromLocalDate(currentDate)).put(currentTime, scheduleList);
                        }
                        schedule.get(convertFromLocalDate(currentDate)).get(currentTime).add(r.getAlias());
                        currentTime = currentTime.incrementTime();
                    }
                }
                currentDate = currentDate.plusDays(1);
                currentTime = originalTime;
            }

            events.get(r.getAlias()).setRepeatTrue();
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, TimeFrame t) {
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, If i) {
        int finalEval = i.getConditions().get(0).accept(errors, this);

        for (int c = 1; c < i.getConditions().size(); c++) {
            String andOr = i.getAndOrs().get(c-1);
            if ((finalEval == 0 && andOr.equals("and")) || (finalEval == 1 && andOr.equals("or"))) {
                break;
            }
            finalEval = i.getConditions().get(c).accept(errors, this);
        }
        if(finalEval == 1) {
            for (Statement s : i.getThen()) {
                s.accept(errors,this);
            }
        } else if (i.getElseNode() != null){
            i.getElseNode().accept(errors, this);
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Else el) {
        for (Statement s : el.getStatements()) {
            s.accept(errors,this);
        }
        return null;
    }

    // 0 = false 1 = true
    @Override
    public Integer visit(StringBuilder errors, TimeCondition t) {
        int i;
        if(t.getAtTime() != null) {
            i = t.getAtTime().accept(errors,this);
        } else {
            i = t.getBetweenTime().accept(errors,this);
        }

        if (t.getNot()) {
            if (i==1) {
                i = 0;
            } else {
                i = 1;
            }
        }
        return i;
    }

    // 0 = false 1 = true
    @Override
    public Integer visit(StringBuilder context, Is is) {
        String attribute = is.getAttribute();
        Event e = events.get(is.getAlias());
        if (e == null) {
            if (is.getNot()) {
                return 1;
            }
            return 0;
        }
        //'name' | 'duration' | 'location'| 'description'
        switch (attribute) {
            case "name":
                if (e.getName().equals(is.getEquals())) {
                    if (is.getNot()) {
                        return 0;
                    }
                    return 1;
                }
                break;
            case "duration":
                int duration = convertToMinutes(is.getEquals());
                if (e.getMinutes() == duration) {
                    if (is.getNot()) {
                        return 0;
                    }
                    return 1;
                }
                break;
            case "location":
                if (e.getLocation().equals(is.getEquals())) {
                    if (is.getNot()) {
                        return 0;
                    }
                    return 1;
                }
                break;
            default:
                if (e.getDescription().equals(is.getEquals())) {
                    if (is.getNot()) {
                        return 0;
                    }
                    return 1;
                }
                break;
        }
        if (is.getNot()) {
            return 1;
        }
        return 0;
    }

    @Override
    public Integer visit(StringBuilder context, BetweenTime b) {
        //TODO
        Date d = b.getDate();
        Map<Time, ArrayList<String>> m = schedule.get(d);
        if (m == null) {
            return 0;
        }
        Time t = b.getStart();
        while(!t.equals(b.getFinish())) {
            ArrayList<String> alias = m.get(t);
            if (alias == null) {
                return 1;
            }
            t = t.incrementTime();
        }
        return 0;
    }

    @Override
    public Integer visit(StringBuilder errors, Change c) {
        String alias = c.getAlias();
        if (!addedEvents.contains(alias)) {
            errors.append("Attempt to change event ").append(alias).append(" that doesn't exist.\n");
        } else {
            EventAttributePair attributePair = c.getAttributePair();
            attributePair.setAlias(alias);
            attributePair.accept(errors, this);
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, DatePair dp) {
        String alias = dp.getAlias();
        Event event = events.get(alias);
        Date newDate = dp.getValue();
        if (event.getRepeatFlag()) {
            errors.append("Attempt to change date of event ").append(alias).append(" that is a repeating event.\n");
        } else if (!isValidDate(newDate)) {
            errors.append("Attempt to change event ").append(alias).append(" to date ").append(newDate.getDay())
                    .append("/").append(newDate.getMonth()).append("/").append(newDate.getYear())
                    .append(" that is invalid. Event date will not be changed.\n");
        } else {
            // remove all old entries of alias instance in schedule
            Time startTime = removeAllEntriesInSchedule(alias);
            // add all new entries of alias instance in schedule
            setEntriesInSchedule(alias, newDate, startTime, event.getMinutes());
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, DescriptionPair dp) {
        String alias = dp.getAlias();
        Event event = events.get(alias);
        event.setDescription(dp.getValue());
        events.put(alias, event);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, DurationPair dp) {
        String alias = dp.getAlias();
        int newDuration = dp.getValue();
        if (newDuration % 5 != 0) {
            errors.append("Attempt to change event ").append(alias).append(" to duration ").append(newDuration)
                    .append(" that is not a multiple of 5. Event duration will not be changed.\n");
        }
        else {
            Event event = events.get(alias);
            int oldDuration = event.getMinutes();
            event.setMinutes(newDuration);
            events.put(alias, event);

            int numOldIncrements = oldDuration / 5;
            int numNewIncrements = newDuration / 5;

            // new duration > old duration
            if (numNewIncrements > numOldIncrements) {
                setExtraNewEntries(alias, numOldIncrements, numNewIncrements);
            }
            // new duration < old duration
            else if (numNewIncrements < numOldIncrements) {
                removeExtraOldEntries(alias, numOldIncrements, numNewIncrements);
            }
            // if new duration == old duration do nothing
        }
        return null;
    }

    // helper function for visiting a DurationPair (CHANGE statement)
    private void setExtraNewEntries(String alias, int numOldIncrements, int numNewIncrements) {
        int currIncrements = 0;
        for (Date currDate : schedule.keySet()) {
            Map<Time,ArrayList<String>> timeMap = schedule.get(currDate);
            for (Time currTime : timeMap.keySet()) {
                ArrayList<String> currAliases = timeMap.get(currTime);
                if (currAliases.contains(alias)) {
                    currIncrements++;
                    // once we've hit the last old entry, we need to add the new extra ones
                    if (currIncrements == numOldIncrements) {
                        setEntriesInSchedule(alias, currDate, currTime.incrementTime(), (numNewIncrements - numOldIncrements) * 5);
                    }
                }
            }
        }
    }

    // helper function for visiting a DurationPair (CHANGE statement)
    private void removeExtraOldEntries(String alias, int numOldIncrements, int numNewIncrements) {
        int currIncrements = 0;
        for (Date currDate : schedule.keySet()) {
            Map<Time,ArrayList<String>> timeMap = schedule.get(currDate);
            for (Time currTime : timeMap.keySet()) {
                ArrayList<String> currAliases = timeMap.get(currTime);
                if (currAliases.contains(alias)) {

                    // once we've hit the last new entry, we need to remove the old extra ones
                    if (currIncrements == numNewIncrements) {
                        Time time = currTime;
                        int entriesToNextHour = (60 - time.getMinute()) / 5;
                        int entriesLeft = numOldIncrements - numNewIncrements;

                        // event bleeds onto next day
                        if (time.getHour() == 23 && entriesToNextHour < entriesLeft) {
                            // remove as many entries as possible today
                            removeEntries(timeMap, alias, time, entriesToNextHour);
                            // remove rest of entries tomorrow
                            time = new Time(0, 0);
                            timeMap = schedule.get(currDate.incrementDate());
                            removeEntries(timeMap, alias, time, entriesLeft - entriesToNextHour);
                        }
                        // default case
                        else {
                            removeEntries(timeMap, alias, time, numOldIncrements - currIncrements);
                        }
                    }
                    currIncrements++;
                }
            }
        }
    }



    @Override
    public Integer visit(StringBuilder errors, LocationPair lp) {
        String alias = lp.getAlias();
        Event event = events.get(alias);
        event.setLocation(lp.getValue());
        events.put(alias, event);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, NamePair np) {
        String alias = np.getAlias();
        Event event = events.get(alias);
        event.setName(np.getValue());
        events.put(alias, event);
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, TimePair tp) {
        String alias = tp.getAlias();
        Date onDate = tp.getOnDate();
        Time newTime = tp.getValue();
        int duration = events.get(alias).getMinutes();
        if (!isValidTime(newTime)) {
            errors.append("Attempt to change event ").append(alias).append(" to time ").append(newTime.getHour()).append(":")
                    .append(newTime.getMinute()).append(" that is invalid. Event time will not be changed.\n");
        } else if (onDate == null) {
            // there might be multiple instances of the event in the schedule
            findEntriesRemoveThenSet(alias, newTime, duration);
        } else {
            // an onDate has been specified; there's only one event instance in the schedule to look for
            removeEntriesInScheduleOnDate(alias, onDate);
            setEntriesInSchedule(alias, onDate, newTime, duration);
        }
        return null;
    }

    // traverse the schedule until we find an event that matches the alias
    // when we find an event that matches the alias, remove all the entries and set the new ones
    private void findEntriesRemoveThenSet(String alias, Time newTime, int duration) {
        List<Date> dateInstances = new ArrayList<>();
        int durationSoFar = 0;
        for (Date currDate : schedule.keySet()) {
            Map<Time,ArrayList<String>> timeMap = schedule.get(currDate);
            for (Time currTime : timeMap.keySet()) {
                ArrayList<String> currAliases = timeMap.get(currTime);

                if (currAliases.contains(alias)) {
                    // this is the first time we've seen an entry in this event instance, add its date to our list
                    if (durationSoFar == 0) {
                        dateInstances.add(currDate);
                    }
                    durationSoFar += 5;
                    // this is the last entry for this event instance, reset the count for the next instance
                    if (durationSoFar == duration) {
                        durationSoFar = 0;
                    }
                }
            }
        }

        // change all event instances to the new time
        for (Date date : dateInstances) {
            removeEntriesInScheduleOnDate(alias, date);
            setEntriesInSchedule(alias, date, newTime, duration);
        }
    }

    // helper function for visiting a DatePair (CHANGE statement)
    // returns the time the event starts at
    private Time removeAllEntriesInSchedule(String alias) {
        Time startTime = null;
        for (Date currDate : schedule.keySet()) {
            Map<Time,ArrayList<String>> timeMap = schedule.get(currDate);
            for (Time currTime : timeMap.keySet()) {
                ArrayList<String> currAliases = timeMap.get(currTime);
                if (currAliases.contains(alias)) {
                    currAliases.remove(alias);
                    if (currAliases.size() == 0) {
                        timeMap.remove(currTime);
                    }

                    // initialize startTime
                    if (startTime == null) {
                        startTime = currTime;
                    }
                }
            }
        }
        return startTime;
    }

    // helper function for visiting a TimePair (CHANGE statement)
    // remove all entries in the schedule with given alias on given date
    private void removeEntriesInScheduleOnDate(String alias, Date onDate) {
        Map<Time,ArrayList<String>> timeMap = schedule.get(onDate);
        removeAllEntries(timeMap, alias);
        // also check next day in case event bleeds into next day
        timeMap = schedule.get(onDate.incrementDate());
        removeAllEntries(timeMap, alias);
    }

    // helper function for removing entries from a Map< Time, ArrayList<String> >
    private void removeAllEntries(Map<Time,ArrayList<String>> timeMap, String alias) {
        if (timeMap == null) {
            return;
        }
        for (Time currTime : timeMap.keySet()) {
            ArrayList<String> currAliases = timeMap.get(currTime);
            currAliases.remove(alias);
            // set empty list values as null to indicate that they should be removed
            if (currAliases.size() == 0) {
                timeMap.put(currTime, null);
            }
        }
        // remove empty times
        while (timeMap.values().remove(null));
    }
    // remove given alias from numTimes entries in timeMap starting at startTime
    private void removeEntries(Map<Time,ArrayList<String>> timeMap, String alias, Time startTime, int numTimes) {
        Time time = startTime;
        for (int i = 0; i < numTimes; i++) {
            ArrayList<String> currAliases = timeMap.get(time);
            currAliases.remove(alias);
            if (currAliases.size() == 0) {
                timeMap.remove(time);
            }
            time = time.incrementTime();
        }
    }

    // helper function for visiting a TimePair (CHANGE statement)
    // adds entries for event with given alias on given date at given startTime for given duration
    private void setEntriesInSchedule(String alias, Date onDate, Time startTime, int duration) {
        Event event = events.get(alias);
        Time time = startTime;
        Map<Time,ArrayList<String>> timeMap = schedule.get(onDate);
        int numEntries = duration / 5;
        int entriesToNextHour = (60 - startTime.getMinute()) / 5;

        // event bleeds onto next day
        if (startTime.getHour() == 23 && entriesToNextHour < numEntries) {
            // set as many entries as possible today
            putEntries(timeMap, alias, startTime, entriesToNextHour);
            // set rest of entries tomorrow
            timeMap = schedule.get(onDate.incrementDate());
            for (int i = 0; i < entriesToNextHour; i++) {
                time = time.incrementTime();
            }
            time = new Time(0, 0);
            putEntries(timeMap, alias, time, numEntries - entriesToNextHour);
        }

        // default case
        else {
            putEntries(timeMap, alias, startTime, numEntries);
        }
    }

    // helper function for putting entries into a Map< Time, ArrayList<String> >
    private void putEntries(Map<Time,ArrayList<String>> timeMap, String alias, Time startTime, int numEntries) {
        Time time = startTime;
        for (int i = 0; i < numEntries; i++) {
            ArrayList<String> toPut = timeMap.get(time);
            if (toPut == null) {
                toPut = new ArrayList<>();
            }
            toPut.add(alias);
            timeMap.put(time, toPut);
            time = time.incrementTime();
        }
    }

    private boolean isValidTime(Time time) {
        return time.getHour() >= 0 && time.getHour() <= 23 && time.getMinute() >= 0 && time.getMinute() <= 59;
    }

    private boolean isValidDate(Date date) {
        // todo
        return true;
    }

    @Override
    public Integer visit(StringBuilder errors, Put p) {
        String alias = p.getAlias();
        Date date = p.getEndDate();
        Event e = events.get(alias);
        if (!events.containsKey(alias)) {
            errors.append("Attempted to use Put feature on non-existent event alias ").append(alias).append(". Try again with different alias.\n");
        }

        if (!schedule.containsKey(date) || !schedule.get(date).get(e.getEventTime()).contains(alias)) { // check if schedule has event corresponding to date; error if not
            errors.append("Attempted to use Put feature on unscheduled event.\n");
        }

        // set up Places
        for (Place pl : p.getPlaceList()) {
            pl.setParentTime(e.getEventTime());
            pl.setParentDate(date);
            pl.setParentAlias(alias);
            pl.accept(errors, this);
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder errors, Place pl) {
        Time parentTime = events.get(pl.getParentAlias()).getEventTime();
        Time time = pl.getTime();
        int parentStartTime = (parentTime.getHour() * 60) + parentTime.getMinute();
        int parentEndTime = parentStartTime + events.get(pl.getParentAlias()).getMinutes();
        int startTime = (time.getHour() * 60) + time.getMinute();
        int endTime = startTime + events.get(pl.getAlias()).getMinutes();

        if (startTime < parentStartTime || endTime > parentEndTime){
            errors.append("Sub-event with alias ").append(pl.getAlias()).append(" has out of bounds time.\n");
        } else {
            int duration = events.get(pl.getAlias()).getMinutes();
            schedule.get(pl.getParentDate()).get(time).add(pl.getAlias());
            for (int i = 1; i < duration/5; i++){
                time = time.incrementTime();
                schedule.get(pl.getParentDate()).get(time).add(pl.getAlias());
            }
            events.get(pl.getAlias()).setEventTime(pl.getTime());
            if (pl.getPut() != null){
                Put p = pl.getPut();
                p.accept(errors, this);
            }
        }
        return null;
    }

    @Override
    public Integer visit(StringBuilder context, AtTime a) {
        Date d = a.getDate();
        Map<Time, ArrayList<String>> m = schedule.get(d);
        if (m == null) {
            return 1;
        }
        ArrayList<String> alias = m.get(a.getTime());
        if (alias == null) {
            return 1;
        } else {
            return 0;
        }
    }
    public LocalDateTime convertDateTime(String date, String time) {
        // Helper to convert our parsed out dates and times from strings to LocalDateTime
        return null;
    }

    // Given a string like 1h 10m, convert to 70
    private int convertToMinutes(String duration) {
        String[] arrOfStr = duration.split(" ");
        int hours = Integer.parseInt(arrOfStr[0].substring(0, arrOfStr[0].length() - 1));
        int minutes = Integer.parseInt(arrOfStr[1].substring(0, arrOfStr[1].length() - 1));
        return hours * 60 + minutes;
    }

    // Given a string DD/MM/YYYY, convert to Date class
    private Date convertToDate(String date) {
        String[] dateVals = date.split("/");
        int day = Integer.parseInt(dateVals[0]);
        int month = Integer.parseInt(dateVals[1]);
        int year = Integer.parseInt(dateVals[2]);
        return new Date(day, month, year);
    }

    // Given a string HH:MM, convert to Time class
    private Time convertToTime(String time) {
        String[] timeVals = time.split(":");
        int hour = Integer.parseInt(timeVals[0]);
        int minute = Integer.parseInt(timeVals[1]);
        return new Time(hour, minute);
    }

    //Given a Date convert to LocalDate class
    private LocalDate convertToLocalDate (Date date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String day = "";
        String month = "";
        if (date.getDay() <= 9) {
            day = "0" + String.valueOf((date.getDay()));
        } else {
            day = String.valueOf((date.getDay()));
        }
        if (date.getMonth() <= 9) {
            month = "0" + String.valueOf((date.getMonth()));
        } else {
            month = String.valueOf((date.getMonth()));
        }
        String d = day + '/' + month + '/' + String.valueOf(date.getYear());
        return LocalDate.parse(d, dateFormatter);
    }

    //Given a LocalDate convert to Date class
    private Date convertFromLocalDate (LocalDate date) {
        return new Date(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    private String dayOrDate (boolean check, LocalDate date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (check) {
            return date.getDayOfWeek().toString();
        }
        return date.format(dateFormatter);
    }

    public Map<Date, Map<Time, ArrayList<String>>> getSchedule() {
        return schedule;
    }

    public Map<String, Event> getEvents() {
        return events;
    }
    public List<String> getAddedEvents() {
       return addedEvents;
    }
}
