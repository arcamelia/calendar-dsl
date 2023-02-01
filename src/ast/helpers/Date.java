package ast.helpers;

import java.util.Objects;

public class Date {
    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Date d) {
            return day == d.getDay() && month == d.getMonth() && year == d.getYear();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    // return a new Date object with this date + 1
    public Date incrementDate() {
        // december 31st
        if (month == 12 && day == 31) {
            return new Date(1, 1, year + 1);
        }
        // february 28th
        if (day == 28 && month == 2) {
            return new Date(1, 3, year);
        }
        // april, june, september, november 30th
        if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return new Date(1, month + 1, year);
        }
        // january, march, may, july, august, october 31st
        if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 10)) {
            return new Date(1, month + 1, year);
        }
        // default case
        return new Date(day + 1, month, year);
    }

    public String toString() {
        return "\n" + month + "/" + day + "/" + year + "\n";
    }
}
