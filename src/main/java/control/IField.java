
package control;

import model.Figure;

public interface IField {

    public void setFigureOnField(int x, int y, Figure figure);

    public boolean isFieldUnitEmpty(int x, int y);

    public Figure getFigureFromPosition(final int x, final int y);
}
