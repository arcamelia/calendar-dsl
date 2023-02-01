package ast;

import ast.helpers.Time;
public class Event extends Node{
    private String alias;
    private String name;
    private Integer minutes;
    private String location;
    private String description;
    private Boolean repeatFlag = false;
    private Time eventTime;

    public Event(String alias, String name, Integer minutes) {
        this.alias = alias;
        this.name = name;
        this.minutes = minutes;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRepeatTrue() {
        this.repeatFlag = true;
    }

    public Boolean getRepeatFlag() {
        return this.repeatFlag;
    }
    public void setEventTime(Time value){
        this.eventTime = value;
    }

    public Time getEventTime(){
        return this.eventTime;
    }

    public void print() {
        String printLocation = location;
        String printDescription = description;
        if (location == null) {
            printLocation = "N/A";
        }
        if (description == null) {
            printDescription = "N/A";
        }
        System.out.println("Name: " + name + ", location: " + printLocation + ", description: " + printDescription);
    }

    @Override
    public <C,T> T accept(C context, CalendarVisitor<C,T> v) {
        return v.visit(context, this);
    }
}