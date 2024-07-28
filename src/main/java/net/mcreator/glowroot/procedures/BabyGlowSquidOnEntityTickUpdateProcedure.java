package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class BabyGlowSquidOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.06) {
			world.addParticle(ParticleTypes.GLOW, (entity.getX()), (entity.getY()), (entity.getZ()), 0, 0, 0);
		}
	}
}
