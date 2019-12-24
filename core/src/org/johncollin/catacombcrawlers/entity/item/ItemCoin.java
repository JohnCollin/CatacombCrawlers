package org.johncollin.catacombcrawlers.entity.item;

import org.johncollin.catacombcrawlers.entity.AnimatedEntity;
import org.johncollin.catacombcrawlers.entity.Entity;

public class ItemCoin extends AnimatedEntity {
	
	private static int animClock = 0;
	private static final int animClockMax = 5;
	
	public ItemCoin(int tx, int ty) {
		super((tx * Entity.TILED_RES) + 4, (ty * Entity.TILED_RES) + 4, Entity.TILED_RES / 4, Entity.TILED_RES / 4,
			288, 272, 8, 8, 4);
	}
	
	@Override
	public void tick() {
		animClock++;
		if(animClock >= animClockMax) {
			animClock = 0;
			
			currentTexture++;
			if(currentTexture >= sframes) {
				currentTexture = 0;
			}
		}
	}
	
}
