package org.johncollin.catacombcrawlers.entity.interactable;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.johncollin.catacombcrawlers.CatacombCrawlers;
import org.johncollin.catacombcrawlers.CatacombCrawlersAPI;
import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class Door extends StaticEntity implements Interactable {
	
	private boolean isOpen;
	
	private TextureRegion[] doorFrame;
	private TextureRegion[] doorLeaf;
	
	public Door(int tx, int ty, boolean isOpen) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, 64 * Entity.SHEETPIXEL_REALPIXEL_RATIO, 35 * Entity.SHEETPIXEL_REALPIXEL_RATIO,
			16, 221, 64, 35);
		
		this.isOpen = isOpen;
		
		this.doorFrame = new TextureRegion[] {
			new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), 16, 224, 16, 32),
			new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), 32, 221, 32, 3),
			new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), 64, 224, 16, 32)
		};
		
		this.doorLeaf = new TextureRegion[] {
			new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), 32, 224, 32, 32),
			new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), 80, 224, 32, 32)
		};
	}
	
	@Override
	public void render(SpriteBatch batch) {
		batch.draw(doorFrame[0], x, y,
			doorFrame[0].getRegionWidth() * Entity.SHEETPIXEL_REALPIXEL_RATIO, doorFrame[0].getRegionHeight() * Entity.SHEETPIXEL_REALPIXEL_RATIO);
		batch.draw(doorFrame[1], x + (Entity.TILED_RES), y + (Entity.TILED_RES * 2),
			doorFrame[1].getRegionWidth() * Entity.SHEETPIXEL_REALPIXEL_RATIO, doorFrame[1].getRegionHeight() * Entity.SHEETPIXEL_REALPIXEL_RATIO);
		batch.draw(doorFrame[2], x + (Entity.TILED_RES * 3), y,
			doorFrame[2].getRegionWidth() * Entity.SHEETPIXEL_REALPIXEL_RATIO, doorFrame[2].getRegionHeight() * Entity.SHEETPIXEL_REALPIXEL_RATIO);
		
		batch.draw(isOpen ? doorLeaf[1] : doorLeaf[0], x + (Entity.TILED_RES), y,
			doorFrame[2].getRegionWidth() * Entity.SHEETPIXEL_REALPIXEL_RATIO * 2, doorFrame[2].getRegionHeight() * Entity.SHEETPIXEL_REALPIXEL_RATIO);
	}
	
	@Override
	public void onInteract() {
	
	}
}
