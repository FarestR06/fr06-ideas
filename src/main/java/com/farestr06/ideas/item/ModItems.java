package com.farestr06.ideas.item;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.item.custom.SaltItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
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

    // Blazelite Tools
    public static final Item BLAZELITE_SWORD = registerItem("blazelite_sword", new SwordItem
            (ModToolMaterial.BLAZELITE, 3, -2.8f, new FabricItemSettings()));
    public static final Item BLAZELITE_SHOVEL = registerItem("blazelite_shovel", new ShovelItem
            (ModToolMaterial.BLAZELITE, 1.5f, -2.8f, new FabricItemSettings()));
    public static final Item BLAZELITE_PICKAXE = registerItem("blazelite_pickaxe", new PickaxeItem
            (ModToolMaterial.BLAZELITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item BLAZELITE_AXE = registerItem("blazelite_axe", new AxeItem
            (ModToolMaterial.BLAZELITE, 6.0f, -2.8f, new FabricItemSettings()));
    public static final Item BLAZELITE_HOE = registerItem("blazelite_hoe", new HoeItem
                    (ModToolMaterial.BLAZELITE, 3, -2.8f, new FabricItemSettings()));

    public static final Item BLAZELITE_HELMET = registerItem("blazelite_helmet", new DyeableArmorItem
            (ModArmorMaterials.BLAZELITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLAZELITE_CHESTPLATE = registerItem("blazelite_chestplate", new DyeableArmorItem
            (ModArmorMaterials.BLAZELITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLAZELITE_LEGGINGS = registerItem("blazelite_leggings", new DyeableArmorItem
            (ModArmorMaterials.BLAZELITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLAZELITE_BOOTS = registerItem("blazelite_boots", new DyeableArmorItem
            (ModArmorMaterials.BLAZELITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    // Blazelite Items
    public static final Item BLAZELITE_INGOT = registerItem("blazelite_ingot", new Item(new FabricItemSettings()));
    public static final Item OIL_BALL = registerItem("oil_ball", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItem("salt", new SaltItem(new FabricItemSettings()));
    public static final DyeItem WHITE_PIGMENT = (DyeItem) registerItem("white_pigment", new DyeItem(DyeColor.valueOf("WHITE_PIGMENT"), new FabricItemSettings()));
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

    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(COFFEE_BERRIES);
        entries.add(LANTERNBERRY);
        entries.add(ACORN);
        entries.add(GOLDEN_ACORN);
        entries.add(ENCHANTED_GOLDEN_ACORN);
        entries.add(SHRINKWEED);
    }
    private static void addItemsToToolItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLAZELITE_HOE);
        entries.add(BLAZELITE_PICKAXE);
        entries.add(BLAZELITE_SHOVEL);
        entries.add(BLAZELITE_AXE);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLAZELITE_SWORD);
        entries.add(BLAZELITE_HELMET);
        entries.add(BLAZELITE_CHESTPLATE);
        entries.add(BLAZELITE_LEGGINGS);
        entries.add(BLAZELITE_BOOTS);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SALT);
        entries.add(SALTPETER);
        entries.add(GRAPHITE);
        entries.add(COFFEE_BERRIES);
        entries.add(SHRINKWEED);
        entries.add(BLAZELITE_INGOT);
        entries.add(WHITE_PIGMENT);
        entries.add(LIGHT_GRAY_PIGMENT);
        entries.add(DARK_GRAY_PIGMENT);
        entries.add(RED_PIGMENT);
        entries.add(ORANGE_PIGMENT);
        entries.add(YELLOW_PIGMENT);
        entries.add(CHARTREUSE_PIGMENT);
        entries.add(GREEN_PIGMENT);
        entries.add(SPRING_GREEN_PIGMENT);
        entries.add(CYAN_PIGMENT);
        entries.add(CAPRI_PIGMENT);
        entries.add(ULTRAMARINE_PIGMENT);
        entries.add(VIOLET_PIGMENT);
        entries.add(MAGENTA_PIGMENT);
        entries.add(PINK_PIGMENT);
        entries.add(ROSE_PIGMENT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, FarestsIdeas.makeId(name), item);
    }

    public static void registerModFuels() {
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModFuels!");

        FuelRegistry.INSTANCE.add(ModItems.OIL_BALL, 1600);
    }

    public static void registerModItems() {
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModItems!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
