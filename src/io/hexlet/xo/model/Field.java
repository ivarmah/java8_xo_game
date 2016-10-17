package io.hexlet.xo.model;


import io.hexlet.xo.model.exceptions.InvalidPointException;


public class Field {

    private static final int MIN_COORDINATE = 0;

    private final Figure[][] field;

    private final int filedSize;

    public Field(final int filedSize) {
        this.filedSize = filedSize;
        field = new Figure[filedSize][filedSize];
    }

    public int getSize() {
        return filedSize;
    }

    public Figure getFigure(final Point point) throws InvalidPointException{
        try{
            if(point.getX() < 0 || point.getY() < 0){
                throw new InvalidPointException();
            }
            else{
                return field[point.getX()][point.getY()];
            }
        } catch(InvalidPointException e){
            throw e;
        }
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException{
        try{
            if(point.getX() < 0 || point.getY() < 0){
                throw new InvalidPointException();
            }
            else{
                field[point.getX()][point.getY()] = figure;
            }
        }
        catch(InvalidPointException e){
            throw e;
        }
    }

}
