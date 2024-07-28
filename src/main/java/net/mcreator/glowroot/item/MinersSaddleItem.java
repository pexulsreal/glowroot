
package net.mcreator.glowroot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MinersSaddleItem extends Item {
	public MinersSaddleItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
