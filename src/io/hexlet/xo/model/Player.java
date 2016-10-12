package io.hexlet.xo.model;

public class Player {

    private final String name;

    private final String figure;

    public Player(PlayerBuilder builder) {
        this.name = builder.getName();
        this.figure = builder.getFigure();
    }

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }

}
