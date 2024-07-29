
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.glowroot.client.renderer.PrimedGlowrootTNTRenderer;
import net.mcreator.glowroot.client.renderer.GlowrootedZombieRenderer;
import net.mcreator.glowroot.client.renderer.GlowrootHybridRenderer;
import net.mcreator.glowroot.client.renderer.GlowrootHermitRenderer;
import net.mcreator.glowroot.client.renderer.GlowrootGolemRenderer;
import net.mcreator.glowroot.client.renderer.GlowrootGolemDrillRenderer;
import net.mcreator.glowroot.client.renderer.GlowrootBomberRenderer;
import net.mcreator.glowroot.client.renderer.GlowfishRenderer;
import net.mcreator.glowroot.client.renderer.GlowbangRenderer;
import net.mcreator.glowroot.client.renderer.GHONERenderer;
import net.mcreator.glowroot.client.renderer.BabyGlowSquidRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowrootModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GlowrootModEntities.INK_BALLOON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOW_INK_BALLOON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWBANG.get(), GlowbangRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWROOT_GOLEM.get(), GlowrootGolemRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWROOT_BOMBER.get(), GlowrootBomberRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWROOT_HERMIT.get(), GlowrootHermitRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWROOTED_ZOMBIE.get(), GlowrootedZombieRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWFISH.get(), GlowfishRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.BABY_GLOW_SQUID.get(), BabyGlowSquidRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.PRIMED_GLOWROOT_TNT.get(), PrimedGlowrootTNTRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWROOT_HYBRID.get(), GlowrootHybridRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GLOWROOT_GOLEM_DRILL.get(), GlowrootGolemDrillRenderer::new);
		event.registerEntityRenderer(GlowrootModEntities.GHONE.get(), GHONERenderer::new);
	}
}
