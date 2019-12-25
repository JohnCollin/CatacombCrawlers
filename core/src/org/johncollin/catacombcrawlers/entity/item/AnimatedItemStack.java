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
