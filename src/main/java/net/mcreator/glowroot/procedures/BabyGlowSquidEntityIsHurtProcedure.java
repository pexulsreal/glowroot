package net.mcreator.glowroot.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class BabyGlowSquidEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY()), (entity.getZ()), 6, 0.3, 0.3, 0.3, 0.3);
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + 0.6), (entity.getDeltaMovement().y() + 0.6), (entity.getDeltaMovement().z() + 0.6)));
	}
}
