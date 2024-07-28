package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.network.chat.Component;

public class EffectlevelprocedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Glowing Effect Level: " + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.GLOWING) ? _livEnt.getEffect(MobEffects.GLOWING).getAmplifier() : 0))), true);
	}
}
