package view;

import model.Coordinate;

public class ViewGameConsoleHelper extends ConsoleRead implements IGameViewHelper {

    private static final String SET_X= "please enter X coordinate: ";

    private static final String SET_Y = "please enter Y coordinate: ";

    public int getCoordinate(final Coordinate coordinate) throws Exception {
        if (coordinate == Coordinate.X){return Integer.parseInt(readFromConsole(SET_X));}
        if (coordinate == Coordinate.Y)
        {return Integer.parseInt(readFromConsole(SET_Y));}
        else throw new Exception("wrong coordinate enum");

    }
}
