package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.network.GlowrootModVariables;
import net.mcreator.glowroot.init.GlowrootModGameRules;

public class FlashbangedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).glowroottint > 0) {
			{
				double _setval = (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).glowroottint
						- 0.01 / (world.getLevelData().getGameRules().getInt(GlowrootModGameRules.DAZZLEDOPACITY));
				entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.glowroottint = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof Mob _entity)
			_entity.getNavigation().stop();
		if (entity instanceof Mob _mob) {
			_mob.setNoAi(true);
		}
	}
}
