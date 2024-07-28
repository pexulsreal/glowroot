
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.entity.GlowrootGolemEntity;
import net.mcreator.glowroot.client.model.Modelglowrootgolemnew;

public class GlowrootGolemRenderer extends MobRenderer<GlowrootGolemEntity, Modelglowrootgolemnew<GlowrootGolemEntity>> {
	public GlowrootGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowrootgolemnew(context.bakeLayer(Modelglowrootgolemnew.LAYER_LOCATION)), 1.1f);
		this.addLayer(new EyesLayer<GlowrootGolemEntity, Modelglowrootgolemnew<GlowrootGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/glowrootgolemnewglowing.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowrootGolemEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/glowrootgolemtexturenew.png");
	}
}
