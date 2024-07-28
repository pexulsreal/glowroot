package net.mcreator.glowroot.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class InfotextProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A73Welcome to Glowroot! This info box is gonna act as the current way to get information on the mod's functionality, as a guidebook hasn't been implemented yet."), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(
					"\u00A7bMost features introduced and utilities are only really discoverable in the biome itself. While there are some new outside-biome features, like glow squids now dazzling you, (configurable with /gamerule dazzleopacity,) and both regular and glow squids dropping tentacles, there isn't much new otherwise."),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(
					"\u00A73Chrysoprase items, like dust and crystals, can be obtained in certain ways. Chrysoprase crystals can be either mined out from small crystal chunks located in the biome, or by using the custom flowers and blocks that generate and right clicking onto a glowroot node with them, (a structure that spawns in the biome, that will generate crystals.) Crystals can be smashed into dust, which can also be used for other recipes. It is reccomended to use JEI to get all of the recipes in the mod, but most are also auto-given with advancements."),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7bGlowroot chips and similar robotic items can be dropped from the Glowroot mobs that spawn in the biome. The chips can also be used in crafting recipes to make new items and blocks."),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(
					"\u00A73Some items, you may notice, dont have basic crafting recipes. This is because they can only be upgraded, or obtained, via a Glowroot Machine. The Glowroot Machine can be used to upgrade items, or craft new ones. It can currently craft all glowroot tools, upgrade keycards to 3 levels, and fill emitter flasks. Glowroot tools, as previously mentioned, have a unique feature of naturally being enchanted with Glowrooted. This will make mending impossible to apply to it, but the tool will also lose/gain durability based on the light level of where the player's standing. You could also use Glowroot Visors to read the level of durability lost/gained if wearing them, along with holding a glowrooted tool."),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(
					"\u00A7bYou may notice there are a ton of new detector/emitter blocks, and runes. These blocks and runes are a new energy system! If you place a glowrooted (lit up) rune next to a emitter or detector, it will function. Some are fairly simple, such as grow emitters bonemealing nearby blocks, light detectors emitting redstone based on the light level, etc.."),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(
					"\u00A73There are 4 new mobs that can spawn in, (and three extra ones only found in /summon.) Glowroot Golems are new tameable and rideable mobs that can be tamed with glowroot leaves/petals. You can right click them with a Drill Head to give them a drill, allowing them to mine blocks when you use the drilling keybind, (automatically set to R.) Glowroot Quadcopters are flying entities that will float above you, and drop glowbangs. Glowroot Hermits are similar to spiders, and will leap at you. If you aren't shifting, they will grab you using their head claws, and carry you. Glowroot Zombies will attack regular mobs like creepers and regular zombies, but mainly target players.They will explode and dazzle you upon death, and are immune to being dazzled themselves. A zombie can also become a Glowroot Zombie if they walk on glowrooted stone or chrysoprase too long."),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(
					"\u00A7bSome special items also exist, like Glowroot TNT and lamps. Lamps change into 15 different light levels per right click, and Glowroot TNT blows up using Chrysoprase dust or crystals, (crystals for a stronger effect!) "),
					false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A73Thats a overview for most of the mod's content, have fun! (Be sure to install JEI to see most recipes, and change the dazzlingopacity gamerule if it's too much for you!)"), false);
	}
}
