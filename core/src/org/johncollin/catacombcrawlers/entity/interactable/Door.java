/**
 * MIT License
 *
 * Copyright (c) 2019 Collin Johnson
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.johncollin.catacombcrawlers.entity.interactable;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.johncollin.catacombcrawlers.CatacombCrawlersAPI;
import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

/**
 * Basic door class (special wall tile)
 *
 * @see org.johncollin.catacombcrawlers.entity.Entity
 * @see org.johncollin.catacombcrawlers.entity.StaticEntity
 * @see org.johncollin.catacombcrawlers.entity.interactable.Interactable
 *
 * @since rev003-1.0.0-SNAPSHOT
 */
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
