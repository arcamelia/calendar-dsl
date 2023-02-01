package parser;

import ast.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import ast.helpers.Date;
import ast.helpers.Time;


import java.util.ArrayList;
import java.util.List;

public class ParseTreeToAST extends CalendarParserBaseVisitor<Node> {
    @Override
    public Program visitProgram(CalendarParser.ProgramContext ctx) {
        List<Event> events = new ArrayList<>();
        List<Statement> statements = new ArrayList<>();
        for (CalendarParser.EventDecContext e : ctx.events().eventDec()) {
            events.add((Event) e.accept(this));
        }
        for (CalendarParser.StatementContext s : ctx.schedule().statement()) {
            statements.add((Statement) s.accept(this));
        }
        return new Program(statements, events);
    }

    @Override
    public Statement visitStatement(CalendarParser.StatementContext ctx) {
        return (Statement) visitChildren(ctx);
    }

    @Override
    public Event visitEventDec(CalendarParser.EventDecContext ctx) {
        Integer minutes = convertToMinutes(ctx.eventDuration().DURATION_VAL().getText());
        Event e = new Event(ctx.ALIAS().getText(), ctx.eventName().TEXT().getText(), minutes);
        if (ctx.eventLocationOrDescription() != null) {
            if (ctx.eventLocationOrDescription().eventDescription() != null) {
                e.setDescription(ctx.eventLocationOrDescription().eventDescription().TEXT().getText());
            } else {
                e.setLocation(ctx.eventLocationOrDescription().eventLocation().TEXT().getText());
            }
        }
        return e;
    }

    @Override
    public Set visitSetStatement(CalendarParser.SetStatementContext ctx) {
        Date date = convertToDate(ctx.DATE().getText());
        Time time = convertToTime(ctx.TIME().getText());
        return new Set(ctx.ALIAS().getText(), date, time);
    }

    @Override
    public Repeat visitRepeatStatement(CalendarParser.RepeatStatementContext ctx) {
        CalendarParser.TimeframeContext frame = ctx.timeframe();
        List<String> timeFrame = new ArrayList<>();
        List<TerminalNode> day;
        boolean weekOrDay;

        if (!frame.DAY_OF_WEEK().isEmpty()) {
            day = frame.DAY_OF_WEEK();
            weekOrDay = true; //originally false
        } else {
            day = frame.DAY();
            weekOrDay = false; //originally true
        }
        for (TerminalNode s: day) {
            timeFrame.add(s.getText());
        }

        Date date = convertToDate(ctx.DATE().getText());

        return new Repeat(ctx.ALIAS().getText(), timeFrame, date, weekOrDay);
    }

    @Override
    public TimeFrame visitTimeframe(CalendarParser.TimeframeContext ctx) {
        //TODO
        List<TerminalNode> test = ctx.DAY();
        return null;
    }

    @Override
    public Change visitChangeStatement(CalendarParser.ChangeStatementContext ctx) {
        String alias = ctx.ALIAS().getText();
        EventAttributePair attributePair = (EventAttributePair) visit(ctx.eventAttributePair());
        return new Change(alias, attributePair);
    }

    @Override
    public EventAttributePair visitEventAttributePair(CalendarParser.EventAttributePairContext ctx) {
        return (EventAttributePair) visitChildren(ctx);
    }

    @Override
    public NamePair visitNamePair(CalendarParser.NamePairContext ctx) {
        String value = ctx.TEXT().getText();
        return new NamePair(value);
    }

    @Override
    public DurationPair visitDurationPair(CalendarParser.DurationPairContext ctx) {
        int value = convertToMinutes(ctx.DURATION_VAL().getText());
        return new DurationPair(value);
    }

    @Override
    public DescriptionPair visitDescriptionPair(CalendarParser.DescriptionPairContext ctx) {
        String value = ctx.TEXT().getText();
        return new DescriptionPair(value);    }

    @Override
    public LocationPair visitLocationPair(CalendarParser.LocationPairContext ctx) {
        String value = ctx.TEXT().getText();
        return new LocationPair(value);    }

