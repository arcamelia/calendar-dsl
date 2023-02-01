package ast;

import ast.Event;
import ast.Node;
import ast.helpers.Date;
import ast.helpers.Time;

import java.util.Map;

public abstract class EventAttributePair extends Node {
//    protected AttributeType type;
//    public abstract void changeAttribute(StringBuilder errors, Map<String, Event> events, Map<Date, Map<Time, String>> schedule, String alias);

    protected String alias = null;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
