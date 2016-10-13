package io.hexlet.xo.controllers;


import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final Figure figure) {
        if (field.getFigure(point) != null) return false;
        field.setFigure(point, figure);
        return true;
    }

}
