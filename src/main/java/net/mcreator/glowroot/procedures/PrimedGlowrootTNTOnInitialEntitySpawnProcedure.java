package net.mcreator.glowroot.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PrimedGlowrootTNTOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		{
			Entity _ent = entity;
			_ent.setYRot(0);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + Mth.nextDouble(RandomSource.create(), -0.05, 0.05)), (entity.getDeltaMovement().y() + Mth.nextDouble(RandomSource.create(), 0.2, 0.25)),
				(entity.getDeltaMovement().z() + Mth.nextDouble(RandomSource.create(), -0.05, 0.05))));
		entity.setGlowingTag(true);
		entity.setInvulnerable(true);
	}
}
