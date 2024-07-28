package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
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

public class PrimedGlowrootTNTOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double particleNum = 0;
		double vX = 0;
		double vY = 0;
		double vZ = 0;
		double i = 0;
		double x_pos = 0;
		double z_pos = 0;
		double speed = 0;
		double arcAngle = 0;
		double radAngle = 0;
		double radPitch = 0;
		double radYaw = 0;
		double angle = 0;
		double y_pos = 0;
		double radius = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
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
		entity.getPersistentData().putDouble("modEntityTimer", (entity.getPersistentData().getDouble("modEntityTimer") + 0.05));
		if (entity.getPersistentData().getDouble("modEntityTimer") > 4) {
			if (entity.getPersistentData().getDouble("crystalized") == 5) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((Mth.nextDouble(RandomSource.create(), 14, 16)) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(GlowrootModMobEffects.DAZZLED.get(), (int) Mth.nextDouble(RandomSource.create(), 350, 400), 0));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) Mth.nextDouble(RandomSource.create(), 350, 400), 0));
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
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 12, 7, 7, 7, 1);
				for (int index0 = 0; index0 < 50; index0++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.GLOW, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 5, 1.5, 1.5, 1.5, 0.5);
				}
				for (int index1 = 0; index1 < 16; index1++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
								(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 10, 1.5, 1.5, 1.5, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
								(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 10, 0.1, 0.1, 0.1, 0.1);
				}
				sx = -3;
				found = false;
				for (int index2 = 0; index2 < 7; index2++) {
					sy = -3;
					for (int index3 = 0; index3 < 7; index3++) {
						sz = -2;
						for (int index4 = 0; index4 < 7; index4++) {
							if (!(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:cantexplode")))) {
								if (world instanceof ServerLevel _level)
									FallingBlockEntity.fall(_level, BlockPos.containing(x + sx, y + sy, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))));
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.PLAYERS, (float) 1.5, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.PLAYERS, (float) 1.5, (float) 1.3, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) Mth.nextDouble(RandomSource.create(), 5, 7), Level.ExplosionInteraction.TNT);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) Mth.nextDouble(RandomSource.create(), 5, 7), Level.ExplosionInteraction.MOB);
			} else {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((Mth.nextDouble(RandomSource.create(), 9, 11)) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(GlowrootModMobEffects.DAZZLED.get(), (int) Mth.nextDouble(RandomSource.create(), 250, 300), 0));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) Mth.nextDouble(RandomSource.create(), 250, 300), 0));
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
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 7, 7, 7, 1);
				for (int index5 = 0; index5 < 30; index5++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.GLOW, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 1, 1.5, 1.5, 1.5, 0.5);
				}
				for (int index6 = 0; index6 < 8; index6++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
								(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 10, 1.5, 1.5, 1.5, 0.5);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
								(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 10, 0.1, 0.1, 0.1, 0.1);
				}
				sx = -3;
				found = false;
				for (int index7 = 0; index7 < 7; index7++) {
					sy = -3;
					for (int index8 = 0; index8 < 7; index8++) {
						sz = -2;
						for (int index9 = 0; index9 < 7; index9++) {
							if (!(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:cantexplode")))) {
								if (world instanceof ServerLevel _level)
									FallingBlockEntity.fall(_level, BlockPos.containing(x + sx, y + sy, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))));
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.PLAYERS, 1, (float) 1.2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.PLAYERS, 1, (float) 1.2, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) Mth.nextDouble(RandomSource.create(), 2, 3), Level.ExplosionInteraction.TNT);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, (float) Mth.nextDouble(RandomSource.create(), 2, 3), Level.ExplosionInteraction.MOB);
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
	}
}
