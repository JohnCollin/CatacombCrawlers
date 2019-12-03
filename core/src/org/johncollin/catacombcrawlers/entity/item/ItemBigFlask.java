package org.johncollin.catacombcrawlers.entity.item;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class ItemBigFlask extends StaticEntity {
	
	public ItemBigFlask(int tx, int ty, int var) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			288 + (var * 16), 224, 16, 16);
	}
	
}
