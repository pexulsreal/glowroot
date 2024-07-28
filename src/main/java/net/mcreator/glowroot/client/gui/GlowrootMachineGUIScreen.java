package net.mcreator.glowroot.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.glowroot.world.inventory.GlowrootMachineGUIMenu;
import net.mcreator.glowroot.network.GlowrootMachineGUIButtonMessage;
import net.mcreator.glowroot.GlowrootMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GlowrootMachineGUIScreen extends AbstractContainerScreen<GlowrootMachineGUIMenu> {
	private final static HashMap<String, Object> guistate = GlowrootMachineGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_checkmarkbutton;
	ImageButton imagebutton_eyebutton;

	public GlowrootMachineGUIScreen(GlowrootMachineGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 78;
		this.imageHeight = 10;
	}

	private static final ResourceLocation texture = new ResourceLocation("glowroot:textures/screens/glowroot_machine_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -44 && mouseX < leftPos + -20 && mouseY > topPos + -46 && mouseY < topPos + -22)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_machine_gui.tooltip_transform"), mouseX, mouseY);
		if (mouseX > leftPos + 99 && mouseX < leftPos + 123 && mouseY > topPos + -47 && mouseY < topPos + -23)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_machine_gui.tooltip_recipes"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/glowrootmachinegui.png"), this.leftPos + -17, this.topPos + -92, 0, 0, 112, 112, 112, 112);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 12, this.topPos + -61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 30, this.topPos + -61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 48, this.topPos + -61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 12, this.topPos + -43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 30, this.topPos + -43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 48, this.topPos + -43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 12, this.topPos + -25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 30, this.topPos + -25, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + 48, this.topPos + -25, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui.label_glowroot_machine"), -3, -90, -6684724, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_checkmarkbutton = new ImageButton(this.leftPos + -42, this.topPos + -44, 20, 18, 0, 0, 18, new ResourceLocation("glowroot:textures/screens/atlas/imagebutton_checkmarkbutton.png"), 20, 36, e -> {
			if (true) {
				GlowrootMod.PACKET_HANDLER.sendToServer(new GlowrootMachineGUIButtonMessage(0, x, y, z));
				GlowrootMachineGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_checkmarkbutton", imagebutton_checkmarkbutton);
		this.addRenderableWidget(imagebutton_checkmarkbutton);
		imagebutton_eyebutton = new ImageButton(this.leftPos + 101, this.topPos + -44, 20, 18, 0, 0, 18, new ResourceLocation("glowroot:textures/screens/atlas/imagebutton_eyebutton.png"), 20, 36, e -> {
			if (true) {
				GlowrootMod.PACKET_HANDLER.sendToServer(new GlowrootMachineGUIButtonMessage(1, x, y, z));
				GlowrootMachineGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_eyebutton", imagebutton_eyebutton);
		this.addRenderableWidget(imagebutton_eyebutton);
	}
}
