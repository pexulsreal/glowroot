
package net.mcreator.glowroot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlowrootDustItem extends Item {
	public GlowrootDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
