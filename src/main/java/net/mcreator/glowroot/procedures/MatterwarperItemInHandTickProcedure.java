package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.glowroot.network.GlowrootModVariables;

public class MatterwarperItemInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 4) {
			if (!((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).xbook == 0
					&& (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).ybook == 0
					&& (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).zbook == 0)) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.GLOW, ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).xbook + 0.5),
							((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).ybook + 0.5),
							((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).zbook + 0.5), 1, 0.1, 0.1, 0.1, 0.1);
			}
		}
	}
}
