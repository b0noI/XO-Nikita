package control;

import view.ConsoleRead;

public class ReadCoordinate extends ConsoleRead {

    private static int CoordinateX;

    private static int CoordinateY;

    private static final String SET_X= "please enter X coordinate: ";

    private static final String SET_Y = "please enter Y coordinate: ";


    public static int getCoordinateX() {return CoordinateX;    }

    public static int getCoordinateY() {return CoordinateY;    }
//todo check for int
    public static void setCoordinateX() {
        CoordinateX = Integer.parseInt(readFromConsole(SET_X));
    }

    public static void setCoordinateY() {
        CoordinateY = Integer.parseInt(readFromConsole(SET_Y));
    }
}
