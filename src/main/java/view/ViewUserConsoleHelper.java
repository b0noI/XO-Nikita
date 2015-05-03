package view;

import model.Figure;

public class ViewUserConsoleHelper implements IUserViewHelper {





    private final String MESSAGE_FOR_X_PLAYER ="Please enter X player name: ";

    private final String MESSAGE_FOR_Y_PLAYER ="Please enter X player name: ";

    private Figure figure;

    public ViewUserConsoleHelper(Figure figure) {
        this.figure = figure;
    }

    public String getPlayerName() {
        return ConsoleRead.readFromConsole(getMessage());
    }

    private String getMessage(){
        if (figure == Figure.X) { return MESSAGE_FOR_X_PLAYER;
        } else return  MESSAGE_FOR_Y_PLAYER;
    }








}
