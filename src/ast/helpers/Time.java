package ast.helpers;

import java.util.Objects;

// 24 hour time of day
// TODO: check during evaluation that time is valid
public class Time implements Comparable{
    private final int hour;
    private final int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Time t) {
            return hour == t.getHour() && minute == t.getMinute();
        }
        return false;
    }

    // return a new Time object with value of this time + 5
    public Time incrementTime() {
        if (minute == 55) {
            if (hour == 23) {
                return new Time(0, 0);
            } else return new Time(this.hour + 1, 0);
        } else {
            return new Time(this.hour, this.minute + 5);
        }
    }

    public boolean greaterThan(Time t) {
        if (this.hour > t.hour) {
            return true;
        }
        return this.hour == t.hour && this.minute > t.minute;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String toString() {
        return hour + ":" + String.format("%02d", minute) + " ";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Time t) {
            if (hour < t.getHour()) {
                return -1;
            } else if (hour > t.getHour()) {
                return 1;
            } else {
                return Integer.compare(minute, t.getMinute());
            }
        }
        return -1;
    }
}

