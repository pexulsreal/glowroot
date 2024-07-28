package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.init.GlowrootModItems;
import net.mcreator.glowroot.GlowrootMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DrillprocProcedure {
	@SubscribeEvent
	public static void onBlockBreaking(PlayerEvent.BreakSpeed event) {
		if (event.getPosition().isEmpty())
			return;
		execute(event, event.getEntity(), event.getNewSpeed());
	}

	public static void execute(Entity entity, double breakSpeed) {
		execute(null, entity, breakSpeed);
	}

	private static void execute(@Nullable Event event, Entity entity, double breakSpeed) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GlowrootModItems.GLOWROOT_DRILL.get()) {
			pickaxe = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("drilledblocks") >= 4
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("drilledblocks") < 9) {
				if (event instanceof PlayerEvent.BreakSpeed _speed) {
					_speed.setNewSpeed((float) (breakSpeed + 0.8));
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("drilledblocks") >= 9) {
				if (event instanceof PlayerEvent.BreakSpeed _speed) {
					_speed.setNewSpeed((float) (breakSpeed + 1.3));
				}
			}
			GlowrootMod.LOGGER.info((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("drilledblocks"));
		}
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GlowrootModItems.GLOWROOT_DRILL.get())) {
			pickaxe.getOrCreateTag().putDouble("drilledblocks", 0);
		}
	}
}
