package org.johncollin.catacombcrawlers.entity.wall.fountain;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallFountainTop extends StaticEntity {
	
	public WallFountainTop(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			64, 0, 16, 16);
	}
	
}
