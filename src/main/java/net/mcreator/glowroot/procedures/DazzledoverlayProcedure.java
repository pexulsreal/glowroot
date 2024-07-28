package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.network.GlowrootModVariables;

public class DazzledoverlayProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		return (entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).glowroottint;
	}
}
