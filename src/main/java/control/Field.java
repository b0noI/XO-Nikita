package control;

import model.Figure;

public class Field implements IField {

    private final int ARRAY_FIELD_SIZE = 3;

    Figure[][] figureField = new Figure[ARRAY_FIELD_SIZE][ARRAY_FIELD_SIZE];

    public Figure getFigureFromPosition(final int x, final int y){
        return figureField[x][y];
    }

    public boolean isFieldUnitEmpty(final int x, final int y){
        if(figureField[x][y] == null) {
            return true;
        }
        return false;
    }

    public void setFigureOnField(final int x, final int y, final Figure figure) {
        if(isFieldUnitEmpty(x,y)){
            figureField[x][y] = figure;}
        else {}
    }


}
