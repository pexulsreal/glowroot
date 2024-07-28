package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.network.GlowrootModVariables;

public class GlowrootPickaxeToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double breaklight = 0;
		double growlight = 0;
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 10) {
			if (itemstack.isDamaged()) {
				{
					double _setval = (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).growlight - 1;
					entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.growlight = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).growlight <= 0) {
					{
						double _setval = 30;
						entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.growlight = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 13) {
						if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) >= 15) {
							itemstack.setDamageValue((int) (itemstack.getDamageValue() - 5));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 0.25, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 0.25, 1, false);
								}
							}
						} else {
							itemstack.setDamageValue((int) (itemstack.getDamageValue() - 3));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 0.2, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 0.2, 1, false);
								}
							}
						}
					} else {
						itemstack.setDamageValue((int) (itemstack.getDamageValue() - 1));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 0.1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.PLAYERS, (float) 0.1, 1, false);
							}
						}
					}
				}
			}
		} else if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 5) {
			{
				double _setval = (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).breaklight - 1;
				entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.breaklight = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).breaklight <= 0) {
				{
					double _setval = 50;
					entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.breaklight = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 3) {
					if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 1) {
						itemstack.setDamageValue((int) (itemstack.getDamageValue() + 3));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death")), SoundSource.PLAYERS, (float) 0.2, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death")), SoundSource.PLAYERS, (float) 0.2, 1, false);
							}
						}
					} else {
						itemstack.setDamageValue((int) (itemstack.getDamageValue() + 2));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death")), SoundSource.NEUTRAL, (float) 0.15, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death")), SoundSource.NEUTRAL, (float) 0.15, 1, false);
							}
						}
					}
				} else {
					itemstack.setDamageValue((int) (itemstack.getDamageValue() + 1));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death")), SoundSource.PLAYERS, (float) 0.1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death")), SoundSource.PLAYERS, (float) 0.1, 1, false);
						}
					}
				}
			}
		}
	}
}
