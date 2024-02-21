package com.farestr06.ideas.entity.custom;

import com.farestr06.ideas.entity.ModEntities;
import com.farestr06.ideas.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.TimeHelper;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class CavefowlEntity extends ChickenEntity implements Angerable {

    private static final Ingredient BREEDING_INGREDIENT = Ingredient.ofItems(Items.GLOW_BERRIES);
    private static final TrackedData<Integer> ANGER_TIME = DataTracker.registerData(CavefowlEntity.class, TrackedDataHandlerRegistry.INTEGER);
    private static final UniformIntProvider ANGER_TIME_RANGE = TimeHelper.betweenSeconds(20, 39);
    private int graphiteLayTime = this.random.nextInt(4000) + 6000;
    private float flapEffects;

    public CavefowlEntity(EntityType<? extends ChickenEntity> entityType, World world) {
        super(entityType, world);
    }
    @Nullable
    private UUID angryAt;

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new PounceAtTargetGoal(this, 0.4f));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.add(3, new EscapeDangerGoal(this, 1.4));
        this.goalSelector.add(4, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(5, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.GLOW_BERRIES), false));
        this.goalSelector.add(6, new FollowParentGoal(this, 1.1));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.add(9, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this, new Class[0]).setGroupRevenge(new Class[0]));
        this.targetSelector.add(2, new UniversalAngerGoal<>(this, false));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ANGER_TIME, 0);
    }

    public static DefaultAttributeContainer.Builder createCavefowlAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 8.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.5)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_ARMOR, 3);

    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return BREEDING_INGREDIENT.test(stack);
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
        super.flapProgress += super.flapSpeed * 2.0f;
        if (!this.getWorld().isClient && this.isAlive() && !this.isBaby() && !this.hasJockey() && --this.graphiteLayTime <= 0) {
            this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0f, (this.random.nextFloat() - this.random.nextFloat()) * 0.2f + 1.0f);
            this.dropItem(ModItems.GRAPHITE);
            this.emitGameEvent(GameEvent.ENTITY_PLACE);
            this.graphiteLayTime = this.random.nextInt(4000) + 6000;
        }
    }

    @Nullable
    @Override
    public CavefowlEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return ModEntities.CAVEFOWL.create(serverWorld);
    }

    protected boolean isFlappingWings() {
        return this.speed > this.flapEffects;
    }

    protected void addFlapEffects() {
        this.flapEffects = this.speed + this.maxWingDeviation / 2.0F;
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.hasJockey = nbt.getBoolean("IsCavefowlJockey");
        if (nbt.contains("GraphiteLayTime")) {
            this.graphiteLayTime = nbt.getInt("GraphiteLayTime");
        }
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putBoolean("IsCavefowlJockey", this.hasJockey);
        nbt.putInt("GraphiteLayTime", this.graphiteLayTime);
    }

    @Override
    public int getAngerTime() {
        return this.dataTracker.get(ANGER_TIME);
    }

    @Override
    public void setAngerTime(int angerTime) {
        this.dataTracker.set(ANGER_TIME, angerTime);
    }

    @Override
    public void chooseRandomAngerTime() {
        this.setAngerTime(ANGER_TIME_RANGE.get(this.random));
    }
    @Override
    @Nullable
    public UUID getAngryAt() {
        return this.angryAt;
    }

    @Override
    public void setAngryAt(@Nullable UUID angryAt) {
        this.angryAt = angryAt;
    }
}
