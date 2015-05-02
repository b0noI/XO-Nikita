package control;

public class ReadName extends ConsoleRead {

    private String playerName;

    private static String message;

    public  ReadName(String message) {
        this.message = message;
    }

    public static String getPlayerName() {
        return ConsoleRead.readFromConsole(message);
    }
}
