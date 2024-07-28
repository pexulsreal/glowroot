package net.mcreator.glowroot.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModItems;
import net.mcreator.glowroot.init.GlowrootModEntities;
import net.mcreator.glowroot.entity.BabyGlowSquidEntity;

public class BabyGlowSquidBucketRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		double fromZ = 0;
		double fromX = 0;
		double fromY = 0;
		fromX = x + 0.5 + direction.getStepX() * 0.6;
		fromY = y + 0.5 + direction.getStepY() * 0.6;
		fromZ = z + 0.5 + direction.getStepZ() * 0.6;
		if ((world.getBlockState(BlockPos.containing(fromX, fromY, fromZ))).getBlock() instanceof SimpleWaterloggedBlock) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == GlowrootModItems.BABY_GLOW_SQUID_BUCKET.get()) {
				world.setBlock(BlockPos.containing(fromX, fromY, fromZ),
						((world.getBlockState(BlockPos.containing(fromX, fromY, fromZ))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _withbp8
								? (world.getBlockState(BlockPos.containing(fromX, fromY, fromZ))).setValue(_withbp8, true)
								: (world.getBlockState(BlockPos.containing(fromX, fromY, fromZ)))),
						3);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BabyGlowSquidEntity(GlowrootModEntities.BABY_GLOW_SQUID.get(), _level);
					entityToSpawn.moveTo(fromX, fromY, fromZ, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn) {
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
							_toTame.tame(_owner);
						}
					}
					entityToSpawn.getPersistentData().putString(((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("squidname")), "");
					_level.addFreshEntity(entityToSpawn);
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Items.BUCKET);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
