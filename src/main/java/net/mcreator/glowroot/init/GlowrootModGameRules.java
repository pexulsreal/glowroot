
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GlowrootModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> DAZZLEDOPACITY = GameRules.register("dazzledopacity", GameRules.Category.PLAYER, GameRules.IntegerValue.create(1));
}
