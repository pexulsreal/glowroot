package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModBlocks;
import net.mcreator.glowroot.GlowrootMod;

import java.util.Map;

public class InvisibleGlowrootBlock2aaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GlowrootMod.queueServerWork(240, () -> {
			if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == GlowrootModBlocks.INVISIBLE_GLOWROOT_BLOCK_2.get())) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = GlowrootModBlocks.ARTIFICIAL_GLOWROOT_BLOCK_2.get().defaultBlockState();
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
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.squirt")), SoundSource.NEUTRAL, (float) 0.88, (float) 0.88);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.squirt")), SoundSource.NEUTRAL, (float) 0.88, (float) 0.88, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, x, y, z, 2, 0.3, 0.3, 0.3, 0.3);
		});
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.GLOW, x, y, z, 3, 0.3, 0.3, 0.3, 0.3);
		GlowrootMod.queueServerWork(210, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.squirt")), SoundSource.NEUTRAL, (float) 0.88, (float) 0.88);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.squirt")), SoundSource.NEUTRAL, (float) 0.88, (float) 0.88, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, x, y, z, 2, 0.3, 0.3, 0.3, 0.3);
		});
		GlowrootMod.queueServerWork(180, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.squirt")), SoundSource.NEUTRAL, (float) 0.88, (float) 0.88);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.squirt")), SoundSource.NEUTRAL, (float) 0.88, (float) 0.88, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.GLOW, x, y, z, 2, 0.3, 0.3, 0.3, 0.3);
		});
	}
}
