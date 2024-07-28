package net.mcreator.glowroot.procedures;

import net.minecraft.world.item.ItemStack;

public class GlowrootKeycardPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 2) {
			return 2;
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 3) {
			return 3;
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 1) {
			return 1;
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 4) {
			return 4;
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 5) {
			return 5;
		}
		return 0;
	}
}
