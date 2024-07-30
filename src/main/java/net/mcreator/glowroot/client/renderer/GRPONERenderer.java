
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.glowroot.entity.GRPONEEntity;
import net.mcreator.glowroot.client.model.Modelglowroothybridfinal;

public class GRPONERenderer extends MobRenderer<GRPONEEntity, Modelglowroothybridfinal<GRPONEEntity>> {
	public GRPONERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowroothybridfinal(context.bakeLayer(Modelglowroothybridfinal.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GRPONEEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/hybridtexture.png");
	}
}
