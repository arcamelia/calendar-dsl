package ast;

public interface CalendarVisitor<C, T> {

    T visit (C context, Program p);
    T visit (C context, Event e);
    T visit (C context, Set s);
    T visit (C context, Repeat r);
    T visit (C context, Change c);
    T visit (C context, Put p);
    T visit (C context, Place pl);
    T visit (C context, If i);
    T visit (C context, Else el);
    T visit (C context, TimeFrame t);
    T visit (C context, TimeCondition t);
    T visit (C context, Is is);
    T visit (C context, BetweenTime b);
    T visit (C context, AtTime a);
    T visit (C context, DatePair dp);
    T visit (C context, DescriptionPair dp);
    T visit (C context, DurationPair dp);
    T visit (C context, LocationPair lp);
    T visit (C context, NamePair np);
    T visit (C context, TimePair tp);
    Object visit(StringBuilder context, AtTime a);
}
