package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.entity.PrimedGlowrootTNTEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlowrootTNTCancelDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PrimedGlowrootTNTEntity) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
