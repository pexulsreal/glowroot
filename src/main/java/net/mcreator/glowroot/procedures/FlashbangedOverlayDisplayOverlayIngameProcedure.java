package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.network.GlowrootModVariables;

public class FlashbangedOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(GlowrootModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GlowrootModVariables.PlayerVariables())).glowroottint > 0) {
			return true;
		}
		return false;
	}
}
