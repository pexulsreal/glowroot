package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;
import net.mcreator.glowroot.init.GlowrootModMobEffects;

import java.util.List;
import java.util.Comparator;

public class BalloonhitblocksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((Mth.nextDouble(RandomSource.create(), 4, 5)) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(GlowrootModMobEffects.DAZZLED.get(), (int) Mth.nextDouble(RandomSource.create(), 160, 180), 0));
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) Mth.nextDouble(RandomSource.create(), 160, 180), 0));
				if (entityiterator instanceof ServerPlayer) {
					if (entityiterator instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("glowroot:stunning"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.splash")), SoundSource.PLAYERS, (float) 1.3, (float) 1.2);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.axolotl.splash")), SoundSource.PLAYERS, (float) 1.3, (float) 1.2, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 1.2, (float) 1.2);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 1.2, (float) 1.2, false);
			}
		}
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
		for (int index0 = 0; index0 < 8; index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
						(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 4, 0.1, 0.1, 0.1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 6, 0.05, 0.05, 0.05, 0.05);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_INK.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
						(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 8, 0.05, 0.05, 0.05, 0.05);
		}
	}
}
