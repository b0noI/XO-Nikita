package control;

import model.Figure;

/**
 * Created by никита on 01.05.2015.
 */
public class Field implements IField {
    //TODO create field

    Figure[][] figureField = new Figure[3][3];


    public Figure[][] getFigureField() {
        return figureField;
    }

    public Figure getFigureFromPosition(int x, int y){
        return figureField[x][y];
    }

    public boolean isFieldUnitEmpty(int x, int y){
        if(figureField[x][y] == null) {
            return true;
        }
        return false;
    }

    @Override
    public void setFigureOnField(int x, int y, Figure figure) {
        if(isFieldUnitEmpty(x,y)){
            figureField[x][y] = figure;}
        else {}
    }
}
