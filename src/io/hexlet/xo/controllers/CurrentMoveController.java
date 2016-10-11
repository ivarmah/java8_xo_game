package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class CurrentMoveController {

    public String currentMove(final Field field) {
        int xCount = 0;
        int oCount = 0;
        boolean terminate = false;
        for(int i = 0; i < field.getSize(); i++){
            for(int it = 0; it < field.getSize(); it++){
                Point p = new Point();
                p.x = i;
                p.y = it;
                if(field.getFigure(p) == "X"){
                    xCount++;
                }
                else if(field.getFigure(p) == "O"){
                    oCount++;
                }
            }
        }
        if(xCount == oCount){
            return "X";
        }
        else{
            return "O";
        }

    }
}
