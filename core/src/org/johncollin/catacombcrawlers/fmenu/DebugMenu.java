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

package org.johncollin.catacombcrawlers.fmenu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import org.johncollin.catacombcrawlers.CatacombCrawlers;
import org.johncollin.catacombcrawlers.entity.Entity;

public class DebugMenu extends Entity {
	
	private boolean enabled;
	
	private String currentDebugMessage = "";
	
	private FreeTypeFontGenerator freeTypeFontGenerator;
	private BitmapFont font;
	
	public DebugMenu() {
		super(0, 0, 0, 0);
		
		this.enabled = false;
		
		freeTypeFontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("uni0553-webfont.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter freeTypeFontParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		freeTypeFontParameter.size = 24;
		font = freeTypeFontGenerator.generateFont(freeTypeFontParameter);
	}
	
	@Override
	public void tick() {
		if(Gdx.input.isKeyJustPressed(Input.Keys.F3)) {
			enabled = !enabled;
		}
	}
	
	@Override
	public void render(SpriteBatch batch) {
		if(enabled) {
			currentDebugMessage =
				CatacombCrawlers.OFFICIAL_NAME + " " + CatacombCrawlers.VERSION + " (" + CatacombCrawlers.GAME_TYPE + ")\n" +
				Gdx.graphics.getFramesPerSecond() + " fps\n\n" +
				
				"Internal Server @ 0ms ticks\n\n" +
				
				"Java: " + System.getProperty("java.version") + "\n" +
				"Mem: " + Runtime.getRuntime().totalMemory() + "\n" +
				"Allocated: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + "\n"
			;
			
			font.draw(batch, currentDebugMessage, 32, Gdx.graphics.getHeight() - 32);
		}
	}
	
	@Override
	public void dispose() {
	
	}
}
