package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.Entity;

public class GlowrootBomberOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("bombing", false);
	}
}
