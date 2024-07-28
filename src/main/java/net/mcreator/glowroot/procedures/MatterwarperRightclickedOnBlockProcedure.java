package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.network.GlowrootModVariables;
import net.mcreator.glowroot.init.GlowrootModBlocks;

public class MatterwarperRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GlowrootModBlocks.GLOWROOT_UPGRADER.get()) {
			if (!(itemstack.getOrCreateTag().getDouble("keycardlvl") == 5)) {
				itemstack.getOrCreateTag().putDouble("keycardlvl", (itemstack.getOrCreateTag().getDouble("keycardlvl") + 1));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:quadcoptercharges")), SoundSource.NEUTRAL, (float) 1.1, (float) 1.1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:quadcoptercharges")), SoundSource.NEUTRAL, (float) 1.1, (float) 1.1, false);
					}
				}
			}
		} else {
			if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 4) {
				if (entity.isShiftKeyDown()) {
					if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:quadcoptercharges")), SoundSource.PLAYERS, 2, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:quadcoptercharges")), SoundSource.PLAYERS, 2, 1, false);
							}
						}
						{
							double _setval = Math.ceil(x);
							entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.xbook = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = Math.ceil(y);
							entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ybook = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = Math.ceil(z);
							entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.zbook = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7bSet Location To: " + (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).xbook + " "
									+ (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).ybook + " "
									+ (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).zbook)), true);
						itemstack.getOrCreateTag().putDouble("xbook", ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).xbook));
						itemstack.getOrCreateTag().putDouble("ybook", ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).ybook));
						itemstack.getOrCreateTag().putDouble("zbook", ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).zbook));
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7bThe location must be a solid block."), true);
					}
				}
			}
		}
	}
}
