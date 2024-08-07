
package net.mcreator.glowroot.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.glowroot.procedures.GlowrootJetpackChestplateTickEventProcedure;
import net.mcreator.glowroot.client.model.Modeljetpackearly;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

public abstract class GlowrootJetpackItem extends ArmorItem {
	public GlowrootJetpackItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 22;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{0, 0, 4, 0}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 30;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "glowroot_jetpack";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Chestplate extends GlowrootJetpackItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new Modeljetpackearly(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljetpackearly.LAYER_LOCATION)).bone, "left_arm",
							new Modeljetpackearly(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljetpackearly.LAYER_LOCATION)).bone2, "right_arm",
							new Modeljetpackearly(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljetpackearly.LAYER_LOCATION)).bone2, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "glowroot:textures/entities/jetpacktexture.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			GlowrootJetpackChestplateTickEventProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	@Override
	public boolean canElytraFly(ItemStack stack, net.minecraft.world.entity.LivingEntity entity) {
		return entity.getPersistentData().getBoolean("jetpackon");
	}

	@Override
	public boolean elytraFlightTick(ItemStack stack, net.minecraft.world.entity.LivingEntity entity, int flightTicks) {
		entity.gameEvent(net.minecraft.world.level.gameevent.GameEvent.ELYTRA_GLIDE);
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
		return 0x00FFAA;
	}
}
