
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.glowroot.network.DrillActivateMessage;
import net.mcreator.glowroot.GlowrootMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GlowrootModKeyMappings {
	public static final KeyMapping DRILL_ACTIVATE = new KeyMapping("key.glowroot.drill_activate", GLFW.GLFW_KEY_R, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GlowrootMod.PACKET_HANDLER.sendToServer(new DrillActivateMessage(0, 0));
				DrillActivateMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DRILL_ACTIVATE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DRILL_ACTIVATE_LASTPRESS);
				GlowrootMod.PACKET_HANDLER.sendToServer(new DrillActivateMessage(1, dt));
				DrillActivateMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long DRILL_ACTIVATE_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DRILL_ACTIVATE);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DRILL_ACTIVATE.consumeClick();
			}
		}
	}
}
