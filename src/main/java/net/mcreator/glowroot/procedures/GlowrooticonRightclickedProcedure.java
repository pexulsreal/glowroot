package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.Entity;

public class GlowrooticonRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setGlowingTag(true);
	}
}
