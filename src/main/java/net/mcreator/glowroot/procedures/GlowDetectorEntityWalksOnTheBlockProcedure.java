package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class GlowDetectorEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		ItemStack pickaxe = ItemStack.EMPTY;
		double enchant_levels = 0;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
	}
}
