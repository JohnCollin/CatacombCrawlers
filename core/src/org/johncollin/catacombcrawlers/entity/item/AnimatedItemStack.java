package org.johncollin.catacombcrawlers.entity.item;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.entity.AnimatedEntity;
import org.johncollin.catacombcrawlers.entity.Entity;

public abstract class AnimatedItemStack extends AnimatedEntity {
	
	protected boolean isInInventory;
	
	public AnimatedItemStack(int tx, int ty, int sx, int sy, int swidth, int sheight, int sframes) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES * (16 / swidth), Entity.TILED_RES * (16 / swidth), sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = false;
	}
	
	public AnimatedItemStack(int tx, int ty, int sx, int sy, int swidth, int sheight, int sframes, boolean isInInventory) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES * (16 / swidth), Entity.TILED_RES * (16 / swidth), sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = isInInventory;
	}
	
	public AnimatedItemStack(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight, int sframes) {
		super(x, y, width, height, sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = false;
	}
	
	public AnimatedItemStack(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight, int sframes, boolean isInInventory) {
		super(x, y, width, height, sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = isInInventory;
	}
	
	@Override
	public void render(SpriteBatch batch) {
		if(!isInInventory) {
			batch.draw(textures[currentTexture], x, y, width, height);
		}
	}
	
	public void renderAt(SpriteBatch batch, int x, int y, int width, int height) {
		if(isInInventory) {
			batch.draw(textures[currentTexture], x, y, width, height);
		}
	}
	
}
