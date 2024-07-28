
package net.mcreator.glowroot.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.procedures.GlowrootTNTRedstoneOnProcedure;
import net.mcreator.glowroot.procedures.GlowrootTNTProcedureProcedure;
import net.mcreator.glowroot.procedures.GlowrootTNTBlockDestroyedByPlayerProcedure;

public class GlowrootTNTBlock extends Block {
	public GlowrootTNTBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().mapColor(MapColor.WARPED_WART_BLOCK).sound(SoundType.WET_GRASS).strength(0.7f, 0f).lightLevel(s -> 5).noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			GlowrootTNTRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		GlowrootTNTBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		GlowrootTNTProcedureProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
