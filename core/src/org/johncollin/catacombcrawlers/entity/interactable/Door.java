package org.johncollin.catacombcrawlers.entity.interactable;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.johncollin.catacombcrawlers.CatacombCrawlersAPI;
import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

public class Door extends StaticEntity implements Interactable {

    private boolean isOpen;

    private TextureRegion openDoor;

    private int openXOffset;

    public Door(int tx, int ty) {
        super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
                16, 221, 64, 35);

        this.isOpen = false;

        this.openDoor = new TextureRegion(CatacombCrawlersAPI.getInstance().getGameTileset(), 80, 224, 32, 32);

        this.openXOffset = sx + 16;
    }

    @Override
    public void render(SpriteBatch batch) {

    }

    @Override
    public void onInteract() {

    }
}
