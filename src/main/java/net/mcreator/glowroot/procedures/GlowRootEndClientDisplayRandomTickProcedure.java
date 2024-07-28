package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;
import net.mcreator.glowroot.init.GlowrootModBlocks;

public class GlowRootEndClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomLocation = 0;
		if (world.isClientSide()) {
			if (Math.random() >= 0.7) {
				world.addParticle((SimpleParticleType) (GlowrootModParticleTypes.GLOW_ROOT_LEAVES.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + 0.5), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 0, 0, 0);
			}
		}
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT_END.get())) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z), _level.getBlockState(BlockPos.containing(x, y, z)).getBlock());
			world.setBlock(BlockPos.containing(x, y, z), GlowrootModBlocks.GLOW_ROOT_END.get().defaultBlockState(), 3);
		}
	}
}
