package ast;

import java.util.List;

public class Else extends Node {
    private List<Statement> statements;

    public Else(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
       return v.visit(context, this);
    }
}
