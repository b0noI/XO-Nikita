package model;

import control.Field;
import control.Move;

public class GameStarter {
    private PlayerHelper playerHelper = new PlayerHelper();

    private Rules rules = new Rules();

    private Field field = new Field();



    public void startGame() {
        playerHelper.initPlayer();
        do {
            new Move(rules, playerHelper.getCurrentPlayer(), field).move();
            playerHelper.changeCurrentPlayer();
        }while (!rules.isWin());
        System.out.println(playerHelper.getCurrentPlayer().getName() + " is win");
    }
}
