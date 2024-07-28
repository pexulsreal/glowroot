package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.network.GlowrootModVariables;
import net.mcreator.glowroot.init.GlowrootModMobEffects;
import net.mcreator.glowroot.init.GlowrootModGameRules;

public class FlashbangedEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(GlowrootModMobEffects.DAZZLED.get()) ? _livEnt.getEffect(GlowrootModMobEffects.DAZZLED.get()).getDuration() : 0) / 20)
					/ (world.getLevelData().getGameRules().getInt(GlowrootModGameRules.DAZZLEDOPACITY));
			entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.glowroottint = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
