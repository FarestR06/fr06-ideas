package com.farestr06.ideas.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent COFFEE_BERRIES = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 1), 0.15f)
            .build();
    public static final FoodComponent SHRINKWEED = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 44, 4), 0.4f).build();
}
