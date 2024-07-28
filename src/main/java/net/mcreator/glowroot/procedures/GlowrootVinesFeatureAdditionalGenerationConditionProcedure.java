package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class GlowrootVinesFeatureAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() instanceof LiquidBlock && (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() instanceof LiquidBlock
				&& (world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() instanceof LiquidBlock && (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() instanceof LiquidBlock
				&& (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() instanceof LiquidBlock && (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() instanceof LiquidBlock
				&& (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() instanceof LiquidBlock) && world.getBlockState(BlockPos.containing(x, y + 1, z)).isFaceSturdy(world, BlockPos.containing(x, y + 1, z), Direction.DOWN)) {
			return true;
		}
		return false;
	}
}
