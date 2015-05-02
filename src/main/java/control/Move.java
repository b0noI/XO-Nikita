package control;

import model.IPlayer;
import model.IRules;

public class Move {
    //TODO create move realize

    private IRules rules;

    private IPlayer player;

    private IField field;

    public Move(IRules rules, IPlayer player, IField field) {
        this.rules = rules;
        this.player = player;
        this.field = field;
    }

    public void move(){
        do {
        ReadCoordinate.setCoordinateX();
        ReadCoordinate.setCoordinateY();}
        while (!field.isFieldUnitEmpty(ReadCoordinate.getCoordinateX(), ReadCoordinate.getCoordinateY()));
        field.setFigureOnField(ReadCoordinate.getCoordinateX(), ReadCoordinate.getCoordinateY(), player.getFigure());
    }


}
