package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;

public class GlowRootBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT.get() || world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT_END.get()) && !world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			return true;
		}
		return false;
	}
}
