package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Figure;

import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {
        final Field field = new Field();
        final ICoordinateGetter view = new ConsoleView();
        final ICoordinateGetter random = new RandomCoordinateGetter();
        IntStream.range(0, 9).forEach(
                i -> {
                    final Point p = random.getMoveCoordinate(field);
                    field.setFigure(p, Figure.X);
                }
        );
        final int sum = (int) IntStream.range(0, 3).mapToLong(
                i -> {
                    return (int) IntStream.range(0, 3).mapToLong(
                            i2 -> {
                                if (field.getFigure(new Point(i, i2)) != null) return (Integer) 1;
                                return (Integer) 0;
                            }
                    ).sum();
                }
        ).sum();

        ((ConsoleView) view).show(field);
        if (sum != 9)
            throw new RuntimeException(String.format("field incorrectly. After 9 iterations it should be fully occupied"));
    }

}
