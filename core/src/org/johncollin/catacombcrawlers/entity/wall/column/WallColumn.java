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

package org.johncollin.catacombcrawlers.entity.wall.column;

import org.johncollin.catacombcrawlers.entity.Entity;
import org.johncollin.catacombcrawlers.entity.StaticEntity;

/**
 * WallColumn base class
 *
 * @see org.johncollin.catacombcrawlers.entity.Entity
 * @see org.johncollin.catacombcrawlers.entity.StaticEntity
 *
 * @since rev-004-1.0.0-SNAPSHOT
 */
public class WallColumn extends StaticEntity {
	
	/**
	 * WallColumn basic constructor
	 *
	 * @param tx The coordinate of the x plane in a unit of standard game tiles.
	 * @param ty The coordinate of the y plane in a unit of standard game tiles.
	 *
	 * @since rev-004-1.0.0-SNAPSHOT
	 */
	public WallColumn(int tx, int ty) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES * 3,
			80, 80, 16, 48);
	}
	
	/**
	 * WallColumn basic constructor with boolean hasWall flag
	 *
	 * @param tx The coordinate of the x plane in a unit of standard game tiles.
	 * @param ty The coordinate of the y plane in a unit of standard game tiles.
	 *
	 * @since rev-004-1.0.0-SNAPSHOT
	 */
	public WallColumn(int tx, int ty, boolean hasWall) {
		super(tx * Entity.TILED_RES, ty * Entity.TILED_RES, Entity.TILED_RES, Entity.TILED_RES * 3,
			hasWall ? 96 : 80, 80, 16, 48);
	}
	
}
