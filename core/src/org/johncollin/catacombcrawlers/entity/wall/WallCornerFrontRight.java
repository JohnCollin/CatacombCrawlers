package org.johncollin.catacombcrawlers.entity.wall;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallCornerFrontRight extends StaticEntity {
	
	public WallCornerFrontRight(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			48, 160, 16, 16);
	}
	
}
