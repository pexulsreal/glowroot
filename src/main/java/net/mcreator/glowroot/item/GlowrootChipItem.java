
package net.mcreator.glowroot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlowrootChipItem extends Item {
	public GlowrootChipItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
