package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class GlowflowersporesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 2; index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_SPORE.get()), (x + 0.5), (y + Mth.nextDouble(RandomSource.create(), 0.3, 1)), (z + 0.5), 10, 0.1, 0.1, 0.1, 0.1);
		}
	}
}
