package com.farestr06.ideas.item;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.item.custom.SaltItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    // Food Items

    public static final Item COFFEE_BERRIES = registerItem("coffee_berries", new Item(new FabricItemSettings().food(ModFoodComponents.COFFEE_BERRIES)));
    public static final Item SHRINKWEED = registerItem("shrinkweed", new Item(new FabricItemSettings().food(ModFoodComponents.SHRINKWEED)));

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

    // Blazelite Items
    public static final Item BLAZELITE_INGOT = registerItem("blazelite_ingot", new Item(new FabricItemSettings()));
    public static final Item OIL_BALL = registerItem("oil_ball", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItem("salt", new SaltItem(new FabricItemSettings()));
    public static final Item WHITE_PIGMENT = registerItem("white_pigment", new Item(new FabricItemSettings()));
    public static final Item LIGHT_GRAY_PIGMENT = registerItem("light_gray_pigment", new Item(new FabricItemSettings()));
    public static final Item DARK_GRAY_PIGMENT = registerItem("dark_gray_pigment", new Item(new FabricItemSettings()));
    public static final Item RED_PIGMENT = registerItem("red_pigment", new Item(new FabricItemSettings()));
    public static final Item ORANGE_PIGMENT = registerItem("orange_pigment", new Item(new FabricItemSettings()));
    public static final Item YELLOW_PIGMENT = registerItem("yellow_pigment", new Item(new FabricItemSettings()));
    public static final Item CHARTREUSE_PIGMENT = registerItem("chartreuse_pigment", new Item(new FabricItemSettings()));
    public static final Item GREEN_PIGMENT = registerItem("green_pigment", new Item(new FabricItemSettings()));
    public static final Item SPRING_GREEN_PIGMENT = registerItem("spring_green_pigment", new Item(new FabricItemSettings()));
    public static final Item CYAN_PIGMENT = registerItem("cyan_pigment", new Item(new FabricItemSettings()));
    public static final Item CAPRI_PIGMENT = registerItem("capri_pigment", new Item(new FabricItemSettings()));
    public static final Item ULTRAMARINE_PIGMENT = registerItem("ultramarine_pigment", new Item(new FabricItemSettings()));
    public static final Item VIOLET_PIGMENT = registerItem("violet_pigment", new Item(new FabricItemSettings()));
    public static final Item MAGENTA_PIGMENT = registerItem("magenta_pigment", new Item(new FabricItemSettings()));
    public static final Item PINK_PIGMENT = registerItem("pink_pigment", new Item(new FabricItemSettings()));
    public static final Item ROSE_PIGMENT = registerItem("rose_pigment", new Item(new FabricItemSettings()));

    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(COFFEE_BERRIES);
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
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SALT);
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
        return Registry.register(Registries.ITEM, new Identifier(FarestsIdeas.MOD_ID, name), item);
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
