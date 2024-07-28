package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.network.GlowrootModVariables;
import net.mcreator.glowroot.init.GlowrootModMobEffects;
import net.mcreator.glowroot.init.GlowrootModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayertickprocedureoverlayProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).glowroottint > 0) {
			if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(GlowrootModMobEffects.DAZZLED.get())) {
				{
					double _setval = (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).glowroottint
							- 0.05 / (world.getLevelData().getGameRules().getInt(GlowrootModGameRules.DAZZLEDOPACITY));
					entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.glowroottint = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
