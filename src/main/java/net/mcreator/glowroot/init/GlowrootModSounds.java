
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GlowrootMod.MODID);
	public static final RegistryObject<SoundEvent> HYBRIDBITES = REGISTRY.register("hybridbites", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "hybridbites")));
	public static final RegistryObject<SoundEvent> HYBRIDHURT = REGISTRY.register("hybridhurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "hybridhurt")));
	public static final RegistryObject<SoundEvent> HYBRIDSTEPS = REGISTRY.register("hybridsteps", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "hybridsteps")));
	public static final RegistryObject<SoundEvent> GLOWROOTEDBLOCK = REGISTRY.register("glowrootedblock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "glowrootedblock")));
	public static final RegistryObject<SoundEvent> ROBOTDIES = REGISTRY.register("robotdies", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "robotdies")));
	public static final RegistryObject<SoundEvent> ROBOTSTEP = REGISTRY.register("robotstep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "robotstep")));
	public static final RegistryObject<SoundEvent> BUTTON = REGISTRY.register("button", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "button")));
	public static final RegistryObject<SoundEvent> DRILLON = REGISTRY.register("drillon", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "drillon")));
	public static final RegistryObject<SoundEvent> DRILLGENERICMOVE = REGISTRY.register("drillgenericmove", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "drillgenericmove")));
	public static final RegistryObject<SoundEvent> GLOWROOTCAVEBIOME = REGISTRY.register("glowrootcavebiome", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "glowrootcavebiome")));
	public static final RegistryObject<SoundEvent> SALAMANDERROAR = REGISTRY.register("salamanderroar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "salamanderroar")));
	public static final RegistryObject<SoundEvent> ROBOTACTIVE = REGISTRY.register("robotactive", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "robotactive")));
	public static final RegistryObject<SoundEvent> GOGGLESEQUIPPED = REGISTRY.register("gogglesequipped", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "gogglesequipped")));
	public static final RegistryObject<SoundEvent> ROBOTHURT = REGISTRY.register("robothurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "robothurt")));
	public static final RegistryObject<SoundEvent> ALARM = REGISTRY.register("alarm", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "alarm")));
	public static final RegistryObject<SoundEvent> KEYCARDACCEPT = REGISTRY.register("keycardaccept", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "keycardaccept")));
	public static final RegistryObject<SoundEvent> KEYCARDDENIED = REGISTRY.register("keycarddenied", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "keycarddenied")));
	public static final RegistryObject<SoundEvent> QUADCOPTERDROPSBANG = REGISTRY.register("quadcopterdropsbang", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "quadcopterdropsbang")));
	public static final RegistryObject<SoundEvent> QUADCOPTERCHARGES = REGISTRY.register("quadcoptercharges", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "quadcoptercharges")));
	public static final RegistryObject<SoundEvent> AMBIENTGLOWROOTBLOCK = REGISTRY.register("ambientglowrootblock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("glowroot", "ambientglowrootblock")));
}
