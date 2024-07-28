package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class BlockbrokenglowrootProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT.get()) {
			if (world.isEmptyBlock(BlockPos.containing(x, y, z)) || !world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
				if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GlowrootModBlocks.GLOW_ROOT_END.get())) {
					{
						BlockPos _bp = BlockPos.containing(x, y + 1, z);
						BlockState _bs = GlowrootModBlocks.GLOW_ROOT_END.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
	}
}
