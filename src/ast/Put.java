package ast;

import ast.helpers.Date;
import java.util.ArrayList;
import java.util.List;

public class Put extends Statement {
    private final String alias;
    private final Date endDate;
    private final List<Place> placeList;
    private String parentAlias;

    public Put (String alias, Date endDate, List<Place> placeList) {
        this.alias = alias;
        this.endDate = endDate;
        this.placeList = placeList;
    }

    public String getAlias() {
        return this.alias;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public List<Place> getPlaceList() {
        return this.placeList;
    }

    @Override
    public <C, T> T accept(C context, CalendarVisitor<C, T> v) {
        return v.visit(context, this);
    }
}
