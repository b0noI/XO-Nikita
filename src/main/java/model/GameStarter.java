package model;

import control.Field;
import control.Move;

/**
 * Created by никита on 01.05.2015.
 */
public class GameStarter {
    private PlayerHelper playerHelper = new PlayerHelper();
    private Rules rules = new Rules();
    private Field field = new Field();



    public void startGame() {
        playerHelper.initPlayer();
        do {
            new Move(rules, playerHelper.getCurrentPlayer(), field);
            playerHelper.changeCurrentPlayer();
        }while (!rules.isWin());
        System.out.println(playerHelper.getCurrentPlayer() + " is win");
    }
}
