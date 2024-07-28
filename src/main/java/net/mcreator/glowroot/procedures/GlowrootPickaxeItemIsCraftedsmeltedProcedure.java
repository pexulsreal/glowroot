package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.glowroot.init.GlowrootModItems;
import net.mcreator.glowroot.init.GlowrootModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlowrootPickaxeItemIsCraftedsmeltedProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getItem().getItem());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == GlowrootModItems.GLOWROOT_PICKAXE.get() || itemstack.getItem() == GlowrootModItems.GLOWROOT_SHOVEL.get() || itemstack.getItem() == GlowrootModItems.PRISM.get()
				|| itemstack.getItem() == GlowrootModItems.GLOWROOT_DRILL.get() || itemstack.getItem() == GlowrootModItems.GLOWROOT_SWORD.get()) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(GlowrootModEnchantments.GLOWROOTED.get(), itemstack) != 0)) {
				itemstack.enchant(GlowrootModEnchantments.GLOWROOTED.get(), 1);
			}
		}
	}
}
