package ast;

public class NamePair extends EventAttributePair {

    private final String value;

    public NamePair(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
