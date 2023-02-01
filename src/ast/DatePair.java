package ast;

import ast.helpers.Date;

public class DatePair extends EventAttributePair {
    private final Date value;

    public DatePair(Date value) {
        this.value = value;
    }

    public Date getValue() {
        return value;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
