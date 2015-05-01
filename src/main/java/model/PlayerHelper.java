package model;

import control.ReadName;

/**
 * Created by никита on 01.05.2015.
 */
public class PlayerHelper {
    private IPlayer byXPlayer;
    private IPlayer byOPlayer;
    private IPlayer currentPlayer = byXPlayer;

    public void initPlayer() {
        byXPlayer = new Player(new ReadName("enter Player X name").getPlayerName(), Figure.X);
        byOPlayer = new Player(new ReadName("enter Player O name").getPlayerName(), Figure.O);
    }

    public IPlayer getByXPlayer() {
        return byXPlayer;
    }

    public IPlayer getByOPlayer() {
        return byOPlayer;
    }

    public IPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public void changeCurrentPlayer(){
        if(currentPlayer == byXPlayer){
            currentPlayer = byOPlayer;
        } else {
            currentPlayer = byXPlayer;
        }
    }
}
