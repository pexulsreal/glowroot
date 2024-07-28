
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.glowroot.client.model.Modelzombieglowrootedhands;
import net.mcreator.glowroot.client.model.Modelzombieglowrooted;
import net.mcreator.glowroot.client.model.Modelprimedglowroottnt;
import net.mcreator.glowroot.client.model.Modelminerhelmet;
import net.mcreator.glowroot.client.model.Modelhybrid;
import net.mcreator.glowroot.client.model.Modelglowroothybridfinal;
import net.mcreator.glowroot.client.model.Modelglowroothermit;
import net.mcreator.glowroot.client.model.Modelglowrootgolemnew;
import net.mcreator.glowroot.client.model.Modelglowrootgolemdrill;
import net.mcreator.glowroot.client.model.Modelglowrootgolem;
import net.mcreator.glowroot.client.model.Modelglowrootbomber;
import net.mcreator.glowroot.client.model.Modelglowgoggles;
import net.mcreator.glowroot.client.model.Modelglowfly;
import net.mcreator.glowroot.client.model.Modelglowfish;
import net.mcreator.glowroot.client.model.Modelglowbombtiny;
import net.mcreator.glowroot.client.model.Modelglowbomb;
import net.mcreator.glowroot.client.model.Modelbabyglowsquid;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GlowrootModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhybrid.LAYER_LOCATION, Modelhybrid::createBodyLayer);
		event.registerLayerDefinition(Modelglowfly.LAYER_LOCATION, Modelglowfly::createBodyLayer);
		event.registerLayerDefinition(Modelzombieglowrooted.LAYER_LOCATION, Modelzombieglowrooted::createBodyLayer);
		event.registerLayerDefinition(Modelminerhelmet.LAYER_LOCATION, Modelminerhelmet::createBodyLayer);
		event.registerLayerDefinition(Modelglowrootgolemdrill.LAYER_LOCATION, Modelglowrootgolemdrill::createBodyLayer);
		event.registerLayerDefinition(Modelglowgoggles.LAYER_LOCATION, Modelglowgoggles::createBodyLayer);
		event.registerLayerDefinition(Modelglowfish.LAYER_LOCATION, Modelglowfish::createBodyLayer);
		event.registerLayerDefinition(Modelbabyglowsquid.LAYER_LOCATION, Modelbabyglowsquid::createBodyLayer);
		event.registerLayerDefinition(Modelglowrootgolemnew.LAYER_LOCATION, Modelglowrootgolemnew::createBodyLayer);
		event.registerLayerDefinition(Modelglowbomb.LAYER_LOCATION, Modelglowbomb::createBodyLayer);
		event.registerLayerDefinition(Modelzombieglowrootedhands.LAYER_LOCATION, Modelzombieglowrootedhands::createBodyLayer);
		event.registerLayerDefinition(Modelglowroothybridfinal.LAYER_LOCATION, Modelglowroothybridfinal::createBodyLayer);
		event.registerLayerDefinition(Modelglowrootgolem.LAYER_LOCATION, Modelglowrootgolem::createBodyLayer);
		event.registerLayerDefinition(Modelglowrootbomber.LAYER_LOCATION, Modelglowrootbomber::createBodyLayer);
		event.registerLayerDefinition(Modelprimedglowroottnt.LAYER_LOCATION, Modelprimedglowroottnt::createBodyLayer);
		event.registerLayerDefinition(Modelglowroothermit.LAYER_LOCATION, Modelglowroothermit::createBodyLayer);
		event.registerLayerDefinition(Modelglowbombtiny.LAYER_LOCATION, Modelglowbombtiny::createBodyLayer);
	}
}
