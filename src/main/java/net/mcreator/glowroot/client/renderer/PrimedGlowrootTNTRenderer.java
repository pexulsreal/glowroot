
package net.mcreator.glowroot.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.glowroot.procedures.PrimedGlowrootTNTEntityShakingConditionProcedure;
import net.mcreator.glowroot.entity.PrimedGlowrootTNTEntity;
import net.mcreator.glowroot.client.model.Modelprimedglowroottnt;

public class PrimedGlowrootTNTRenderer extends MobRenderer<PrimedGlowrootTNTEntity, Modelprimedglowroottnt<PrimedGlowrootTNTEntity>> {
	public PrimedGlowrootTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprimedglowroottnt(context.bakeLayer(Modelprimedglowroottnt.LAYER_LOCATION)), 1f);
		this.addLayer(new EyesLayer<PrimedGlowrootTNTEntity, Modelprimedglowroottnt<PrimedGlowrootTNTEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("glowroot:textures/entities/bomb_entity.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedGlowrootTNTEntity entity) {
		return new ResourceLocation("glowroot:textures/entities/bomb_entity.png");
	}

	@Override
	protected boolean isShaking(PrimedGlowrootTNTEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return PrimedGlowrootTNTEntityShakingConditionProcedure.execute();
	}
}
