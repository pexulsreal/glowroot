
package net.mcreator.glowroot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GlowrootEngineItem extends Item {
	public GlowrootEngineItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
