
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.entity.GlowrootGolemDrillEntity;
import net.mcreator.glowroot.client.model.Modelglowrootgolemdrill;

public class GlowrootGolemDrillRenderer extends MobRenderer<GlowrootGolemDrillEntity, Modelglowrootgolemdrill<GlowrootGolemDrillEntity>> {
	public GlowrootGolemDrillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowrootgolemdrill(context.bakeLayer(Modelglowrootgolemdrill.LAYER_LOCATION)), 1.1f);
		this.addLayer(new EyesLayer<GlowrootGolemDrillEntity, Modelglowrootgolemdrill<GlowrootGolemDrillEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/glowrootgolemnewglowing.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowrootGolemDrillEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/drill.png");
	}
}
