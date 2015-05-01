package model;

/**
 * Created by никита on 01.05.2015.
 */
public class Player implements IPlayer {
    private String name;
    private Figure figure;

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    @Override
    public Figure getFigure() {
        return figure;
    }

    @Override
    public String getName() {
        return name;
    }
}
