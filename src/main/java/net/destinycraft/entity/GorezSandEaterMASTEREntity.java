
package net.destinycraft.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.destinycraft.procedures.EmergenceofcriticaltargetsSpawnProcedure;
import net.destinycraft.procedures.EmergenceofcriticaltargetsDefeatProcedure;
import net.destinycraft.init.Destinycraft2ModItems;
import net.destinycraft.init.Destinycraft2ModEntities;

import javax.annotation.Nullable;

public class GorezSandEaterMASTEREntity extends Monster {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.RED, ServerBossEvent.BossBarOverlay.NOTCHED_10);

	public GorezSandEaterMASTEREntity(PlayMessages.SpawnEntity packet, Level world) {
		this(Destinycraft2ModEntities.GOREZ_SAND_EATER_MASTER.get(), world);
	}

	public GorezSandEaterMASTEREntity(EntityType<GorezSandEaterMASTEREntity> type, Level world) {
		super(type, world);
		maxUpStep = 1f;
		xpReward = 2600;
		setNoAi(false);
		setCustomName(Component.literal("[達人]ゴレス・サンドイーター"));
		setCustomNameVisible(true);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Destinycraft2ModItems.MW_IRON_SWORD.get()));
		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.CHAINMAIL_HELMET));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.CHAINMAIL_LEGGINGS));
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.CHAINMAIL_BOOTS));
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (GorezSandEaterMASTEREntity.this.isInWater())
					GorezSandEaterMASTEREntity.this.setDeltaMovement(GorezSandEaterMASTEREntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !GorezSandEaterMASTEREntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - GorezSandEaterMASTEREntity.this.getX();
					double dy = this.wantedY - GorezSandEaterMASTEREntity.this.getY();
					double dz = this.wantedZ - GorezSandEaterMASTEREntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * GorezSandEaterMASTEREntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					GorezSandEaterMASTEREntity.this.setYRot(this.rotlerp(GorezSandEaterMASTEREntity.this.getYRot(), f, 10));
					GorezSandEaterMASTEREntity.this.yBodyRot = GorezSandEaterMASTEREntity.this.getYRot();
					GorezSandEaterMASTEREntity.this.yHeadRot = GorezSandEaterMASTEREntity.this.getYRot();
					if (GorezSandEaterMASTEREntity.this.isInWater()) {
						GorezSandEaterMASTEREntity.this.setSpeed((float) GorezSandEaterMASTEREntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						GorezSandEaterMASTEREntity.this.setXRot(this.rotlerp(GorezSandEaterMASTEREntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(GorezSandEaterMASTEREntity.this.getXRot() * (float) (Math.PI / 180.0));
						GorezSandEaterMASTEREntity.this.setZza(f3 * f1);
						GorezSandEaterMASTEREntity.this.setYya((float) (f1 * dy));
					} else {
						GorezSandEaterMASTEREntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					GorezSandEaterMASTEREntity.this.setSpeed(0);
					GorezSandEaterMASTEREntity.this.setYya(0);
					GorezSandEaterMASTEREntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Player.class, false, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		EmergenceofcriticaltargetsDefeatProcedure.execute(this.level);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		EmergenceofcriticaltargetsSpawnProcedure.execute(world);
		return retval;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
		SpawnPlacements.register(Destinycraft2ModEntities.GOREZ_SAND_EATER_MASTER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 780);
		builder = builder.add(Attributes.ARMOR, 0.6);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 28);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.7);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.2);
		return builder;
	}
}
