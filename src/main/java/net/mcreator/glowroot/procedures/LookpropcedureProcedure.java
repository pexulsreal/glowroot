package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.Entity;

public class LookpropcedureProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("cangrab") == false) {
			return true;
		}
		return false;
	}
}
