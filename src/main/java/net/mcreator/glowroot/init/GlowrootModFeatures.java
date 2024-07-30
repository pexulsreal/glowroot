
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.glowroot.world.features.plants.LargeGlowFlowerFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootsFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootTallWeedsFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootRoseFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootPaeoniaFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootFernFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootDandelionFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootAstilbesFeature;
import net.mcreator.glowroot.world.features.plants.GlowrootAlliumFeature;
import net.mcreator.glowroot.world.features.plants.GlowWeedsFeature;
import net.mcreator.glowroot.world.features.plants.GlowPoppyFeature;
import net.mcreator.glowroot.world.features.plants.GlowMushroomFeature;
import net.mcreator.glowroot.world.features.plants.GlowFlowerFeature;
import net.mcreator.glowroot.world.features.plants.GlowBulbFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootRedstoneOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootLapisOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootIronOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootGoldOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootEmeraldOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootDiamondOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootCoppeOreFeature;
import net.mcreator.glowroot.world.features.ores.GlowrootCoalOreFeature;
import net.mcreator.glowroot.world.features.NodeStructureFeature;
import net.mcreator.glowroot.world.features.NodeStructure1Feature;
import net.mcreator.glowroot.world.features.NodeStructure11Feature;
import net.mcreator.glowroot.world.features.NodeStructure111Feature;
import net.mcreator.glowroot.world.features.GlowrootLabratoryFeature;
import net.mcreator.glowroot.world.features.GlowrootBushesFeature;
import net.mcreator.glowroot.world.features.Crystal3Feature;
import net.mcreator.glowroot.world.features.Crystal33Feature;
import net.mcreator.glowroot.world.features.Crystal333Feature;
import net.mcreator.glowroot.world.features.Crystal3333Feature;
import net.mcreator.glowroot.world.features.Crystal2Feature;
import net.mcreator.glowroot.world.features.Crystal22Feature;
import net.mcreator.glowroot.world.features.Crystal222Feature;
import net.mcreator.glowroot.world.features.Crystal2222Feature;
import net.mcreator.glowroot.world.features.Crystal1Feature;
import net.mcreator.glowroot.world.features.Crystal11Feature;
import net.mcreator.glowroot.world.features.Crystal111Feature;
import net.mcreator.glowroot.world.features.Crystal1111Feature;
import net.mcreator.glowroot.world.features.CattailGenerationFeature;
import net.mcreator.glowroot.GlowrootMod;

@Mod.EventBusSubscriber
public class GlowrootModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GlowrootMod.MODID);
	public static final RegistryObject<Feature<?>> GLOW_WEEDS = REGISTRY.register("glow_weeds", GlowWeedsFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_TALL_WEEDS = REGISTRY.register("glowroot_tall_weeds", GlowrootTallWeedsFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_FERN = REGISTRY.register("glowroot_fern", GlowrootFernFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_ASTILBES = REGISTRY.register("glowroot_astilbes", GlowrootAstilbesFeature::new);
	public static final RegistryObject<Feature<?>> GLOW_POPPY = REGISTRY.register("glow_poppy", GlowPoppyFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_ROSE = REGISTRY.register("glowroot_rose", GlowrootRoseFeature::new);
	public static final RegistryObject<Feature<?>> GLOW_FLOWER = REGISTRY.register("glow_flower", GlowFlowerFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_PAEONIA = REGISTRY.register("glowroot_paeonia", GlowrootPaeoniaFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_ALLIUM = REGISTRY.register("glowroot_allium", GlowrootAlliumFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_DANDELION = REGISTRY.register("glowroot_dandelion", GlowrootDandelionFeature::new);
	public static final RegistryObject<Feature<?>> LARGE_GLOW_FLOWER = REGISTRY.register("large_glow_flower", LargeGlowFlowerFeature::new);
	public static final RegistryObject<Feature<?>> GLOWSHROOM = REGISTRY.register("glowshroom", GlowMushroomFeature::new);
	public static final RegistryObject<Feature<?>> GLOW_BULB = REGISTRY.register("glow_bulb", GlowBulbFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_LEAVES_FALLEN = REGISTRY.register("glowroot_leaves_fallen", GlowrootsFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_COAL_ORE = REGISTRY.register("glowroot_coal_ore", GlowrootCoalOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_COPPE_ORE = REGISTRY.register("glowroot_coppe_ore", GlowrootCoppeOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_IRON_ORE = REGISTRY.register("glowroot_iron_ore", GlowrootIronOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_GOLD_ORE = REGISTRY.register("glowroot_gold_ore", GlowrootGoldOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_LAPIS_ORE = REGISTRY.register("glowroot_lapis_ore", GlowrootLapisOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_REDSTONE_ORE = REGISTRY.register("glowroot_redstone_ore", GlowrootRedstoneOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_DIAMOND_ORE = REGISTRY.register("glowroot_diamond_ore", GlowrootDiamondOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_EMERALD_ORE = REGISTRY.register("glowroot_emerald_ore", GlowrootEmeraldOreFeature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_BUSHES = REGISTRY.register("glowroot_bushes", GlowrootBushesFeature::new);
	public static final RegistryObject<Feature<?>> NODE_STRUCTURE = REGISTRY.register("node_structure", NodeStructureFeature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_1 = REGISTRY.register("crystal_1", Crystal1Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_2 = REGISTRY.register("crystal_2", Crystal2Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_3 = REGISTRY.register("crystal_3", Crystal3Feature::new);
	public static final RegistryObject<Feature<?>> NODE_STRUCTURE_1 = REGISTRY.register("node_structure_1", NodeStructure1Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_11 = REGISTRY.register("crystal_11", Crystal11Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_22 = REGISTRY.register("crystal_22", Crystal22Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_33 = REGISTRY.register("crystal_33", Crystal33Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_111 = REGISTRY.register("crystal_111", Crystal111Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_222 = REGISTRY.register("crystal_222", Crystal222Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_333 = REGISTRY.register("crystal_333", Crystal333Feature::new);
	public static final RegistryObject<Feature<?>> NODE_STRUCTURE_11 = REGISTRY.register("node_structure_11", NodeStructure11Feature::new);
	public static final RegistryObject<Feature<?>> NODE_STRUCTURE_111 = REGISTRY.register("node_structure_111", NodeStructure111Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_3333 = REGISTRY.register("crystal_3333", Crystal3333Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_1111 = REGISTRY.register("crystal_1111", Crystal1111Feature::new);
	public static final RegistryObject<Feature<?>> CRYSTAL_2222 = REGISTRY.register("crystal_2222", Crystal2222Feature::new);
	public static final RegistryObject<Feature<?>> GLOWROOT_LABRATORY = REGISTRY.register("glowroot_labratory", GlowrootLabratoryFeature::new);
	public static final RegistryObject<Feature<?>> CATTAIL_GENERATION = REGISTRY.register("cattail_generation", CattailGenerationFeature::new);
}
