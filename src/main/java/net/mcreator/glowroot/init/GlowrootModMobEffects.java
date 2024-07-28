
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.glowroot.potion.DazzledMobEffect;
import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GlowrootMod.MODID);
	public static final RegistryObject<MobEffect> DAZZLED = REGISTRY.register("dazzled", () -> new DazzledMobEffect());
}
