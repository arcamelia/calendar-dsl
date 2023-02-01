package ast;
import ast.helpers.Date;
import ast.helpers.Time;

public class Place extends Statement {
    private final String alias;
    private final Time time;
    private Time parentTime;
    private Date parentDate;
    private String parentAlias;
    private Put put;

    public Place (String alias, Time time, Put p) {
        this.alias = alias;
        this.time = time;
        this.parentTime = new Time(0,0);
        this.parentDate = new Date(0,0,0);
        this.parentAlias = "";
        this.put = p;
    }

    public String getAlias() {
        return this.alias;
    }

    public Time getTime() {
        return this.time;
    }

    public Put getPut() {return this.put;}

    public void setParentTime(Time value) {
        this.parentTime = value;
    }

    public Time getParentTime(){
        return this.parentTime;
    }

    public void setParentDate(Date value) {
        this.parentDate = value;
    }

    public Date getParentDate(){
        return this.parentDate;
    }

    public void setParentAlias(String value){
        this.parentAlias = value;
    }

    public String getParentAlias(){
        return this.parentAlias;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
