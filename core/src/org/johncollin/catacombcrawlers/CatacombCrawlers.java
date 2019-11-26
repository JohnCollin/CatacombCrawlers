package org.johncollin.catacombcrawlers;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.fmenu.DebugMenu;
import org.johncollin.catacombcrawlers.state.DebugState;
import org.johncollin.catacombcrawlers.state.State;

public class CatacombCrawlers extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private Texture tileset;
	
	private State currentState;
	private DebugState debugState;
	
	private DebugMenu debugMenu;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		tileset = new Texture("tileset.png");
		CatacombCrawlersAPI.getInstance().setGameTileset(tileset);
		
		CatacombCrawlersAPI.getInstance().setCatacombCrawlers(this);
		
		setupCustomCursor();
		
		this.debugState = new DebugState();
		
		this.debugMenu = new DebugMenu();
		
		this.currentState = debugState;
	}
	
	private void setupCustomCursor() {
		Pixmap pixmap = new Pixmap(Gdx.files.internal("cursor.png"));
		Gdx.graphics.setCursor(Gdx.graphics.newCursor(pixmap, 0, 0));
		pixmap.dispose();
	}
	
	private void tick() {
		debugMenu.tick();
		
		if(Gdx.input.isKeyPressed(Input.Keys.ESCAPE)) {
			Gdx.app.exit();
		}
		
		currentState.tick();
	}
	
	@Override
	public void render () {
		tick();
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		currentState.render(batch);
		debugMenu.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		
		currentState.dispose();
		
		debugMenu.dispose();
	}
}
