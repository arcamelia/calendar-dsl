package ast;

import java.util.List;

public class If extends Statement {
    private List<Condition> conditions;
    private List<String> andOrs;
    private List<Statement> then;
    private Else elseNode;

    public If(List<Condition> conditions, List<String> andOrs, List<Statement> then, Else elseNode) {
        this.conditions = conditions;
        this.andOrs = andOrs;
        this.then = then;
        this.elseNode = elseNode;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public List<String> getAndOrs() {
        return andOrs;
    }

    public List<Statement> getThen() {
        return then;
    }

    public Else getElseNode() {
        return elseNode;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
