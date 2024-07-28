package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;

public class GlowrootedStoneOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			if (Math.random() > 0.3) {
				world.setBlock(BlockPos.containing(x, y + 1, z),
						(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:glowrootflowertall"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			}
		} else if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			if (Math.random() > 0.3) {
				world.setBlock(BlockPos.containing(x, y + 1, z),
						(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:glowrootflower"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
			}
		}
		particleAmount = 4;
		particleRadius = 4;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 1 + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)),
					(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), 0, 0, 0);
		}
	}
}
