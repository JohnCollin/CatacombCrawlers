package org.johncollin.catacombcrawlers.state;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface State {
	
	void tick();
	void render(SpriteBatch batch);
	void dispose();
	
}
