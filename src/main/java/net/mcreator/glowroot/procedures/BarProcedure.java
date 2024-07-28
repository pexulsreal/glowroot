package net.mcreator.glowroot.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.init.GlowrootModEnchantments;

public class BarProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.GLOWROOTED.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			return true;
		}
		return false;
	}
}
