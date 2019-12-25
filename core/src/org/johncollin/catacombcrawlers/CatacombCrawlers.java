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

package org.johncollin.catacombcrawlers;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.fmenu.DebugMenu;
import org.johncollin.catacombcrawlers.graphics.Assets;
import org.johncollin.catacombcrawlers.state.DebugState;
import org.johncollin.catacombcrawlers.state.State;

public class CatacombCrawlers extends ApplicationAdapter {
	
	public static final String OFFICIAL_NAME = "CatacombCrawlers";
	public static final String VERSION = "rev002-1.0.0-SNAPSHOT";
	public static final String PUBLIC_VERSION = "1.0.0";
	public static final String GAME_TYPE = CatacombCrawlers.PUBLIC_VERSION + "/vanilla";
	
	//Graphics
	private SpriteBatch batch;
	private Texture tileset;
	
	//Game States
	private State currentState;
	private DebugState debugState;
	
	//F3 Menu (DEBUG)
	private DebugMenu debugMenu;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		tileset = new Texture(Assets.tileset);
		CatacombCrawlersAPI.getInstance().setGameTileset(tileset);
		
		CatacombCrawlersAPI.getInstance().setCatacombCrawlers(this);
		
		setupCustomCursor();
		
		this.debugState = new DebugState();
		
		this.debugMenu = new DebugMenu();
		
		this.currentState = debugState;
	}
	
	private void setupCustomCursor() {
		Pixmap pixmap = new Pixmap(Gdx.files.internal(Assets.cursor));
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
