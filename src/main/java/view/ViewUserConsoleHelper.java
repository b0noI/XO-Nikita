package view;

import model.Figure;
import model.IPlayer;

@SuppressWarnings("ALL")
public class ViewUserConsoleHelper implements IUserViewHelper {





    private final String MESSAGE_FOR_X_PLAYER ="Please enter X player name: ";

    private final String MESSAGE_FOR_Y_PLAYER ="Please enter X player name: ";

    private Figure figure;

    private IPlayer player;

    public ViewUserConsoleHelper(Figure figure) {
        this.figure = figure;
    }

    public ViewUserConsoleHelper(IPlayer player) {
        this.player = player;
    }

    public String getPlayerName() {
        return ConsoleRead.readFromConsole(getMessage());
    }

    public void getWinnerMessage(){
        System.out.println(player.getName() + " is win by " + player.getFigure() );
    }

    public void getInitMoveMessage(){
        System.out.println("Player " + player.getName() + " " + player.getFigure() + " : ");
    }

    private String getMessage(){
        if (figure == Figure.X) { return MESSAGE_FOR_X_PLAYER;
        } else return  MESSAGE_FOR_Y_PLAYER;
    }










}
