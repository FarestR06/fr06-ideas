package com.farestr06.ideas.item.potion;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.item.ModItems;
import com.farestr06.ideas.status_effects.ModStatusEffects;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final Potion SMALL_POTION = registerPotion("small", ModStatusEffects.SMALL, 600, 1);
    public static final Potion HASTE_POTION = registerPotion("haste", StatusEffects.HASTE, 600, 1);
    public static final Potion DRAGON_POTION = registerPotion("dragon", ModStatusEffects.VOIDED, 600, 1);

    public static Potion registerPotion(String name, StatusEffect statusEffect, int duration, int amplifier){
        return Registry.register(Registries.POTION, new Identifier(FarestsIdeas.MOD_ID, name),
                new Potion(new StatusEffectInstance(statusEffect, duration, amplifier)));
    }
    public static void registerModPotions(){
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModPotions!");
    }

    public static void registerModPotionRecipes(){
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModPotionRecipes!");
        FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Ingredient.ofItems(ModItems.SHRINKWEED), ModPotions.SMALL_POTION);
        FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Ingredient.ofItems(ModItems.COFFEE_BERRIES), ModPotions.HASTE_POTION);
        FabricBrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Ingredient.ofItems(ModItems.BOTTLE_OF_VOID), ModPotions.DRAGON_POTION);
    }
}
