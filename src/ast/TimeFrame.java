package ast;

public class TimeFrame extends Statement{
    private final String day;
    private final String weekDay;

    public TimeFrame(String day, String weekDay) {
        this.day = day;
        this.weekDay = weekDay;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
