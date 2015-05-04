package model;

import control.Field;
import control.Move;
import view.ViewGameConsoleHelper;
import view.ViewUserConsoleHelper;

public class GameStarter {
    private PlayerHelper playerHelper = new PlayerHelper();

    private ViewGameConsoleHelper viewGameConsoleHelper = new ViewGameConsoleHelper();

    private Field field = new Field();

    private Rules rules = new Rules(field);

    public void startGame() {
        playerHelper.initPlayer();
        do {
            playerHelper.changeCurrentPlayer();
            new ViewUserConsoleHelper(playerHelper.getCurrentPlayer()).getInitMoveMessage();
            new Move(rules, playerHelper.getCurrentPlayer(), field, viewGameConsoleHelper).move();
        }while (!rules.isWin());
        new ViewUserConsoleHelper(playerHelper.getCurrentPlayer()).getWinnerMessage();
        System.exit(0);
    }
}
