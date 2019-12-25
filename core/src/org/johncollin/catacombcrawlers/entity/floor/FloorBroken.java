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

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

/**
 * FloorBroken floor class.
 *
 * @see org.johncollin.catacombcrawlers.entity.Entity
 * @see org.johncollin.catacombcrawlers.entity.StaticEntity
 *
 * @since rev002-1.0.0-SNAPSHOT
 */
public class FloorBroken extends StaticEntity {
	
	/**
	 * FloorBroken basic class constructor.
	 *
	 * <p>
	 *     This constructor is used for random tile generation,
	 *     hence the utilization of Math.random() within this constructor.
	 * </p>
	 *
	 * @param tx The coordinate of the x plane in a unit of standard game tiles.
	 * @param ty The coordinate of the y plane in a unit of standard game tiles.
	 *
	 * @see org.johncollin.catacombcrawlers.entity.Entity
	 *
	 * @since rev002-1.0.0-SNAPSHOT
	 */
	public FloorBroken(int tx, int ty) {
		// super(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight)
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			16 + (((int) (Math.random() * 2)) * 16), 80, 16, 16);
	}
	
	/**
	 * FloorBroken basic class constructor with basic broken floor type variant.
	 *
	 * <p>
	 *     This constructor is used for specific tile generation, with an extra input "var" for
	 *     variation, which tells the object which broken floor texture to use.
	 * </p>
	 *
	 * @param tx
	 * @param ty
	 * @param var
	 *
	 * @see org.johncollin.catacombcrawlers.entity.Entity
	 *
	 * @since rev002-1.0.0-SNAPSHOT
	 */
	public FloorBroken(int tx, int ty, int var) {
		// super(int x, int y, int width, int height, int sx, int sy, int swidth, int sheight)
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES,
			16 + (var * 16), 80, 16, 16);
	}
	
}
