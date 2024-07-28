
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.entity.GlowrootHermitEntity;
import net.mcreator.glowroot.client.model.Modelglowroothermit;

public class GlowrootHermitRenderer extends MobRenderer<GlowrootHermitEntity, Modelglowroothermit<GlowrootHermitEntity>> {
	public GlowrootHermitRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglowroothermit(context.bakeLayer(Modelglowroothermit.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<GlowrootHermitEntity, Modelglowroothermit<GlowrootHermitEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/glowroothermitglowing.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowrootHermitEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/glowroothermittexture.png");
	}
}
