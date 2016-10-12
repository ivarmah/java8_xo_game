package io.hexlet.xo.model;

public class PlayerBuilder {
    private String name;

    private String figure;

    public String getName() {
        return name;
    }

    public PlayerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public String getFigure() {
        return figure;
    }

    public PlayerBuilder figure(String figure) {
        this.figure = figure;
        return this;
    }

    public Player build(){
        return new Player(this);
    }
}
