package org.johncollin.catacombcrawlers.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.johncollin.catacombcrawlers.CatacombCrawlersAPI;

public abstract class StaticEntity extends Entity {
	
	protected int sx, sy;
	protected int swidth, sheight;
	protected TextureRegion texture;
	
	public StaticEntity(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight) {
		super(x, y, width, height);
		
		this.sx = sx;
		this.sy = sy;
		this.swidth = swidth;
		this.sheight = sheight;
		
		this.texture = new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), sx, sy, swidth, sheight);
	}
	
	@Override
	public void tick() { }
	
	@Override
	public void render(SpriteBatch batch) {
		batch.draw(texture, x, y, width, height);
	}
	
	@Override
	public void dispose() { }
	
	public TextureRegion getTexture() {
		return texture;
	}
	
	public void setTexture(TextureRegion texture) {
		this.texture = texture;
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
	
}
