package ast;

public class Change extends Statement {
    private final String alias;
    private final EventAttributePair attributePair;

    public Change (String alias, EventAttributePair attributePair) {
        this.alias = alias;
        this.attributePair = attributePair;
    }

    public String getAlias() {
        return alias;
    }

    public EventAttributePair getAttributePair() {
        return attributePair;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
