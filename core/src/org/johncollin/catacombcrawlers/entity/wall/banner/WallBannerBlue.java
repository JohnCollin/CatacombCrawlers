package org.johncollin.catacombcrawlers.entity.wall.banner;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class WallBannerBlue extends StaticEntity {
	
	public WallBannerBlue(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			32, 32, 16, 16);
	}
	
}
