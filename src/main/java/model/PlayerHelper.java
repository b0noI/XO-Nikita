package model;

import view.ViewUserConsoleHelper;

class PlayerHelper {
    private IPlayer byXPlayer;

    private IPlayer byOPlayer;

    private IPlayer currentPlayer;

    public void initPlayer() {
        byXPlayer = new Player(new ViewUserConsoleHelper(Figure.X).getPlayerName(), Figure.X);
        byOPlayer = new Player(new ViewUserConsoleHelper(Figure.O).getPlayerName(), Figure.O);
        currentPlayer = byOPlayer;
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
