package eu.ivarm.xo.controllers;


import eu.ivarm.xo.model.Figure;
import eu.ivarm.xo.model.Field;
import eu.ivarm.xo.model.Point;
import eu.ivarm.xo.model.exceptions.AlreadyOccupiedException;
import eu.ivarm.xo.model.exceptions.InvalidPointException;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws AlreadyOccupiedException, InvalidPointException
    {
        try{
            if(field.getFigure(point) != null){
                throw new AlreadyOccupiedException();
            }
            else{
                field.setFigure(point, figure);
            }

        }
        catch(AlreadyOccupiedException | InvalidPointException e){
            throw e;
        }
    }

}
