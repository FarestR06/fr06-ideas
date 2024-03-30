package com.farestr06.ideas.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent COFFEE_BERRIES = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 1), 0.15f)
            .build();
    public static final FoodComponent SHRINKWEED = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 44, 4), 0.4f).build();

    public static final FoodComponent LANTERNBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(1.0f).build();
    public static final FoodComponent ACORN = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).snack().build();
    public static final FoodComponent GOLDEN_ACORN = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 0.75f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 0.75f).alwaysEdible().build();
    public static final FoodComponent ENCHANTED_GOLDEN_ACORN = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 0.5f).snack().alwaysEdible().build();

}
