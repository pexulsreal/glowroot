
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.glowroot.enchantment.YellowLightEnchantment;
import net.mcreator.glowroot.enchantment.RedLightEnchantment;
import net.mcreator.glowroot.enchantment.GlowrootedEnchantment;
import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, GlowrootMod.MODID);
	public static final RegistryObject<Enchantment> GLOWROOTED = REGISTRY.register("glowrooted", () -> new GlowrootedEnchantment());
	public static final RegistryObject<Enchantment> RED_LIGHT = REGISTRY.register("red_light", () -> new RedLightEnchantment());
	public static final RegistryObject<Enchantment> YELLOW_LIGHT = REGISTRY.register("yellow_light", () -> new YellowLightEnchantment());
}
