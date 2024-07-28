
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.glowroot.client.particle.SquidInkParticle;
import net.mcreator.glowroot.client.particle.GlowrootSporeParticle;
import net.mcreator.glowroot.client.particle.GlowrootLightPopParticle;
import net.mcreator.glowroot.client.particle.GlowrootInkParticle;
import net.mcreator.glowroot.client.particle.GlowrootFlameParticle;
import net.mcreator.glowroot.client.particle.GlowRootLeavesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowrootModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get(), GlowRootLeavesParticle::provider);
		event.registerSpriteSet(GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get(), GlowrootLightPopParticle::provider);
		event.registerSpriteSet(GlowrootModParticleTypes.GLOWROOT_INK.get(), GlowrootInkParticle::provider);
		event.registerSpriteSet(GlowrootModParticleTypes.SQUID_INK.get(), SquidInkParticle::provider);
		event.registerSpriteSet(GlowrootModParticleTypes.GLOWROOT_FLAME.get(), GlowrootFlameParticle::provider);
		event.registerSpriteSet(GlowrootModParticleTypes.GLOWROOT_SPORE.get(), GlowrootSporeParticle::provider);
	}
}
