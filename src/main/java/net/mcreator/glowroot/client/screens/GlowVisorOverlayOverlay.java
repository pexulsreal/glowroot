
package net.mcreator.glowroot.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.glowroot.procedures.Light9Procedure;
import net.mcreator.glowroot.procedures.Light8Procedure;
import net.mcreator.glowroot.procedures.Light7Procedure;
import net.mcreator.glowroot.procedures.Light6Procedure;
import net.mcreator.glowroot.procedures.Light5Procedure;
import net.mcreator.glowroot.procedures.Light4Procedure;
import net.mcreator.glowroot.procedures.Light3Procedure;
import net.mcreator.glowroot.procedures.Light2Procedure;
import net.mcreator.glowroot.procedures.Light1Procedure;
import net.mcreator.glowroot.procedures.Light15Procedure;
import net.mcreator.glowroot.procedures.Light14Procedure;
import net.mcreator.glowroot.procedures.Light13Procedure;
import net.mcreator.glowroot.procedures.Light12Procedure;
import net.mcreator.glowroot.procedures.Light11Procedure;
import net.mcreator.glowroot.procedures.Light10Procedure;
import net.mcreator.glowroot.procedures.Light0Procedure;
import net.mcreator.glowroot.procedures.GlowVisorOverlayDisplayOverlayIngameProcedure;
import net.mcreator.glowroot.procedures.Below5Procedure;
import net.mcreator.glowroot.procedures.Below3Procedure;
import net.mcreator.glowroot.procedures.Below1Procedure;
import net.mcreator.glowroot.procedures.BarProcedure;
import net.mcreator.glowroot.procedures.Above15Procedure;
import net.mcreator.glowroot.procedures.Above13Procedure;
import net.mcreator.glowroot.procedures.Above10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class GlowVisorOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (GlowVisorOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/visoroverlayy.png"), 0, 0, 0, 0, w, h, w, h);
			event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/circleog.png"), posX + -213, posY + -120, 0, 0, 34, 35, 34, 35);

			if (BarProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/bar.png"), posX + -185, posY + -111, 0, 0, 68, 16, 68, 16);
			}
			if (Light0Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/0.png"), posX + -201, posY + -110, 0, 0, 10, 14, 10, 14);
			}
			if (Light1Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/1.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light2Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/2.png"), posX + -201, posY + -111, 0, 0, 12, 14, 12, 14);
			}
			if (Light3Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/3.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light4Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/4.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light5Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/5.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light6Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/6.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light7Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/7.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light8Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/8.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light12Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/12.png"), posX + -207, posY + -110, 0, 0, 32, 14, 32, 14);
			}
			if (Light9Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/9.png"), posX + -202, posY + -110, 0, 0, 12, 14, 12, 14);
			}
			if (Light10Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/10.png"), posX + -206, posY + -110, 0, 0, 32, 14, 32, 14);
			}
			if (Light11Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/11.png"), posX + -206, posY + -110, 0, 0, 32, 14, 32, 14);
			}
			if (Light13Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/13.png"), posX + -206, posY + -110, 0, 0, 32, 14, 32, 14);
			}
			if (Light14Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/14.png"), posX + -206, posY + -110, 0, 0, 32, 14, 32, 14);
			}
			if (Light15Procedure.execute(world, x, y, z)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/15.png"), posX + -206, posY + -110, 0, 0, 32, 14, 32, 14);
			}
			if (Below3Procedure.execute(world, x, y, z, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/dotred.png"), posX + -158, posY + -111, 0, 0, 16, 16, 16, 16);
			}
			if (Below5Procedure.execute(world, x, y, z, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/dotred.png"), posX + -177, posY + -111, 0, 0, 16, 16, 16, 16);
			}
			if (Below1Procedure.execute(world, x, y, z, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/dotred.png"), posX + -139, posY + -111, 0, 0, 16, 16, 16, 16);
			}
			if (Above10Procedure.execute(world, x, y, z, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/greendot.png"), posX + -177, posY + -111, 0, 0, 16, 16, 16, 16);
			}
			if (Above13Procedure.execute(world, x, y, z, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/greendot.png"), posX + -158, posY + -111, 0, 0, 16, 16, 16, 16);
			}
			if (Above15Procedure.execute(world, x, y, z, entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("glowroot:textures/screens/greendot.png"), posX + -139, posY + -111, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
