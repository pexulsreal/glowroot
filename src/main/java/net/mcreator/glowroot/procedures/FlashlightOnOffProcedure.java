package net.mcreator.glowroot.procedures;

import net.minecraft.world.item.ItemStack;

public class FlashlightOnOffProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("flashlighton") == true) {
			return 1;
		} else if (itemstack.getOrCreateTag().getBoolean("flashlighton") == false) {
			return 2;
		}
		return 0;
	}
}
