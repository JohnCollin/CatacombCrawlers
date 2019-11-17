package org.johncollin.catacombcrawlers.entity.floor;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class FloorBroken extends StaticEntity {
	
	public FloorBroken(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			16 + (((int) (Math.random() * 2)) * 16), 80, 16, 16);
	}
	
	public FloorBroken(int tx, int ty, int var) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			16 + (var * 16), 80, 16, 16);
	}
	
}
