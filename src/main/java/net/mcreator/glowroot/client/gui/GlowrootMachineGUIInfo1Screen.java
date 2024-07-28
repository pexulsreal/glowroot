package net.mcreator.glowroot.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.glowroot.world.inventory.GlowrootMachineGUIInfo1Menu;
import net.mcreator.glowroot.network.GlowrootMachineGUIInfo1ButtonMessage;
import net.mcreator.glowroot.GlowrootMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GlowrootMachineGUIInfo1Screen extends AbstractContainerScreen<GlowrootMachineGUIInfo1Menu> {
	private final static HashMap<String, Object> guistate = GlowrootMachineGUIInfo1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox RecipeFinder;
	ImageButton imagebutton_buttonx;
	ImageButton imagebutton_buttonsearch;

	public GlowrootMachineGUIInfo1Screen(GlowrootMachineGUIInfo1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("glowroot:textures/screens/glowroot_machine_gui_info_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		RecipeFinder.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 56 && mouseX < leftPos + 80 && mouseY > topPos + 39 && mouseY < topPos + 63)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.tooltip_search"), mouseX, mouseY);
		if (mouseX > leftPos + -139 && mouseX < leftPos + -115 && mouseY > topPos + 2 && mouseY < topPos + 26)
			guiGraphics.renderTooltip(font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.tooltip_close_out"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/frostborn.png"), this.leftPos + 0, this.topPos + -2, 0, 0, 146, 180, 146, 180);

		guiGraphics.blit(new ResourceLocation("glowroot:textures/screens/frostborn2.png"), this.leftPos + -144, this.topPos + -2, 0, 0, 146, 180, 146, 180);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (RecipeFinder.isFocused())
			return RecipeFinder.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		RecipeFinder.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_glowroot_machine"), -117, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_the_glowroot_machine"), -135, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_an_infuser_of_which"), -135, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_combines_certain"), -135, 70, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_with_artificial_properties"), -135, 79, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_artificial_power_has"), -135, 88, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_different_levels_with_3"), -135, 97, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_being_the_hardest_to"), -135, 106, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_obtain"), -135, 115, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_you_can_search_up"), -135, 133, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_and_their_respective"), -135, 142, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_recipe_via_searchbar"), -135, 151, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_some_main_items_are"), 17, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_glowcards_emitter_flasks"), 17, 70, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_emitter_flasks"), 17, 79, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_artificial_blocks"), 17, 88, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_typing_the_items"), 17, 106, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_respective_id_or"), 17, 115, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_ingame_name_will"), 17, 124, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_the_searchbar_above"), 17, 133, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_will_provide_you_with"), 17, 142, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.label_the_recipe_for_it"), 17, 151, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		RecipeFinder = new EditBox(this.font, this.leftPos + 11, this.topPos + 20, 120, 20, Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.RecipeFinder")) {
			{
				setSuggestion(Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.RecipeFinder").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.RecipeFinder").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.glowroot.glowroot_machine_gui_info_1.RecipeFinder").getString());
				else
					setSuggestion(null);
			}
		};
		RecipeFinder.setMaxLength(32767);
		guistate.put("text:RecipeFinder", RecipeFinder);
		this.addWidget(this.RecipeFinder);
		imagebutton_buttonx = new ImageButton(this.leftPos + -136, this.topPos + 6, 20, 18, 0, 0, 18, new ResourceLocation("glowroot:textures/screens/atlas/imagebutton_buttonx.png"), 20, 36, e -> {
			if (true) {
				GlowrootMod.PACKET_HANDLER.sendToServer(new GlowrootMachineGUIInfo1ButtonMessage(0, x, y, z));
				GlowrootMachineGUIInfo1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonx", imagebutton_buttonx);
		this.addRenderableWidget(imagebutton_buttonx);
		imagebutton_buttonsearch = new ImageButton(this.leftPos + 58, this.topPos + 42, 20, 18, 0, 0, 18, new ResourceLocation("glowroot:textures/screens/atlas/imagebutton_buttonsearch.png"), 20, 36, e -> {
			if (true) {
				GlowrootMod.PACKET_HANDLER.sendToServer(new GlowrootMachineGUIInfo1ButtonMessage(1, x, y, z));
				GlowrootMachineGUIInfo1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buttonsearch", imagebutton_buttonsearch);
		this.addRenderableWidget(imagebutton_buttonsearch);
	}
}
