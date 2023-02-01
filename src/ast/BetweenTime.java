package ast;

import ast.CalendarVisitor;
import ast.Node;
import ast.helpers.Date;
import ast.helpers.Time;

public class BetweenTime extends Node {
    Time start;
    Time finish;
    Date date;

    public BetweenTime(Time start, Time finish, Date date) {
        this.start = start;
        this.finish = finish;
        this.date = date;
    }

    public Time getStart() {
        return start;
    }

    public Time getFinish() {
        return finish;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
