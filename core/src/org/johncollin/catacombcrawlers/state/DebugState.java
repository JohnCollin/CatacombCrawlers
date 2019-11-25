package org.johncollin.catacombcrawlers.state;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.floor.*;
import org.johncollin.catacombcrawlers.entity.wall.*;
import org.johncollin.catacombcrawlers.entity.wall.banner.WallBannerBlue;
import org.johncollin.catacombcrawlers.entity.wall.banner.WallBannerGreen;
import org.johncollin.catacombcrawlers.entity.wall.banner.WallBannerRed;
import org.johncollin.catacombcrawlers.entity.wall.banner.WallBannerYellow;
import org.johncollin.catacombcrawlers.entity.wall.column.WallColumn;
import org.johncollin.catacombcrawlers.entity.wall.fountain.*;

import java.util.ArrayList;

public class DebugState implements State {
	
	private ArrayList<Entity> debugBlocksByID;
	
	public DebugState() {
		debugBlocksByID = new ArrayList<Entity>();
		
		debugBlocksByID.add(new WallLeft(0, 1));
		debugBlocksByID.add(new WallMiddle(1, 1));
		debugBlocksByID.add(new WallRight(2, 1));
		
		debugBlocksByID.add(new WallTopLeft(0, 2));
		debugBlocksByID.add(new WallTopMiddle(1, 2));
		debugBlocksByID.add(new WallTopRight(2, 2));
		
		debugBlocksByID.add(new WallFountainTop(3, 2));
		debugBlocksByID.add(new WallFountainMidRed(3, 1));
		debugBlocksByID.add(new WallFountainBasinRed(3, 0));
		debugBlocksByID.add(new WallFountainMidBlue(4, 1));
		debugBlocksByID.add(new WallFountainBasinBlue(4, 0));
		
		debugBlocksByID.add(new WallHole(5, 1, true));
		debugBlocksByID.add(new WallHole(6, 1, false));
		
		debugBlocksByID.add(new WallBannerBlue(7, 1));
		debugBlocksByID.add(new WallBannerGreen(8, 1));
		debugBlocksByID.add(new WallBannerRed(9, 1));
		debugBlocksByID.add(new WallBannerYellow(10, 1));
		
		debugBlocksByID.add(new WallColumn(11, 0, true));
		debugBlocksByID.add(new WallColumn(12, 0, false));
		
		debugBlocksByID.add(new WallGoo(13, 1));
		debugBlocksByID.add(new FloorGoo(13, 0));
		
		debugBlocksByID.add(new Floor(0, 0, 0));
		debugBlocksByID.add(new Floor(1, 0, 1));
		debugBlocksByID.add(new Floor(2, 0, 2));
		
		debugBlocksByID.add(new FloorBroken(5, 0, 0));
		debugBlocksByID.add(new FloorBroken(6, 0, 1));
		debugBlocksByID.add(new FloorBroken(7, 0, 2));
		
		debugBlocksByID.add(new FloorDamaged(8, 0, 0));
		debugBlocksByID.add(new FloorDamaged(9, 0, 1));
		
		debugBlocksByID.add(new FloorLadder(10, 0));
		
		debugBlocksByID.add(new FloorSpikes(11, 0));
		
		debugBlocksByID.add(new WallSideTopLeft(0, 5));
		debugBlocksByID.add(new WallSideMidLeft(0, 4));
		debugBlocksByID.add(new WallSideFrontLeft(0, 3));
		
		debugBlocksByID.add(new WallSideTopRight(1, 5));
		debugBlocksByID.add(new WallSideMidRight(1, 4));
		debugBlocksByID.add(new WallSideFrontRight(1, 3));
	}
	
	@Override
	public void tick() {
		for(Entity staticEntity : debugBlocksByID) {
			staticEntity.tick();
		}
	}
	
	@Override
	public void render(SpriteBatch batch) {
		for(Entity staticEntity : debugBlocksByID) {
			staticEntity.render(batch);
		}
	}
	
	@Override
	public void dispose() {
		for(Entity staticEntity : debugBlocksByID) {
			staticEntity.dispose();
		}
	}
}
