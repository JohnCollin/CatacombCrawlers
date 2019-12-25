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

package org.johncollin.catacombcrawlers.state;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.floor.*;
import org.johncollin.catacombcrawlers.entity.interactable.Door;
import org.johncollin.catacombcrawlers.entity.item.flask.*;
import org.johncollin.catacombcrawlers.entity.item.misc.ItemStackCoin;
import org.johncollin.catacombcrawlers.entity.misc.TileCrate;
import org.johncollin.catacombcrawlers.entity.misc.TileSkull;
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
		
		generateTileComplements();
		
		generateItems();
		
		generateSpecialWallTiles();
		
		generateAlternateWallTiles();
		
		generateBasicWallTiles();
		
		generateFloorDebugTiles();
	}
	
	private void generateTileComplements() {
		debugBlocksByID.add(new TileSkull(6, 5));
		debugBlocksByID.add(new TileCrate(7, 5));
	}
	
	private void generateItems() {
		debugBlocksByID.add(new ItemStackBigHealthFlask(6, 4));
		debugBlocksByID.add(new ItemStackBigStaminaFlask(7, 4));
		debugBlocksByID.add(new ItemStackBigMagicFlask(8, 4));
		debugBlocksByID.add(new ItemStackBigLuckFlask(9, 4));
		
		debugBlocksByID.add(new ItemStackHealthFlask(6, 3));
		debugBlocksByID.add(new ItemStackStaminaFlask(7, 3));
		debugBlocksByID.add(new ItemStackMagicFlask(8, 3));
		debugBlocksByID.add(new ItemStackLuckFlask(9, 3));
		
		debugBlocksByID.add(new ItemStackCoin(8, 5));
	}
	
	private void generateSpecialWallTiles() {
		debugBlocksByID.add(new Door(14, 1, false));
		debugBlocksByID.add(new Door(14, 4, true));
	}
	
	private void generateAlternateWallTiles() {
		debugBlocksByID.add(new WallSideTopLeft(0, 5));
		debugBlocksByID.add(new WallSideMidLeft(0, 4));
		debugBlocksByID.add(new WallSideFrontLeft(0, 3));

		debugBlocksByID.add(new WallSideTopRight(1, 5));
		debugBlocksByID.add(new WallSideMidRight(1, 4));
		debugBlocksByID.add(new WallSideFrontRight(1, 3));

		debugBlocksByID.add(new WallCornerTopLeft(2, 6));
		debugBlocksByID.add(new WallCornerLeft(2, 5));
		debugBlocksByID.add(new WallCornerBottomLeft(2, 4));
		debugBlocksByID.add(new WallCornerFrontLeft(2, 3));

		debugBlocksByID.add(new WallCornerTopRight(3, 6));
		debugBlocksByID.add(new WallCornerRight(3, 5));
		debugBlocksByID.add(new WallCornerBottomRight(3, 4));
		debugBlocksByID.add(new WallCornerFrontRight(3, 3));

		debugBlocksByID.add(new WallInnerCornerTTopLeft(5, 5));
		debugBlocksByID.add(new WallInnerCornerLTopLeft(5, 4));
		debugBlocksByID.add(new WallInnerCornerMidLeft(5, 3));

		debugBlocksByID.add(new WallInnerCornerTTopRight(4, 5));
		debugBlocksByID.add(new WallInnerCornerLTopRight(4, 4));
		debugBlocksByID.add(new WallInnerCornerMidRight(4, 3));
	}

	private void generateBasicWallTiles() {
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
	}

	private void generateFloorDebugTiles() {
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

		debugBlocksByID.add(new FloorEdge(13, 0));
		debugBlocksByID.add(new FloorHole(14, 0));
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
