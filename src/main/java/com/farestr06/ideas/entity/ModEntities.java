package com.farestr06.ideas.entity;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.entity.custom.CavefowlEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModEntities {
    public static final EntityType<CavefowlEntity> CAVEFOWL = Registry.register(Registries.ENTITY_TYPE,
            FarestsIdeas.makeId("cavefowl"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CavefowlEntity::new).dimensions(EntityDimensions.fixed(0.35f, 0.65f)).build());
}
