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

package org.johncollin.catacombcrawlers.entity.item;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.entity.AnimatedEntity;
import org.johncollin.catacombcrawlers.entity.Entity;

/**
 * AnimatedItemStack base class
 *
 * @see org.johncollin.catacombcrawlers.entity.Entity
 * @see org.johncollin.catacombcrawlers.entity.AnimatedEntity
 *
 * @since rev-004-1.0.0-SNAPSHOT
 */
public abstract class AnimatedItemStack extends AnimatedEntity {
	
	/**
	 * Boolean to show whether to render within an inventory or on the ground at a location.
	 *
	 * @since rev-004-1.0.0-SNAPSHOT
	 */
	protected boolean isInInventory;
	
	/**
	 * Basic AnimatedItemStack Constructor
	 *
	 * @param tx The coordinate of the x plane in a unit of standard game tiles.
	 * @param ty The coordinate of the y plane in a unit of standard game tiles.
	 * @param sx The place within the game tile spreadsheet where the texture is located on the x axis
	 * @param sy The place within the game tile spreadsheet where the texture is located on the y axis
	 * @param swidth The width of the texture within the game tile spreadsheet on the x axis
	 * @param sheight The width of the texture within the game tile spreadsheet on the y axis
	 * @param sframes The number of frames in the animation.
	 */
	public AnimatedItemStack(int tx, int ty, int sx, int sy, int swidth, int sheight, int sframes) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES * (16 / swidth), Entity.TILED_RES * (16 / swidth), sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = false;
	}
	
	/**
	 * AnimatedItemStack Constructor with isInInventory flag
	 *
	 * @param tx The coordinate of the x plane in a unit of standard game tiles.
	 * @param ty The coordinate of the y plane in a unit of standard game tiles.
	 * @param sx The place within the game tile spreadsheet where the texture is located on the x axis
	 * @param sy The place within the game tile spreadsheet where the texture is located on the y axis
	 * @param swidth The width of the texture within the game tile spreadsheet on the x axis
	 * @param sheight The width of the texture within the game tile spreadsheet on the y axis
	 * @param sframes The number of frames in the animation.
	 * @param isInInventory The flag whether the item is in the inventory or not.
	 */
	public AnimatedItemStack(int tx, int ty, int sx, int sy, int swidth, int sheight, int sframes, boolean isInInventory) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES * (16 / swidth), Entity.TILED_RES * (16 / swidth), sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = isInInventory;
	}
	
	/**
	 * AnimatedItemStack Constructor with direct coordinate values.
	 *
	 * @param x The coordinate of the x plane in pixels.
	 * @param y The coordinate of the y plane in pixels.
	 * @param width The width of the texture in pixels.
	 * @param height The height of the texture in pixels.
	 * @param sx The place within the game tile spreadsheet where the texture is located on the x axis
	 * @param sy The place within the game tile spreadsheet where the texture is located on the y axis
	 * @param swidth The width of the texture within the game tile spreadsheet on the x axis
	 * @param sheight The width of the texture within the game tile spreadsheet on the y axis
	 * @param sframes The number of frames in the animation.
	 */
	public AnimatedItemStack(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight, int sframes) {
		super(x, y, width, height, sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = false;
	}
	
	/**
	 * AnimatedItemStack Constructor with direct coordinate values and isInInventory flag.
	 *
	 * @param x The coordinate of the x plane in pixels.
	 * @param y The coordinate of the y plane in pixels.
	 * @param width The width of the texture in pixels.
	 * @param height The height of the texture in pixels.
	 * @param sx The place within the game tile spreadsheet where the texture is located on the x axis
	 * @param sy The place within the game tile spreadsheet where the texture is located on the y axis
	 * @param swidth The width of the texture within the game tile spreadsheet on the x axis
	 * @param sheight The width of the texture within the game tile spreadsheet on the y axis
	 * @param sframes The number of frames in the animation.
	 * @param isInInventory The flag whether the item is in the inventory or not.
	 */
	public AnimatedItemStack(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight, int sframes, boolean isInInventory) {
		super(x, y, width, height, sx, sy, swidth, sheight, sframes);
		
		this.isInInventory = isInInventory;
	}
	
	/**
	 * Overridden method from {@link org.johncollin.catacombcrawlers.entity.AnimatedEntity} for special
	 * update method.
	 *
	 * @see org.johncollin.catacombcrawlers.entity.Entity
	 * @see org.johncollin.catacombcrawlers.entity.AnimatedEntity
	 *
	 * @since rev004-1.0.0-SNAPSHOT
	 */
	@Override
	public void render(SpriteBatch batch) {
		if(!isInInventory) {
			batch.draw(textures[currentTexture], x, y, width, height);
		}
	}
	
	/**
	 * Special method that tells the entity to render at a specific point.
	 *
	 * @param batch SpriteBatch used to render images within LibGDX.
	 * @param x The coordinate of the x plane in pixels.
	 * @param y The coordinate of the y plane in pixels.
	 * @param width The width of the texture in pixels.
	 * @param height The height of the texture in pixels.
	 */
	public void renderAt(SpriteBatch batch, int x, int y, int width, int height) {
		if(isInInventory) {
			batch.draw(textures[currentTexture], x, y, width, height);
		}
	}
	
}
