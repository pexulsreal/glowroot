package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;

public class LockerAirNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOWROOT_LOCKER.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOWROOT_LOCKER_OPEN.get())) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
