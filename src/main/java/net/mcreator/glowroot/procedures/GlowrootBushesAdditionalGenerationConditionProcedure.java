package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;

public class GlowrootBushesAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() instanceof LiquidBlock && world.getBlockState(BlockPos.containing(x, y, z)).canOcclude())
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOWROOTED_STONE.get()) {
			return true;
		}
		return false;
	}
}
