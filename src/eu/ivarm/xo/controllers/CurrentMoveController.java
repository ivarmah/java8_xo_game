package eu.ivarm.xo.controllers;

import eu.ivarm.xo.model.Field;
import eu.ivarm.xo.model.Figure;
import eu.ivarm.xo.model.Point;
import eu.ivarm.xo.model.exceptions.InvalidPointException;

public class CurrentMoveController {

    public Figure currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            countFigure += countFiguresInTheRow(field, x);
        }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0)
            return Figure.X;

        return Figure.O;
    }

    private int countFiguresInTheRow(final Field field, final Integer row) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            final Point p = new Point(x, row);
            try {
                if (field.getFigure(p) != null)
                    countFigure++;
            } catch (final InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigure;
    }

}
