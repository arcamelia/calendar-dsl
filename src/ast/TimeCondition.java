package ast;

public class TimeCondition extends Condition {
    Boolean not;
    AtTime atTime;
    BetweenTime betweenTime;

    public TimeCondition(Boolean not, AtTime atTime, BetweenTime betweenTime) {
        this.not = not;
        this.atTime = atTime;
        this.betweenTime = betweenTime;
    }

    public Boolean getNot() {
        return not;
    }

    public AtTime getAtTime() {
        return atTime;
    }

    public BetweenTime getBetweenTime() {
        return betweenTime;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
