package org.johncollin.catacombcrawlers;

import com.badlogic.gdx.graphics.Texture;

public class CatacombCrawlersAPI {
	
	private static CatacombCrawlersAPI instance;
	
	private CatacombCrawlers catacombCrawlers;
	
	private Texture gameTileset;
	
	private CatacombCrawlersAPI() { }
	
	public static CatacombCrawlersAPI getInstance() {
		if(instance == null) {
			instance = new CatacombCrawlersAPI();
		}
		
		return instance;
	}
	
	public CatacombCrawlers getCatacombCrawlers() {
		return catacombCrawlers;
	}
	
	public void setCatacombCrawlers(CatacombCrawlers catacombCrawlers) {
		this.catacombCrawlers = catacombCrawlers;
	}
	
	public Texture getGameTileset() {
		return gameTileset;
	}
	
	public void setGameTileset(Texture gameTileset) {
		this.gameTileset = gameTileset;
	}
	
}
