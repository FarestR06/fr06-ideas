package com.farestr06.deeperdepths.item;

import com.farestr06.deeperdepths.DeeperDepths;
import com.farestr06.deeperdepths.entity.ModEntities;
import com.farestr06.deeperdepths.item.custom.FossilSlimeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item HEAVYSTONE_INGOT = registerItem("heavystone_ingot", new Item(new FabricItemSettings().requires(FeatureFlags.UPDATE_1_21).fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item FOSSIL_SLIME = registerItem("fossil_slime", new FossilSlimeItem(new FabricItemSettings()));
    public static final Item BLAZELITE_INGOT = registerItem("blazelite_ingot", new Item(new FabricItemSettings()));

    public static final Item PRIMORDIAL_SLIME_SPAWN_EGG = registerItem("primordial_slime_spawn_egg",
            new SpawnEggItem(ModEntities.PRIMORDIAL_SLIME, 0x000000, 0xff8000, new FabricItemSettings()));

    public static final Item WHITE_PIGMENT = registerItem("white_pigment", new DyeItem(DyeColor.valueOf("WHITE_PIGMENT"), new FabricItemSettings()));
    public static final Item LIGHT_GRAY_PIGMENT = registerItem("light_gray_pigment", new DyeItem(DyeColor.valueOf("LIGHT_GRAY_PIGMENT"), new FabricItemSettings()));
    public static final Item DARK_GRAY_PIGMENT = registerItem("dark_gray_pigment", new DyeItem(DyeColor.valueOf("DARK_GRAY_PIGMENT"), new FabricItemSettings()));
    public static final Item RED_PIGMENT = registerItem("red_pigment", new DyeItem(DyeColor.valueOf("RED_PIGMENT"), new FabricItemSettings()));
    public static final Item ORANGE_PIGMENT = registerItem("orange_pigment", new DyeItem(DyeColor.valueOf("ORANGE_PIGMENT"), new FabricItemSettings()));
    public static final Item YELLOW_PIGMENT = registerItem("yellow_pigment", new DyeItem(DyeColor.valueOf("YELLOW"), new FabricItemSettings()));
    public static final Item CHARTREUSE_PIGMENT = registerItem("chartreuse_pigment", new DyeItem(DyeColor.valueOf("CHARTREUSE_PIGMENT"), new FabricItemSettings()));
    public static final Item GREEN_PIGMENT = registerItem("green_pigment", new DyeItem(DyeColor.valueOf("GREEN_PIGMENT"), new FabricItemSettings()));
    public static final Item SPRING_GREEN_PIGMENT = registerItem("spring_green_pigment", new DyeItem(DyeColor.valueOf("SPRING_GREEN_PIGMENT"), new FabricItemSettings()));
    public static final Item CYAN_PIGMENT = registerItem("cyan_pigment", new DyeItem(DyeColor.valueOf("CYAN_PIGMENT"), new FabricItemSettings()));
    public static final Item CAPRI_PIGMENT = registerItem("capri_pigment", new DyeItem(DyeColor.valueOf("CAPRI_PIGMENT"), new FabricItemSettings()));
    public static final Item ULTRAMARINE_PIGMENT = registerItem("ultramarine_pigment", new DyeItem(DyeColor.valueOf("ULTRAMARINE_PIGMENT"), new FabricItemSettings()));
    public static final Item VIOLET_PIGMENT = registerItem("violet_pigment", new DyeItem(DyeColor.valueOf("VIOLET_PIGMENT"), new FabricItemSettings()));
    public static final Item MAGENTA_PIGMENT = registerItem("magenta_pigment", new DyeItem(DyeColor.valueOf("MAGENTA_PIGMENT"), new FabricItemSettings()));
    public static final Item PINK_PIGMENT = registerItem("pink_pigment", new DyeItem(DyeColor.valueOf("PINK_PIGMENT"), new FabricItemSettings()));
    public static final Item ROSE_PIGMENT = registerItem("rose_pigment", new DyeItem(DyeColor.valueOf("ROSE_PIGMENT"), new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, DeeperDepths.makeId(name), item);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToToolItemGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(FOSSIL_SLIME);
        entries.add(HEAVYSTONE_INGOT);
    }

    public static void registerModFuels() {
        DeeperDepths.LOGGER.info("Go go gadget " + DeeperDepths.MOD_ID + ":registerModFuels!");

        FuelRegistry.INSTANCE.add(FOSSIL_SLIME, 1600);
    }
    public static void registerModItems() {
        DeeperDepths.LOGGER.info("Go go gadget " + DeeperDepths.MOD_ID + ":registerModItems!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }

    private static void addItemsToSpawnEggItemGroup(FabricItemGroupEntries entries) {
        entries.add(PRIMORDIAL_SLIME_SPAWN_EGG);
    }
}
