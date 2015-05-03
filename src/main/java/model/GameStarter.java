package model;

import control.Field;
import control.Move;
import view.ViewGameConsoleHelper;

public class GameStarter {
    private PlayerHelper playerHelper = new PlayerHelper();

    private ViewGameConsoleHelper viewGameConsoleHelper = new ViewGameConsoleHelper();

    private Field field = new Field();

    private Rules rules = new Rules(field);

    public void startGame() {
        playerHelper.initPlayer();
        do {
            playerHelper.changeCurrentPlayer();
            new Move(rules, playerHelper.getCurrentPlayer(), field, viewGameConsoleHelper).move();
        }while (!rules.isWin());
        System.out.println(playerHelper.getCurrentPlayer().getName() + " is win by " + playerHelper.getCurrentPlayer().getFigure() );
        System.exit(0);
    }
}
