package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModItems;
import net.mcreator.glowroot.entity.GlowrootGolemDrillEntity;

public class DrillActivateOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof GlowrootGolemDrillEntity) {
				if ((entity.getVehicle()).getPersistentData().getBoolean("drillon") == false) {
					(entity.getVehicle()).getPersistentData().putBoolean("drillon", true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:drillgenericmove")), SoundSource.VOICE, (float) 0.8, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:drillgenericmove")), SoundSource.VOICE, (float) 0.8, 1, false);
						}
					}
				} else if ((entity.getVehicle()).getPersistentData().getBoolean("drillon") == true) {
					(entity.getVehicle()).getPersistentData().putBoolean("drillon", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:drillgenericmove")), SoundSource.VOICE, (float) 0.8, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:drillgenericmove")), SoundSource.VOICE, (float) 0.8, 1, false);
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == GlowrootModItems.GLOWROOT_JETPACK_CHESTPLATE.get()) {
			if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() >= 350)) {
				if (entity.getPersistentData().getBoolean("jetpackon") == false) {
					entity.getPersistentData().putBoolean("jetpackon", true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.VOICE, 1, 1, false);
						}
					}
				} else if (entity.getPersistentData().getBoolean("jetpackon") == true) {
					entity.getPersistentData().putBoolean("jetpackon", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.VOICE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.VOICE, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
