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
				Gdx.graphics.getFramesPerSecond() + " fps"
			;
			
			font.draw(batch, currentDebugMessage, 32, Gdx.graphics.getHeight() - 32);
		}
	}
	
	@Override
	public void dispose() {
	
	}
}
