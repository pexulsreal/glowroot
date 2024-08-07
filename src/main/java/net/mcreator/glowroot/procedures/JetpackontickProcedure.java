package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.glowroot.init.GlowrootModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JetpackontickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == GlowrootModItems.GLOWROOT_JETPACK_CHESTPLATE.get()) {
			if (entity.getPersistentData().getBoolean("jetpackon") == true) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() >= 351) {
					entity.getPersistentData().putBoolean("jetpackon", false);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.TNT);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(GlowrootModItems.GLOWROOT_JETPACK_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(GlowrootModItems.GLOWROOT_JETPACK_CHESTPLATE.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).setDamageValue(351);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem(), 200);
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7bUse a charged battery to fuel the jetpack!"), true);
				}
			}
		}
	}
}
