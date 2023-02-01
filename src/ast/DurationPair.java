package ast;

public class DurationPair extends EventAttributePair {

    private final int value;

    public DurationPair(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
