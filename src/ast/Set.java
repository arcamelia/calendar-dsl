package ast;

import java.time.*;
import ast.helpers.Date;
import ast.helpers.Time;
import java.time.LocalDateTime;

public class Set extends Statement {

    private final String alias;
    private final Date date;
    private final Time time;

    public Set(String alias, Date date, Time time) {
        this.alias = alias;
        this.date = date;
        this.time = time;
    }

    public String getAlias() {
        return this.alias;
    }

    public Date getDate() {
        return this.date;
    }

    public Time getTime() {
        return this.time;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
