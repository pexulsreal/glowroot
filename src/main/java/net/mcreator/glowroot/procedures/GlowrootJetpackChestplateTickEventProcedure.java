package net.mcreator.glowroot.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class GlowrootJetpackChestplateTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 3, 0.1, 0.1, 0.1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
		}
		if (entity.getPersistentData().getBoolean("jetpackon") == true) {
			if (!entity.onGround()) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false)) {
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x / 3), Math.abs(entity.getLookAngle().y / 2), (entity.getLookAngle().z / 3)));
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
							((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") + 3));
				} else {
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
							((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().getDouble("damagewait") + 5));
					if (entity.getDeltaMovement().x() > 0) {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + 0.01), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					} else {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() - 0.01), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					}
					if (entity.getDeltaMovement().y() > 0) {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), Math.abs(entity.getDeltaMovement().y() + 0.02), (entity.getDeltaMovement().z())));
					} else {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), Math.abs(entity.getDeltaMovement().y() + 0.02), (entity.getDeltaMovement().z())));
					}
					if (entity.getDeltaMovement().z() > 0) {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + 0.01)));
					} else {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() - 0.01)));
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 2, 0.1, 0.1, 0.1, 0.1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
			} else {
				if (!entity.isShiftKeyDown()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), Math.abs(entity.getLookAngle().y / 1), (entity.getDeltaMovement().z())));
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 3, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 2, 0.1, 0.1, 0.1, 0.1);
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
				} else {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 3, 0.1, 0.1, 0.1, 0.1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.GLOW, (entity.getX()), (entity.getY() + 0.5), (entity.getZ()), 2, 0.1, 0.1, 0.1, 0.1);
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
}
