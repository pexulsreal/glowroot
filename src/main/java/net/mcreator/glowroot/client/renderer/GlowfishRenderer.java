
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.glowroot.entity.GlowfishEntity;
import net.mcreator.glowroot.client.model.Modelglowfish;

public class GlowfishRenderer extends MobRenderer<GlowfishEntity, Modelglowfish<GlowfishEntity>> {
	public GlowfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowfish(context.bakeLayer(Modelglowfish.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlowfishEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/tropical_fish_a.png");
	}
}
