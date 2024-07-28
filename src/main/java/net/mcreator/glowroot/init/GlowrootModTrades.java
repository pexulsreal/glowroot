
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.glowroot.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GlowrootModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(GlowrootModBlocks.GLOWSHROOM.get(), 5), 6, 20, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.GLOW_INK_SAC),

					new ItemStack(Items.EMERALD, 2), 15, 30, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(GlowrootModItems.COOKED_SQUID_TENTACLE.get(), 4), 12, 20, 0.05f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(GlowrootModItems.CHRYSOPRASE_DUST.get(), 2), 12, 25, 0.05f));
		}
	}
}
