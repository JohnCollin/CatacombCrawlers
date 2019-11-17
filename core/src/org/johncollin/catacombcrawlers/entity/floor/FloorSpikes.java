package org.johncollin.catacombcrawlers.entity.floor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import org.johncollin.catacombcrawlers.entity.AnimatedEntity;
import org.johncollin.catacombcrawlers.entity.Entity;

public class FloorSpikes extends AnimatedEntity {
	
	private static boolean anim = false;
	
	private static int animClock = 0;
	private static final int animClockMax = 3;
	
	public FloorSpikes(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			16, 176, 16, 16, 4);
	}
	
	@Override
	public void tick() {
		if(anim) {
			animClock++;
			
			if(animClock >= animClockMax) {
				currentTexture++;
				animClock = 0;
				if(currentTexture >= sframes) {
					currentTexture = 0;
					animClock = 0;
					anim = false;
				}
			}
		}
	}
	
	public void spike() {
		anim = true;
	}
	
}
