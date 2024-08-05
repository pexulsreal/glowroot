
package net.mcreator.glowroot.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.glowroot.procedures.FlashlightOnRightclickedProcedure;
import net.mcreator.glowroot.procedures.FlashlightOnItemInHandTickProcedure;

public class GlowlightItem extends Item {
	public GlowlightItem() {
		super(new Item.Properties().durability(1200).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		FlashlightOnRightclickedProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			FlashlightOnItemInHandTickProcedure.execute(world, entity, itemstack);
	}// credits to Icey087!
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
