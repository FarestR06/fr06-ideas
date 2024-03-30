package com.farestr06.ideas.block;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.block.custom.CreepingLeavesBlock;
import com.farestr06.ideas.block.custom.OakSaplingCropBlock;
import com.farestr06.ideas.block.custom.VoidBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block VOID_BLOCK = registerBlock("void_block",
            new VoidBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.SOUL_SAND).strength(0.5f, 1111.1f).instrument(Instrument.DRAGON).collidable(false).emissiveLighting(Blocks::always).replaceable()));

    // Workstations

    // Wood

    public static final Block MAPLE_LOG = registerBlock("maple_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2f))); 
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f))); 
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f))); 
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2f)));
    
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f)));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(2f)));

    // Ores

    public static final Block GRAPHITE_BLOCK = registerBlock("graphite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.BLACK).strength(2.0f, 2.5f).sounds(BlockSoundGroup.POLISHED_TUFF).instrument(Instrument.BIT)));
    public static final Block GRAPHENE_BLOCK = registerBlock("graphene_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).mapColor(MapColor.BLACK).strength(4.5f, 5.5f).sounds(BlockSoundGroup.STONE).instrument(Instrument.BIT)));

    // Crops

    public static final Block OAK_SAPLING_CROP = Registry.register(Registries.BLOCK, FarestsIdeas.makeId("oak_sapling_crop"),
            new OakSaplingCropBlock(FabricBlockSettings.copyOf(Blocks.TORCHFLOWER_CROP)));

    // Creeping Leaves

    public static final Block CREEPING_OAK_LEAVES = registerBlock("creeping_oak_leaves",
            new CreepingLeavesBlock(Blocks.OAK_LEAVES, FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CREEPING_SPRUCE_LEAVES = registerBlock("creeping_spruce_leaves",
            new CreepingLeavesBlock(Blocks.SPRUCE_LEAVES, FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)));
    public static final Block CREEPING_BIRCH_LEAVES = registerBlock("creeping_birch_leaves",
            new CreepingLeavesBlock(Blocks.BIRCH_LEAVES, FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES)));
    public static final Block CREEPING_JUNGLE_LEAVES = registerBlock("creeping_jungle_leaves",
            new CreepingLeavesBlock(Blocks.JUNGLE_LEAVES, FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));
    public static final Block CREEPING_ACACIA_LEAVES = registerBlock("creeping_acacia_leaves",
            new CreepingLeavesBlock(Blocks.ACACIA_LEAVES, FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES)));
    public static final Block CREEPING_DARK_OAK_LEAVES = registerBlock("creeping_dark_oak_leaves",
            new CreepingLeavesBlock(Blocks.DARK_OAK_LEAVES, FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)));
    public static final Block CREEPING_AZALEA_LEAVES = registerBlock("creeping_azalea_leaves",
            new CreepingLeavesBlock(Blocks.AZALEA_LEAVES, FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block CREEPING_FLOWERING_AZALEA_LEAVES = registerBlock("creeping_flowering_azalea_leaves",
            new CreepingLeavesBlock(Blocks.FLOWERING_AZALEA_LEAVES, FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final Block CREEPING_MANGROVE_LEAVES = registerBlock("creeping_mangrove_leaves",
            new CreepingLeavesBlock(Blocks.MANGROVE_LEAVES, FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)));
    public static final Block CREEPING_CHERRY_LEAVES = registerBlock("creeping_cherry_leaves",
            new CreepingLeavesBlock(Blocks.CHERRY_LEAVES, FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block CREEPING_MAPLE_LEAVES = registerBlock("creeping_maple_leaves",
            new CreepingLeavesBlock(ModBlocks.MAPLE_LEAVES, FabricBlockSettings.copyOf(ModBlocks.MAPLE_LEAVES)));


    private static void addBlocksToBuildingBlockItemGroup(FabricItemGroupEntries entries) {
        entries.add(MAPLE_LOG);
        entries.add(MAPLE_WOOD);
        entries.add(STRIPPED_MAPLE_LOG);
        entries.add(STRIPPED_MAPLE_WOOD);
        entries.add(MAPLE_PLANKS);
        entries.add(GRAPHITE_BLOCK);
        entries.add(GRAPHENE_BLOCK);
    }
    private static void addBlocksToNaturalBlockItemGroup(FabricItemGroupEntries entries) {
        entries.add(MAPLE_LEAVES);
        entries.add(CREEPING_OAK_LEAVES);
        entries.add(CREEPING_SPRUCE_LEAVES);
        entries.add(CREEPING_BIRCH_LEAVES);
        entries.add(CREEPING_JUNGLE_LEAVES);
        entries.add(CREEPING_ACACIA_LEAVES);
        entries.add(CREEPING_DARK_OAK_LEAVES);
        entries.add(CREEPING_AZALEA_LEAVES);
        entries.add(CREEPING_FLOWERING_AZALEA_LEAVES);
        entries.add(CREEPING_MANGROVE_LEAVES);
        entries.add(CREEPING_CHERRY_LEAVES);
        entries.add(CREEPING_MAPLE_LEAVES);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, FarestsIdeas.makeId(name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, FarestsIdeas.makeId(name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModBlocks!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlockItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlocksToNaturalBlockItemGroup);
    }
}

