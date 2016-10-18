package eu.ivarm.xo;

import eu.ivarm.xo.model.Field;
import eu.ivarm.xo.model.Point;
import eu.ivarm.xo.model.Player;
import eu.ivarm.xo.model.Game;
import eu.ivarm.xo.model.Figure;
import eu.ivarm.xo.model.exceptions.InvalidPointException;


public class Main {

    public static void main(String... args) {
        final Field field = new Field(3);
        final Player p = new Player("Slava", Figure.X);
        final Player p2 = new Player("Gleb", Figure.O);
        final Game g = new Game.Builder().player1(p).player2(p2).field(field).name("XO").build();
        if (!g.getPlayer1().equals(p)) throw new RuntimeException(String.format("Game.getPlayer1 returns %s instead of %s", g.getPlayer1(), p));
        if (!g.getPlayer2().equals(p2)) throw new RuntimeException(String.format("Game.getPlayer2 returns %s instead of %s", g.getPlayer2(), p2));

        try {
            field.getFigure(new Point(-1, 1));
            throw new RuntimeException("Field do not throw Exception when reading the Point -1, -1");
        } catch (final InvalidPointException e){}
        try {
            field.setFigure(new Point(-1, 1), Figure.X);
            throw new RuntimeException("Field do not throw Exception when setting to the Point -1, -1");
        } catch (final InvalidPointException e){}
    }

}
