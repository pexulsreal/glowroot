package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LightlevelvalueProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return "" + world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z));
	}
}
