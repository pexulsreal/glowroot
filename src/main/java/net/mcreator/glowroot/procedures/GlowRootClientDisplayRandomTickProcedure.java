package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;

public class GlowRootClientDisplayRandomTickProcedure {
	public static BlockState execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT_END.get())) {
			return GlowrootModBlocks.GLOW_ROOT_END.get().defaultBlockState();
		}
		return GlowrootModBlocks.GLOW_ROOT.get().defaultBlockState();
	}
}
