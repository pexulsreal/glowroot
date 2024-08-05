
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.glowroot.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.glowroot.block.entity.LockerAirBlockEntity;
import net.mcreator.glowroot.block.entity.LightDetectorBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootedCrystalizedBlockBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootSeekerBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootPipe4WayBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootPipe2WayBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootPipe1WayBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootNodeBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootMachineBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootLockerOpenBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootLockerBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootLaserEmitterBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootFurnaceBlockEntity;
import net.mcreator.glowroot.block.entity.GlowrootCartBlockEntity;
import net.mcreator.glowroot.block.entity.FlashlightLightBlockEntity;
import net.mcreator.glowroot.block.entity.DarknessDetectorBlockEntity;
import net.mcreator.glowroot.block.entity.AlarmoffBlockEntity;
import net.mcreator.glowroot.block.entity.AlarmOnBlockEntity;
import net.mcreator.glowroot.GlowrootMod;

public class GlowrootModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GlowrootMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ALARMOFF = register("alarmoff", GlowrootModBlocks.ALARMOFF, AlarmoffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_LOCKER = register("glowroot_locker", GlowrootModBlocks.GLOWROOT_LOCKER, GlowrootLockerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_CART = register("glowroot_cart", GlowrootModBlocks.GLOWROOT_CART, GlowrootCartBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_MACHINE = register("glowroot_machine", GlowrootModBlocks.GLOWROOT_MACHINE, GlowrootMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_NODE = register("glowroot_node", GlowrootModBlocks.GLOWROOT_NODE, GlowrootNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LIGHT_DETECTOR = register("light_detector", GlowrootModBlocks.LIGHT_DETECTOR, LightDetectorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARKNESS_DETECTOR = register("darkness_detector", GlowrootModBlocks.DARKNESS_DETECTOR, DarknessDetectorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_SEEKER = register("glowroot_seeker", GlowrootModBlocks.GLOWROOT_SEEKER, GlowrootSeekerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUDDED_BLOCK_OF_CHRYSOPRASE = register("budded_block_of_chrysoprase", GlowrootModBlocks.BUDDED_BLOCK_OF_CHRYSOPRASE, GlowrootedCrystalizedBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_FURNACE = register("glowroot_furnace", GlowrootModBlocks.GLOWROOT_FURNACE, GlowrootFurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_LOCKER_OPEN = register("glowroot_locker_open", GlowrootModBlocks.GLOWROOT_LOCKER_OPEN, GlowrootLockerOpenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_PIPE_1_WAY = register("glowroot_pipe_1_way", GlowrootModBlocks.GLOWROOT_PIPE_1_WAY, GlowrootPipe1WayBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_PIPE_2_WAY = register("glowroot_pipe_2_way", GlowrootModBlocks.GLOWROOT_PIPE_2_WAY, GlowrootPipe2WayBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_PIPE_4_WAY = register("glowroot_pipe_4_way", GlowrootModBlocks.GLOWROOT_PIPE_4_WAY, GlowrootPipe4WayBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLASHLIGHT_LIGHT = register("flashlight_light", GlowrootModBlocks.FLASHLIGHT_LIGHT, FlashlightLightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALARM_ON = register("alarm_on", GlowrootModBlocks.ALARM_ON, AlarmOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GLOWROOT_LASER_EMITTER = register("glowroot_laser_emitter", GlowrootModBlocks.GLOWROOT_LASER_EMITTER, GlowrootLaserEmitterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOCKER_AIR = register("locker_air", GlowrootModBlocks.LOCKER_AIR, LockerAirBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
