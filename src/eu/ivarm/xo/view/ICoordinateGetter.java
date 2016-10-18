package eu.ivarm.xo.view;

import eu.ivarm.xo.model.Field;
import eu.ivarm.xo.model.Point;

public interface ICoordinateGetter {

    public Point getMoveCoordinate(final Field field);

}
