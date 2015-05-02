package control;

public class ReadCoordinate extends ConsoleRead {

    private static int CoordinateX;

    private static int CoordinateY;

    private static String setX = "please enter X coordinate: ";

    private static String setY = "please enter Y coordinate: ";


    public static int getCoordinateX() {return CoordinateX;    }

    public static int getCoordinateY() {return CoordinateY;    }
//todo check for int
    public static void setCoordinateX() {
        CoordinateX = Integer.parseInt(readFromConsole(setX));
    }

    public static void setCoordinateY() {
        CoordinateY = Integer.parseInt(readFromConsole(setY));
    }
}
