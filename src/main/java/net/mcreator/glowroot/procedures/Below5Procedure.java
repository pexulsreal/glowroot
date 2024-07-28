package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModEnchantments;

public class Below5Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.GLOWROOTED.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 5) {
				return true;
			}
		}
		return false;
	}
}
