package net.mcreator.glowroot.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.SpectralArrow;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.LeashFenceKnotEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.glowroot.init.GlowrootModParticleTypes;
import net.mcreator.glowroot.init.GlowrootModMobEffects;

import java.util.List;
import java.util.Comparator;

public class PrismRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double zPos = 0;
		double yPos = 0;
		double yknockback = 0;
		double xPos = 0;
		double dis = 0;
		double zknockback = 0;
		double rad = 0;
		double rad_now = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double radius = 0;
		double xknockback = 0;
		if (itemstack.getOrCreateTag().getDouble("ready") <= 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, (float) 1.4, (float) 1.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:glowrootedblock")), SoundSource.NEUTRAL, (float) 1.4, (float) 1.5, false);
				}
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(5, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			itemstack.getOrCreateTag().putDouble("ready", 35);
			radius = Mth.nextDouble(RandomSource.create(), -1, 1);
			X = x + Math.sin(Math.toRadians(entity.getYRot() + 180)) * 1 + Math.sin(Math.toRadians(entity.getYRot() + 90)) * radius;
			Y = y + 1.5 + Math.sin(Math.toRadians(entity.getXRot() + Mth.nextDouble(RandomSource.create(), -15, 15))) * (-1);
			Z = z + Math.cos(Math.toRadians(entity.getYRot())) * 1 + Math.cos(Math.toRadians(entity.getYRot() + 90)) * radius;
			rad = Math.toRadians(entity.getYRot());
			dis = 0.1;
			rad_now = Math.toRadians(entity.getYRot());
			for (int index0 = 0; index0 < 36; index0++) {
				xPos = X + Math.cos(rad_now) * Math.cos(rad) * dis;
				yPos = Y + Math.sin(rad_now) * dis;
				zPos = Z + Math.cos(rad_now) * Math.sin(rad) * dis;
				world.addParticle(ParticleTypes.GLOW, xPos, yPos, zPos, 0, 0, 0);
				rad_now = rad_now + Math.toRadians(10);
			}
			dis = 0;
			for (int index1 = 0; index1 < 100; index1++) {
				xPos = X + Math.sin(Math.toRadians(entity.getYRot() + 180)) * dis;
				yPos = Y + Math.sin(Math.toRadians(entity.getXRot())) * dis * (-1);
				zPos = Z + Math.cos(Math.toRadians(entity.getYRot())) * dis;
				world.addParticle(ParticleTypes.GLOW, xPos, yPos, zPos, 0, 0, 0);
				{
					final Vec3 _center = new Vec3(xPos, yPos, zPos);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof ItemEntity || entityiterator instanceof ItemFrame || entityiterator instanceof ArmorStand || entityiterator instanceof Arrow || entityiterator instanceof SpectralArrow
								|| entityiterator instanceof ExperienceOrb || entityiterator instanceof LeashFenceKnotEntity || entityiterator instanceof ShulkerBullet || entityiterator instanceof ShulkerBullet || entity == entityiterator)) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (GlowrootModParticleTypes.GLOWROOT_LIGHT_POP.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
										(int) Mth.nextDouble(RandomSource.create(), 4, 6), 0.1, 0.1, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.GLOW, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), (int) Mth.nextDouble(RandomSource.create(), 4, 6), 0.1, 0.1, 0.1, 0.1);
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FIREWORKS)), (float) Mth.nextDouble(RandomSource.create(), 3, 4));
							if (entityiterator instanceof ServerPlayer) {
								if (entityiterator instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("glowroot:stunning"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										for (String criteria : _ap.getRemainingCriteria())
											_player.getAdvancements().award(_adv, criteria);
									}
								}
							}
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(GlowrootModMobEffects.DAZZLED.get(), (int) Mth.nextDouble(RandomSource.create(), 60, 70), 0));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) Mth.nextDouble(RandomSource.create(), 60, 70), 0));
						}
					}
				}
				dis = dis + 0.5;
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 35);
			}
		}
	}
}
