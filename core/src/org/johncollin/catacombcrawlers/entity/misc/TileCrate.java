package org.johncollin.catacombcrawlers.entity.misc;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class TileCrate extends StaticEntity {
	
	public TileCrate(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, (int) (Entity.TILED_RES * 1.375),
			224, 202, 16, 22);
	}
	
}
