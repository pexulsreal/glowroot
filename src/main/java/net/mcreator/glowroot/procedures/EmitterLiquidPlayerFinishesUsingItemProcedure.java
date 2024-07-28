package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
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
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;
import net.mcreator.glowroot.init.GlowrootModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class EmitterLiquidPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 2) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				itemstack.getOrCreateTag().putDouble("keycardlvl", 0);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8, 8, 8), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(GlowrootModMobEffects.DAZZLED.get(), 200, 0));
						for (int index0 = 0; index0 < 8; index0++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 4, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 4, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 6, 0.05, 0.05, 0.05, 0.05);
						}
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
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 1.3, (float) 1.1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 1.3, (float) 1.1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.work_cleric")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.work_cleric")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 1) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				itemstack.getOrCreateTag().putDouble("keycardlvl", 0);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8, 8, 8), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1200, 0));
						for (int index1 = 0; index1 < 8; index1++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 6, 0.05, 0.05, 0.05, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_INK.get()), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 8, 0.05, 0.05, 0.05, 0.05);
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.work_cleric")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.work_cleric")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_INK.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 3) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				itemstack.getOrCreateTag().putDouble("keycardlvl", 0);
			}
			sx = -1;
			for (int index2 = 0; index2 < 3; index2++) {
				sy = -1;
				for (int index3 = 0; index3 < 3; index3++) {
					sz = -1;
					for (int index4 = 0; index4 < 3; index4++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof BonemealableBlock) {
							if (world instanceof Level _level) {
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + sx + 0.5), (y + sy + 1), (z + sz + 0.5), 5, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.BLOCKS, (float) 1.5, (float) 1.2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.BLOCKS, (float) 1.5, (float) 1.2, false);
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
		} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 4) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				itemstack.getOrCreateTag().putDouble("keycardlvl", 0);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8, 8, 8), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 0));
						for (int index5 = 0; index5 < 8; index5++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.SQUID_INK.get()), (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 6, 0.05, 0.05, 0.05, 0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ASH, (entityiterator.getX() + Mth.nextDouble(RandomSource.create(), 0, 1)), (entityiterator.getY() + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(entityiterator.getZ() + Mth.nextDouble(RandomSource.create(), 0, 1)), 8, 0.05, 0.05, 0.05, 0.05);
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.work_cleric")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.work_cleric")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wandering_trader.drink_milk")), SoundSource.PLAYERS, (float) 0.9, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.SQUID_INK.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 0.1, 0.1, 0.1, 0.1);
		}
	}
}
