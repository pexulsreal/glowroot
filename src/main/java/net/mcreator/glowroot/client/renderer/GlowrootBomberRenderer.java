
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.entity.GlowrootBomberEntity;
import net.mcreator.glowroot.client.model.Modelglowrootbomber;

public class GlowrootBomberRenderer extends MobRenderer<GlowrootBomberEntity, Modelglowrootbomber<GlowrootBomberEntity>> {
	public GlowrootBomberRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowrootbomber(context.bakeLayer(Modelglowrootbomber.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<GlowrootBomberEntity, Modelglowrootbomber<GlowrootBomberEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/glowrootquadcopterglowing.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowrootBomberEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/glowrootquadcoptertexture.png");
	}
}
