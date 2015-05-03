package control;

import model.Coordinate;
import model.IPlayer;
import model.IRules;
import view.IGameViewHelper;

public class Move {

    private IRules rules;

    private IPlayer player;

    private IField field;

    private IGameViewHelper gameViewHelper;

    private int coordinateX;

    private int coordinateY;

    public Move(IRules rules, IPlayer player, IField field, IGameViewHelper gameViewHelper) {
        this.rules = rules;
        this.player = player;
        this.field = field;
        this.gameViewHelper = gameViewHelper;
    }

    public void move(){
        //todo refactor string
        do {
            System.out.println("Player " + player.getName() + " " + player.getFigure() + " : ");
            try {
                coordinateX = gameViewHelper.getCoordinate(Coordinate.X);
                coordinateY = gameViewHelper.getCoordinate(Coordinate.Y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (!field.isFieldUnitEmpty(coordinateX, coordinateY));
        field.setFigureOnField(coordinateX, coordinateY, player.getFigure());
    }


}
