package com.farestr06.ideas.datagen;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COFFEE_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHRINKWEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLAZELITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OIL_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_GRAY_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARTREUSE_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRING_GREEN_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAPRI_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ULTRAMARINE_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIOLET_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_PIGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_PIGMENT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLAZELITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZELITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZELITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZELITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLAZELITE_SWORD, Models.HANDHELD);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OILY_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSOIL);

        generateBlazeliteModels(blockStateModelGenerator);
        generateWhiteBlazeliteModels(blockStateModelGenerator);
        generateLightGrayBlazeliteModels(blockStateModelGenerator);
        generateDarkGrayBlazeliteModels(blockStateModelGenerator);
        generateRedBlazeliteModels(blockStateModelGenerator);
        generateOrangeBlazeliteModels(blockStateModelGenerator);
        generateYellowBlazeliteModels(blockStateModelGenerator);
        generateChartreuseBlazeliteModels(blockStateModelGenerator);
        generateGreenBlazeliteModels(blockStateModelGenerator);
        generateSpringGreenBlazeliteModels(blockStateModelGenerator);
        generateCyanBlazeliteModels(blockStateModelGenerator);
        generateCapriBlazeliteModels(blockStateModelGenerator);
        generateUltramarineBlazeliteModels(blockStateModelGenerator);
        generateVioletBlazeliteModels(blockStateModelGenerator);
        generateMagentaBlazeliteModels(blockStateModelGenerator);
        generatePinkBlazeliteModels(blockStateModelGenerator);
        generateRoseBlazeliteModels(blockStateModelGenerator);
    }

    private static void generateBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool blazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool blazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZELITE_TILES);

        blazeliteBlockPool.stairs(ModBlocks.BLAZELITE_STAIRS);
        blazeliteBlockPool.slab(ModBlocks.BLAZELITE_SLAB);
        blazeliteBlockPool.button(ModBlocks.BLAZELITE_BUTTON);
        blazeliteBlockPool.pressurePlate(ModBlocks.BLAZELITE_PRESSURE_PLATE);
        blazeliteBlockPool.fence(ModBlocks.BLAZELITE_FENCE);
        blazeliteBlockPool.fenceGate(ModBlocks.BLAZELITE_FENCE_GATE);
        blazeliteBlockPool.wall(ModBlocks.BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLAZELITE_TRAPDOOR);

        blazeliteBrickPool.stairs(ModBlocks.BLAZELITE_BRICK_STAIRS);
        blazeliteBrickPool.slab(ModBlocks.BLAZELITE_BRICK_SLAB);
        blazeliteBrickPool.fence(ModBlocks.BLAZELITE_BRICK_FENCE);
        blazeliteBrickPool.fenceGate(ModBlocks.BLAZELITE_BRICK_FENCE_GATE);
        blazeliteBrickPool.wall(ModBlocks.BLAZELITE_BRICK_WALL);

        blazeliteTilePool.stairs(ModBlocks.BLAZELITE_TILE_STAIRS);
        blazeliteTilePool.slab(ModBlocks.BLAZELITE_TILE_SLAB);
        blazeliteTilePool.fence(ModBlocks.BLAZELITE_TILE_FENCE);
        blazeliteTilePool.fenceGate(ModBlocks.BLAZELITE_TILE_FENCE_GATE);
        blazeliteTilePool.wall(ModBlocks.BLAZELITE_TILE_WALL);
    }
    private static void generateWhiteBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BLAZELITE_TILES);

        lightGrayBlazeliteBlockPool.stairs(ModBlocks.WHITE_BLAZELITE_STAIRS);
        lightGrayBlazeliteBlockPool.slab(ModBlocks.WHITE_BLAZELITE_SLAB);
        lightGrayBlazeliteBlockPool.button(ModBlocks.WHITE_BLAZELITE_BUTTON);
        lightGrayBlazeliteBlockPool.pressurePlate(ModBlocks.WHITE_BLAZELITE_PRESSURE_PLATE);
        lightGrayBlazeliteBlockPool.fence(ModBlocks.WHITE_BLAZELITE_FENCE);
        lightGrayBlazeliteBlockPool.fenceGate(ModBlocks.WHITE_BLAZELITE_FENCE_GATE);
        lightGrayBlazeliteBlockPool.wall(ModBlocks.WHITE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.WHITE_BLAZELITE_TRAPDOOR);

        lightGrayBlazeliteBrickPool.stairs(ModBlocks.WHITE_BLAZELITE_BRICK_STAIRS);
        lightGrayBlazeliteBrickPool.slab(ModBlocks.WHITE_BLAZELITE_BRICK_SLAB);
        lightGrayBlazeliteBrickPool.fence(ModBlocks.WHITE_BLAZELITE_BRICK_FENCE);
        lightGrayBlazeliteBrickPool.fenceGate(ModBlocks.WHITE_BLAZELITE_BRICK_FENCE_GATE);
        lightGrayBlazeliteBrickPool.wall(ModBlocks.WHITE_BLAZELITE_BRICK_WALL);

        lightGrayBlazeliteTilePool.stairs(ModBlocks.WHITE_BLAZELITE_TILE_STAIRS);
        lightGrayBlazeliteTilePool.slab(ModBlocks.WHITE_BLAZELITE_TILE_SLAB);
        lightGrayBlazeliteTilePool.fence(ModBlocks.WHITE_BLAZELITE_TILE_FENCE);
        lightGrayBlazeliteTilePool.fenceGate(ModBlocks.WHITE_BLAZELITE_TILE_FENCE_GATE);
        lightGrayBlazeliteTilePool.wall(ModBlocks.WHITE_BLAZELITE_TILE_WALL);
    }
    private static void generateLightGrayBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES);

        lightGrayBlazeliteBlockPool.stairs(ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS);
        lightGrayBlazeliteBlockPool.slab(ModBlocks.LIGHT_GRAY_BLAZELITE_SLAB);
        lightGrayBlazeliteBlockPool.button(ModBlocks.LIGHT_GRAY_BLAZELITE_BUTTON);
        lightGrayBlazeliteBlockPool.pressurePlate(ModBlocks.LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE);
        lightGrayBlazeliteBlockPool.fence(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE);
        lightGrayBlazeliteBlockPool.fenceGate(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE);
        lightGrayBlazeliteBlockPool.wall(ModBlocks.LIGHT_GRAY_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR);

        lightGrayBlazeliteBrickPool.stairs(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_STAIRS);
        lightGrayBlazeliteBrickPool.slab(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_SLAB);
        lightGrayBlazeliteBrickPool.fence(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE);
        lightGrayBlazeliteBrickPool.fenceGate(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE);
        lightGrayBlazeliteBrickPool.wall(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_WALL);

        lightGrayBlazeliteTilePool.stairs(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_STAIRS);
        lightGrayBlazeliteTilePool.slab(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_SLAB);
        lightGrayBlazeliteTilePool.fence(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE);
        lightGrayBlazeliteTilePool.fenceGate(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE);
        lightGrayBlazeliteTilePool.wall(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_WALL);
    }
    private static void generateDarkGrayBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool darkGrayBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool darkGrayBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkGrayBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_GRAY_BLAZELITE_TILES);

        darkGrayBlazeliteBlockPool.stairs(ModBlocks.DARK_GRAY_BLAZELITE_STAIRS);
        darkGrayBlazeliteBlockPool.slab(ModBlocks.DARK_GRAY_BLAZELITE_SLAB);
        darkGrayBlazeliteBlockPool.button(ModBlocks.DARK_GRAY_BLAZELITE_BUTTON);
        darkGrayBlazeliteBlockPool.pressurePlate(ModBlocks.DARK_GRAY_BLAZELITE_PRESSURE_PLATE);
        darkGrayBlazeliteBlockPool.fence(ModBlocks.DARK_GRAY_BLAZELITE_FENCE);
        darkGrayBlazeliteBlockPool.fenceGate(ModBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE);
        darkGrayBlazeliteBlockPool.wall(ModBlocks.DARK_GRAY_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.DARK_GRAY_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR);

        darkGrayBlazeliteBrickPool.stairs(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_STAIRS);
        darkGrayBlazeliteBrickPool.slab(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_SLAB);
        darkGrayBlazeliteBrickPool.fence(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE);
        darkGrayBlazeliteBrickPool.fenceGate(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE);
        darkGrayBlazeliteBrickPool.wall(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_WALL);

        darkGrayBlazeliteTilePool.stairs(ModBlocks.DARK_GRAY_BLAZELITE_TILE_STAIRS);
        darkGrayBlazeliteTilePool.slab(ModBlocks.DARK_GRAY_BLAZELITE_TILE_SLAB);
        darkGrayBlazeliteTilePool.fence(ModBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE);
        darkGrayBlazeliteTilePool.fenceGate(ModBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE_GATE);
        darkGrayBlazeliteTilePool.wall(ModBlocks.DARK_GRAY_BLAZELITE_TILE_WALL);
    }
    private static void generateRedBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool redBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool redBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_BLAZELITE_TILES);

        redBlazeliteBlockPool.stairs(ModBlocks.RED_BLAZELITE_STAIRS);
        redBlazeliteBlockPool.slab(ModBlocks.RED_BLAZELITE_SLAB);
        redBlazeliteBlockPool.button(ModBlocks.RED_BLAZELITE_BUTTON);
        redBlazeliteBlockPool.pressurePlate(ModBlocks.RED_BLAZELITE_PRESSURE_PLATE);
        redBlazeliteBlockPool.fence(ModBlocks.RED_BLAZELITE_FENCE);
        redBlazeliteBlockPool.fenceGate(ModBlocks.RED_BLAZELITE_FENCE_GATE);
        redBlazeliteBlockPool.wall(ModBlocks.RED_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RED_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RED_BLAZELITE_TRAPDOOR);

        redBlazeliteBrickPool.stairs(ModBlocks.RED_BLAZELITE_BRICK_STAIRS);
        redBlazeliteBrickPool.slab(ModBlocks.RED_BLAZELITE_BRICK_SLAB);
        redBlazeliteBrickPool.fence(ModBlocks.RED_BLAZELITE_BRICK_FENCE);
        redBlazeliteBrickPool.fenceGate(ModBlocks.RED_BLAZELITE_BRICK_FENCE_GATE);
        redBlazeliteBrickPool.wall(ModBlocks.RED_BLAZELITE_BRICK_WALL);

        redBlazeliteTilePool.stairs(ModBlocks.RED_BLAZELITE_TILE_STAIRS);
        redBlazeliteTilePool.slab(ModBlocks.RED_BLAZELITE_TILE_SLAB);
        redBlazeliteTilePool.fence(ModBlocks.RED_BLAZELITE_TILE_FENCE);
        redBlazeliteTilePool.fenceGate(ModBlocks.RED_BLAZELITE_TILE_FENCE_GATE);
        redBlazeliteTilePool.wall(ModBlocks.RED_BLAZELITE_TILE_WALL);
    }
    private static void generateOrangeBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool orangeBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool orangeBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool orangeBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_BLAZELITE_TILES);

        orangeBlazeliteBlockPool.stairs(ModBlocks.ORANGE_BLAZELITE_STAIRS);
        orangeBlazeliteBlockPool.slab(ModBlocks.ORANGE_BLAZELITE_SLAB);
        orangeBlazeliteBlockPool.button(ModBlocks.ORANGE_BLAZELITE_BUTTON);
        orangeBlazeliteBlockPool.pressurePlate(ModBlocks.ORANGE_BLAZELITE_PRESSURE_PLATE);
        orangeBlazeliteBlockPool.fence(ModBlocks.ORANGE_BLAZELITE_FENCE);
        orangeBlazeliteBlockPool.fenceGate(ModBlocks.ORANGE_BLAZELITE_FENCE_GATE);
        orangeBlazeliteBlockPool.wall(ModBlocks.ORANGE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ORANGE_BLAZELITE_TRAPDOOR);

        orangeBlazeliteBrickPool.stairs(ModBlocks.ORANGE_BLAZELITE_BRICK_STAIRS);
        orangeBlazeliteBrickPool.slab(ModBlocks.ORANGE_BLAZELITE_BRICK_SLAB);
        orangeBlazeliteBrickPool.fence(ModBlocks.ORANGE_BLAZELITE_BRICK_FENCE);
        orangeBlazeliteBrickPool.fenceGate(ModBlocks.ORANGE_BLAZELITE_BRICK_FENCE_GATE);
        orangeBlazeliteBrickPool.wall(ModBlocks.ORANGE_BLAZELITE_BRICK_WALL);

        orangeBlazeliteTilePool.stairs(ModBlocks.ORANGE_BLAZELITE_TILE_STAIRS);
        orangeBlazeliteTilePool.slab(ModBlocks.ORANGE_BLAZELITE_TILE_SLAB);
        orangeBlazeliteTilePool.fence(ModBlocks.ORANGE_BLAZELITE_TILE_FENCE);
        orangeBlazeliteTilePool.fenceGate(ModBlocks.ORANGE_BLAZELITE_TILE_FENCE_GATE);
        orangeBlazeliteTilePool.wall(ModBlocks.ORANGE_BLAZELITE_TILE_WALL);
    }
    private static void generateYellowBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool yellowBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool yellowBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool yellowBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_BLAZELITE_TILES);

        yellowBlazeliteBlockPool.stairs(ModBlocks.YELLOW_BLAZELITE_STAIRS);
        yellowBlazeliteBlockPool.slab(ModBlocks.YELLOW_BLAZELITE_SLAB);
        yellowBlazeliteBlockPool.button(ModBlocks.YELLOW_BLAZELITE_BUTTON);
        yellowBlazeliteBlockPool.pressurePlate(ModBlocks.YELLOW_BLAZELITE_PRESSURE_PLATE);
        yellowBlazeliteBlockPool.fence(ModBlocks.YELLOW_BLAZELITE_FENCE);
        yellowBlazeliteBlockPool.fenceGate(ModBlocks.YELLOW_BLAZELITE_FENCE_GATE);
        yellowBlazeliteBlockPool.wall(ModBlocks.YELLOW_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.YELLOW_BLAZELITE_TRAPDOOR);

        yellowBlazeliteBrickPool.stairs(ModBlocks.YELLOW_BLAZELITE_BRICK_STAIRS);
        yellowBlazeliteBrickPool.slab(ModBlocks.YELLOW_BLAZELITE_BRICK_SLAB);
        yellowBlazeliteBrickPool.fence(ModBlocks.YELLOW_BLAZELITE_BRICK_FENCE);
        yellowBlazeliteBrickPool.fenceGate(ModBlocks.YELLOW_BLAZELITE_BRICK_FENCE_GATE);
        yellowBlazeliteBrickPool.wall(ModBlocks.YELLOW_BLAZELITE_BRICK_WALL);

        yellowBlazeliteTilePool.stairs(ModBlocks.YELLOW_BLAZELITE_TILE_STAIRS);
        yellowBlazeliteTilePool.slab(ModBlocks.YELLOW_BLAZELITE_TILE_SLAB);
        yellowBlazeliteTilePool.fence(ModBlocks.YELLOW_BLAZELITE_TILE_FENCE);
        yellowBlazeliteTilePool.fenceGate(ModBlocks.YELLOW_BLAZELITE_TILE_FENCE_GATE);
        yellowBlazeliteTilePool.wall(ModBlocks.YELLOW_BLAZELITE_TILE_WALL);
    }
    private static void generateChartreuseBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool chartreuseBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool chartreuseBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool chartreuseBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARTREUSE_BLAZELITE_TILES);

        chartreuseBlazeliteBlockPool.stairs(ModBlocks.CHARTREUSE_BLAZELITE_STAIRS);
        chartreuseBlazeliteBlockPool.slab(ModBlocks.CHARTREUSE_BLAZELITE_SLAB);
        chartreuseBlazeliteBlockPool.button(ModBlocks.CHARTREUSE_BLAZELITE_BUTTON);
        chartreuseBlazeliteBlockPool.pressurePlate(ModBlocks.CHARTREUSE_BLAZELITE_PRESSURE_PLATE);
        chartreuseBlazeliteBlockPool.fence(ModBlocks.CHARTREUSE_BLAZELITE_FENCE);
        chartreuseBlazeliteBlockPool.fenceGate(ModBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE);
        chartreuseBlazeliteBlockPool.wall(ModBlocks.CHARTREUSE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.CHARTREUSE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR);

        chartreuseBlazeliteBrickPool.stairs(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_STAIRS);
        chartreuseBlazeliteBrickPool.slab(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_SLAB);
        chartreuseBlazeliteBrickPool.fence(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE);
        chartreuseBlazeliteBrickPool.fenceGate(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE);
        chartreuseBlazeliteBrickPool.wall(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_WALL);

        chartreuseBlazeliteTilePool.stairs(ModBlocks.CHARTREUSE_BLAZELITE_TILE_STAIRS);
        chartreuseBlazeliteTilePool.slab(ModBlocks.CHARTREUSE_BLAZELITE_TILE_SLAB);
        chartreuseBlazeliteTilePool.fence(ModBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE);
        chartreuseBlazeliteTilePool.fenceGate(ModBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE_GATE);
        chartreuseBlazeliteTilePool.wall(ModBlocks.CHARTREUSE_BLAZELITE_TILE_WALL);
    }
    private static void generateGreenBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool greenBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool greenBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool greenBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_BLAZELITE_TILES);

        greenBlazeliteBlockPool.stairs(ModBlocks.GREEN_BLAZELITE_STAIRS);
        greenBlazeliteBlockPool.slab(ModBlocks.GREEN_BLAZELITE_SLAB);
        greenBlazeliteBlockPool.button(ModBlocks.GREEN_BLAZELITE_BUTTON);
        greenBlazeliteBlockPool.pressurePlate(ModBlocks.GREEN_BLAZELITE_PRESSURE_PLATE);
        greenBlazeliteBlockPool.fence(ModBlocks.GREEN_BLAZELITE_FENCE);
        greenBlazeliteBlockPool.fenceGate(ModBlocks.GREEN_BLAZELITE_FENCE_GATE);
        greenBlazeliteBlockPool.wall(ModBlocks.GREEN_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GREEN_BLAZELITE_TRAPDOOR);

        greenBlazeliteBrickPool.stairs(ModBlocks.GREEN_BLAZELITE_BRICK_STAIRS);
        greenBlazeliteBrickPool.slab(ModBlocks.GREEN_BLAZELITE_BRICK_SLAB);
        greenBlazeliteBrickPool.fence(ModBlocks.GREEN_BLAZELITE_BRICK_FENCE);
        greenBlazeliteBrickPool.fenceGate(ModBlocks.GREEN_BLAZELITE_BRICK_FENCE_GATE);
        greenBlazeliteBrickPool.wall(ModBlocks.GREEN_BLAZELITE_BRICK_WALL);

        greenBlazeliteTilePool.stairs(ModBlocks.GREEN_BLAZELITE_TILE_STAIRS);
        greenBlazeliteTilePool.slab(ModBlocks.GREEN_BLAZELITE_TILE_SLAB);
        greenBlazeliteTilePool.fence(ModBlocks.GREEN_BLAZELITE_TILE_FENCE);
        greenBlazeliteTilePool.fenceGate(ModBlocks.GREEN_BLAZELITE_TILE_FENCE_GATE);
        greenBlazeliteTilePool.wall(ModBlocks.GREEN_BLAZELITE_TILE_WALL);
    }
    private static void generateSpringGreenBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool springGreenBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool springGreenBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool springGreenBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRING_GREEN_BLAZELITE_TILES);

        springGreenBlazeliteBlockPool.stairs(ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS);
        springGreenBlazeliteBlockPool.slab(ModBlocks.SPRING_GREEN_BLAZELITE_SLAB);
        springGreenBlazeliteBlockPool.button(ModBlocks.SPRING_GREEN_BLAZELITE_BUTTON);
        springGreenBlazeliteBlockPool.pressurePlate(ModBlocks.SPRING_GREEN_BLAZELITE_PRESSURE_PLATE);
        springGreenBlazeliteBlockPool.fence(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE);
        springGreenBlazeliteBlockPool.fenceGate(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE);
        springGreenBlazeliteBlockPool.wall(ModBlocks.SPRING_GREEN_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.SPRING_GREEN_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR);

        springGreenBlazeliteBrickPool.stairs(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_STAIRS);
        springGreenBlazeliteBrickPool.slab(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_SLAB);
        springGreenBlazeliteBrickPool.fence(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE);
        springGreenBlazeliteBrickPool.fenceGate(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE);
        springGreenBlazeliteBrickPool.wall(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_WALL);

        springGreenBlazeliteTilePool.stairs(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_STAIRS);
        springGreenBlazeliteTilePool.slab(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_SLAB);
        springGreenBlazeliteTilePool.fence(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE);
        springGreenBlazeliteTilePool.fenceGate(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE);
        springGreenBlazeliteTilePool.wall(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_WALL);
    }
    private static void generateCyanBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cyanBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cyanBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cyanBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_BLAZELITE_TILES);

        cyanBlazeliteBlockPool.stairs(ModBlocks.CYAN_BLAZELITE_STAIRS);
        cyanBlazeliteBlockPool.slab(ModBlocks.CYAN_BLAZELITE_SLAB);
        cyanBlazeliteBlockPool.button(ModBlocks.CYAN_BLAZELITE_BUTTON);
        cyanBlazeliteBlockPool.pressurePlate(ModBlocks.CYAN_BLAZELITE_PRESSURE_PLATE);
        cyanBlazeliteBlockPool.fence(ModBlocks.CYAN_BLAZELITE_FENCE);
        cyanBlazeliteBlockPool.fenceGate(ModBlocks.CYAN_BLAZELITE_FENCE_GATE);
        cyanBlazeliteBlockPool.wall(ModBlocks.CYAN_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CYAN_BLAZELITE_TRAPDOOR);

        cyanBlazeliteBrickPool.stairs(ModBlocks.CYAN_BLAZELITE_BRICK_STAIRS);
        cyanBlazeliteBrickPool.slab(ModBlocks.CYAN_BLAZELITE_BRICK_SLAB);
        cyanBlazeliteBrickPool.fence(ModBlocks.CYAN_BLAZELITE_BRICK_FENCE);
        cyanBlazeliteBrickPool.fenceGate(ModBlocks.CYAN_BLAZELITE_BRICK_FENCE_GATE);
        cyanBlazeliteBrickPool.wall(ModBlocks.CYAN_BLAZELITE_BRICK_WALL);

        cyanBlazeliteTilePool.stairs(ModBlocks.CYAN_BLAZELITE_TILE_STAIRS);
        cyanBlazeliteTilePool.slab(ModBlocks.CYAN_BLAZELITE_TILE_SLAB);
        cyanBlazeliteTilePool.fence(ModBlocks.CYAN_BLAZELITE_TILE_FENCE);
        cyanBlazeliteTilePool.fenceGate(ModBlocks.CYAN_BLAZELITE_TILE_FENCE_GATE);
        cyanBlazeliteTilePool.wall(ModBlocks.CYAN_BLAZELITE_TILE_WALL);
    }
    private static void generateCapriBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool capriBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CAPRI_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool capriBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CAPRI_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool capriBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CAPRI_BLAZELITE_TILES);

        capriBlazeliteBlockPool.stairs(ModBlocks.CAPRI_BLAZELITE_STAIRS);
        capriBlazeliteBlockPool.slab(ModBlocks.CAPRI_BLAZELITE_SLAB);
        capriBlazeliteBlockPool.button(ModBlocks.CAPRI_BLAZELITE_BUTTON);
        capriBlazeliteBlockPool.pressurePlate(ModBlocks.CAPRI_BLAZELITE_PRESSURE_PLATE);
        capriBlazeliteBlockPool.fence(ModBlocks.CAPRI_BLAZELITE_FENCE);
        capriBlazeliteBlockPool.fenceGate(ModBlocks.CAPRI_BLAZELITE_FENCE_GATE);
        capriBlazeliteBlockPool.wall(ModBlocks.CAPRI_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.CAPRI_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CAPRI_BLAZELITE_TRAPDOOR);

        capriBlazeliteBrickPool.stairs(ModBlocks.CAPRI_BLAZELITE_BRICK_STAIRS);
        capriBlazeliteBrickPool.slab(ModBlocks.CAPRI_BLAZELITE_BRICK_SLAB);
        capriBlazeliteBrickPool.fence(ModBlocks.CAPRI_BLAZELITE_BRICK_FENCE);
        capriBlazeliteBrickPool.fenceGate(ModBlocks.CAPRI_BLAZELITE_BRICK_FENCE_GATE);
        capriBlazeliteBrickPool.wall(ModBlocks.CAPRI_BLAZELITE_BRICK_WALL);

        capriBlazeliteTilePool.stairs(ModBlocks.CAPRI_BLAZELITE_TILE_STAIRS);
        capriBlazeliteTilePool.slab(ModBlocks.CAPRI_BLAZELITE_TILE_SLAB);
        capriBlazeliteTilePool.fence(ModBlocks.CAPRI_BLAZELITE_TILE_FENCE);
        capriBlazeliteTilePool.fenceGate(ModBlocks.CAPRI_BLAZELITE_TILE_FENCE_GATE);
        capriBlazeliteTilePool.wall(ModBlocks.CAPRI_BLAZELITE_TILE_WALL);
    }
    private static void generateUltramarineBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ultramarineBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ultramarineBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool ultramarineBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ULTRAMARINE_BLAZELITE_TILES);

        ultramarineBlazeliteBlockPool.stairs(ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS);
        ultramarineBlazeliteBlockPool.slab(ModBlocks.ULTRAMARINE_BLAZELITE_SLAB);
        ultramarineBlazeliteBlockPool.button(ModBlocks.ULTRAMARINE_BLAZELITE_BUTTON);
        ultramarineBlazeliteBlockPool.pressurePlate(ModBlocks.ULTRAMARINE_BLAZELITE_PRESSURE_PLATE);
        ultramarineBlazeliteBlockPool.fence(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE);
        ultramarineBlazeliteBlockPool.fenceGate(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE);
        ultramarineBlazeliteBlockPool.wall(ModBlocks.ULTRAMARINE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.ULTRAMARINE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR);

        ultramarineBlazeliteBrickPool.stairs(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_STAIRS);
        ultramarineBlazeliteBrickPool.slab(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_SLAB);
        ultramarineBlazeliteBrickPool.fence(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE);
        ultramarineBlazeliteBrickPool.fenceGate(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE);
        ultramarineBlazeliteBrickPool.wall(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_WALL);

        ultramarineBlazeliteTilePool.stairs(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_STAIRS);
        ultramarineBlazeliteTilePool.slab(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_SLAB);
        ultramarineBlazeliteTilePool.fence(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE);
        ultramarineBlazeliteTilePool.fenceGate(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE);
        ultramarineBlazeliteTilePool.wall(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_WALL);
    }
    private static void generateVioletBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool violetBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool violetBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool violetBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VIOLET_BLAZELITE_TILES);

        violetBlazeliteBlockPool.stairs(ModBlocks.VIOLET_BLAZELITE_STAIRS);
        violetBlazeliteBlockPool.slab(ModBlocks.VIOLET_BLAZELITE_SLAB);
        violetBlazeliteBlockPool.button(ModBlocks.VIOLET_BLAZELITE_BUTTON);
        violetBlazeliteBlockPool.pressurePlate(ModBlocks.VIOLET_BLAZELITE_PRESSURE_PLATE);
        violetBlazeliteBlockPool.fence(ModBlocks.VIOLET_BLAZELITE_FENCE);
        violetBlazeliteBlockPool.fenceGate(ModBlocks.VIOLET_BLAZELITE_FENCE_GATE);
        violetBlazeliteBlockPool.wall(ModBlocks.VIOLET_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.VIOLET_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.VIOLET_BLAZELITE_TRAPDOOR);

        violetBlazeliteBrickPool.stairs(ModBlocks.VIOLET_BLAZELITE_BRICK_STAIRS);
        violetBlazeliteBrickPool.slab(ModBlocks.VIOLET_BLAZELITE_BRICK_SLAB);
        violetBlazeliteBrickPool.fence(ModBlocks.VIOLET_BLAZELITE_BRICK_FENCE);
        violetBlazeliteBrickPool.fenceGate(ModBlocks.VIOLET_BLAZELITE_BRICK_FENCE_GATE);
        violetBlazeliteBrickPool.wall(ModBlocks.VIOLET_BLAZELITE_BRICK_WALL);

        violetBlazeliteTilePool.stairs(ModBlocks.VIOLET_BLAZELITE_TILE_STAIRS);
        violetBlazeliteTilePool.slab(ModBlocks.VIOLET_BLAZELITE_TILE_SLAB);
        violetBlazeliteTilePool.fence(ModBlocks.VIOLET_BLAZELITE_TILE_FENCE);
        violetBlazeliteTilePool.fenceGate(ModBlocks.VIOLET_BLAZELITE_TILE_FENCE_GATE);
        violetBlazeliteTilePool.wall(ModBlocks.VIOLET_BLAZELITE_TILE_WALL);
    }
    private static void generateMagentaBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool magentaBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool magentaBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool magentaBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_BLAZELITE_TILES);

        magentaBlazeliteBlockPool.stairs(ModBlocks.MAGENTA_BLAZELITE_STAIRS);
        magentaBlazeliteBlockPool.slab(ModBlocks.MAGENTA_BLAZELITE_SLAB);
        magentaBlazeliteBlockPool.button(ModBlocks.MAGENTA_BLAZELITE_BUTTON);
        magentaBlazeliteBlockPool.pressurePlate(ModBlocks.MAGENTA_BLAZELITE_PRESSURE_PLATE);
        magentaBlazeliteBlockPool.fence(ModBlocks.MAGENTA_BLAZELITE_FENCE);
        magentaBlazeliteBlockPool.fenceGate(ModBlocks.MAGENTA_BLAZELITE_FENCE_GATE);
        magentaBlazeliteBlockPool.wall(ModBlocks.MAGENTA_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAGENTA_BLAZELITE_TRAPDOOR);

        magentaBlazeliteBrickPool.stairs(ModBlocks.MAGENTA_BLAZELITE_BRICK_STAIRS);
        magentaBlazeliteBrickPool.slab(ModBlocks.MAGENTA_BLAZELITE_BRICK_SLAB);
        magentaBlazeliteBrickPool.fence(ModBlocks.MAGENTA_BLAZELITE_BRICK_FENCE);
        magentaBlazeliteBrickPool.fenceGate(ModBlocks.MAGENTA_BLAZELITE_BRICK_FENCE_GATE);
        magentaBlazeliteBrickPool.wall(ModBlocks.MAGENTA_BLAZELITE_BRICK_WALL);

        magentaBlazeliteTilePool.stairs(ModBlocks.MAGENTA_BLAZELITE_TILE_STAIRS);
        magentaBlazeliteTilePool.slab(ModBlocks.MAGENTA_BLAZELITE_TILE_SLAB);
        magentaBlazeliteTilePool.fence(ModBlocks.MAGENTA_BLAZELITE_TILE_FENCE);
        magentaBlazeliteTilePool.fenceGate(ModBlocks.MAGENTA_BLAZELITE_TILE_FENCE_GATE);
        magentaBlazeliteTilePool.wall(ModBlocks.MAGENTA_BLAZELITE_TILE_WALL);
    }
    private static void generatePinkBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool pinkBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool pinkBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_BLAZELITE_TILES);

        pinkBlazeliteBlockPool.stairs(ModBlocks.PINK_BLAZELITE_STAIRS);
        pinkBlazeliteBlockPool.slab(ModBlocks.PINK_BLAZELITE_SLAB);
        pinkBlazeliteBlockPool.button(ModBlocks.PINK_BLAZELITE_BUTTON);
        pinkBlazeliteBlockPool.pressurePlate(ModBlocks.PINK_BLAZELITE_PRESSURE_PLATE);
        pinkBlazeliteBlockPool.fence(ModBlocks.PINK_BLAZELITE_FENCE);
        pinkBlazeliteBlockPool.fenceGate(ModBlocks.PINK_BLAZELITE_FENCE_GATE);
        pinkBlazeliteBlockPool.wall(ModBlocks.PINK_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_BLAZELITE_TRAPDOOR);

        pinkBlazeliteBrickPool.stairs(ModBlocks.PINK_BLAZELITE_BRICK_STAIRS);
        pinkBlazeliteBrickPool.slab(ModBlocks.PINK_BLAZELITE_BRICK_SLAB);
        pinkBlazeliteBrickPool.fence(ModBlocks.PINK_BLAZELITE_BRICK_FENCE);
        pinkBlazeliteBrickPool.fenceGate(ModBlocks.PINK_BLAZELITE_BRICK_FENCE_GATE);
        pinkBlazeliteBrickPool.wall(ModBlocks.PINK_BLAZELITE_BRICK_WALL);

        pinkBlazeliteTilePool.stairs(ModBlocks.PINK_BLAZELITE_TILE_STAIRS);
        pinkBlazeliteTilePool.slab(ModBlocks.PINK_BLAZELITE_TILE_SLAB);
        pinkBlazeliteTilePool.fence(ModBlocks.PINK_BLAZELITE_TILE_FENCE);
        pinkBlazeliteTilePool.fenceGate(ModBlocks.PINK_BLAZELITE_TILE_FENCE_GATE);
        pinkBlazeliteTilePool.wall(ModBlocks.PINK_BLAZELITE_TILE_WALL);
    }
    private static void generateRoseBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool roseBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool roseBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool roseBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROSE_BLAZELITE_TILES);

        roseBlazeliteBlockPool.stairs(ModBlocks.ROSE_BLAZELITE_STAIRS);
        roseBlazeliteBlockPool.slab(ModBlocks.ROSE_BLAZELITE_SLAB);
        roseBlazeliteBlockPool.button(ModBlocks.ROSE_BLAZELITE_BUTTON);
        roseBlazeliteBlockPool.pressurePlate(ModBlocks.ROSE_BLAZELITE_PRESSURE_PLATE);
        roseBlazeliteBlockPool.fence(ModBlocks.ROSE_BLAZELITE_FENCE);
        roseBlazeliteBlockPool.fenceGate(ModBlocks.ROSE_BLAZELITE_FENCE_GATE);
        roseBlazeliteBlockPool.wall(ModBlocks.ROSE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.ROSE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ROSE_BLAZELITE_TRAPDOOR);

        roseBlazeliteBrickPool.stairs(ModBlocks.ROSE_BLAZELITE_BRICK_STAIRS);
        roseBlazeliteBrickPool.slab(ModBlocks.ROSE_BLAZELITE_BRICK_SLAB);
        roseBlazeliteBrickPool.fence(ModBlocks.ROSE_BLAZELITE_BRICK_FENCE);
        roseBlazeliteBrickPool.fenceGate(ModBlocks.ROSE_BLAZELITE_BRICK_FENCE_GATE);
        roseBlazeliteBrickPool.wall(ModBlocks.ROSE_BLAZELITE_BRICK_WALL);

        roseBlazeliteTilePool.stairs(ModBlocks.ROSE_BLAZELITE_TILE_STAIRS);
        roseBlazeliteTilePool.slab(ModBlocks.ROSE_BLAZELITE_TILE_SLAB);
        roseBlazeliteTilePool.fence(ModBlocks.ROSE_BLAZELITE_TILE_FENCE);
        roseBlazeliteTilePool.fenceGate(ModBlocks.ROSE_BLAZELITE_TILE_FENCE_GATE);
        roseBlazeliteTilePool.wall(ModBlocks.ROSE_BLAZELITE_TILE_WALL);
    }


}
