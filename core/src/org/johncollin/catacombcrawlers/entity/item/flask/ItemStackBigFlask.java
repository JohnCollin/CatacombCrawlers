package org.johncollin.catacombcrawlers.entity.item.flask;

import org.johncollin.catacombcrawlers.entity.item.ItemStack;

public abstract class ItemStackBigFlask extends ItemStack {
	
	public ItemStackBigFlask(int tx, int ty, int var) {
		super(tx, ty, 288 + (var * 16), 224, 16, 16);
	}
	
}
