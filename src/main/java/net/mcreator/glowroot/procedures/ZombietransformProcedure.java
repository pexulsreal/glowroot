package net.mcreator.glowroot.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;
import net.mcreator.glowroot.init.GlowrootModEntities;
import net.mcreator.glowroot.init.GlowrootModBlocks;
import net.mcreator.glowroot.entity.GlowrootedZombieEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZombietransformProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Zombie) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false)) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.GLOWROOTED_STONE.get()) {
					if (Math.random() <= entity.getPersistentData().getDouble("timeonglowroot") / 400) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
									(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 1, 0.1, 0.1, 0.1, 0.1);
					}
					entity.getPersistentData().putDouble("timeonglowroot", (entity.getPersistentData().getDouble("timeonglowroot") + 1));
					if (entity.getPersistentData().getDouble("timeonglowroot") == 400) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new GlowrootedZombieEntity(GlowrootModEntities.GLOWROOTED_ZOMBIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z()));
							if (entityToSpawn instanceof Mob _mobToSpawn) {
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
									_toTame.tame(_owner);
								}
							}
							entityToSpawn.getPersistentData().putString((entity.getDisplayName().getString()), "NBT value");
							_level.addFreshEntity(entityToSpawn);
						}
						if (!entity.level().isClientSide())
							entity.discard();
						for (int index0 = 0; index0 < 4; index0++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 4, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 6, 0.05, 0.05, 0.05,
										0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_INK.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 8, 0.05, 0.05, 0.05, 0.05);
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == GlowrootModBlocks.UNPURE_CHRYSOPRASE.get()) {
					if (Math.random() <= entity.getPersistentData().getDouble("timeonglowroot") / 400) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
									(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 1, 0.1, 0.1, 0.1, 0.1);
					}
					entity.getPersistentData().putDouble("timeonglowroot", (entity.getPersistentData().getDouble("timeonglowroot") + 2));
					if (entity.getPersistentData().getDouble("timeonglowroot") == 400) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new GlowrootedZombieEntity(GlowrootModEntities.GLOWROOTED_ZOMBIE.get(), _level);
							entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z()));
							if (entityToSpawn instanceof Mob _mobToSpawn) {
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
									_toTame.tame(_owner);
								}
							}
							entityToSpawn.getPersistentData().putString((entity.getDisplayName().getString()), "NBT value");
							_level.addFreshEntity(entityToSpawn);
						}
						if (!entity.level().isClientSide())
							entity.discard();
						for (int index1 = 0; index1 < 6; index1++) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 4, 0.1, 0.1, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 6, 0.05, 0.05, 0.05,
										0.05);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_INK.get()), (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)),
										(z + Mth.nextDouble(RandomSource.create(), 0, 1)), 8, 0.05, 0.05, 0.05, 0.05);
						}
					}
				}
			}
		}
	}
}
