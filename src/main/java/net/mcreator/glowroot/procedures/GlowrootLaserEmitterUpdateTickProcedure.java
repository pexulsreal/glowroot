package net.mcreator.glowroot.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GlowrootLaserEmitterUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Vec3 pos0 = Vec3.ZERO;
		Vec3 pos1 = Vec3.ZERO;
		Vec3 pos2 = Vec3.ZERO;
		Vec3 pos3 = Vec3.ZERO;
		Vec3 pos4 = Vec3.ZERO;
		boolean flag0 = false;
		double height = 0;
		double particleamount = 0;
		double hy = 0;
		double particleRadius = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		double speed = 0;
		double var5 = 0;
		double var4 = 0;
		double var3 = 0;
		double radius = 0;
		double var2 = 0;
		double var1 = 0;
		double var0 = 0;
		double range = 0;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		double raytrace_y = 0;
		double raytrace_x = 0;
		double raytrace_z = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootartificialchargeblock")))
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootartificialchargeblock")))
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootartificialchargeblock")))
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootartificialchargeblock")))
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootartificialchargeblock")))
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootartificialchargeblock")))
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootchargeblock")))) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
		}
	}
}
