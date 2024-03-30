package com.farestr06.deeperdepths.entity.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.mob.DrownedEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.world.World;

public class PrimordialSlimeEntity
        extends SlimeEntity {
    public PrimordialSlimeEntity(EntityType<? extends PrimordialSlimeEntity> entityType, World world) {
        super((EntityType<? extends SlimeEntity>) entityType, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(2, new ActiveTargetGoal<AxolotlEntity>(this, AxolotlEntity.class, true));
        this.goalSelector.add(2, new ActiveTargetGoal<TurtleEntity>(this, TurtleEntity.class, true));
        this.goalSelector.add(1, new ActiveTargetGoal<DrownedEntity>(this, DrownedEntity.class, true));
        this.goalSelector.add(2, new ActiveTargetGoal<DolphinEntity>(this, DolphinEntity.class, true));
        this.goalSelector.add(2, new ActiveTargetGoal<FishEntity>(this, FishEntity.class, true));
    }

    @Override
    public void setSize(int size, boolean heal) {
        super.setSize(size, heal);
    }
    @Override
    public void onDamaged(DamageSource damageSource) {
        if ((damageSource.isOf(DamageTypes.IN_FIRE) || damageSource.isOf(DamageTypes.ON_FIRE)) && !this.getWorld().isClient) {
            this.kill();
            this.getWorld().createExplosion(
                    this, this.getX(), this.getY(), this.getZ(), this.getSize() + 1, true, World.ExplosionSourceType.MOB
            );
        }
        super.onDamaged(damageSource);
    }

    @Override
    protected float getDamageAmount() {
        return super.getDamageAmount() * 1.2f;
    }
}
