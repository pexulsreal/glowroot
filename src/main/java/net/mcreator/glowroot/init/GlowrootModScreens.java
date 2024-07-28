
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.glowroot.client.gui.GlowrootToolsGUI2Screen;
import net.mcreator.glowroot.client.gui.GlowrootToolsGUI1Screen;
import net.mcreator.glowroot.client.gui.GlowrootRecipeBaseGUIScreen;
import net.mcreator.glowroot.client.gui.GlowrootMachineRecipeGUIScreen;
import net.mcreator.glowroot.client.gui.GlowrootMachineGUIScreen;
import net.mcreator.glowroot.client.gui.GlowrootMachineGUIInfo1Screen;
import net.mcreator.glowroot.client.gui.GlowrootKeycardGUI2Screen;
import net.mcreator.glowroot.client.gui.GlowrootKeycardGUI1Screen;
import net.mcreator.glowroot.client.gui.GlowrootEmitterFlaskgui2Screen;
import net.mcreator.glowroot.client.gui.GlowrootEmitterFlask1guiScreen;
import net.mcreator.glowroot.client.gui.GlowrootCartGUIScreen;
import net.mcreator.glowroot.client.gui.GlowrootBasicEmptyInfoScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowrootModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GlowrootModMenus.GLOWROOT_CART_GUI.get(), GlowrootCartGUIScreen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_MACHINE_GUI.get(), GlowrootMachineGUIScreen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_MACHINE_GUI_INFO_1.get(), GlowrootMachineGUIInfo1Screen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_KEYCARD_GUI_1.get(), GlowrootKeycardGUI1Screen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_KEYCARD_GUI_2.get(), GlowrootKeycardGUI2Screen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_BASIC_EMPTY_INFO.get(), GlowrootBasicEmptyInfoScreen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_EMITTER_FLASK_1GUI.get(), GlowrootEmitterFlask1guiScreen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_EMITTER_FLASKGUI_2.get(), GlowrootEmitterFlaskgui2Screen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_RECIPE_BASE_GUI.get(), GlowrootRecipeBaseGUIScreen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_TOOLS_GUI_1.get(), GlowrootToolsGUI1Screen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_TOOLS_GUI_2.get(), GlowrootToolsGUI2Screen::new);
			MenuScreens.register(GlowrootModMenus.GLOWROOT_MACHINE_RECIPE_GUI.get(), GlowrootMachineRecipeGUIScreen::new);
		});
	}
}
