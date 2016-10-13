package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.model.Figure;

import io.hexlet.xo.controllers.*;

import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) throws Exception {
        final Field field = new Field();
        final ICoordinateGetter random = new RandomCoordinateGetter();
        final ICoordinateGetter ai = new AICoordinateGetter();
        final MoveController mc = new MoveController();
        final WinnerController wc = new WinnerController();
        final ConsoleView cv = new ConsoleView();
        cv.show(field);
        for (int i = 0; i < 9; i++) {
            Thread.sleep(1000);
            final Point p;
            if (i % 2 == 0)
                p = ai.getMoveCoordinate(field);
            else
                p = random.getMoveCoordinate(field);
            final Figure f = i % 2 == 0 ? Figure.X : Figure.O;
            if (!mc.applyFigure(field, p, f)) {
                throw new RuntimeException("looks like AI make illigal moves;)");
            }
            final Figure winner = wc.getWinner(field);
            cv.show(field);
            if (winner == Figure.O)
                throw new RuntimeException("O winns 0_o");
            if (winner == Figure.X) {
                System.out.println("X - winns!");
                return;
            }
        }
        throw new RuntimeException("no one wins =(");
    }

}
