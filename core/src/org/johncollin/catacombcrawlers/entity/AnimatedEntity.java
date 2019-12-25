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

package org.johncollin.catacombcrawlers.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.johncollin.catacombcrawlers.CatacombCrawlersAPI;

public abstract class AnimatedEntity extends Entity {
	
	protected int sx, sy;
	protected int swidth, sheight;
	protected int sframes;
	protected TextureRegion[] textures;
	protected int currentTexture;
	
	public AnimatedEntity(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight, int sframes) {
		super(x, y, width, height);
		
		this.sx = sx;
		this.sy = sy;
		this.swidth = swidth;
		this.sheight = sheight;
		this.sframes = sframes;
		
		this.textures = new TextureRegion[sframes];
		for(int i = 0; i < sframes; i++) {
			textures[i] = new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), sx + (swidth * i), sy, swidth, sheight);
		}
		
		this.currentTexture = 0;
	}
	
	public AnimatedEntity(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight, int sframes, int currentTexture) {
		super(x, y, width, height);
		
		this.sx = sx;
		this.sy = sy;
		this.swidth = swidth;
		this.sheight = sheight;
		this.sframes = sframes;
		
		this.textures = new TextureRegion[sframes];
		for(int i = 0; i < sframes; i++) {
			textures[i] = new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), sx + (swidth * i), sy, swidth, sheight);
		}
		
		this.currentTexture = currentTexture;
	}
	
	@Override
	public void render(SpriteBatch batch) {
		batch.draw(textures[currentTexture], x, y, width, height);
	}
	
	@Override
	public void dispose() { }
	
	public TextureRegion[] getTextures() {
		return textures;
	}
	
	public void setTextures(TextureRegion[] textures) {
		this.textures = textures;
	}
	
	public int getCurrentTexture() {
		return currentTexture;
	}
	
	public void setCurrentTexture(int currentTexture) {
		this.currentTexture = currentTexture;
	}
	
	public int getSx() {
		return sx;
	}
	
	public void setSx(int sx) {
		this.sx = sx;
	}
	
	public int getSy() {
		return sy;
	}
	
	public void setSy(int sy) {
		this.sy = sy;
	}
	
	public int getSwidth() {
		return swidth;
	}
	
	public void setSwidth(int swidth) {
		this.swidth = swidth;
	}
	
	public int getSheight() {
		return sheight;
	}
	
	public void setSheight(int sheight) {
		this.sheight = sheight;
	}
	
	public int getSframes() {
		return sframes;
	}
	
	public void setSframes(int sframes) {
		this.sframes = sframes;
	}
}
