package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class GlowrootJetpackChestplateTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		if (entity.getPersistentData().getBoolean("jetpackon") == true) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(Items.FIREWORK_ROCKET, 50);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:ambientglowrootblock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:ambientglowrootblock")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
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
			}.checkGamemode(entity) || new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
						- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() > 20) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7bFuel: " + ("\u00A73" + ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
								- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue())))), true);
				} else {
					if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
							- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 19
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 17
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 15
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 13
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 11
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 9
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 7
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 5
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 3
							|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 1)) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7cFuel:" + ("\u00A74" + ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue())))), true);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7fFuel:" + ("\u00A77" + ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getMaxDamage()
									- (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue())))), true);
					}
				}
			}
			if (entity.getPersistentData().getBoolean("jetpackon") == true) {
				if (!entity.onGround()) {
					if (entity.getPersistentData().getBoolean("jetpackon") == true) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false)) {
							if (entity.getPersistentData().getBoolean("jetpackon") == true) {
								entity.setDeltaMovement(new Vec3((entity.getLookAngle().x / 3), Math.abs(entity.getLookAngle().y / 2), (entity.getLookAngle().z / 3)));
								if (entity.getPersistentData().getBoolean("jetpackon") == true) {
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
									}.checkGamemode(entity) || new Object() {
										public boolean checkGamemode(Entity _ent) {
											if (_ent instanceof ServerPlayer _serverPlayer) {
												return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
											} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
												return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
														&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
											}
											return false;
										}
									}.checkGamemode(entity))) {
										if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") >= 10) {
											{
												ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
												if (_ist.hurt(1, RandomSource.create(), null)) {
													_ist.shrink(1);
													_ist.setDamageValue(0);
												}
											}
											(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait", 0);
										}
										(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait",
												((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") + 1));
									}
								}
							}
						} else {
							if (entity.getPersistentData().getBoolean("jetpackon") == true) {
								if (entity.getDeltaMovement().x() > 0) {
									entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + 0.01), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
								} else {
									entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() - 0.01), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
								}
								if (entity.getLookAngle().y > 0) {
									entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), Math.abs(entity.getDeltaMovement().y() + 0.03), (entity.getDeltaMovement().z())));
								} else {
									entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
								}
								if (entity.getDeltaMovement().z() > 0) {
									entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + 0.01)));
								} else {
									entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() - 0.01)));
								}
								if (entity.getPersistentData().getBoolean("jetpackon") == true) {
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
									}.checkGamemode(entity) || new Object() {
										public boolean checkGamemode(Entity _ent) {
											if (_ent instanceof ServerPlayer _serverPlayer) {
												return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
											} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
												return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
														&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
											}
											return false;
										}
									}.checkGamemode(entity))) {
										if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") >= 10) {
											{
												ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
												if (_ist.hurt(1, RandomSource.create(), null)) {
													_ist.shrink(1);
													_ist.setDamageValue(0);
												}
											}
											(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait", 0);
										}
										(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait",
												((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") + 2));
									}
								}
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_SPORE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
					}
				} else {
					if (!entity.isShiftKeyDown()) {
						if (entity.getPersistentData().getBoolean("jetpackon") == true) {
							entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), Math.abs(entity.getLookAngle().y * 3), (entity.getDeltaMovement().z())));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
							if (entity.getPersistentData().getBoolean("jetpackon") == true) {
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
								}.checkGamemode(entity) || new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
										}
										return false;
									}
								}.checkGamemode(entity))) {
									if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") >= 10) {
										{
											ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
										(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait", 0);
									}
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait",
											((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") + 1));
								}
							}
						}
					} else {
						if (entity.getPersistentData().getBoolean("jetpackon") == true) {
							if (entity.getPersistentData().getBoolean("jetpackon") == true) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 3, 0.1, 0.1, 0.1, 0.1);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0.1, 0.1, 0.1, 0.1);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_SPORE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0.1, 0.1, 0.1, 0.1);
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
								}.checkGamemode(entity) || new Object() {
									public boolean checkGamemode(Entity _ent) {
										if (_ent instanceof ServerPlayer _serverPlayer) {
											return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
										} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
											return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
													&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
										}
										return false;
									}
								}.checkGamemode(entity))) {
									if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") >= 10) {
										{
											ItemStack _ist = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
											if (_ist.hurt(1, RandomSource.create(), null)) {
												_ist.shrink(1);
												_ist.setDamageValue(0);
											}
										}
										(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait", 0);
									}
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putDouble("damagewait",
											((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") + 1));
								}
							}
						}
					}
				}
			}
		}
	}
}
