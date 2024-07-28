
package net.mcreator.glowroot.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.entity.GlowrootedZombieEntity;
import net.mcreator.glowroot.client.model.Modelzombieglowrootedhands;

public class GlowrootedZombieRenderer extends MobRenderer<GlowrootedZombieEntity, Modelzombieglowrootedhands<GlowrootedZombieEntity>> {
	public GlowrootedZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzombieglowrootedhands(context.bakeLayer(Modelzombieglowrootedhands.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<GlowrootedZombieEntity, Modelzombieglowrootedhands<GlowrootedZombieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/glowrootzombieglow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowrootedZombieEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/glowrootzombie.png");
	}
}
