
package net.mcreator.glowroot.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.procedures.GlowrootPickaxeToolInInventoryTickProcedure;
import net.mcreator.glowroot.procedures.GlowrootPickaxeItemIsCraftedsmeltedProcedure;
import net.mcreator.glowroot.init.GlowrootModItems;

public class GlowrootShovelItem extends ShovelItem {
	public GlowrootShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1200;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GlowrootModItems.CHRYSOPRASE_DUST.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		GlowrootPickaxeItemIsCraftedsmeltedProcedure.execute(itemstack);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GlowrootPickaxeToolInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	// credits to Icey087!
	@Override
	public boolean isBarVisible(ItemStack stack) {
		return stack.isDamaged();
	}

	@Override
	public int getBarWidth(ItemStack stack) {
		return Math.round(13.0F - (float) stack.getDamageValue() * 13.0F / (float) stack.getMaxDamage());
	}

	@Override
	public int getBarColor(ItemStack stack) {
		// For example, 0xFFAA00 is an orange color.
		return 0x3BE9CC;
	}
}
