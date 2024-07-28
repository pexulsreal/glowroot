package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.init.GlowrootModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Dazzledeffect2Procedure {
	@SubscribeEvent
	public static void onEventTriggered(EnderManAngerEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity player) {
		execute(null, player);
	}

	private static void execute(@Nullable Event event, Entity player) {
		if (player == null)
			return;
		if (player instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GlowrootModMobEffects.DAZZLED.get())) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
