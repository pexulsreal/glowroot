
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.glowroot.world.inventory.GlowrootToolsGUI2Menu;
import net.mcreator.glowroot.world.inventory.GlowrootToolsGUI1Menu;
import net.mcreator.glowroot.world.inventory.GlowrootRecipeBaseGUIMenu;
import net.mcreator.glowroot.world.inventory.GlowrootMachineRecipeGUIMenu;
import net.mcreator.glowroot.world.inventory.GlowrootMachineGUIMenu;
import net.mcreator.glowroot.world.inventory.GlowrootMachineGUIInfo1Menu;
import net.mcreator.glowroot.world.inventory.GlowrootKeycardGUI2Menu;
import net.mcreator.glowroot.world.inventory.GlowrootKeycardGUI1Menu;
import net.mcreator.glowroot.world.inventory.GlowrootEmitterFlaskgui2Menu;
import net.mcreator.glowroot.world.inventory.GlowrootEmitterFlask1guiMenu;
import net.mcreator.glowroot.world.inventory.GlowrootCartGUIMenu;
import net.mcreator.glowroot.world.inventory.GlowrootBasicEmptyInfoMenu;
import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GlowrootMod.MODID);
	public static final RegistryObject<MenuType<GlowrootCartGUIMenu>> GLOWROOT_CART_GUI = REGISTRY.register("glowroot_cart_gui", () -> IForgeMenuType.create(GlowrootCartGUIMenu::new));
	public static final RegistryObject<MenuType<GlowrootMachineGUIMenu>> GLOWROOT_MACHINE_GUI = REGISTRY.register("glowroot_machine_gui", () -> IForgeMenuType.create(GlowrootMachineGUIMenu::new));
	public static final RegistryObject<MenuType<GlowrootMachineGUIInfo1Menu>> GLOWROOT_MACHINE_GUI_INFO_1 = REGISTRY.register("glowroot_machine_gui_info_1", () -> IForgeMenuType.create(GlowrootMachineGUIInfo1Menu::new));
	public static final RegistryObject<MenuType<GlowrootKeycardGUI1Menu>> GLOWROOT_KEYCARD_GUI_1 = REGISTRY.register("glowroot_keycard_gui_1", () -> IForgeMenuType.create(GlowrootKeycardGUI1Menu::new));
	public static final RegistryObject<MenuType<GlowrootKeycardGUI2Menu>> GLOWROOT_KEYCARD_GUI_2 = REGISTRY.register("glowroot_keycard_gui_2", () -> IForgeMenuType.create(GlowrootKeycardGUI2Menu::new));
	public static final RegistryObject<MenuType<GlowrootBasicEmptyInfoMenu>> GLOWROOT_BASIC_EMPTY_INFO = REGISTRY.register("glowroot_basic_empty_info", () -> IForgeMenuType.create(GlowrootBasicEmptyInfoMenu::new));
	public static final RegistryObject<MenuType<GlowrootEmitterFlask1guiMenu>> GLOWROOT_EMITTER_FLASK_1GUI = REGISTRY.register("glowroot_emitter_flask_1gui", () -> IForgeMenuType.create(GlowrootEmitterFlask1guiMenu::new));
	public static final RegistryObject<MenuType<GlowrootEmitterFlaskgui2Menu>> GLOWROOT_EMITTER_FLASKGUI_2 = REGISTRY.register("glowroot_emitter_flaskgui_2", () -> IForgeMenuType.create(GlowrootEmitterFlaskgui2Menu::new));
	public static final RegistryObject<MenuType<GlowrootRecipeBaseGUIMenu>> GLOWROOT_RECIPE_BASE_GUI = REGISTRY.register("glowroot_recipe_base_gui", () -> IForgeMenuType.create(GlowrootRecipeBaseGUIMenu::new));
	public static final RegistryObject<MenuType<GlowrootToolsGUI1Menu>> GLOWROOT_TOOLS_GUI_1 = REGISTRY.register("glowroot_tools_gui_1", () -> IForgeMenuType.create(GlowrootToolsGUI1Menu::new));
	public static final RegistryObject<MenuType<GlowrootToolsGUI2Menu>> GLOWROOT_TOOLS_GUI_2 = REGISTRY.register("glowroot_tools_gui_2", () -> IForgeMenuType.create(GlowrootToolsGUI2Menu::new));
	public static final RegistryObject<MenuType<GlowrootMachineRecipeGUIMenu>> GLOWROOT_MACHINE_RECIPE_GUI = REGISTRY.register("glowroot_machine_recipe_gui", () -> IForgeMenuType.create(GlowrootMachineRecipeGUIMenu::new));
}
