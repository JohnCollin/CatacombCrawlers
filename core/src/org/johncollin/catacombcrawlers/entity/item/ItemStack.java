package org.johncollin.catacombcrawlers.entity.item;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public abstract class ItemStack extends StaticEntity {
	
	protected boolean isInInventory;
	
	public ItemStack(int tx, int ty,  int sx, int sy, int swidth, int sheight) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES, sx, sy, swidth, sheight);
		
		this.isInInventory = false;
	}
	
	public ItemStack(int tx, int ty, int sx, int sy, int swidth, int sheight, boolean isInInventory) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES * (16 / swidth), Entity.TILED_RES * (16 / swidth), sx, sy, swidth, sheight);
		
		this.isInInventory = isInInventory;
	}
	
	@Override
	public void render(SpriteBatch batch) {
		if(!isInInventory) {
			batch.draw(texture, x, y, width, height);
		}
	}
	
	public void renderAt(SpriteBatch batch, int x, int y, int width, int height) {
		if(isInInventory) {
			batch.draw(texture, x, y, width, height);
		}
	}
	
}
