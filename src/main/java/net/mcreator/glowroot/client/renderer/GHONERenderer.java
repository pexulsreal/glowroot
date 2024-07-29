
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.glowroot.entity.GHONEEntity;
import net.mcreator.glowroot.client.model.Modelglowroothybridfinal;

public class GHONERenderer extends MobRenderer<GHONEEntity, Modelglowroothybridfinal<GHONEEntity>> {
	public GHONERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowroothybridfinal(context.bakeLayer(Modelglowroothybridfinal.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GHONEEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/hybridtexture.png");
	}
}
