package com.farestr06.deeperdepths.entity.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class PrimordialSlimeEntity
        extends SlimeEntity {

    public PrimordialSlimeEntity(EntityType<? extends PrimordialSlimeEntity> entityType, World world) {
        super((EntityType<? extends SlimeEntity>) entityType, world);
    }

    @Override
    public void pushAwayFrom(Entity entity) {
        super.pushAwayFrom(entity);
        if (entity instanceof LivingEntity) {
            if (((LivingEntity) entity).getGroup() == EntityGroup.AQUATIC) {
                this.damage((LivingEntity) entity);
            }
        }
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(2, new ActiveTargetGoal<AxolotlEntity>(this, AxolotlEntity.class, 10, true, false, livingEntity -> Math.abs(livingEntity.getY() - this.getY()) <= 4.0));
        this.goalSelector.add(2, new ActiveTargetGoal<TurtleEntity>(this, TurtleEntity.class, 10, true, false, livingEntity -> Math.abs(livingEntity.getY() - this.getY()) <= 4.0));
        this.goalSelector.add(2, new ActiveTargetGoal<DrownedEntity>(this, DrownedEntity.class, 10, true, false, livingEntity -> Math.abs(livingEntity.getY() - this.getY()) <= 4.0));
        this.goalSelector.add(2, new ActiveTargetGoal<DolphinEntity>(this, DolphinEntity.class, 10, true, false, livingEntity -> Math.abs(livingEntity.getY() - this.getY()) <= 4.0));
        this.goalSelector.add(2, new ActiveTargetGoal<FishEntity>(this, FishEntity.class, 10, true, false, livingEntity -> Math.abs(livingEntity.getY() - this.getY()) <= 4.0));
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if (stack.isIn(ItemTags.CREEPER_IGNITERS)) {
            SoundEvent soundEvent = stack.isOf(Items.FIRE_CHARGE) ? SoundEvents.ITEM_FIRECHARGE_USE : SoundEvents.ITEM_FLINTANDSTEEL_USE;
            this.getWorld().playSound(player, this.getX(), this.getY(), this.getZ(), soundEvent, this.getSoundCategory(), 1.0f, this.random.nextFloat() * 0.4f + 0.8f);
            if (!this.getWorld().isClient) {
                this.explode();
                if (!stack.isDamageable()) {
                    stack.decrement(1);
                } else {
                    stack.damage(1, player, playerx -> playerx.sendToolBreakStatus(hand));
                }
            }
            return ActionResult.success(this.getWorld().isClient);
        }
        return super.interactMob(player, hand);
    }

    @Override
    public void setOnFireFor(int seconds) {
        if (!this.getWorld().isClient) {
            explode();
        }
    }

    @Override
    public void onDamaged(DamageSource damageSource) {
        if (damageSource.isOf(DamageTypes.IN_FIRE) || damageSource.isOf(DamageTypes.ON_FIRE)) {
            if (!this.getWorld().isClient) {
                explode();
            }
        } else {
            super.onDamaged(damageSource);
        }
    }

    private void explode() {
        this.dead = true;
        this.getWorld().createExplosion(
                this, this.getX(), this.getY(), this.getZ(), this.getSize() * (Random.create().nextFloat() + 0.2f), true, World.ExplosionSourceType.MOB
        );
        this.discard();
    }

    @Override
    protected float getDamageAmount() {
        return super.getDamageAmount() * 1.2f;
    }
}
