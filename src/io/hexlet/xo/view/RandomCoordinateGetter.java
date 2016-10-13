package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

import java.util.Random;

public class RandomCoordinateGetter implements ICoordinateGetter {

    @Override
    public Point getMoveCoordinate(Field field) {
        int x = 0;
        int y = 0;
        Point p = new Point(0, 0);
        Random rn = new Random();

        while (field.getFigure(p) != null) {
            p = new Point(rn.nextInt(3), rn.nextInt(3));
        }

        return p;
    }

}