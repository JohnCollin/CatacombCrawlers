package org.johncollin.catacombcrawlers.fmenu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.entity.Entity;

public class DebugMenu extends Entity {

    private boolean enabled;

    public DebugMenu() {
        super(0, 0, 0, 0);

        this.enabled = false;
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

        }
    }

    @Override
    public void dispose() {

    }
}
