package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;
import net.mcreator.glowroot.init.GlowrootModEntities;
import net.mcreator.glowroot.entity.GlowbangEntity;

import java.util.List;
import java.util.Comparator;

public class GlowrootBomberOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player || entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("glowroot:glowrootquadcopterenemy")))) {
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
						}.checkGamemode(entityiterator) || new Object() {
							public boolean checkGamemode(Entity _ent) {
								if (_ent instanceof ServerPlayer _serverPlayer) {
									return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
								} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
									return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
											&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
								}
								return false;
							}
						}.checkGamemode(entityiterator))) {
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
							if (entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY() + 9), (entityiterator.getZ()), 2.5);
								if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(
										new Vec3((entity.getX() + Mth.nextDouble(RandomSource.create(), -4, 4)), (entity.getY() + Mth.nextDouble(RandomSource.create(), -15, -2)), (entity.getZ() + Mth.nextDouble(RandomSource.create(), -4, 4))), 25,
										25, 25), e -> true).isEmpty()) {
									if (Math.random() < 0.05) {
										if (entity.getPersistentData().getBoolean("bombing") == false) {
											entity.getPersistentData().putBoolean("bombing", true);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, 1, 1, false);
												}
											}
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.GLOW, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
														((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), 10, 0.05, 0.05, 0.05, 0.2);
										}
									}
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("bombing") == true) {
				entity.getPersistentData().putDouble("attacktime", (entity.getPersistentData().getDouble("attacktime") + 1));
				if (entity.getPersistentData().getDouble("attacktime") == 95) {
					if (entity.isAlive()) {
						if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
							if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive() && !(new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
									} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
									}
									return false;
								}
							}.checkGamemode((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) || new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
									} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
									}
									return false;
								}
							}.checkGamemode((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)))) {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
											AbstractArrow entityToSpawn = new GlowbangEntity(GlowrootModEntities.GLOWBANG.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 0, 0);
									_entityToSpawn.setPos((entity.getX()), (entity.getY() - 1.5), (entity.getZ()));
									_entityToSpawn.shoot((Mth.nextDouble(RandomSource.create(), -0.05, 0.05)), (Mth.nextDouble(RandomSource.create(), -0.8, -1.1)), (Mth.nextDouble(RandomSource.create(), -0.05, 0.05)),
											(float) Mth.nextDouble(RandomSource.create(), 0.8, 1.1), (float) 0.05);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.deactivate")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.deactivate")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_FLAME.get()), (entity.getX()), (entity.getY() - 0.8), (entity.getZ()), 10, 0.05, 0.05, 0.05, 0.2);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY() - 0.8), (entity.getZ()), 10, 0.05, 0.05, 0.05, 0.2);
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("attacktime") == 300) {
					if (entity.isAlive()) {
						entity.getPersistentData().putDouble("attacktime", 0);
						entity.getPersistentData().putBoolean("bombing", false);
					}
				}
			}
		}
	}
}
