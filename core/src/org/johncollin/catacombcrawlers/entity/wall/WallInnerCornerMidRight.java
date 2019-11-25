package org.johncollin.catacombcrawlers.entity.wall;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallInnerCornerMidRight extends StaticEntity {

    public WallInnerCornerMidRight(int tx, int ty) {
        super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
                64, 144, 16, 16);
    }

}
