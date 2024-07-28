package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.glowroot.init.GlowrootModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class MatterWarperTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == GlowrootModItems.MATTERWARPER.get()) {
			if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 2) {
				if (!Screen.hasShiftDown()) {
					tooltip.add(Component.literal("\u00A7bSHIFT to see details."));
				} else {
					tooltip.add(Component.literal("\u00A7bAbility - Root Repair"));
				}
			} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 3) {
				if (!Screen.hasShiftDown()) {
					tooltip.add(Component.literal("\u00A7bSHIFT to see details."));
				} else {
					tooltip.add(Component.literal("\u00A7bAbility - Light Hands"));
				}
			} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 1) {
				if (!Screen.hasShiftDown()) {
					tooltip.add(Component.literal("\u00A7bSHIFT to see details."));
				} else {
					tooltip.add(Component.literal("\u00A7bAbility - Hybrid Eye"));
				}
			} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 4) {
				if (!Screen.hasShiftDown()) {
					tooltip.add(Component.literal("\u00A7bSHIFT to see details."));
				} else {
					tooltip.add(Component.literal("\u00A7bAbility - Light Transport"));
					if (!(itemstack.getOrCreateTag().getDouble("xbook") == 0 && itemstack.getOrCreateTag().getDouble("ybook") == 0 && itemstack.getOrCreateTag().getDouble("zbook") == 0)) {
						tooltip.add(Component.literal(("\u00A73Location: " + itemstack.getOrCreateTag().getDouble("xbook") + " " + itemstack.getOrCreateTag().getDouble("ybook") + " " + itemstack.getOrCreateTag().getDouble("zbook"))));
					} else {
						tooltip.add(Component.literal("\u00A73Location Not Set."));
					}
				}
			} else if (itemstack.getOrCreateTag().getDouble("keycardlvl") == 5) {
				if (!Screen.hasShiftDown()) {
					tooltip.add(Component.literal("\u00A7bSHIFT to see details."));
				} else {
					tooltip.add(Component.literal("\u00A7bAbility - Rune Transplant"));
				}
			}
		}
	}
}
