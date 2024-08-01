
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.glowroot.procedures.GlowrootKeycardPropertyValueProviderProcedure;
import net.mcreator.glowroot.procedures.FlashlightOnOffProcedure;
import net.mcreator.glowroot.item.ThetruthItem;
import net.mcreator.glowroot.item.SquidTentacleItem;
import net.mcreator.glowroot.item.RawGlowfishItem;
import net.mcreator.glowroot.item.PrismItem;
import net.mcreator.glowroot.item.MiningHelmetItem;
import net.mcreator.glowroot.item.MinersSaddleItem;
import net.mcreator.glowroot.item.MatterwarperItem;
import net.mcreator.glowroot.item.InkBalloonItem;
import net.mcreator.glowroot.item.HermitClawItem;
import net.mcreator.glowroot.item.GlowsquidTentacleItem;
import net.mcreator.glowroot.item.GlowrooticonItem;
import net.mcreator.glowroot.item.GlowrootVestItem;
import net.mcreator.glowroot.item.GlowrootTorchItem;
import net.mcreator.glowroot.item.GlowrootSwordItem;
import net.mcreator.glowroot.item.GlowrootShovelItem;
import net.mcreator.glowroot.item.GlowrootPickaxeItem;
import net.mcreator.glowroot.item.GlowrootMusicDiscItem;
import net.mcreator.glowroot.item.GlowrootKeycardItem;
import net.mcreator.glowroot.item.GlowrootEngineItem;
import net.mcreator.glowroot.item.GlowrootDustItem;
import net.mcreator.glowroot.item.GlowrootDrillItem;
import net.mcreator.glowroot.item.GlowrootCrystalItem;
import net.mcreator.glowroot.item.GlowrootChipItem;
import net.mcreator.glowroot.item.GlowlightItem;
import net.mcreator.glowroot.item.GlowbangItem;
import net.mcreator.glowroot.item.GlowInkBalloonItem;
import net.mcreator.glowroot.item.GlowGogglesItem;
import net.mcreator.glowroot.item.ForcelookerItem;
import net.mcreator.glowroot.item.EmitterLiquidItem;
import net.mcreator.glowroot.item.CookedGlowfishItem;
import net.mcreator.glowroot.item.CookedGlowSquidTentacleItem;
import net.mcreator.glowroot.item.BabyGlowSquidBucketItem;
import net.mcreator.glowroot.GlowrootMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GlowrootModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GlowrootMod.MODID);
	public static final RegistryObject<Item> GLOW_ROOT = block(GlowrootModBlocks.GLOW_ROOT);
	public static final RegistryObject<Item> GLOW_WEEDS = block(GlowrootModBlocks.GLOW_WEEDS);
	public static final RegistryObject<Item> GLOWROOT_TALL_WEEDS = doubleBlock(GlowrootModBlocks.GLOWROOT_TALL_WEEDS);
	public static final RegistryObject<Item> GLOWROOT_FERN = block(GlowrootModBlocks.GLOWROOT_FERN);
	public static final RegistryObject<Item> GLOWROOT_ASTILBES = block(GlowrootModBlocks.GLOWROOT_ASTILBES);
	public static final RegistryObject<Item> GLOW_POPPY = block(GlowrootModBlocks.GLOW_POPPY);
	public static final RegistryObject<Item> GLOWROOT_ROSE = block(GlowrootModBlocks.GLOWROOT_ROSE);
	public static final RegistryObject<Item> GLOW_FLOWER = block(GlowrootModBlocks.GLOW_FLOWER);
	public static final RegistryObject<Item> GLOWROOT_PAEONIA = block(GlowrootModBlocks.GLOWROOT_PAEONIA);
	public static final RegistryObject<Item> GLOWROOT_ALLIUM = block(GlowrootModBlocks.GLOWROOT_ALLIUM);
	public static final RegistryObject<Item> GLOWROOT_DANDELION = block(GlowrootModBlocks.GLOWROOT_DANDELION);
	public static final RegistryObject<Item> GLOWROOT_CATTAIL = block(GlowrootModBlocks.GLOWROOT_CATTAIL);
	public static final RegistryObject<Item> LARGE_GLOW_FLOWER = doubleBlock(GlowrootModBlocks.LARGE_GLOW_FLOWER);
	public static final RegistryObject<Item> GLOWSHROOM = block(GlowrootModBlocks.GLOWSHROOM);
	public static final RegistryObject<Item> GLOW_BULB = block(GlowrootModBlocks.GLOW_BULB);
	public static final RegistryObject<Item> GLOWROOT_LEAVES_FALLEN = block(GlowrootModBlocks.GLOWROOT_LEAVES_FALLEN);
	public static final RegistryObject<Item> GLOWROOT_LEAVES = block(GlowrootModBlocks.GLOWROOT_LEAVES);
	public static final RegistryObject<Item> GLOWROOTED_STONE = block(GlowrootModBlocks.GLOWROOTED_STONE);
	public static final RegistryObject<Item> GLOWROOTDIRT = block(GlowrootModBlocks.GLOWROOTDIRT);
	public static final RegistryObject<Item> GLOWROOT_COAL_ORE = block(GlowrootModBlocks.GLOWROOT_COAL_ORE);
	public static final RegistryObject<Item> GLOWROOT_COPPE_ORE = block(GlowrootModBlocks.GLOWROOT_COPPE_ORE);
	public static final RegistryObject<Item> GLOWROOT_IRON_ORE = block(GlowrootModBlocks.GLOWROOT_IRON_ORE);
	public static final RegistryObject<Item> GLOWROOT_GOLD_ORE = block(GlowrootModBlocks.GLOWROOT_GOLD_ORE);
	public static final RegistryObject<Item> GLOWROOT_LAPIS_ORE = block(GlowrootModBlocks.GLOWROOT_LAPIS_ORE);
	public static final RegistryObject<Item> GLOWROOT_REDSTONE_ORE = block(GlowrootModBlocks.GLOWROOT_REDSTONE_ORE);
	public static final RegistryObject<Item> GLOWROOT_DIAMOND_ORE = block(GlowrootModBlocks.GLOWROOT_DIAMOND_ORE);
	public static final RegistryObject<Item> GLOWROOT_EMERALD_ORE = block(GlowrootModBlocks.GLOWROOT_EMERALD_ORE);
	public static final RegistryObject<Item> GLOWROOT_STONE_STAIRS = block(GlowrootModBlocks.GLOWROOT_STONE_STAIRS);
	public static final RegistryObject<Item> GLOWROOT_STONE_SLAB = block(GlowrootModBlocks.GLOWROOT_STONE_SLAB);
	public static final RegistryObject<Item> GLOWROOT_STONE_WALL = block(GlowrootModBlocks.GLOWROOT_STONE_WALL);
	public static final RegistryObject<Item> GLOWROOT_STONE_BUTTON = block(GlowrootModBlocks.GLOWROOT_STONE_BUTTON);
	public static final RegistryObject<Item> GLOWROOT_STONE_PRESSURE_PLATE = block(GlowrootModBlocks.GLOWROOT_STONE_PRESSURE_PLATE);
	public static final RegistryObject<Item> GLOWROOT_BRICKS = block(GlowrootModBlocks.GLOWROOT_BRICKS);
	public static final RegistryObject<Item> GLOWROOT_BRICK_STAIRS = block(GlowrootModBlocks.GLOWROOT_BRICK_STAIRS);
	public static final RegistryObject<Item> GLOWROOT_BRICK_SLAB = block(GlowrootModBlocks.GLOWROOT_BRICK_SLAB);
	public static final RegistryObject<Item> GLOWROOT_BRICK_WALL = block(GlowrootModBlocks.GLOWROOT_BRICK_WALL);
	public static final RegistryObject<Item> CHISELED_GLOWROOT_BRICKS = block(GlowrootModBlocks.CHISELED_GLOWROOT_BRICKS);
	public static final RegistryObject<Item> CUT_GLOWROOT = block(GlowrootModBlocks.CUT_GLOWROOT);
	public static final RegistryObject<Item> CUT_GLOWROOT_STAIRS = block(GlowrootModBlocks.CUT_GLOWROOT_STAIRS);
	public static final RegistryObject<Item> CUT_GLOWROOT_SLAB = block(GlowrootModBlocks.CUT_GLOWROOT_SLAB);
	public static final RegistryObject<Item> GLOWROOT_CONCRETE = block(GlowrootModBlocks.GLOWROOT_CONCRETE);
	public static final RegistryObject<Item> GLOWROOT_PILLAR = block(GlowrootModBlocks.GLOWROOT_PILLAR);
	public static final RegistryObject<Item> GLOWROOT_GRATE = block(GlowrootModBlocks.GLOWROOT_GRATE);
	public static final RegistryObject<Item> THE_RIGHT_SIDE = block(GlowrootModBlocks.THE_RIGHT_SIDE);
	public static final RegistryObject<Item> GLOWROOT_PANEL = block(GlowrootModBlocks.GLOWROOT_PANEL);
	public static final RegistryObject<Item> GLOWROOT_VENT_DUCT = block(GlowrootModBlocks.GLOWROOT_VENT_DUCT);
	public static final RegistryObject<Item> GLOWROOT_LIT_VENT_DUCT = block(GlowrootModBlocks.GLOWROOT_LIT_VENT_DUCT);
	public static final RegistryObject<Item> ALARMOFF = block(GlowrootModBlocks.ALARMOFF);
	public static final RegistryObject<Item> GLOWROOT_LOCKER = block(GlowrootModBlocks.GLOWROOT_LOCKER);
	public static final RegistryObject<Item> GLOWROOT_CART = block(GlowrootModBlocks.GLOWROOT_CART);
	public static final RegistryObject<Item> GLOWROOT_VENT = block(GlowrootModBlocks.GLOWROOT_VENT);
	public static final RegistryObject<Item> GLOWROOT_TORCH = REGISTRY.register("glowroot_torch", () -> new GlowrootTorchItem());
	public static final RegistryObject<Item> GLOWROOT_DOOR = doubleBlock(GlowrootModBlocks.GLOWROOT_DOOR);
	public static final RegistryObject<Item> GLOWROOT_LADDER = block(GlowrootModBlocks.GLOWROOT_LADDER);
	public static final RegistryObject<Item> GLOWROOT_BARS = block(GlowrootModBlocks.GLOWROOT_BARS);
	public static final RegistryObject<Item> GLOWROOT_CHAIN = block(GlowrootModBlocks.GLOWROOT_CHAIN);
	public static final RegistryObject<Item> GLOWROOT_BLOCK = block(GlowrootModBlocks.GLOWROOT_BLOCK);
	public static final RegistryObject<Item> GLOW_ROOT_LANTERN = block(GlowrootModBlocks.GLOW_ROOT_LANTERN);
	public static final RegistryObject<Item> GLOW_RUNES = block(GlowrootModBlocks.GLOW_RUNES);
	public static final RegistryObject<Item> GLOWING_RUNES = block(GlowrootModBlocks.GLOWING_RUNES);
	public static final RegistryObject<Item> ARTIFICAL_GLOWROOT_BLOCK_1 = block(GlowrootModBlocks.ARTIFICAL_GLOWROOT_BLOCK_1);
	public static final RegistryObject<Item> ARTIFICIAL_GLOWROOT_BLOCK_2 = block(GlowrootModBlocks.ARTIFICIAL_GLOWROOT_BLOCK_2);
	public static final RegistryObject<Item> ARTIFICAL_GLOWROOT_BLOCK_3 = block(GlowrootModBlocks.ARTIFICAL_GLOWROOT_BLOCK_3);
	public static final RegistryObject<Item> GLOWROOT_UPGRADER = block(GlowrootModBlocks.GLOWROOT_UPGRADER);
	public static final RegistryObject<Item> GLOWROOT_MACHINE = block(GlowrootModBlocks.GLOWROOT_MACHINE);
	public static final RegistryObject<Item> GLOWROOT_NODE = block(GlowrootModBlocks.GLOWROOT_NODE);
	public static final RegistryObject<Item> GLOW_EMITTER = block(GlowrootModBlocks.GLOW_EMITTER);
	public static final RegistryObject<Item> LIGHT_DETECTOR = block(GlowrootModBlocks.LIGHT_DETECTOR);
	public static final RegistryObject<Item> DARKNESS_DETECTOR = block(GlowrootModBlocks.DARKNESS_DETECTOR);
	public static final RegistryObject<Item> GROW_EMITTER = block(GlowrootModBlocks.GROW_EMITTER);
	public static final RegistryObject<Item> GLOWROOT_SEEKER = block(GlowrootModBlocks.GLOWROOT_SEEKER);
	public static final RegistryObject<Item> GLOW_GLASS = block(GlowrootModBlocks.GLOW_GLASS);
	public static final RegistryObject<Item> GLOW_GLASS_PANE = block(GlowrootModBlocks.GLOW_GLASS_PANE);
	public static final RegistryObject<Item> GLOWROOT_TNT = block(GlowrootModBlocks.GLOWROOT_TNT);
	public static final RegistryObject<Item> GLOWSHROOM_BLOCK = block(GlowrootModBlocks.GLOWSHROOM_BLOCK);
	public static final RegistryObject<Item> SQUID_TENTACLE = REGISTRY.register("squid_tentacle", () -> new SquidTentacleItem());
	public static final RegistryObject<Item> GLOWSQUID_TENTACLE = REGISTRY.register("glowsquid_tentacle", () -> new GlowsquidTentacleItem());
	public static final RegistryObject<Item> COOKED_SQUID_TENTACLE = REGISTRY.register("cooked_squid_tentacle", () -> new CookedGlowSquidTentacleItem());
	public static final RegistryObject<Item> INK_BALLOON = REGISTRY.register("ink_balloon", () -> new InkBalloonItem());
	public static final RegistryObject<Item> GLOW_INK_BALLOON = REGISTRY.register("glow_ink_balloon", () -> new GlowInkBalloonItem());
	public static final RegistryObject<Item> CHRYSOPRASE_DUST = REGISTRY.register("chrysoprase_dust", () -> new GlowrootDustItem());
	public static final RegistryObject<Item> CHRYSOPRASE_CRYSTAL = REGISTRY.register("chrysoprase_crystal", () -> new GlowrootCrystalItem());
	public static final RegistryObject<Item> UNPURE_CHRYSOPRASE = block(GlowrootModBlocks.UNPURE_CHRYSOPRASE);
	public static final RegistryObject<Item> PURE_CHYSOPRASE = block(GlowrootModBlocks.PURE_CHYSOPRASE);
	public static final RegistryObject<Item> BLOCK_OF_CHRYSOPRASE = block(GlowrootModBlocks.BLOCK_OF_CHRYSOPRASE);
	public static final RegistryObject<Item> BUDDED_BLOCK_OF_CHRYSOPRASE = block(GlowrootModBlocks.BUDDED_BLOCK_OF_CHRYSOPRASE);
	public static final RegistryObject<Item> CHRYSOPRASE_CLUSTER = block(GlowrootModBlocks.CHRYSOPRASE_CLUSTER);
	public static final RegistryObject<Item> LARGE_CHRYSOPRASE_BUD = block(GlowrootModBlocks.LARGE_CHRYSOPRASE_BUD);
	public static final RegistryObject<Item> MEDIUM_CHRYSOPRASE_BUD = block(GlowrootModBlocks.MEDIUM_CHRYSOPRASE_BUD);
	public static final RegistryObject<Item> SMALL_CHRYSOPRASE_BUD = block(GlowrootModBlocks.SMALL_CHRYSOPRASE_BUD);
	public static final RegistryObject<Item> GLOWROOT_CHIP = REGISTRY.register("glowroot_chip", () -> new GlowrootChipItem());
	public static final RegistryObject<Item> GLOWROOT_DRILL_HEAD = REGISTRY.register("glowroot_drill_head", () -> new MinersSaddleItem());
	public static final RegistryObject<Item> GLOWROOT_ENGINE = REGISTRY.register("glowroot_engine", () -> new GlowrootEngineItem());
	public static final RegistryObject<Item> GLOWROOT_CORE = block(GlowrootModBlocks.GLOWROOT_CORE);
	public static final RegistryObject<Item> GLOWCARD = REGISTRY.register("glowcard", () -> new GlowrootKeycardItem());
	public static final RegistryObject<Item> GLOWLIGHT = REGISTRY.register("glowlight", () -> new GlowlightItem());
	public static final RegistryObject<Item> EMITTER_FLASK = REGISTRY.register("emitter_flask", () -> new EmitterLiquidItem());
	public static final RegistryObject<Item> GLOWBANG = REGISTRY.register("glowbang", () -> new GlowbangItem());
	public static final RegistryObject<Item> GLOWROOT_VEST_CHESTPLATE = REGISTRY.register("glowroot_vest_chestplate", () -> new GlowrootVestItem.Chestplate());
	public static final RegistryObject<Item> GLOWROOT_MUSIC_DISC = REGISTRY.register("glowroot_music_disc", () -> new GlowrootMusicDiscItem());
	public static final RegistryObject<Item> GLOWROOT_SWORD = REGISTRY.register("glowroot_sword", () -> new GlowrootSwordItem());
	public static final RegistryObject<Item> GLOWROOT_PICKAXE = REGISTRY.register("glowroot_pickaxe", () -> new GlowrootPickaxeItem());
	public static final RegistryObject<Item> GLOWROOT_SHOVEL = REGISTRY.register("glowroot_shovel", () -> new GlowrootShovelItem());
	public static final RegistryObject<Item> GLOWROOT_DRILL = REGISTRY.register("glowroot_drill", () -> new GlowrootDrillItem());
	public static final RegistryObject<Item> PRISM = REGISTRY.register("prism", () -> new PrismItem());
	public static final RegistryObject<Item> GLOW_GOGGLES_HELMET = REGISTRY.register("glow_goggles_helmet", () -> new GlowGogglesItem.Helmet());
	public static final RegistryObject<Item> GLOWROOT_GOLEM_SPAWN_EGG = REGISTRY.register("glowroot_golem_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GLOWROOT_GOLEM, -15853255, -14700669, new Item.Properties()));
	public static final RegistryObject<Item> GLOWROOT_BOMBER_SPAWN_EGG = REGISTRY.register("glowroot_bomber_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GLOWROOT_BOMBER, -14936782, -12739710, new Item.Properties()));
	public static final RegistryObject<Item> GLOWROOT_HERMIT_SPAWN_EGG = REGISTRY.register("glowroot_hermit_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GLOWROOT_HERMIT, -14476739, -13476759, new Item.Properties()));
	public static final RegistryObject<Item> GLOWROOTED_ZOMBIE_SPAWN_EGG = REGISTRY.register("glowrooted_zombie_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GLOWROOTED_ZOMBIE, -14607552, -13269072, new Item.Properties()));
	public static final RegistryObject<Item> GLOWROOT_HYBRID_SPAWN_EGG = REGISTRY.register("glowroot_hybrid_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GLOWROOT_HYBRID, -14348486, -15392431, new Item.Properties()));
	public static final RegistryObject<Item> MATTERWARPER = REGISTRY.register("matterwarper", () -> new MatterwarperItem());
	public static final RegistryObject<Item> CAVE_PAINTING_1 = block(GlowrootModBlocks.CAVE_PAINTING_1);
	public static final RegistryObject<Item> GHONE_SPAWN_EGG = REGISTRY.register("ghone_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GHONE, -14348486, -15392431, new Item.Properties()));
	public static final RegistryObject<Item> GRPONE_SPAWN_EGG = REGISTRY.register("grpone_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GRPONE, -14348486, -15392431, new Item.Properties()));
	public static final RegistryObject<Item> GHROOMORHALLWAY_SPAWN_EGG = REGISTRY.register("ghroomorhallway_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GHROOMORHALLWAY, -14348486, -15392431, new Item.Properties()));
	public static final RegistryObject<Item> CHRYSOPRASE_DUST_SPLAT = block(GlowrootModBlocks.CHRYSOPRASE_DUST_SPLAT);
	public static final RegistryObject<Item> EMITTER_FLASK_BLOCK = block(GlowrootModBlocks.EMITTER_FLASK_BLOCK);
	public static final RegistryObject<Item> GLOW_ROOT_END = block(GlowrootModBlocks.GLOW_ROOT_END);
	public static final RegistryObject<Item> GLOW_DETECTOR = block(GlowrootModBlocks.GLOW_DETECTOR);
	public static final RegistryObject<Item> GLOWROOT_LAMP_1 = block(GlowrootModBlocks.GLOWROOT_LAMP_1);
	public static final RegistryObject<Item> GLOWROOT_LAMP_2 = block(GlowrootModBlocks.GLOWROOT_LAMP_2);
	public static final RegistryObject<Item> GLOWROOT_LAMP_3 = block(GlowrootModBlocks.GLOWROOT_LAMP_3);
	public static final RegistryObject<Item> GLOWROOT_LAMP_4 = block(GlowrootModBlocks.GLOWROOT_LAMP_4);
	public static final RegistryObject<Item> GLOWROOT_LAMP_5 = block(GlowrootModBlocks.GLOWROOT_LAMP_5);
	public static final RegistryObject<Item> GLOWROOT_LAMP_6 = block(GlowrootModBlocks.GLOWROOT_LAMP_6);
	public static final RegistryObject<Item> GLOWROOT_LAMP_7 = block(GlowrootModBlocks.GLOWROOT_LAMP_7);
	public static final RegistryObject<Item> GLOWROOT_LAMP_8 = block(GlowrootModBlocks.GLOWROOT_LAMP_8);
	public static final RegistryObject<Item> GLOWROOT_LAMP_9 = block(GlowrootModBlocks.GLOWROOT_LAMP_9);
	public static final RegistryObject<Item> GLOWROOT_LAMP_10 = block(GlowrootModBlocks.GLOWROOT_LAMP_10);
	public static final RegistryObject<Item> GLOWROOT_LAMP_11 = block(GlowrootModBlocks.GLOWROOT_LAMP_11);
	public static final RegistryObject<Item> GLOWROOT_LAMP_12 = block(GlowrootModBlocks.GLOWROOT_LAMP_12);
	public static final RegistryObject<Item> GLOWROOT_LAMP_13 = block(GlowrootModBlocks.GLOWROOT_LAMP_13);
	public static final RegistryObject<Item> GLOWROOT_LAMP_14 = block(GlowrootModBlocks.GLOWROOT_LAMP_14);
	public static final RegistryObject<Item> GLOWROOT_LAMP_15 = block(GlowrootModBlocks.GLOWROOT_LAMP_15);
	public static final RegistryObject<Item> BABY_GLOW_SQUID_BUCKET = REGISTRY.register("baby_glow_squid_bucket", () -> new BabyGlowSquidBucketItem());
	public static final RegistryObject<Item> INVISIBLE_GLOWROOT_BLOCK_1 = block(GlowrootModBlocks.INVISIBLE_GLOWROOT_BLOCK_1);
	public static final RegistryObject<Item> ARTIFICAL_GLOWROOTED_BLOCK_1 = block(GlowrootModBlocks.ARTIFICAL_GLOWROOTED_BLOCK_1);
	public static final RegistryObject<Item> ARTIFICAL_GLOWROOTED_BLOCK_3 = block(GlowrootModBlocks.ARTIFICAL_GLOWROOTED_BLOCK_3);
	public static final RegistryObject<Item> INVISIBLE_GLOWROOT_BLOCK_3 = block(GlowrootModBlocks.INVISIBLE_GLOWROOT_BLOCK_3);
	public static final RegistryObject<Item> ARTIFICIAL_GLOWROOTED_BLOCK_2 = block(GlowrootModBlocks.ARTIFICIAL_GLOWROOTED_BLOCK_2);
	public static final RegistryObject<Item> INVISIBLE_GLOWROOT_BLOCK_2 = block(GlowrootModBlocks.INVISIBLE_GLOWROOT_BLOCK_2);
	public static final RegistryObject<Item> DAZZLER = block(GlowrootModBlocks.DAZZLER);
	public static final RegistryObject<Item> GLOWROOT_FURNACE = block(GlowrootModBlocks.GLOWROOT_FURNACE);
	public static final RegistryObject<Item> GLOWROOT_LOCKER_OPEN = block(GlowrootModBlocks.GLOWROOT_LOCKER_OPEN);
	public static final RegistryObject<Item> GLOWROOT_PIPE_1_WAY = block(GlowrootModBlocks.GLOWROOT_PIPE_1_WAY);
	public static final RegistryObject<Item> GLOWROOT_PIPE_2_WAY = block(GlowrootModBlocks.GLOWROOT_PIPE_2_WAY);
	public static final RegistryObject<Item> GLOWROOT_PIPE_4_WAY = block(GlowrootModBlocks.GLOWROOT_PIPE_4_WAY);
	public static final RegistryObject<Item> TORCH_FLOOR = block(GlowrootModBlocks.TORCH_FLOOR);
	public static final RegistryObject<Item> TORCH_WALL = block(GlowrootModBlocks.TORCH_WALL);
	public static final RegistryObject<Item> FLASHLIGHT_LIGHT = block(GlowrootModBlocks.FLASHLIGHT_LIGHT);
	public static final RegistryObject<Item> REDSTONE_FLASHLIGHT_LIGHT = block(GlowrootModBlocks.REDSTONE_FLASHLIGHT_LIGHT);
	public static final RegistryObject<Item> GLOW_FLASHLIGHT_LIGHT = block(GlowrootModBlocks.GLOW_FLASHLIGHT_LIGHT);
	public static final RegistryObject<Item> REDSTONE_GLOW_FLASHLIGHT_LIGHT = block(GlowrootModBlocks.REDSTONE_GLOW_FLASHLIGHT_LIGHT);
	public static final RegistryObject<Item> RAW_GLOWFISH = REGISTRY.register("raw_glowfish", () -> new RawGlowfishItem());
	public static final RegistryObject<Item> COOKED_GLOWFISH = REGISTRY.register("cooked_glowfish", () -> new CookedGlowfishItem());
	public static final RegistryObject<Item> MINING_HELMET_HELMET = REGISTRY.register("mining_helmet_helmet", () -> new MiningHelmetItem.Helmet());
	public static final RegistryObject<Item> GLOWROOTED_CALCITE = block(GlowrootModBlocks.GLOWROOTED_CALCITE);
	public static final RegistryObject<Item> GLOWROOTED_SMOOTH_BASALT = block(GlowrootModBlocks.GLOWROOTED_SMOOTH_BASALT);
	public static final RegistryObject<Item> GLOWROOT_GOLEM_DRILL_SPAWN_EGG = REGISTRY.register("glowroot_golem_drill_spawn_egg", () -> new ForgeSpawnEggItem(GlowrootModEntities.GLOWROOT_GOLEM_DRILL, -15520959, -14237021, new Item.Properties()));
	public static final RegistryObject<Item> GLOWROOTICON = REGISTRY.register("glowrooticon", () -> new GlowrooticonItem());
	public static final RegistryObject<Item> ALARM_ON = block(GlowrootModBlocks.ALARM_ON);
	public static final RegistryObject<Item> GLOWROOT_SPAWNER = block(GlowrootModBlocks.GLOWROOT_SPAWNER);
	public static final RegistryObject<Item> CHISELED_GLOWROOT_PILLAR = block(GlowrootModBlocks.CHISELED_GLOWROOT_PILLAR);
	public static final RegistryObject<Item> GLOWROOT_LASER_EMITTER = block(GlowrootModBlocks.GLOWROOT_LASER_EMITTER);
	public static final RegistryObject<Item> LOCKER_AIR = block(GlowrootModBlocks.LOCKER_AIR);
	public static final RegistryObject<Item> HERMIT_CLAW = REGISTRY.register("hermit_claw", () -> new HermitClawItem());
	public static final RegistryObject<Item> FORCELOOKER = REGISTRY.register("forcelooker", () -> new ForcelookerItem());
	public static final RegistryObject<Item> ISRAEL = REGISTRY.register("israel", () -> new ThetruthItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(GLOWCARD.get(), new ResourceLocation("glowroot:glowcard_levelcard1"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(GLOWCARD.get(), new ResourceLocation("glowroot:glowcard_levelcard2"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(GLOWCARD.get(), new ResourceLocation("glowroot:glowcard_levelcard3"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(GLOWLIGHT.get(), new ResourceLocation("glowroot:glowlight_flashlighton"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) FlashlightOnOffProcedure.execute(itemStackToRender));
			ItemProperties.register(EMITTER_FLASK.get(), new ResourceLocation("glowroot:emitter_flask_dazzler"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(EMITTER_FLASK.get(), new ResourceLocation("glowroot:emitter_flask_glower"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(EMITTER_FLASK.get(), new ResourceLocation("glowroot:emitter_flask_grow"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(EMITTER_FLASK.get(), new ResourceLocation("glowroot:emitter_flask_dark"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(MATTERWARPER.get(), new ResourceLocation("glowroot:matterwarper_lighttransport"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(MATTERWARPER.get(), new ResourceLocation("glowroot:matterwarper_runetransplant"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(MATTERWARPER.get(), new ResourceLocation("glowroot:matterwarper_hybrideye"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(MATTERWARPER.get(), new ResourceLocation("glowroot:matterwarper_rootrepair"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(MATTERWARPER.get(), new ResourceLocation("glowroot:matterwarper_lighthands"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GlowrootKeycardPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
