
package control;

import model.Figure;

public interface IField {

    void setFigureOnField(int x, int y, Figure figure);

    boolean isFieldUnitEmpty(int x, int y);

    Figure getFigureFromPosition(final int x, final int y);
}
