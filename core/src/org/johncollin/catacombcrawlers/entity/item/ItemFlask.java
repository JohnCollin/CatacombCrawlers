package org.johncollin.catacombcrawlers.entity.item;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class ItemFlask extends StaticEntity {
	
	public ItemFlask(int tx, int ty, int var) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			288 + (var * 16), 240, 16, 16);
	}
	
}
