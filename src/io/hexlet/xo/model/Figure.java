package io.hexlet.xo.model;
public enum Figure{
    X("X"),O("O");
    private String figure;

    Figure(String figure){
        this.figure = figure;
    }

    String getFigure(){
        return this.figure;
    }
}
