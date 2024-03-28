package com.farestr06.deeperdepths.item.custom;

import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class FossilSlimeItem extends Item {
    public FossilSlimeItem(Settings settings) {
        super(settings);
    }

    @Override
    public void onItemEntityDestroyed(ItemEntity entity) {
        if (entity.isOnFire()) {
            entity.getWorld().createExplosion(entity, entity.getX(), entity.getY(), entity.getZ(), 3.5f, true, World.ExplosionSourceType.TNT);
        }
        super.onItemEntityDestroyed(entity);
    }
}
