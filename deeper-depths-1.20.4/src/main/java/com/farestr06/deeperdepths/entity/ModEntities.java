package com.farestr06.deeperdepths.entity;

import com.farestr06.deeperdepths.DeeperDepths;
import com.farestr06.deeperdepths.entity.custom.PrimordialSlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModEntities {
    public static final EntityType<PrimordialSlimeEntity> PRIMORDIAL_SLIME = Registry.register(Registries.ENTITY_TYPE,
            DeeperDepths.makeId("primordial_slime"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, PrimordialSlimeEntity::new).dimensions(EntityDimensions.fixed(2.04f, 2.04f)).build());

    public static void registerModEntities() {
        DeeperDepths.LOGGER.info("Registering Entities for " + DeeperDepths.MOD_ID);

    }
}
