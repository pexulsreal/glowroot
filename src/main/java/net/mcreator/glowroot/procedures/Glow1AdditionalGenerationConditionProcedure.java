package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Glow1AdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
