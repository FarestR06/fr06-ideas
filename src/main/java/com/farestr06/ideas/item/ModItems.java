package com.farestr06.ideas.item;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.item.custom.SaltItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ModItems {



    // Food Items

    public static final Item COFFEE_BERRIES = registerItem("coffee_berries", new Item(new FabricItemSettings().food(ModFoodComponents.COFFEE_BERRIES)));
    public static final Item SHRINKWEED = registerItem("shrinkweed", new Item(new FabricItemSettings().food(ModFoodComponents.SHRINKWEED)));
    public static final Item LANTERNBERRY = registerItem("lanternberry", new Item(new FabricItemSettings().food(ModFoodComponents.LANTERNBERRY)));
    public static final Item TEOSINTE = registerItem("teosinte", new Item(new FabricItemSettings().food(FoodComponents.BREAD)));
    public static final Item ACORN = registerItem("acorn", new AliasedBlockItem(ModBlocks.OAK_SAPLING_CROP, new FabricItemSettings().food(ModFoodComponents.ACORN)));
    public static final Item GOLDEN_ACORN = registerItem("golden_acorn", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_ACORN)));
    public static final Item ENCHANTED_GOLDEN_ACORN = registerItem("enchanted_golden_acorn", new EnchantedGoldenAppleItem(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.ENCHANTED_GOLDEN_ACORN)));

    // Farming Items

    public static final Item SALTPETER = registerItem("saltpeter", new BoneMealItem(new FabricItemSettings()));

    // Alchemy Ingredients

    

    // BREWING ITEMS
    public static final Item BOTTLE_OF_VOID = registerItem("void", new Item(new FabricItemSettings()));

    // Ores
    public static final Item GRAPHITE = registerItem("graphite", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItem("salt", new SaltItem(new FabricItemSettings()));
    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(COFFEE_BERRIES);
        entries.add(LANTERNBERRY);
        entries.add(ACORN);
        entries.add(GOLDEN_ACORN);
        entries.add(ENCHANTED_GOLDEN_ACORN);
        entries.add(SHRINKWEED);
    }
    private static void addItemsToToolItemGroup(FabricItemGroupEntries entries) {
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SALT);
        entries.add(SALTPETER);
        entries.add(GRAPHITE);
        entries.add(COFFEE_BERRIES);
        entries.add(SHRINKWEED);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, FarestsIdeas.makeId(name), item);
    }

    public static void registerModFuels() {
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModFuels!");

    }

    public static void registerModItems() {
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModItems!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
