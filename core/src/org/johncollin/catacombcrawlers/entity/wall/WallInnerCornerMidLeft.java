package org.johncollin.catacombcrawlers.entity.wall;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallInnerCornerMidLeft extends StaticEntity {

    public WallInnerCornerMidLeft(int tx, int ty) {
        super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
                80, 144, 16, 16);
    }

}
