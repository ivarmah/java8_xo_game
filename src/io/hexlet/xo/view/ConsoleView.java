package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.Point;

public class ConsoleView {

    public void show(final Game game) {
        final Field field = game.getField();
        final StringBuilder fieldBuilder = new StringBuilder();
        for (int x = 0; x < field.getSize(); x++) {
            if (x != 0) {
                generateSeparator(fieldBuilder);
            }
            generateLine(field, x, fieldBuilder);
        }
    }

    public boolean move(final Game game) {
        return true;
    }

    public void generateLine(final Field field, final int x, final StringBuilder sb) {
        for (int i = 0; i < 3; i++) {
            sb.append(" ");
            Figure fig = field.getFigure(new Point(i, x));
            if(fig != null){
                sb.append(fig.toString());
            }
            else{
                sb.append(" ");
            }
            sb.append(" ");
            if(i != 2){
                sb.append("|");
            }
            else{
                sb.append("\n");
            }
        }
    }

    public void generateSeparator(final StringBuilder sb) {
        sb.append("~~~~~~~~~~~\n");
    }

}
