package eu.ivarm.xo.controllers;


import eu.ivarm.xo.model.Field;
import eu.ivarm.xo.model.Point;
import eu.ivarm.xo.model.Figure;
import eu.ivarm.xo.model.exceptions.InvalidPointException;

public class WinnerController {

    public Figure getWinner(final Field field) {
        Figure winner;
        for (int i = 0; i < field.getSize(); i++) {
            winner = checkRow(field, i);
            if (winner != null) return winner;
            winner = checkColumn(field, i);
            if (winner != null) return winner;
        }
        winner = checkDiag1(field);
        if (winner != null) return winner;
        winner = checkDiag2(field);
        if (winner != null) return winner;

        return null;
    }

    private Figure checkDiag1(final Field field) {
        final Point p1 = new Point(0, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(2, 2);

        try {
            if (field.getFigure(p1) != null && field.getFigure(p2) != null &&
                    field.getFigure(p3) != null &&
                    field.getFigure(p1).equals(field.getFigure(p2)) &&
                    field.getFigure(p1).equals(field.getFigure(p3))) {
                return field.getFigure(p1);
            }
        } catch (final InvalidPointException e) {
            return null;
        }
        return null;
    }

    private Figure checkDiag2(final Field field) {

        final Point p1 = new Point(2, 0);
        final Point p2 = new Point(1, 1);
        final Point p3 = new Point(0, 2);

        try {
            if (field.getFigure(p1) != null && field.getFigure(p2) != null
                    && field.getFigure(p3) != null &&
                    field.getFigure(p1).equals(field.getFigure(p2)) &&
                    field.getFigure(p1).equals(field.getFigure(p3))) {
                return field.getFigure(p1);
            }
        } catch (final InvalidPointException e) {
            return null;
        }
        return null;
    }

    private Figure checkColumn(final Field field, final Integer i) {
        final Point p1 = new Point(0, i);
        final Point p2 = new Point(1, i);
        final Point p3 = new Point(2, i);

        try {
            if (field.getFigure(p1) != null && field.getFigure(p2) != null
                    && field.getFigure(p3) != null &&
                    field.getFigure(p1).equals(field.getFigure(p2)) &&
                    field.getFigure(p1).equals(field.getFigure(p3))) {
                return field.getFigure(p1);
            }
        } catch (final InvalidPointException e) {
            return null;
        }
        return null;
    }

    private Figure checkRow(final Field field, final Integer i) {
        final Point p1 = new Point(i, 0);
        final Point p2 = new Point(i, 1);
        final Point p3 = new Point(i, 2);

        try {
            if (field.getFigure(p1) != null && field.getFigure(p2) != null
                    && field.getFigure(p3) != null &&
                    field.getFigure(p1).equals(field.getFigure(p2)) &&
                    field.getFigure(p1).equals(field.getFigure(p3))) {
                return field.getFigure(p1);
            }
        } catch (final InvalidPointException e) {
            return null;
        }
        return null;
    }

}