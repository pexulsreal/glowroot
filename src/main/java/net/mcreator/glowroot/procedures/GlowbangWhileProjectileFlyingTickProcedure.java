package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class GlowbangWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 2; index0++) {
			world.addParticle(ParticleTypes.GLOW, x, y, z, 0.15, 0.15, 0.15);
		}
		for (int index1 = 0; index1 < 1; index1++) {
			world.addParticle((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), x, y, z, 0.15, 0.15, 0.15);
		}
	}
}
