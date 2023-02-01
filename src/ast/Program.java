package ast;
import java.util.List;

public class Program extends Node {
    private final List<Statement> statements;
    private final List<Event> events;

    public Program(List<Statement> statements, List<Event> events) {
        this.statements = statements;
        this.events = events;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C,T> v) {
        return v.visit(context, this);
    }
}
