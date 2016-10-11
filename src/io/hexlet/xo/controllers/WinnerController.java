package io.hexlet.xo.controllers;


import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.exceptions.InvalidPointException;

public class WinnerController {

    public String getWinner(final Field field) {
        String winner;
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

    private String checkDiag1(final Field field) {
        final Point p1 = new Point();
        final Point p2 = new Point();
        final Point p3 = new Point();
        p1.x = 0;
        p2.x = 1;
        p3.x = 2;

        p1.y = 0;
        p2.y = 1;
        p3.y = 2;

        if (field.getFigure(p1) != null && field.getFigure(p2) != null &&
                field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private String checkDiag2(final Field field) {
        final Point p1 = new Point();
        final Point p2 = new Point();
        final Point p3 = new Point();
        p1.x = 2;
        p2.x = 1;
        p3.x = 0;

        p1.y = 0;
        p2.y = 1;
        p3.y = 2;

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private String checkColumn(final Field field, final Integer i) {
        final Point p1 = new Point();
        final Point p2 = new Point();
        final Point p3 = new Point();
        p1.x = 0;
        p2.x = 1;
        p3.x = 2;

        p1.y = i;
        p2.y = i;
        p3.y = i;

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }

    private String checkRow(final Field field, final Integer i) {
        final Point p1 = new Point();
        final Point p2 = new Point();
        final Point p3 = new Point();
        p1.x = i;
        p2.x = i;
        p3.x = i;

        p1.y = 0;
        p2.y = 1;
        p3.y = 2;

        if (field.getFigure(p1) != null && field.getFigure(p2) != null
                && field.getFigure(p3) != null &&
                field.getFigure(p1).equals(field.getFigure(p2)) &&
                field.getFigure(p1).equals(field.getFigure(p3))) {
            return field.getFigure(p1);
        }
        return null;
    }
}
