
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, GlowrootMod.MODID);
	public static final RegistryObject<SimpleParticleType> GLOW_ROOT_LEAVES = REGISTRY.register("glow_root_leaves", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GLOWROOT_LIGHT_POP = REGISTRY.register("glowroot_light_pop", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GLOWROOT_INK = REGISTRY.register("glowroot_ink", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SQUID_INK = REGISTRY.register("squid_ink", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GLOWROOT_FLAME = REGISTRY.register("glowroot_flame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GLOWROOT_SPORE = REGISTRY.register("glowroot_spore", () -> new SimpleParticleType(false));
}
