package org.johncollin.catacombcrawlers.entity.wall;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallHole extends StaticEntity {
	
	public WallHole(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			48, Math.random() >= 0.5 ? 32 : 48, 16, 16);
	}
	
	public WallHole(int tx, int ty, boolean secondary) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			48, secondary ? 32 : 48, 16, 16);
	}
	
}
