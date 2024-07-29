
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.glowroot.entity.PrimedGlowrootTNTEntity;
import net.mcreator.glowroot.entity.InkBalloonEntity;
import net.mcreator.glowroot.entity.GlowrootedZombieEntity;
import net.mcreator.glowroot.entity.GlowrootHybridEntity;
import net.mcreator.glowroot.entity.GlowrootHermitEntity;
import net.mcreator.glowroot.entity.GlowrootGolemEntity;
import net.mcreator.glowroot.entity.GlowrootGolemDrillEntity;
import net.mcreator.glowroot.entity.GlowrootBomberEntity;
import net.mcreator.glowroot.entity.GlowfishEntity;
import net.mcreator.glowroot.entity.GlowbangEntity;
import net.mcreator.glowroot.entity.GlowInkBalloonEntity;
import net.mcreator.glowroot.entity.GHONEEntity;
import net.mcreator.glowroot.entity.BabyGlowSquidEntity;
import net.mcreator.glowroot.GlowrootMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GlowrootModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GlowrootMod.MODID);
	public static final RegistryObject<EntityType<InkBalloonEntity>> INK_BALLOON = register("projectile_ink_balloon",
			EntityType.Builder.<InkBalloonEntity>of(InkBalloonEntity::new, MobCategory.MISC).setCustomClientFactory(InkBalloonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GlowInkBalloonEntity>> GLOW_INK_BALLOON = register("projectile_glow_ink_balloon",
			EntityType.Builder.<GlowInkBalloonEntity>of(GlowInkBalloonEntity::new, MobCategory.MISC).setCustomClientFactory(GlowInkBalloonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GlowbangEntity>> GLOWBANG = register("projectile_glowbang",
			EntityType.Builder.<GlowbangEntity>of(GlowbangEntity::new, MobCategory.MISC).setCustomClientFactory(GlowbangEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GlowrootGolemEntity>> GLOWROOT_GOLEM = register("glowroot_golem", EntityType.Builder.<GlowrootGolemEntity>of(GlowrootGolemEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(GlowrootGolemEntity::new).fireImmune().sized(1.9f, 1.9f));
	public static final RegistryObject<EntityType<GlowrootBomberEntity>> GLOWROOT_BOMBER = register("glowroot_bomber", EntityType.Builder.<GlowrootBomberEntity>of(GlowrootBomberEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowrootBomberEntity::new).fireImmune().sized(1.5f, 1.1f));
	public static final RegistryObject<EntityType<GlowrootHermitEntity>> GLOWROOT_HERMIT = register("glowroot_hermit", EntityType.Builder.<GlowrootHermitEntity>of(GlowrootHermitEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowrootHermitEntity::new).fireImmune().sized(1.8f, 0.5f));
	public static final RegistryObject<EntityType<GlowrootedZombieEntity>> GLOWROOTED_ZOMBIE = register("glowrooted_zombie", EntityType.Builder.<GlowrootedZombieEntity>of(GlowrootedZombieEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowrootedZombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GlowfishEntity>> GLOWFISH = register("glowfish",
			EntityType.Builder.<GlowfishEntity>of(GlowfishEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowfishEntity::new)

					.sized(0.5f, 0.4f));
	public static final RegistryObject<EntityType<BabyGlowSquidEntity>> BABY_GLOW_SQUID = register("baby_glow_squid",
			EntityType.Builder.<BabyGlowSquidEntity>of(BabyGlowSquidEntity::new, MobCategory.UNDERGROUND_WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGlowSquidEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<PrimedGlowrootTNTEntity>> PRIMED_GLOWROOT_TNT = register("primed_glowroot_tnt", EntityType.Builder.<PrimedGlowrootTNTEntity>of(PrimedGlowrootTNTEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedGlowrootTNTEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<GlowrootHybridEntity>> GLOWROOT_HYBRID = register("glowroot_hybrid", EntityType.Builder.<GlowrootHybridEntity>of(GlowrootHybridEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowrootHybridEntity::new).fireImmune().sized(1.5f, 3.8f));
	public static final RegistryObject<EntityType<GlowrootGolemDrillEntity>> GLOWROOT_GOLEM_DRILL = register("glowroot_golem_drill", EntityType.Builder.<GlowrootGolemDrillEntity>of(GlowrootGolemDrillEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(GlowrootGolemDrillEntity::new).fireImmune().sized(1.9f, 1.9f));
	public static final RegistryObject<EntityType<GHONEEntity>> GHONE = register("ghone",
			EntityType.Builder.<GHONEEntity>of(GHONEEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GHONEEntity::new).fireImmune().sized(1.5f, 3.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GlowrootGolemEntity.init();
			GlowrootBomberEntity.init();
			GlowrootHermitEntity.init();
			GlowrootedZombieEntity.init();
			GlowfishEntity.init();
			BabyGlowSquidEntity.init();
			PrimedGlowrootTNTEntity.init();
			GlowrootHybridEntity.init();
			GlowrootGolemDrillEntity.init();
			GHONEEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GLOWROOT_GOLEM.get(), GlowrootGolemEntity.createAttributes().build());
		event.put(GLOWROOT_BOMBER.get(), GlowrootBomberEntity.createAttributes().build());
		event.put(GLOWROOT_HERMIT.get(), GlowrootHermitEntity.createAttributes().build());
		event.put(GLOWROOTED_ZOMBIE.get(), GlowrootedZombieEntity.createAttributes().build());
		event.put(GLOWFISH.get(), GlowfishEntity.createAttributes().build());
		event.put(BABY_GLOW_SQUID.get(), BabyGlowSquidEntity.createAttributes().build());
		event.put(PRIMED_GLOWROOT_TNT.get(), PrimedGlowrootTNTEntity.createAttributes().build());
		event.put(GLOWROOT_HYBRID.get(), GlowrootHybridEntity.createAttributes().build());
		event.put(GLOWROOT_GOLEM_DRILL.get(), GlowrootGolemDrillEntity.createAttributes().build());
		event.put(GHONE.get(), GHONEEntity.createAttributes().build());
	}
}
