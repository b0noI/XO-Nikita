package control;

import model.Coordinate;
import model.IPlayer;
import view.IGameViewHelper;

public class Move {

    private IPlayer player;

    private IField field;

    private IGameViewHelper gameViewHelper;

    private int coordinateX;

    private int coordinateY;

    public Move(IPlayer player, IField field, IGameViewHelper gameViewHelper) {
        this.player = player;
        this.field = field;
        this.gameViewHelper = gameViewHelper;
    }

    public void move(){
        //todo refactor string
        do {

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
