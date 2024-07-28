
package net.mcreator.glowroot.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.glowroot.procedures.LookprocedurebomberProcedure;
import net.mcreator.glowroot.procedures.GlowrootQuadcopterdiesProcedure;
import net.mcreator.glowroot.procedures.GlowrootBomberOnInitialEntitySpawnProcedure;
import net.mcreator.glowroot.procedures.GlowrootBomberOnEntityTickUpdateProcedure;
import net.mcreator.glowroot.init.GlowrootModEntities;

import javax.annotation.Nullable;

public class GlowrootBomberEntity extends Monster {
	public GlowrootBomberEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(GlowrootModEntities.GLOWROOT_BOMBER.get(), world);
	}

	public GlowrootBomberEntity(EntityType<GlowrootBomberEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 8;
		setNoAi(false);
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = GlowrootBomberEntity.this.getRandom();
				double dir_x = GlowrootBomberEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = GlowrootBomberEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = GlowrootBomberEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

			@Override
			public boolean canUse() {
				double x = GlowrootBomberEntity.this.getX();
				double y = GlowrootBomberEntity.this.getY();
				double z = GlowrootBomberEntity.this.getZ();
				Entity entity = GlowrootBomberEntity.this;
				Level world = GlowrootBomberEntity.this.level();
				return super.canUse() && LookprocedurebomberProcedure.execute(world, x, y, z);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GlowrootBomberEntity.this.getX();
				double y = GlowrootBomberEntity.this.getY();
				double z = GlowrootBomberEntity.this.getZ();
				Entity entity = GlowrootBomberEntity.this;
				Level world = GlowrootBomberEntity.this.level();
				return super.canContinueToUse() && LookprocedurebomberProcedure.execute(world, x, y, z);
			}

		});
		this.goalSelector.addGoal(4, new FollowMobGoal(this, 1, (float) 10, (float) 5));
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 15));
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, GlowrootGolemEntity.class, (float) 15));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = GlowrootBomberEntity.this.getX();
				double y = GlowrootBomberEntity.this.getY();
				double z = GlowrootBomberEntity.this.getZ();
				Entity entity = GlowrootBomberEntity.this;
				Level world = GlowrootBomberEntity.this.level();
				return super.canUse() && LookprocedurebomberProcedure.execute(world, x, y, z);
			}

			@Override
			public boolean canContinueToUse() {
				double x = GlowrootBomberEntity.this.getX();
				double y = GlowrootBomberEntity.this.getY();
				double z = GlowrootBomberEntity.this.getZ();
				Entity entity = GlowrootBomberEntity.this;
				Level world = GlowrootBomberEntity.this.level();
				return super.canContinueToUse() && LookprocedurebomberProcedure.execute(world, x, y, z);
			}
		});
		this.goalSelector.addGoal(8, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:robotactive"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:robothurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("glowroot:robotdies"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.is(DamageTypes.IN_FIRE))
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source.is(DamageTypes.FALL))
			return false;
		if (source.is(DamageTypes.CACTUS))
			return false;
		if (source.is(DamageTypes.DRAGON_BREATH))
			return false;
		if (source.is(DamageTypes.WITHER))
			return false;
		if (source.is(DamageTypes.WITHER_SKULL))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		GlowrootQuadcopterdiesProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		GlowrootBomberOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		GlowrootBomberOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
		SpawnPlacements.register(GlowrootModEntities.GLOWROOT_BOMBER.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		builder = builder.add(Attributes.FLYING_SPEED, 0.25);
		return builder;
	}
}
