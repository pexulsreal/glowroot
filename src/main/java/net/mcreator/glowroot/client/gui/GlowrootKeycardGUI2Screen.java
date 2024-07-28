package net.mcreator.glowroot.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.glowroot.world.inventory.GlowrootKeycardGUI2Menu;
import net.mcreator.glowroot.network.GlowrootKeycardGUI2ButtonMessage;
import net.mcreator.glowroot.GlowrootMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GlowrootKeycardGUI2Screen extends AbstractContainerScreen<GlowrootKeycardGUI2Menu> {
	private final static HashMap<String, Object> guistate = GlowrootKeycardGUI2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_buttonx;

	public GlowrootKeycardGUI2Screen(GlowrootKeycardGUI2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("glowroot:textures/screens/glowroot_keycard_gui_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -138 && mouseX < leftPos + -114 && mouseY > topPos + 4 && mouseY < topPos + 28)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_page_1"), mouseX, mouseY);
		if (mouseX > leftPos + -85 && mouseX < leftPos + -61 && mouseY > topPos + 39 && mouseY < topPos + 63)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_prism"), mouseX, mouseY);
		if (mouseX > leftPos + -85 && mouseX < leftPos + -61 && mouseY > topPos + 75 && mouseY < topPos + 99)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_prism1"), mouseX, mouseY);
		if (mouseX > leftPos + -67 && mouseX < leftPos + -43 && mouseY > topPos + 57 && mouseY < topPos + 81)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_prism2"), mouseX, mouseY);
		if (mouseX > leftPos + -103 && mouseX < leftPos + -79 && mouseY > topPos + 57 && mouseY < topPos + 81)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_prism3"), mouseX, mouseY);
		if (mouseX > leftPos + -65 && mouseX < leftPos + -41 && mouseY > topPos + 37 && mouseY < topPos + 61)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_glowroot_engine"), mouseX, mouseY);
		if (mouseX > leftPos + -105 && mouseX < leftPos + -81 && mouseY > topPos + 37 && mouseY < topPos + 61)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_glowroot_engine1"), mouseX, mouseY);
		if (mouseX > leftPos + -105 && mouseX < leftPos + -81 && mouseY > topPos + 77 && mouseY < topPos + 101)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_glowroot_engine2"), mouseX, mouseY);
		if (mouseX > leftPos + -65 && mouseX < leftPos + -41 && mouseY > topPos + 77 && mouseY < topPos + 101)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_glowroot_engine3"), mouseX, mouseY);
		if (mouseX > leftPos + -86 && mouseX < leftPos + -62 && mouseY > topPos + 120 && mouseY < topPos + 144)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_glowcard_3"), mouseX, mouseY);
		if (mouseX > leftPos + -85 && mouseX < leftPos + -61 && mouseY > topPos + 57 && mouseY < topPos + 81)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_keycard_gui_2.tooltip_glowcard"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/frostborn2.png"), this.leftPos + -144, this.topPos + -2, 0, 0, 146, 180, 146, 180);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/atransparent.png"), this.leftPos + -81, this.topPos + 124, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/frostborn.png"), this.leftPos + 0, this.topPos + -2, 0, 0, 146, 180, 146, 180);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/atransparent.png"), this.leftPos + -81, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + -81, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + -99, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + -63, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/a.png"), this.leftPos + -81, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/arrowdown.png"), this.leftPos + -81, this.topPos + 97, 0, 0, 18, 20, 18, 20);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/key_card3.png"), this.leftPos + -81, this.topPos + 124, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/key_card2.png"), this.leftPos + -81, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/prismitem.png"), this.leftPos + -81, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/prismitem.png"), this.leftPos + -99, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/prismitem.png"), this.leftPos + -63, this.topPos + 61, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/prismitem.png"), this.leftPos + -81, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/atransparent.png"), this.leftPos + -63, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/engine.png"), this.leftPos + -63, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/atransparent.png"), this.leftPos + -99, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/atransparent.png"), this.leftPos + -63, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/atransparent.png"), this.leftPos + -99, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/engine.png"), this.leftPos + -63, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/engine.png"), this.leftPos + -99, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/engine.png"), this.leftPos + -99, this.topPos + 43, 0, 0, 16, 16, 16, 16);

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_buttonx = new ImageButton(this.leftPos + -136, this.topPos + 6, 20, 18, 0, 0, 18, new ResourceLocation("glowroot:textures/screens/atlas/imagebutton_buttonx.png"), 20, 36, e -> {
			if (true) {
				GlowrootMod.PACKET_HANDLER.sendToServer(new GlowrootKeycardGUI2ButtonMessage(0, x, y, z));
				GlowrootKeycardGUI2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonx", imagebutton_buttonx);
		this.addRenderableWidget(imagebutton_buttonx);
	}
}
