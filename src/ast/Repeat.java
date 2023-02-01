package ast;
import java.util.List;
import java.time.*;
import ast.helpers.Date;

public class Repeat extends Statement {
    private final String alias;
    private final List<String> timeframe;
    private final Date endDate;
    private final Boolean day;

    public Repeat(String alias, List<String> timeframe, Date endDate, Boolean day) {
        this.alias = alias;
        this.timeframe = timeframe;
        this.endDate = endDate;
        this.day = day;
    }

    public String getAlias() {
        return this.alias;
    }

    public List<String> getTimeframe() {
        return this.timeframe;
    }

    public Date getEndDate() {return this.endDate;}

    public Boolean getDay () {return this.day;}

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
