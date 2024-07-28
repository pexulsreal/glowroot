package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class BalloonglowflyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 3; index0++) {
			world.addParticle(ParticleTypes.GLOW, (x + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)), y, (z + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)), 0.05, 0.05, 0.05);
		}
		for (int index1 = 0; index1 < 1; index1++) {
			world.addParticle((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_INK.get()), (x + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)), y, (z + Mth.nextDouble(RandomSource.create(), -0.2, 0.2)), 0.05, 0.05, 0.05);
		}
	}
}
