
package net.mcreator.glowroot.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.glowroot.init.GlowrootModItems;

import java.util.List;

public class GlowrootedEnchantment extends Enchantment {
	public GlowrootedEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.MENDING).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(GlowrootModItems.GLOWROOT_PICKAXE.get()), new ItemStack(GlowrootModItems.GLOWROOT_SWORD.get()), new ItemStack(GlowrootModItems.GLOWROOT_SHOVEL.get()), new ItemStack(GlowrootModItems.PRISM.get()),
				new ItemStack(GlowrootModItems.GLOW_GOGGLES_HELMET.get()), new ItemStack(GlowrootModItems.GLOWROOT_DRILL.get())).test(itemstack);
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
