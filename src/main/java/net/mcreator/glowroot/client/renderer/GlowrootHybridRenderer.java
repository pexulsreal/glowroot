
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.glowroot.entity.GlowrootHybridEntity;
import net.mcreator.glowroot.client.model.Modelglowroothybridfinal;

public class GlowrootHybridRenderer extends MobRenderer<GlowrootHybridEntity, Modelglowroothybridfinal<GlowrootHybridEntity>> {
	public GlowrootHybridRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowroothybridfinal(context.bakeLayer(Modelglowroothybridfinal.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlowrootHybridEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/hybridtexture.png");
	}
}
