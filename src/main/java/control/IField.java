
package control;

import model.Figure;

/**
 * Created by никита on 01.05.2015.
 */
public interface IField {

    public void setFigureOnField(int x, int y, Figure figure);

    public boolean isFieldUnitEmpty(int x, int y);
}
