package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class TorchWallClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isClientSide()) {
			if (Math.random() >= 0.95) {
				world.addParticle((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_FLAME.get()), (x + Mth.nextDouble(RandomSource.create(), 0.48, 0.52)), (y + Mth.nextDouble(RandomSource.create(), 0.78, 0.84)),
						(z + Mth.nextDouble(RandomSource.create(), 0.48, 0.52)), (Mth.nextDouble(RandomSource.create(), -0.01, 0.01)), (Mth.nextDouble(RandomSource.create(), -0.01, 0.01)), (Mth.nextDouble(RandomSource.create(), -0.01, 0.01)));
			}
		}
	}
}
