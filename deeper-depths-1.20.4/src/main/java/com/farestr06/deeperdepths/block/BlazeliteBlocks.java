package com.farestr06.deeperdepths.block;

import com.farestr06.deeperdepths.DeeperDepths;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class BlazeliteBlocks {
    public static final Block BLAZELITE_BLOCK = registerBlock("blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_STAIRS = registerBlock("blazelite_stairs",
            new StairsBlock(BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_SLAB = registerBlock("blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BRICKS = registerBlock("blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BRICK_STAIRS = registerBlock("blazelite_brick_stairs",
            new StairsBlock(BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BRICK_SLAB = registerBlock("blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TILES = registerBlock("blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TILE_STAIRS = registerBlock("blazelite_tile_stairs",
            new StairsBlock(BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TILE_SLAB = registerBlock("blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BUTTON = registerBlock("blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_PRESSURE_PLATE = registerBlock("blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_FENCE = registerBlock("blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BRICK_FENCE = registerBlock("blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TILE_FENCE = registerBlock("blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BRICK_FENCE_GATE = registerBlock("blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TILE_FENCE_GATE = registerBlock("blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_FENCE_GATE = registerBlock("blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_BRICK_WALL = registerBlock("blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TILE_WALL = registerBlock("blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_WALL = registerBlock("blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_DOOR = registerBlock("blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block BLAZELITE_TRAPDOOR = registerBlock("blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // White
    public static final Block WHITE_BLAZELITE_BLOCK = registerBlock("white_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_STAIRS = registerBlock("white_blazelite_stairs",
            new StairsBlock(WHITE_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BRICKS = registerBlock("white_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BRICK_STAIRS = registerBlock("white_blazelite_brick_stairs",
            new StairsBlock(WHITE_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TILES = registerBlock("white_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TILE_STAIRS = registerBlock("white__blazelite_tile_stairs",
            new StairsBlock(WHITE_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_SLAB = registerBlock("white_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BRICK_SLAB = registerBlock("white_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TILE_SLAB = registerBlock("white__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BUTTON = registerBlock("white_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_PRESSURE_PLATE = registerBlock("white_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_FENCE = registerBlock("white_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BRICK_FENCE = registerBlock("white_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TILE_FENCE = registerBlock("white_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BRICK_FENCE_GATE = registerBlock("white_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TILE_FENCE_GATE = registerBlock("white_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_FENCE_GATE = registerBlock("white_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_BRICK_WALL = registerBlock("white_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TILE_WALL = registerBlock("white_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_WALL = registerBlock("white_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_DOOR = registerBlock("white_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block WHITE_BLAZELITE_TRAPDOOR = registerBlock("white_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Light Gray
    public static final Block LIGHT_GRAY_BLAZELITE_BLOCK = registerBlock("light_gray_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_STAIRS = registerBlock("light_gray_blazelite_stairs",
            new StairsBlock(LIGHT_GRAY_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BRICKS = registerBlock("light_gray_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BRICK_STAIRS = registerBlock("light_gray_blazelite_brick_stairs",
            new StairsBlock(LIGHT_GRAY_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TILES = registerBlock("light_gray_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TILE_STAIRS = registerBlock("light_gray_blazelite_tile_stairs",
            new StairsBlock(LIGHT_GRAY_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_SLAB = registerBlock("light_gray_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BRICK_SLAB = registerBlock("light_gray_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TILE_SLAB = registerBlock("light_gray_blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BUTTON = registerBlock("light_gray_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE = registerBlock("light_gray_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_FENCE = registerBlock("light_gray_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BRICK_FENCE = registerBlock("light_gray_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TILE_FENCE = registerBlock("light_gray_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE = registerBlock("light_gray_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE = registerBlock("light_gray_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_FENCE_GATE = registerBlock("light_gray_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_BRICK_WALL = registerBlock("light_gray_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TILE_WALL = registerBlock("light_gray_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_WALL = registerBlock("light_gray_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_DOOR = registerBlock("light_gray_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block LIGHT_GRAY_BLAZELITE_TRAPDOOR = registerBlock("light_gray_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Dark Gray
    public static final Block DARK_GRAY_BLAZELITE_BLOCK = registerBlock("dark_gray_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_STAIRS = registerBlock("dark_gray_blazelite_stairs",
            new StairsBlock(DARK_GRAY_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BRICKS = registerBlock("dark_gray_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BRICK_STAIRS = registerBlock("dark_gray_blazelite_brick_stairs",
            new StairsBlock(DARK_GRAY_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TILES = registerBlock("dark_gray_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TILE_STAIRS = registerBlock("dark_gray_blazelite_tile_stairs",
            new StairsBlock(DARK_GRAY_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_SLAB = registerBlock("dark_gray_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BRICK_SLAB = registerBlock("dark_gray_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TILE_SLAB = registerBlock("dark_gray_blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BUTTON = registerBlock("dark_gray_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_PRESSURE_PLATE = registerBlock("dark_gray_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_FENCE = registerBlock("dark_gray_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BRICK_FENCE = registerBlock("dark_gray_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TILE_FENCE = registerBlock("dark_gray_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE = registerBlock("dark_gray_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TILE_FENCE_GATE = registerBlock("dark_gray_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_FENCE_GATE = registerBlock("dark_gray_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_BRICK_WALL = registerBlock("dark_gray_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TILE_WALL = registerBlock("dark_gray_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_WALL = registerBlock("dark_gray_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_DOOR = registerBlock("dark_gray_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block DARK_GRAY_BLAZELITE_TRAPDOOR = registerBlock("dark_gray_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Red
    public static final Block RED_BLAZELITE_BLOCK = registerBlock("red_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_STAIRS = registerBlock("red_blazelite_stairs",
            new StairsBlock(RED_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BRICKS = registerBlock("red_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BRICK_STAIRS = registerBlock("red_blazelite_brick_stairs",
            new StairsBlock(RED_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TILES = registerBlock("red_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TILE_STAIRS = registerBlock("red__blazelite_tile_stairs",
            new StairsBlock(RED_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_SLAB = registerBlock("red_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BRICK_SLAB = registerBlock("red_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TILE_SLAB = registerBlock("red__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BUTTON = registerBlock("red_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_PRESSURE_PLATE = registerBlock("red_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_FENCE = registerBlock("red_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BRICK_FENCE = registerBlock("red_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TILE_FENCE = registerBlock("red_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BRICK_FENCE_GATE = registerBlock("red_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TILE_FENCE_GATE = registerBlock("red_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_FENCE_GATE = registerBlock("red_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_BRICK_WALL = registerBlock("red_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TILE_WALL = registerBlock("red_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_WALL = registerBlock("red_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_DOOR = registerBlock("red_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block RED_BLAZELITE_TRAPDOOR = registerBlock("red_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Orange
    public static final Block ORANGE_BLAZELITE_BLOCK = registerBlock("orange_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_STAIRS = registerBlock("orange_blazelite_stairs",
            new StairsBlock(ORANGE_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BRICKS = registerBlock("orange_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BRICK_STAIRS = registerBlock("orange_blazelite_brick_stairs",
            new StairsBlock(ORANGE_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TILES = registerBlock("orange_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TILE_STAIRS = registerBlock("orange__blazelite_tile_stairs",
            new StairsBlock(ORANGE_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_SLAB = registerBlock("orange_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BRICK_SLAB = registerBlock("orange_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TILE_SLAB = registerBlock("orange__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BUTTON = registerBlock("orange_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_PRESSURE_PLATE = registerBlock("orange_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_FENCE = registerBlock("orange_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BRICK_FENCE = registerBlock("orange_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TILE_FENCE = registerBlock("orange_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BRICK_FENCE_GATE = registerBlock("orange_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TILE_FENCE_GATE = registerBlock("orange_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_FENCE_GATE = registerBlock("orange_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_BRICK_WALL = registerBlock("orange_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TILE_WALL = registerBlock("orange_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_WALL = registerBlock("orange_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_DOOR = registerBlock("orange_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ORANGE_BLAZELITE_TRAPDOOR = registerBlock("orange_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Yellow
    public static final Block YELLOW_BLAZELITE_BLOCK = registerBlock("yellow_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_STAIRS = registerBlock("yellow_blazelite_stairs",
            new StairsBlock(YELLOW_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BRICKS = registerBlock("yellow_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BRICK_STAIRS = registerBlock("yellow_blazelite_brick_stairs",
            new StairsBlock(YELLOW_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TILES = registerBlock("yellow_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TILE_STAIRS = registerBlock("yellow__blazelite_tile_stairs",
            new StairsBlock(YELLOW_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_SLAB = registerBlock("yellow_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BRICK_SLAB = registerBlock("yellow_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TILE_SLAB = registerBlock("yellow__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BUTTON = registerBlock("yellow_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_PRESSURE_PLATE = registerBlock("yellow_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_FENCE = registerBlock("yellow_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BRICK_FENCE = registerBlock("yellow_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TILE_FENCE = registerBlock("yellow_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BRICK_FENCE_GATE = registerBlock("yellow_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TILE_FENCE_GATE = registerBlock("yellow_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_FENCE_GATE = registerBlock("yellow_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_BRICK_WALL = registerBlock("yellow_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TILE_WALL = registerBlock("yellow_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_WALL = registerBlock("yellow_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_DOOR = registerBlock("yellow_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block YELLOW_BLAZELITE_TRAPDOOR = registerBlock("yellow_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Chartreuse
    public static final Block CHARTREUSE_BLAZELITE_BLOCK = registerBlock("chartreuse_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_STAIRS = registerBlock("chartreuse_blazelite_stairs",
            new StairsBlock(CHARTREUSE_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BRICKS = registerBlock("chartreuse_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BRICK_STAIRS = registerBlock("chartreuse_blazelite_brick_stairs",
            new StairsBlock(CHARTREUSE_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TILES = registerBlock("chartreuse_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TILE_STAIRS = registerBlock("chartreuse_blazelite_tile_stairs",
            new StairsBlock(CHARTREUSE_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_SLAB = registerBlock("chartreuse_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BRICK_SLAB = registerBlock("chartreuse_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TILE_SLAB = registerBlock("chartreuse_blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BUTTON = registerBlock("chartreuse_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_PRESSURE_PLATE = registerBlock("chartreuse_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_FENCE = registerBlock("chartreuse_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BRICK_FENCE = registerBlock("chartreuse_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TILE_FENCE = registerBlock("chartreuse_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE = registerBlock("chartreuse_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TILE_FENCE_GATE = registerBlock("chartreuse_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_FENCE_GATE = registerBlock("chartreuse_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_BRICK_WALL = registerBlock("chartreuse_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TILE_WALL = registerBlock("chartreuse_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_WALL = registerBlock("chartreuse_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_DOOR = registerBlock("chartreuse_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CHARTREUSE_BLAZELITE_TRAPDOOR = registerBlock("chartreuse_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Green
    public static final Block GREEN_BLAZELITE_BLOCK = registerBlock("green_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_STAIRS = registerBlock("green_blazelite_stairs",
            new StairsBlock(GREEN_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BRICKS = registerBlock("green_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BRICK_STAIRS = registerBlock("green_blazelite_brick_stairs",
            new StairsBlock(GREEN_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TILES = registerBlock("green_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TILE_STAIRS = registerBlock("green_blazelite_tile_stairs",
            new StairsBlock(GREEN_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_SLAB = registerBlock("green_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BRICK_SLAB = registerBlock("green_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TILE_SLAB = registerBlock("green_blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BUTTON = registerBlock("green_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_PRESSURE_PLATE = registerBlock("green_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_FENCE = registerBlock("green_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BRICK_FENCE = registerBlock("green_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TILE_FENCE = registerBlock("green_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BRICK_FENCE_GATE = registerBlock("green_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TILE_FENCE_GATE = registerBlock("green_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_FENCE_GATE = registerBlock("green_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_BRICK_WALL = registerBlock("green_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TILE_WALL = registerBlock("green_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_WALL = registerBlock("green_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_DOOR = registerBlock("green_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block GREEN_BLAZELITE_TRAPDOOR = registerBlock("green_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Spring Green
    public static final Block SPRING_GREEN_BLAZELITE_BLOCK = registerBlock("spring_green_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_STAIRS = registerBlock("spring_green_blazelite_stairs",
            new StairsBlock(SPRING_GREEN_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BRICKS = registerBlock("spring_green_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BRICK_STAIRS = registerBlock("spring_green_blazelite_brick_stairs",
            new StairsBlock(SPRING_GREEN_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TILES = registerBlock("spring_green_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TILE_STAIRS = registerBlock("spring_green__blazelite_tile_stairs",
            new StairsBlock(SPRING_GREEN_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_SLAB = registerBlock("spring_green_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BRICK_SLAB = registerBlock("spring_green_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TILE_SLAB = registerBlock("spring_green__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BUTTON = registerBlock("spring_green_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_PRESSURE_PLATE = registerBlock("spring_green_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_FENCE = registerBlock("spring_green_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BRICK_FENCE = registerBlock("spring_green_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TILE_FENCE = registerBlock("spring_green_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE = registerBlock("spring_green_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE = registerBlock("spring_green_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_FENCE_GATE = registerBlock("spring_green_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_BRICK_WALL = registerBlock("spring_green_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TILE_WALL = registerBlock("spring_green_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_WALL = registerBlock("spring_green_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_DOOR = registerBlock("spring_green_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block SPRING_GREEN_BLAZELITE_TRAPDOOR = registerBlock("spring_green_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Cyan
    public static final Block CYAN_BLAZELITE_BLOCK = registerBlock("cyan_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_STAIRS = registerBlock("cyan_blazelite_stairs",
            new StairsBlock(CYAN_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BRICKS = registerBlock("cyan_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BRICK_STAIRS = registerBlock("cyan_blazelite_brick_stairs",
            new StairsBlock(CYAN_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TILES = registerBlock("cyan_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TILE_STAIRS = registerBlock("cyan_blazelite_tile_stairs",
            new StairsBlock(CYAN_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_SLAB = registerBlock("cyan_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BRICK_SLAB = registerBlock("cyan_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TILE_SLAB = registerBlock("cyan_blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BUTTON = registerBlock("cyan_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_PRESSURE_PLATE = registerBlock("cyan_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_FENCE = registerBlock("cyan_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BRICK_FENCE = registerBlock("cyan_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TILE_FENCE = registerBlock("cyan_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BRICK_FENCE_GATE = registerBlock("cyan_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TILE_FENCE_GATE = registerBlock("cyan_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_FENCE_GATE = registerBlock("cyan_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_BRICK_WALL = registerBlock("cyan_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TILE_WALL = registerBlock("cyan_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_WALL = registerBlock("cyan_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_DOOR = registerBlock("cyan_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CYAN_BLAZELITE_TRAPDOOR = registerBlock("cyan_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Capri
    public static final Block CAPRI_BLAZELITE_BLOCK = registerBlock("capri_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_STAIRS = registerBlock("capri_blazelite_stairs",
            new StairsBlock(CAPRI_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BRICKS = registerBlock("capri_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BRICK_STAIRS = registerBlock("capri_blazelite_brick_stairs",
            new StairsBlock(CAPRI_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TILES = registerBlock("capri_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TILE_STAIRS = registerBlock("capri_blazelite_tile_stairs",
            new StairsBlock(CAPRI_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_SLAB = registerBlock("capri_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BRICK_SLAB = registerBlock("capri_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TILE_SLAB = registerBlock("capri_blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BUTTON = registerBlock("capri_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_PRESSURE_PLATE = registerBlock("capri_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_FENCE = registerBlock("capri_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BRICK_FENCE = registerBlock("capri_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TILE_FENCE = registerBlock("capri_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BRICK_FENCE_GATE = registerBlock("capri_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TILE_FENCE_GATE = registerBlock("capri_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_FENCE_GATE = registerBlock("capri_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_BRICK_WALL = registerBlock("capri_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TILE_WALL = registerBlock("capri_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_WALL = registerBlock("capri_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_DOOR = registerBlock("capri_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block CAPRI_BLAZELITE_TRAPDOOR = registerBlock("capri_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Ultramarine
    public static final Block ULTRAMARINE_BLAZELITE_BLOCK = registerBlock("ultramarine_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_STAIRS = registerBlock("ultramarine_blazelite_stairs",
            new StairsBlock(ULTRAMARINE_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BRICKS = registerBlock("ultramarine_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BRICK_STAIRS = registerBlock("ultramarine_blazelite_brick_stairs",
            new StairsBlock(ULTRAMARINE_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TILES = registerBlock("ultramarine_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TILE_STAIRS = registerBlock("ultramarine__blazelite_tile_stairs",
            new StairsBlock(ULTRAMARINE_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_SLAB = registerBlock("ultramarine_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BRICK_SLAB = registerBlock("ultramarine_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TILE_SLAB = registerBlock("ultramarine__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BUTTON = registerBlock("ultramarine_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_PRESSURE_PLATE = registerBlock("ultramarine_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_FENCE = registerBlock("ultramarine_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BRICK_FENCE = registerBlock("ultramarine_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TILE_FENCE = registerBlock("ultramarine_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE = registerBlock("ultramarine_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE = registerBlock("ultramarine_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_FENCE_GATE = registerBlock("ultramarine_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_BRICK_WALL = registerBlock("ultramarine_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TILE_WALL = registerBlock("ultramarine_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_WALL = registerBlock("ultramarine_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_DOOR = registerBlock("ultramarine_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ULTRAMARINE_BLAZELITE_TRAPDOOR = registerBlock("ultramarine_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Violet
    public static final Block VIOLET_BLAZELITE_BLOCK = registerBlock("violet_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_STAIRS = registerBlock("violet_blazelite_stairs",
            new StairsBlock(VIOLET_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BRICKS = registerBlock("violet_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BRICK_STAIRS = registerBlock("violet_blazelite_brick_stairs",
            new StairsBlock(VIOLET_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TILES = registerBlock("violet_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TILE_STAIRS = registerBlock("violet__blazelite_tile_stairs",
            new StairsBlock(VIOLET_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_SLAB = registerBlock("violet_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BRICK_SLAB = registerBlock("violet_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TILE_SLAB = registerBlock("violet__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BUTTON = registerBlock("violet_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_PRESSURE_PLATE = registerBlock("violet_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_FENCE = registerBlock("violet_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BRICK_FENCE = registerBlock("violet_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TILE_FENCE = registerBlock("violet_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BRICK_FENCE_GATE = registerBlock("violet_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TILE_FENCE_GATE = registerBlock("violet_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_FENCE_GATE = registerBlock("violet_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_BRICK_WALL = registerBlock("violet_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TILE_WALL = registerBlock("violet_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_WALL = registerBlock("violet_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_DOOR = registerBlock("violet_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block VIOLET_BLAZELITE_TRAPDOOR = registerBlock("violet_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Magenta
    public static final Block MAGENTA_BLAZELITE_BLOCK = registerBlock("magenta_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_STAIRS = registerBlock("magenta_blazelite_stairs",
            new StairsBlock(MAGENTA_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BRICKS = registerBlock("magenta_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BRICK_STAIRS = registerBlock("magenta_blazelite_brick_stairs",
            new StairsBlock(MAGENTA_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TILES = registerBlock("magenta_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TILE_STAIRS = registerBlock("magenta__blazelite_tile_stairs",
            new StairsBlock(MAGENTA_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_SLAB = registerBlock("magenta_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BRICK_SLAB = registerBlock("magenta_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TILE_SLAB = registerBlock("magenta__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BUTTON = registerBlock("magenta_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_PRESSURE_PLATE = registerBlock("magenta_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_FENCE = registerBlock("magenta_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BRICK_FENCE = registerBlock("magenta_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TILE_FENCE = registerBlock("magenta_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BRICK_FENCE_GATE = registerBlock("magenta_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TILE_FENCE_GATE = registerBlock("magenta_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_FENCE_GATE = registerBlock("magenta_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_BRICK_WALL = registerBlock("magenta_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TILE_WALL = registerBlock("magenta_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_WALL = registerBlock("magenta_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_DOOR = registerBlock("magenta_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block MAGENTA_BLAZELITE_TRAPDOOR = registerBlock("magenta_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Pink
    public static final Block PINK_BLAZELITE_BLOCK = registerBlock("pink_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_STAIRS = registerBlock("pink_blazelite_stairs",
            new StairsBlock(PINK_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BRICKS = registerBlock("pink_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BRICK_STAIRS = registerBlock("pink_blazelite_brick_stairs",
            new StairsBlock(PINK_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TILES = registerBlock("pink_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TILE_STAIRS = registerBlock("pink__blazelite_tile_stairs",
            new StairsBlock(PINK_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_SLAB = registerBlock("pink_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BRICK_SLAB = registerBlock("pink_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TILE_SLAB = registerBlock("pink__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BUTTON = registerBlock("pink_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_PRESSURE_PLATE = registerBlock("pink_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_FENCE = registerBlock("pink_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BRICK_FENCE = registerBlock("pink_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TILE_FENCE = registerBlock("pink_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BRICK_FENCE_GATE = registerBlock("pink_blazelitebrick__fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TILE_FENCE_GATE = registerBlock("pink_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_FENCE_GATE = registerBlock("pink_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_BRICK_WALL = registerBlock("pink_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TILE_WALL = registerBlock("pink_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_WALL = registerBlock("pink_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_DOOR = registerBlock("pink_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block PINK_BLAZELITE_TRAPDOOR = registerBlock("pink_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    // Rose
    public static final Block ROSE_BLAZELITE_BLOCK = registerBlock("rose_blazelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_STAIRS = registerBlock("rose_blazelite_stairs",
            new StairsBlock(ROSE_BLAZELITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BRICKS = registerBlock("rose_blazelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BRICK_STAIRS = registerBlock("rose_blazelite_brick_stairs",
            new StairsBlock(ROSE_BLAZELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TILES = registerBlock("rose_blazelite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TILE_STAIRS = registerBlock("rose__blazelite_tile_stairs",
            new StairsBlock(ROSE_BLAZELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_SLAB = registerBlock("rose_blazelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BRICK_SLAB = registerBlock("rose_blazelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TILE_SLAB = registerBlock("rose__blazelite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BUTTON = registerBlock("rose_blazelite_button",
            new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE,  10, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(0.5f, 0.5f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_PRESSURE_PLATE = registerBlock("rose_blazelite_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
                    FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                            .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_FENCE = registerBlock("rose_blazelite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BRICK_FENCE = registerBlock("rose_blazelite_brick_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TILE_FENCE = registerBlock("rose_blazelite_tile_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BRICK_FENCE_GATE = registerBlock("rose_blazelite_brick_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TILE_FENCE_GATE = registerBlock("rose_blazelite_tile_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_FENCE_GATE = registerBlock("rose_blazelite_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_BRICK_WALL = registerBlock("rose_blazelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TILE_WALL = registerBlock("rose_blazelite_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_WALL = registerBlock("rose_blazelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.BONE)
                    .strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_DOOR = registerBlock("rose_blazelite_door",
            new DoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));
    public static final Block ROSE_BLAZELITE_TRAPDOOR = registerBlock("rose_blazelite_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED, FabricBlockSettings.copyOf(Blocks.TERRACOTTA)
                    .sounds(BlockSoundGroup.BONE).strength(10.0f, 240.0f).instrument(Instrument.PLING)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, DeeperDepths.makeId(name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, DeeperDepths.makeId(name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DeeperDepths.LOGGER.info("Registering ModBlocks for " + DeeperDepths.MOD_ID);
    }
}
