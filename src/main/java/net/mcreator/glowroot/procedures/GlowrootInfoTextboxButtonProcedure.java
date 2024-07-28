package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.glowroot.world.inventory.GlowrootToolsGUI1Menu;
import net.mcreator.glowroot.world.inventory.GlowrootMachineRecipeGUIMenu;
import net.mcreator.glowroot.world.inventory.GlowrootKeycardGUI1Menu;
import net.mcreator.glowroot.world.inventory.GlowrootEmitterFlask1guiMenu;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class GlowrootInfoTextboxButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("keycard")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowcard")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Keycard")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowcard")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glow Card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glow card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glow card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glow Card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("key card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Key card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Key Card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("key Card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("card")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("key")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Key")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("KEY")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("KEYCARD")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWCARD")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("CARD")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("GlowrootKeycardGUI1");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new GlowrootKeycardGUI1Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("emitter")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("flask emitter")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Emitter")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Flask Emitter")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Emitter Flask")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("emitter flask")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Emitter flask")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("emitter Flask")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Emitter Liquid")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("emitter liquid")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Flask")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("flask")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("bottle")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("potion")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Bottle")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Potion")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("EMITTER FLASK")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("EMITTER")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("FLASK")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("POTION")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("GlowrootEmitterFlask1gui");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new GlowrootEmitterFlask1guiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("sword")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("pickaxe")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("shovel")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("drill")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowroot sword")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowroot Sword")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowroot pickaxe")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowroot Pickaxe")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowroot shovel")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowroot Shovel")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowroot drill")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowroot Drill")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWROOT SWORD")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWROOT SHOVEL")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWROOT PICKAXE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWROOT DRILL")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowroot tools")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowroot tools")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWROOT TOOLS")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("tools")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("tool")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("GlowrootToolsGUI1");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new GlowrootToolsGUI1Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("ENGINE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glowroot Engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glowroot engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOWROOT ENGINE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Glow Engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("glow engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("root engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Root Engine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("ROOT ENGINE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("GLOW ENGINE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("ENGINE ITEM")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("engine item")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Engine Item")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("enigne")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("ENIGNE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Enigne")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("Eengine")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("EHEENGINE")
				|| (guistate.containsKey("text:RecipeFinder") ? ((EditBox) guistate.get("text:RecipeFinder")).getValue() : "").equals("ENGINE")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("GlowrootMachineRecipeGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new GlowrootMachineRecipeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
