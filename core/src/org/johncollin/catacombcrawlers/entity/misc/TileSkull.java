package org.johncollin.catacombcrawlers.entity.misc;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class TileSkull extends StaticEntity {
	
	public TileSkull(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			224, 224, 16, 16);
	}
	
}
