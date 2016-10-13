package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import java.util.Random;

public class RandomCoordinateGetter implements ICoordinateGetter {

    private static final Random RANDOM = new Random();

    public Point getMoveCoordinate(final Field field) {
        Point result = getRandomPoint();
        while (field.getFigure(result) != null) {
            result = getRandomPoint();
        }
        return result;
    }

    private Point getRandomPoint() {
        return new Point(
                getRandomInt(),
                getRandomInt()
        );
    }

    private int getRandomInt() {
        return Math.abs(RANDOM.nextInt() % 3);
    }

}
