package org.johncollin.catacombcrawlers.entity.item.flask;

import org.johncollin.catacombcrawlers.entity.item.ItemStack;

public class ItemStackFlask extends ItemStack {
	
	public ItemStackFlask(int tx, int ty, int var) {
		super(tx, ty, 288 + (var * 16), 240, 16, 16);
	}
	
}
