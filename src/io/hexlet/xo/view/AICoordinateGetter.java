package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Figure;

public class AICoordinateGetter implements ICoordinateGetter {

    public Point getMoveCoordinate(final Field field) {
        if (field.getFigure(new Point(1, 1)) == null)
            return new Point(1, 1);
        if (field.getFigure(new Point(0, 0)) == null)
            return new Point(0, 0);
        if (field.getFigure(new Point(0, 0)) == Figure.O)
            return new Point(2, 0);
        if (field.getFigure(new Point(0, 0)) == Figure.X && field.getFigure(new Point(2, 2)) == null)
            return new Point(2, 2);
        if (field.getFigure(new Point(2, 0)) == Figure.X && field.getFigure(new Point(0, 2)) == null)
            return new Point(0, 2);
        return new RandomCoordinateGetter().getMoveCoordinate(field);
    }

}
