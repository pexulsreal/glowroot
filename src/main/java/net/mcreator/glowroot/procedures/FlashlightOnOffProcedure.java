package net.mcreator.glowroot.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.glowroot.init.GlowrootModEnchantments;

public class FlashlightOnOffProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("flashlighton") == true) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.RED_LIGHT.get(), itemstack) != 0) && EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.YELLOW_LIGHT.get(), itemstack) != 0) {
				return 4;
			} else if (!(EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.YELLOW_LIGHT.get(), itemstack) != 0) && EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.RED_LIGHT.get(), itemstack) != 0) {
				return 3;
			} else if (EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.RED_LIGHT.get(), itemstack) != 0 && EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.YELLOW_LIGHT.get(), itemstack) != 0) {
				return 5;
			}
			return 1;
		} else if (itemstack.getOrCreateTag().getBoolean("flashlighton") == false) {
			return 2;
		}
		return 0;
	}
}
