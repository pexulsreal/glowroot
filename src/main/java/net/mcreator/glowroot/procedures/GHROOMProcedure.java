package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GHROOMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (Math.random() >= 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootlabhall"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 1), BlockPos.containing(x - 3, y - 1, z + 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			if (Math.random() >= 0.5) {
				if (Math.random() >= 0.5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootlabroomtestroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 1, z + 1), BlockPos.containing(x - 6, y - 1, z + 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootlabroombrokentestroom2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 1, z + 1), BlockPos.containing(x - 6, y - 1, z + 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				}
			} else {
				if (Math.random() >= 0.5) {
					if (Math.random() >= 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootlabroomtestroom1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 1, z + 1), BlockPos.containing(x - 6, y - 1, z + 1),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootlabroombrokentestroom1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 1, z + 1), BlockPos.containing(x - 6, y - 1, z + 1),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
					}
				} else {
					if (Math.random() >= 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootstoragenew2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 1, z + 1), BlockPos.containing(x - 6, y - 1, z + 1),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("glowroot", "glowrootstoragenew"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 1, z + 1), BlockPos.containing(x - 6, y - 1, z + 1),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (!entity.level().isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}
