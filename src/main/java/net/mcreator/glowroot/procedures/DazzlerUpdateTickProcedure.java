package net.mcreator.glowroot.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModMobEffects;

import java.util.List;
import java.util.Comparator;

public class DazzlerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double increaser = 0;
		double range = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("glowroot:glowrootchargeblock")))) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(GlowrootModMobEffects.DAZZLED.get(),
								(int) ((entityiterator instanceof LivingEntity _livEnt && _livEnt.hasEffect(GlowrootModMobEffects.DAZZLED.get()) ? _livEnt.getEffect(GlowrootModMobEffects.DAZZLED.get()).getDuration() : 0) + 2), 0));
				}
			}
		}
	}
}