package ast;

import ast.helpers.Date;
import ast.helpers.Time;

public class TimePair extends EventAttributePair {

    private final Time value;
    private final Date onDate;

    public TimePair(Time value) {
        this.value = value;
        this.onDate = null;
    }

    // overloaded constructor for optional date
    // todo: during evaluation, check that onDate is a valid date for the event
    public TimePair(Time value, Date onDate) {
        this.value = value;
        this.onDate = onDate;
    }

    public Time getValue() {
        return value;
    }

    public Date getOnDate() {
        return onDate;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
