package ast;

import ast.helpers.Date;
import ast.helpers.Time;

public class AtTime extends Node{
    Time time;
    Date date;

    public AtTime(Time time, Date date) {
        this.time = time;
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