    @Override
    public DatePair visitDatePair(CalendarParser.DatePairContext ctx) {
        Date value = convertToDate(ctx.DATE().getText());
        return new DatePair(value);
    }

    @Override
    public TimePair visitTimePair(CalendarParser.TimePairContext ctx) {
        Time value = convertToTime(ctx.TIME().getText());
        if (ctx.DATE() != null) {
            Date onDate = convertToDate(ctx.DATE().getText());
            return new TimePair(value, onDate);
        }
        return new TimePair(value);
    }

    @Override
    public Put visitPutStatement(CalendarParser.PutStatementContext ctx) {
            Date date = convertToDate(ctx.DATE().getText());
            List<Place> placeList = new ArrayList<>();
            for (CalendarParser.PlaceStatementContext p : ctx.placeStatement()){
                placeList.add(visitPlaceStatement(p));
            }
            return new Put(ctx.ALIAS().getText(), date, placeList);
    }

    @Override
    public Place visitPlaceStatement(CalendarParser.PlaceStatementContext ctx) {
        Time time = convertToTime(ctx.TIME().getText());
        if(ctx.putStatement() != null){
            return new Place(ctx.ALIAS().getText(), time, visitPutStatement(ctx.putStatement()));
        }
        return new Place(ctx.ALIAS().getText(), time, null);
    }

    @Override
    public If visitIfStatement(CalendarParser.IfStatementContext ctx) {
        List<Condition> conditions = new ArrayList<>();
        for (CalendarParser.ConditionContext c: ctx.condition()) {
            conditions.add((Condition) c.accept(this));
        }

        List<String> andOrs = new ArrayList<>();
        for (CalendarParser.AndorContext a : ctx.andor()) {
            if(a.AND() != null) {
                andOrs.add("and");
            } else {
                andOrs.add("or");
            }
        }

        List<Statement>  statements = new ArrayList<>();
        for (CalendarParser.StatementContext s: ctx.statement()) {
            statements.add((Statement) s.accept(this));
        }
        Else e = null;
        if (ctx.elseStatement() != null) {
            e = (Else) ctx.elseStatement().accept(this);
        }
        return new If(conditions, andOrs, statements, e);
    }

    @Override
    public Else visitElseStatement(CalendarParser.ElseStatementContext ctx) {
        List<Statement>  statements = new ArrayList<>();
        for (CalendarParser.StatementContext s: ctx.statement()) {
            statements.add((Statement) s.accept(this));
        }
        return new Else(statements);
    }

    @Override
    public Is visitIsStatement(CalendarParser.IsStatementContext ctx) {
        boolean not = ctx.IS_NOT() != null;
        return new Is(ctx.ALIAS().getText(), ctx.EVENT_ATTRIBUTE().getText(), not, ctx.TEXT().getText());
    }

    @Override
    public TimeCondition visitTimeStatement(CalendarParser.TimeStatementContext ctx) {
        boolean not = ctx.NOT() != null;

        if(ctx.atTimeStatement() != null) {
            return new TimeCondition(not, (AtTime) ctx.atTimeStatement().accept(this), null);
        } else {
            return new TimeCondition(not, null, (BetweenTime) ctx.betweenStatement().accept(this));
        }
    }

    @Override
    public AtTime visitAtTimeStatement(CalendarParser.AtTimeStatementContext ctx) {
        return new AtTime(convertToTime(ctx.TIME().getText()), convertToDate(ctx.DATE().getText()));
    }

    @Override
    public BetweenTime visitBetweenStatement(CalendarParser.BetweenStatementContext ctx) {
        return new BetweenTime(convertToTime(ctx.TIME().get(0).getText()), convertToTime(ctx.TIME().get(1).getText()), convertToDate(ctx.DATE().getText()));
    }

    @Override
    public Condition visitCondition(CalendarParser.ConditionContext ctx) {
        return (Condition) visitChildren(ctx);
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
}
