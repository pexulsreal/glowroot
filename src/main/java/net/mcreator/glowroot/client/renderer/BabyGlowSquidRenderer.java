
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.entity.BabyGlowSquidEntity;
import net.mcreator.glowroot.client.model.Modelbabyglowsquid;

public class BabyGlowSquidRenderer extends MobRenderer<BabyGlowSquidEntity, Modelbabyglowsquid<BabyGlowSquidEntity>> {
	public BabyGlowSquidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbabyglowsquid(context.bakeLayer(Modelbabyglowsquid.LAYER_LOCATION)), 0.4f);
		this.addLayer(new EyesLayer<BabyGlowSquidEntity, Modelbabyglowsquid<BabyGlowSquidEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/glowin_squid_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BabyGlowSquidEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/glowin_squid_1.png");
	}
}
