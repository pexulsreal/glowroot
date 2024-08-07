package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModItems;
import net.mcreator.glowroot.init.GlowrootModBlocks;

public class GlowrootBatteryRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("keycardlvl") >= 1) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == GlowrootModItems.GLOWROOT_JETPACK_CHESTPLATE.get()) {
				if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() == 0)) {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).setDamageValue(0);
					itemstack.getOrCreateTag().putDouble("keycardlvl", 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, (float) 0.8, (float) 0.9);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, (float) 0.8, (float) 0.9, false);
						}
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7bJetpack has been refueled!"), true);
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7bYour fuel is already full!"), true);
				}
			}
		}
		if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == GlowrootModBlocks.UNPURE_CHRYSOPRASE.get().asItem()) {
				itemstack.getOrCreateTag().putDouble("keycardlvl", 1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, (float) 0.8, (float) 0.9);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, (float) 0.8, (float) 0.9, false);
					}
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).shrink(1);
			}
		}
	}
}
