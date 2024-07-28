package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;

public class GlowRootUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level)
			_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT_END.get())) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
			world.setBlock(BlockPos.containing(x, y, z), GlowrootModBlocks.GLOW_ROOT_END.get().defaultBlockState(), 3);
		}
	}
}
