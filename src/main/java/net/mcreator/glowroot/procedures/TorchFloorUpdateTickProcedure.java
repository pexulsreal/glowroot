package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class TorchFloorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.2) {
			world.addParticle((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_FLAME.get()), (x + 0.5), (y + 0.8), (z + 0.5), (Mth.nextInt(RandomSource.create(), 0, (int) 0.05)), (Mth.nextInt(RandomSource.create(), 0, (int) 0.05)),
					(Mth.nextInt(RandomSource.create(), 0, (int) 0.05)));
		}
	}
}
