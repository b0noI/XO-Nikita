package model;

public class Player implements IPlayer {
    private String name;

    private Figure figure;

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    public String getName() {
        return name;
    }
}
