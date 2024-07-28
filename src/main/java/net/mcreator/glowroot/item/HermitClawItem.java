
package net.mcreator.glowroot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HermitClawItem extends Item {
	public HermitClawItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
