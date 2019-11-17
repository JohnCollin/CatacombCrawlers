package org.johncollin.catacombcrawlers.entity.wall.fountain;

import org.johncollin.catacombcrawlers.entity.AnimatedEntity;
import org.johncollin.catacombcrawlers.entity.Entity;

public class WallFountainBasinRed extends AnimatedEntity {
	
	private static int animClock = 0;
	private static final int animClockMax = 25;
	
	public WallFountainBasinRed(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			64, 32, 16, 16, 3);
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
