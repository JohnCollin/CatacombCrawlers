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

package org.johncollin.catacombcrawlers.entity.floor;

import org.johncollin.catacombcrawlers.entity.AnimatedEntity;
import org.johncollin.catacombcrawlers.entity.Entity;

/**
 * Basic FloorSpikes class (special tile)
 *
 * @see org.johncollin.catacombcrawlers.entity.Entity
 * @see org.johncollin.catacombcrawlers.entity.AnimatedEntity
 *
 * @since rev002-1.0.0-SNAPSHOT
 */
public class FloorSpikes extends AnimatedEntity {
	
	/**
	 * Boolean that states whether or not the tile is currently in the animation mode.
	 */
	private static boolean anim = false;
	
	/**
	 * Animation clock by units of tick (how many frames have passed until update essentially)
	 */
	private static int animClock = 0;
	/**
	 * Animation frame clock (rate at how slow the frames cycle essentially)
	 */
	private static final int animClockMax = 3;
	
	/**
	 * FloorSpikes base class constructor.
	 * <p>
	 * Constructs one of type FloorSpikes at a given tile coordinate location.
	 *
	 * @param tx The coordinate of the x plane in a unit of standard game tiles.
	 * @param ty The coordinate of the y plane in a unit of standard game tiles.
	 *
	 * @see org.johncollin.catacombcrawlers.entity.Entity
	 *
	 * @since rev002-1.0.0-SNAPSHOT
	 */
	public FloorSpikes(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			16, 176, 16, 16, 4);
	}
	
	/**
	 * Overridden method from {@link org.johncollin.catacombcrawlers.entity.AnimatedEntity} for special
	 * update method.
	 *
	 * @see org.johncollin.catacombcrawlers.entity.Entity
	 * @see org.johncollin.catacombcrawlers.entity.AnimatedEntity
	 *
	 * @since rev002-1.0.0-SNAPSHOT
	 */
	@Override
	public void tick() {
		if(anim) {
			animClock++;
			
			if(animClock >= animClockMax) {
				currentTexture++;
				animClock = 0;
				if(currentTexture >= sframes) {
					currentTexture = 0;
					animClock = 0;
					anim = false;
				}
			}
		}
	}
	
	/**
	 * Method that enables the spike animation, can be called publicly.
	 *
	 * @since rev002-1.0.0-SNAPSHOT
	 */
	public void spike() {
		anim = true;
	}
	
}
