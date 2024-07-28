
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, GlowrootMod.MODID);
	public static final RegistryObject<PaintingVariant> GLOWROOT_PAINTING = REGISTRY.register("glowroot_painting", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> INTO_THE_CORE = REGISTRY.register("into_the_core", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> BECK_PAINTING = REGISTRY.register("beck_painting", () -> new PaintingVariant(32, 32));
}
