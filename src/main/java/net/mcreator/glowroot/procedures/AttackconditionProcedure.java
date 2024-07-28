package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.entity.GlowrootedZombieEntity;
import net.mcreator.glowroot.entity.GlowrootHermitEntity;
import net.mcreator.glowroot.entity.GlowrootGolemEntity;
import net.mcreator.glowroot.entity.GlowrootGolemDrillEntity;
import net.mcreator.glowroot.entity.GlowrootBomberEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AttackconditionProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingChangeTargetEvent event) {
		execute(event, event.getOriginalTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof GlowrootedZombieEntity || entity instanceof GlowrootGolemEntity || entity instanceof GlowrootGolemDrillEntity || entity instanceof GlowrootBomberEntity || entity instanceof GlowrootHermitEntity) {
			if (sourceentity instanceof Mob _entity) {
				_entity.setTarget(null);
			}
		}
	}
}
