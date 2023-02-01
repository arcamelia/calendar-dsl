package ast;

public class LocationPair extends EventAttributePair {

    public String getValue() {
        return value;
    }

    private final String value;

    public LocationPair(String value) {
        this.value = value;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
