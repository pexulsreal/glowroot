package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.glowroot.entity.GlowrootGolemEntity;
import net.mcreator.glowroot.entity.GlowrootGolemDrillEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlowrootDrillEntityPreventDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if ((entity.getVehicle()) instanceof GlowrootGolemEntity || (entity.getVehicle()) instanceof GlowrootGolemDrillEntity) {
			if (damagesource.is(DamageTypes.FALL) || damagesource.is(DamageTypes.IN_WALL)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
