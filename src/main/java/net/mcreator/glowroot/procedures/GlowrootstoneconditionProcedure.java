package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GlowrootstoneconditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		double randomx = 0;
		double randomz = 0;
		double randomy = 0;
		for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 1, 7); index0++) {
			randomx = Mth.nextDouble(RandomSource.create(), -2, 2);
			randomz = Mth.nextDouble(RandomSource.create(), -2, 2);
			if (world.isEmptyBlock(BlockPos.containing(x + randomx, y + 1, z + randomz)) && (world.getBlockState(BlockPos.containing(x + randomx, y, z + randomz))).is(BlockTags.create(new ResourceLocation("forge:glowrootplantblock")))) {
				if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("glowroot:glowroot_caves"))) {
					if (Math.random() > 0.15) {
						world.setBlock(BlockPos.containing(x + randomx, y + 1, z + randomz),
								(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:glowrootflower"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
						randomx = 0;
						randomz = 0;
					}
				} else {
					if (Math.random() > 0.5) {
						world.setBlock(BlockPos.containing(x + randomx, y + 1, z + randomz),
								(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:glowrootflower"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
						randomx = 0;
						randomz = 0;
					}
				}
			}
		}
	}
}
