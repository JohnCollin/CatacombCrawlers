package org.johncollin.catacombcrawlers.entity.wall.column;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallColumn extends StaticEntity {
	
	public WallColumn(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES * 3,
			80, 80, 16, 48);
	}
	
	public WallColumn(int tx, int ty, boolean hasWall) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES * 3,
			hasWall ? 96 : 80, 80, 16, 48);
	}
	
}
