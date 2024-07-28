
package net.mcreator.glowroot.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedGlowSquidTentacleItem extends Item {
	public CookedGlowSquidTentacleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.4f).build()));
	}
}
