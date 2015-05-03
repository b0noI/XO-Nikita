package view;

import model.Coordinate;

public class ViewGameConsoleHelper extends ConsoleRead implements IGameViewHelper {

    private static final String SET_X= "please enter X coordinate: ";

    private static final String SET_Y = "please enter Y coordinate: ";

    private String tempCoordinate;

    public int getCoordinate(final Coordinate coordinate) throws Exception {
        if (coordinate == Coordinate.X){return checkForWrightCoordinate(SET_X);}
        if (coordinate == Coordinate.Y){return checkForWrightCoordinate(SET_Y);}
        else throw new Exception("wrong coordinate enum");
    }

    private int checkForWrightCoordinate(String message){
        //TODO consult
        tempCoordinate = null;
        do {
            tempCoordinate = readFromConsole(message);
        }while (!RegExp.checkForRealCoordinat(tempCoordinate));
        return (Integer.parseInt(tempCoordinate)-1);
    }
}
