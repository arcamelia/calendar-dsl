package ast;

public class Is extends Condition {
    private final String alias;
    private final String attribute;
    private final Boolean not;
    private final String equals;

    public Is(String alias, String attribute, Boolean not, String equals) {
        this.alias = alias;
        this.attribute = attribute;
        this.not = not;
        this.equals = equals;
    }

    public String getAlias() {
        return alias;
    }

    public String getAttribute() {
        return attribute;
    }

    public Boolean getNot() {
        return not;
    }

    public String getEquals() {
        return equals;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
