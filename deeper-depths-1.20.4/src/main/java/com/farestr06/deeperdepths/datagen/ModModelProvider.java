package com.farestr06.deeperdepths.datagen;

import com.farestr06.deeperdepths.block.BlazeliteBlocks;
import com.farestr06.deeperdepths.block.ModBlocks;
import com.farestr06.deeperdepths.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUL_SILT);
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

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FOSSIL_SLIME, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRIMORDIAL_SLIME_SPAWN_EGG, new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
    }

    private static void generateBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool blazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool blazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.BLAZELITE_TILES);

        blazeliteBlockPool.stairs(BlazeliteBlocks.BLAZELITE_STAIRS);
        blazeliteBlockPool.slab(BlazeliteBlocks.BLAZELITE_SLAB);
        blazeliteBlockPool.button(BlazeliteBlocks.BLAZELITE_BUTTON);
        blazeliteBlockPool.pressurePlate(BlazeliteBlocks.BLAZELITE_PRESSURE_PLATE);
        blazeliteBlockPool.fence(BlazeliteBlocks.BLAZELITE_FENCE);
        blazeliteBlockPool.fenceGate(BlazeliteBlocks.BLAZELITE_FENCE_GATE);
        blazeliteBlockPool.wall(BlazeliteBlocks.BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.BLAZELITE_TRAPDOOR);

        blazeliteBrickPool.stairs(BlazeliteBlocks.BLAZELITE_BRICK_STAIRS);
        blazeliteBrickPool.slab(BlazeliteBlocks.BLAZELITE_BRICK_SLAB);
        blazeliteBrickPool.fence(BlazeliteBlocks.BLAZELITE_BRICK_FENCE);
        blazeliteBrickPool.fenceGate(BlazeliteBlocks.BLAZELITE_BRICK_FENCE_GATE);
        blazeliteBrickPool.wall(BlazeliteBlocks.BLAZELITE_BRICK_WALL);

        blazeliteTilePool.stairs(BlazeliteBlocks.BLAZELITE_TILE_STAIRS);
        blazeliteTilePool.slab(BlazeliteBlocks.BLAZELITE_TILE_SLAB);
        blazeliteTilePool.fence(BlazeliteBlocks.BLAZELITE_TILE_FENCE);
        blazeliteTilePool.fenceGate(BlazeliteBlocks.BLAZELITE_TILE_FENCE_GATE);
        blazeliteTilePool.wall(BlazeliteBlocks.BLAZELITE_TILE_WALL);
    }
    private static void generateWhiteBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.WHITE_BLAZELITE_TILES);

        lightGrayBlazeliteBlockPool.stairs(BlazeliteBlocks.WHITE_BLAZELITE_STAIRS);
        lightGrayBlazeliteBlockPool.slab(BlazeliteBlocks.WHITE_BLAZELITE_SLAB);
        lightGrayBlazeliteBlockPool.button(BlazeliteBlocks.WHITE_BLAZELITE_BUTTON);
        lightGrayBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.WHITE_BLAZELITE_PRESSURE_PLATE);
        lightGrayBlazeliteBlockPool.fence(BlazeliteBlocks.WHITE_BLAZELITE_FENCE);
        lightGrayBlazeliteBlockPool.fenceGate(BlazeliteBlocks.WHITE_BLAZELITE_FENCE_GATE);
        lightGrayBlazeliteBlockPool.wall(BlazeliteBlocks.WHITE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.WHITE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.WHITE_BLAZELITE_TRAPDOOR);

        lightGrayBlazeliteBrickPool.stairs(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_STAIRS);
        lightGrayBlazeliteBrickPool.slab(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_SLAB);
        lightGrayBlazeliteBrickPool.fence(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_FENCE);
        lightGrayBlazeliteBrickPool.fenceGate(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_FENCE_GATE);
        lightGrayBlazeliteBrickPool.wall(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_WALL);

        lightGrayBlazeliteTilePool.stairs(BlazeliteBlocks.WHITE_BLAZELITE_TILE_STAIRS);
        lightGrayBlazeliteTilePool.slab(BlazeliteBlocks.WHITE_BLAZELITE_TILE_SLAB);
        lightGrayBlazeliteTilePool.fence(BlazeliteBlocks.WHITE_BLAZELITE_TILE_FENCE);
        lightGrayBlazeliteTilePool.fenceGate(BlazeliteBlocks.WHITE_BLAZELITE_TILE_FENCE_GATE);
        lightGrayBlazeliteTilePool.wall(BlazeliteBlocks.WHITE_BLAZELITE_TILE_WALL);
    }
    private static void generateLightGrayBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lightGrayBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES);

        lightGrayBlazeliteBlockPool.stairs(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS);
        lightGrayBlazeliteBlockPool.slab(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_SLAB);
        lightGrayBlazeliteBlockPool.button(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BUTTON);
        lightGrayBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE);
        lightGrayBlazeliteBlockPool.fence(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE);
        lightGrayBlazeliteBlockPool.fenceGate(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE);
        lightGrayBlazeliteBlockPool.wall(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR);

        lightGrayBlazeliteBrickPool.stairs(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_STAIRS);
        lightGrayBlazeliteBrickPool.slab(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_SLAB);
        lightGrayBlazeliteBrickPool.fence(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE);
        lightGrayBlazeliteBrickPool.fenceGate(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE);
        lightGrayBlazeliteBrickPool.wall(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_WALL);

        lightGrayBlazeliteTilePool.stairs(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_STAIRS);
        lightGrayBlazeliteTilePool.slab(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_SLAB);
        lightGrayBlazeliteTilePool.fence(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE);
        lightGrayBlazeliteTilePool.fenceGate(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE);
        lightGrayBlazeliteTilePool.wall(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_WALL);
    }
    private static void generateDarkGrayBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool darkGrayBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool darkGrayBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkGrayBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES);

        darkGrayBlazeliteBlockPool.stairs(BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS);
        darkGrayBlazeliteBlockPool.slab(BlazeliteBlocks.DARK_GRAY_BLAZELITE_SLAB);
        darkGrayBlazeliteBlockPool.button(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BUTTON);
        darkGrayBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.DARK_GRAY_BLAZELITE_PRESSURE_PLATE);
        darkGrayBlazeliteBlockPool.fence(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE);
        darkGrayBlazeliteBlockPool.fenceGate(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE);
        darkGrayBlazeliteBlockPool.wall(BlazeliteBlocks.DARK_GRAY_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.DARK_GRAY_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR);

        darkGrayBlazeliteBrickPool.stairs(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_STAIRS);
        darkGrayBlazeliteBrickPool.slab(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_SLAB);
        darkGrayBlazeliteBrickPool.fence(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE);
        darkGrayBlazeliteBrickPool.fenceGate(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE);
        darkGrayBlazeliteBrickPool.wall(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_WALL);

        darkGrayBlazeliteTilePool.stairs(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_STAIRS);
        darkGrayBlazeliteTilePool.slab(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_SLAB);
        darkGrayBlazeliteTilePool.fence(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE);
        darkGrayBlazeliteTilePool.fenceGate(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE_GATE);
        darkGrayBlazeliteTilePool.wall(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_WALL);
    }
    private static void generateRedBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool redBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.RED_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool redBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.RED_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.RED_BLAZELITE_TILES);

        redBlazeliteBlockPool.stairs(BlazeliteBlocks.RED_BLAZELITE_STAIRS);
        redBlazeliteBlockPool.slab(BlazeliteBlocks.RED_BLAZELITE_SLAB);
        redBlazeliteBlockPool.button(BlazeliteBlocks.RED_BLAZELITE_BUTTON);
        redBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.RED_BLAZELITE_PRESSURE_PLATE);
        redBlazeliteBlockPool.fence(BlazeliteBlocks.RED_BLAZELITE_FENCE);
        redBlazeliteBlockPool.fenceGate(BlazeliteBlocks.RED_BLAZELITE_FENCE_GATE);
        redBlazeliteBlockPool.wall(BlazeliteBlocks.RED_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.RED_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.RED_BLAZELITE_TRAPDOOR);

        redBlazeliteBrickPool.stairs(BlazeliteBlocks.RED_BLAZELITE_BRICK_STAIRS);
        redBlazeliteBrickPool.slab(BlazeliteBlocks.RED_BLAZELITE_BRICK_SLAB);
        redBlazeliteBrickPool.fence(BlazeliteBlocks.RED_BLAZELITE_BRICK_FENCE);
        redBlazeliteBrickPool.fenceGate(BlazeliteBlocks.RED_BLAZELITE_BRICK_FENCE_GATE);
        redBlazeliteBrickPool.wall(BlazeliteBlocks.RED_BLAZELITE_BRICK_WALL);

        redBlazeliteTilePool.stairs(BlazeliteBlocks.RED_BLAZELITE_TILE_STAIRS);
        redBlazeliteTilePool.slab(BlazeliteBlocks.RED_BLAZELITE_TILE_SLAB);
        redBlazeliteTilePool.fence(BlazeliteBlocks.RED_BLAZELITE_TILE_FENCE);
        redBlazeliteTilePool.fenceGate(BlazeliteBlocks.RED_BLAZELITE_TILE_FENCE_GATE);
        redBlazeliteTilePool.wall(BlazeliteBlocks.RED_BLAZELITE_TILE_WALL);
    }
    private static void generateOrangeBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool orangeBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool orangeBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool orangeBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ORANGE_BLAZELITE_TILES);

        orangeBlazeliteBlockPool.stairs(BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS);
        orangeBlazeliteBlockPool.slab(BlazeliteBlocks.ORANGE_BLAZELITE_SLAB);
        orangeBlazeliteBlockPool.button(BlazeliteBlocks.ORANGE_BLAZELITE_BUTTON);
        orangeBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.ORANGE_BLAZELITE_PRESSURE_PLATE);
        orangeBlazeliteBlockPool.fence(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE);
        orangeBlazeliteBlockPool.fenceGate(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE_GATE);
        orangeBlazeliteBlockPool.wall(BlazeliteBlocks.ORANGE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.ORANGE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.ORANGE_BLAZELITE_TRAPDOOR);

        orangeBlazeliteBrickPool.stairs(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_STAIRS);
        orangeBlazeliteBrickPool.slab(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_SLAB);
        orangeBlazeliteBrickPool.fence(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_FENCE);
        orangeBlazeliteBrickPool.fenceGate(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_FENCE_GATE);
        orangeBlazeliteBrickPool.wall(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_WALL);

        orangeBlazeliteTilePool.stairs(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_STAIRS);
        orangeBlazeliteTilePool.slab(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_SLAB);
        orangeBlazeliteTilePool.fence(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_FENCE);
        orangeBlazeliteTilePool.fenceGate(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_FENCE_GATE);
        orangeBlazeliteTilePool.wall(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_WALL);
    }
    private static void generateYellowBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool yellowBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool yellowBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool yellowBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.YELLOW_BLAZELITE_TILES);

        yellowBlazeliteBlockPool.stairs(BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS);
        yellowBlazeliteBlockPool.slab(BlazeliteBlocks.YELLOW_BLAZELITE_SLAB);
        yellowBlazeliteBlockPool.button(BlazeliteBlocks.YELLOW_BLAZELITE_BUTTON);
        yellowBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.YELLOW_BLAZELITE_PRESSURE_PLATE);
        yellowBlazeliteBlockPool.fence(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE);
        yellowBlazeliteBlockPool.fenceGate(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE_GATE);
        yellowBlazeliteBlockPool.wall(BlazeliteBlocks.YELLOW_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.YELLOW_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.YELLOW_BLAZELITE_TRAPDOOR);

        yellowBlazeliteBrickPool.stairs(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_STAIRS);
        yellowBlazeliteBrickPool.slab(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_SLAB);
        yellowBlazeliteBrickPool.fence(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_FENCE);
        yellowBlazeliteBrickPool.fenceGate(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_FENCE_GATE);
        yellowBlazeliteBrickPool.wall(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_WALL);

        yellowBlazeliteTilePool.stairs(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_STAIRS);
        yellowBlazeliteTilePool.slab(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_SLAB);
        yellowBlazeliteTilePool.fence(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_FENCE);
        yellowBlazeliteTilePool.fenceGate(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_FENCE_GATE);
        yellowBlazeliteTilePool.wall(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_WALL);
    }
    private static void generateChartreuseBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool chartreuseBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool chartreuseBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool chartreuseBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES);

        chartreuseBlazeliteBlockPool.stairs(BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS);
        chartreuseBlazeliteBlockPool.slab(BlazeliteBlocks.CHARTREUSE_BLAZELITE_SLAB);
        chartreuseBlazeliteBlockPool.button(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BUTTON);
        chartreuseBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.CHARTREUSE_BLAZELITE_PRESSURE_PLATE);
        chartreuseBlazeliteBlockPool.fence(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE);
        chartreuseBlazeliteBlockPool.fenceGate(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE);
        chartreuseBlazeliteBlockPool.wall(BlazeliteBlocks.CHARTREUSE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.CHARTREUSE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR);

        chartreuseBlazeliteBrickPool.stairs(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_STAIRS);
        chartreuseBlazeliteBrickPool.slab(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_SLAB);
        chartreuseBlazeliteBrickPool.fence(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE);
        chartreuseBlazeliteBrickPool.fenceGate(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE);
        chartreuseBlazeliteBrickPool.wall(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_WALL);

        chartreuseBlazeliteTilePool.stairs(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_STAIRS);
        chartreuseBlazeliteTilePool.slab(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_SLAB);
        chartreuseBlazeliteTilePool.fence(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE);
        chartreuseBlazeliteTilePool.fenceGate(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE_GATE);
        chartreuseBlazeliteTilePool.wall(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_WALL);
    }
    private static void generateGreenBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool greenBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool greenBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool greenBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.GREEN_BLAZELITE_TILES);

        greenBlazeliteBlockPool.stairs(BlazeliteBlocks.GREEN_BLAZELITE_STAIRS);
        greenBlazeliteBlockPool.slab(BlazeliteBlocks.GREEN_BLAZELITE_SLAB);
        greenBlazeliteBlockPool.button(BlazeliteBlocks.GREEN_BLAZELITE_BUTTON);
        greenBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.GREEN_BLAZELITE_PRESSURE_PLATE);
        greenBlazeliteBlockPool.fence(BlazeliteBlocks.GREEN_BLAZELITE_FENCE);
        greenBlazeliteBlockPool.fenceGate(BlazeliteBlocks.GREEN_BLAZELITE_FENCE_GATE);
        greenBlazeliteBlockPool.wall(BlazeliteBlocks.GREEN_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.GREEN_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.GREEN_BLAZELITE_TRAPDOOR);

        greenBlazeliteBrickPool.stairs(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_STAIRS);
        greenBlazeliteBrickPool.slab(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_SLAB);
        greenBlazeliteBrickPool.fence(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_FENCE);
        greenBlazeliteBrickPool.fenceGate(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_FENCE_GATE);
        greenBlazeliteBrickPool.wall(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_WALL);

        greenBlazeliteTilePool.stairs(BlazeliteBlocks.GREEN_BLAZELITE_TILE_STAIRS);
        greenBlazeliteTilePool.slab(BlazeliteBlocks.GREEN_BLAZELITE_TILE_SLAB);
        greenBlazeliteTilePool.fence(BlazeliteBlocks.GREEN_BLAZELITE_TILE_FENCE);
        greenBlazeliteTilePool.fenceGate(BlazeliteBlocks.GREEN_BLAZELITE_TILE_FENCE_GATE);
        greenBlazeliteTilePool.wall(BlazeliteBlocks.GREEN_BLAZELITE_TILE_WALL);
    }
    private static void generateSpringGreenBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool springGreenBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool springGreenBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool springGreenBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES);

        springGreenBlazeliteBlockPool.stairs(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS);
        springGreenBlazeliteBlockPool.slab(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_SLAB);
        springGreenBlazeliteBlockPool.button(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BUTTON);
        springGreenBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_PRESSURE_PLATE);
        springGreenBlazeliteBlockPool.fence(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE);
        springGreenBlazeliteBlockPool.fenceGate(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE);
        springGreenBlazeliteBlockPool.wall(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR);

        springGreenBlazeliteBrickPool.stairs(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_STAIRS);
        springGreenBlazeliteBrickPool.slab(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_SLAB);
        springGreenBlazeliteBrickPool.fence(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE);
        springGreenBlazeliteBrickPool.fenceGate(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE);
        springGreenBlazeliteBrickPool.wall(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_WALL);

        springGreenBlazeliteTilePool.stairs(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_STAIRS);
        springGreenBlazeliteTilePool.slab(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_SLAB);
        springGreenBlazeliteTilePool.fence(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE);
        springGreenBlazeliteTilePool.fenceGate(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE);
        springGreenBlazeliteTilePool.wall(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_WALL);
    }
    private static void generateCyanBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool cyanBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cyanBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool cyanBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CYAN_BLAZELITE_TILES);

        cyanBlazeliteBlockPool.stairs(BlazeliteBlocks.CYAN_BLAZELITE_STAIRS);
        cyanBlazeliteBlockPool.slab(BlazeliteBlocks.CYAN_BLAZELITE_SLAB);
        cyanBlazeliteBlockPool.button(BlazeliteBlocks.CYAN_BLAZELITE_BUTTON);
        cyanBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.CYAN_BLAZELITE_PRESSURE_PLATE);
        cyanBlazeliteBlockPool.fence(BlazeliteBlocks.CYAN_BLAZELITE_FENCE);
        cyanBlazeliteBlockPool.fenceGate(BlazeliteBlocks.CYAN_BLAZELITE_FENCE_GATE);
        cyanBlazeliteBlockPool.wall(BlazeliteBlocks.CYAN_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.CYAN_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.CYAN_BLAZELITE_TRAPDOOR);

        cyanBlazeliteBrickPool.stairs(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_STAIRS);
        cyanBlazeliteBrickPool.slab(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_SLAB);
        cyanBlazeliteBrickPool.fence(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_FENCE);
        cyanBlazeliteBrickPool.fenceGate(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_FENCE_GATE);
        cyanBlazeliteBrickPool.wall(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_WALL);

        cyanBlazeliteTilePool.stairs(BlazeliteBlocks.CYAN_BLAZELITE_TILE_STAIRS);
        cyanBlazeliteTilePool.slab(BlazeliteBlocks.CYAN_BLAZELITE_TILE_SLAB);
        cyanBlazeliteTilePool.fence(BlazeliteBlocks.CYAN_BLAZELITE_TILE_FENCE);
        cyanBlazeliteTilePool.fenceGate(BlazeliteBlocks.CYAN_BLAZELITE_TILE_FENCE_GATE);
        cyanBlazeliteTilePool.wall(BlazeliteBlocks.CYAN_BLAZELITE_TILE_WALL);
    }
    private static void generateCapriBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool capriBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool capriBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool capriBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.CAPRI_BLAZELITE_TILES);

        capriBlazeliteBlockPool.stairs(BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS);
        capriBlazeliteBlockPool.slab(BlazeliteBlocks.CAPRI_BLAZELITE_SLAB);
        capriBlazeliteBlockPool.button(BlazeliteBlocks.CAPRI_BLAZELITE_BUTTON);
        capriBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.CAPRI_BLAZELITE_PRESSURE_PLATE);
        capriBlazeliteBlockPool.fence(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE);
        capriBlazeliteBlockPool.fenceGate(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE_GATE);
        capriBlazeliteBlockPool.wall(BlazeliteBlocks.CAPRI_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.CAPRI_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.CAPRI_BLAZELITE_TRAPDOOR);

        capriBlazeliteBrickPool.stairs(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_STAIRS);
        capriBlazeliteBrickPool.slab(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_SLAB);
        capriBlazeliteBrickPool.fence(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_FENCE);
        capriBlazeliteBrickPool.fenceGate(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_FENCE_GATE);
        capriBlazeliteBrickPool.wall(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_WALL);

        capriBlazeliteTilePool.stairs(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_STAIRS);
        capriBlazeliteTilePool.slab(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_SLAB);
        capriBlazeliteTilePool.fence(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_FENCE);
        capriBlazeliteTilePool.fenceGate(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_FENCE_GATE);
        capriBlazeliteTilePool.wall(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_WALL);
    }
    private static void generateUltramarineBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ultramarineBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ultramarineBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool ultramarineBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES);

        ultramarineBlazeliteBlockPool.stairs(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS);
        ultramarineBlazeliteBlockPool.slab(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_SLAB);
        ultramarineBlazeliteBlockPool.button(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BUTTON);
        ultramarineBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_PRESSURE_PLATE);
        ultramarineBlazeliteBlockPool.fence(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE);
        ultramarineBlazeliteBlockPool.fenceGate(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE);
        ultramarineBlazeliteBlockPool.wall(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR);

        ultramarineBlazeliteBrickPool.stairs(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_STAIRS);
        ultramarineBlazeliteBrickPool.slab(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_SLAB);
        ultramarineBlazeliteBrickPool.fence(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE);
        ultramarineBlazeliteBrickPool.fenceGate(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE);
        ultramarineBlazeliteBrickPool.wall(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_WALL);

        ultramarineBlazeliteTilePool.stairs(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_STAIRS);
        ultramarineBlazeliteTilePool.slab(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_SLAB);
        ultramarineBlazeliteTilePool.fence(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE);
        ultramarineBlazeliteTilePool.fenceGate(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE);
        ultramarineBlazeliteTilePool.wall(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_WALL);
    }
    private static void generateVioletBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool violetBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool violetBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool violetBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.VIOLET_BLAZELITE_TILES);

        violetBlazeliteBlockPool.stairs(BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS);
        violetBlazeliteBlockPool.slab(BlazeliteBlocks.VIOLET_BLAZELITE_SLAB);
        violetBlazeliteBlockPool.button(BlazeliteBlocks.VIOLET_BLAZELITE_BUTTON);
        violetBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.VIOLET_BLAZELITE_PRESSURE_PLATE);
        violetBlazeliteBlockPool.fence(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE);
        violetBlazeliteBlockPool.fenceGate(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE_GATE);
        violetBlazeliteBlockPool.wall(BlazeliteBlocks.VIOLET_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.VIOLET_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.VIOLET_BLAZELITE_TRAPDOOR);

        violetBlazeliteBrickPool.stairs(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_STAIRS);
        violetBlazeliteBrickPool.slab(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_SLAB);
        violetBlazeliteBrickPool.fence(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_FENCE);
        violetBlazeliteBrickPool.fenceGate(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_FENCE_GATE);
        violetBlazeliteBrickPool.wall(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_WALL);

        violetBlazeliteTilePool.stairs(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_STAIRS);
        violetBlazeliteTilePool.slab(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_SLAB);
        violetBlazeliteTilePool.fence(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_FENCE);
        violetBlazeliteTilePool.fenceGate(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_FENCE_GATE);
        violetBlazeliteTilePool.wall(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_WALL);
    }
    private static void generateMagentaBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool magentaBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool magentaBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool magentaBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES);

        magentaBlazeliteBlockPool.stairs(BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS);
        magentaBlazeliteBlockPool.slab(BlazeliteBlocks.MAGENTA_BLAZELITE_SLAB);
        magentaBlazeliteBlockPool.button(BlazeliteBlocks.MAGENTA_BLAZELITE_BUTTON);
        magentaBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.MAGENTA_BLAZELITE_PRESSURE_PLATE);
        magentaBlazeliteBlockPool.fence(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE);
        magentaBlazeliteBlockPool.fenceGate(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE_GATE);
        magentaBlazeliteBlockPool.wall(BlazeliteBlocks.MAGENTA_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.MAGENTA_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.MAGENTA_BLAZELITE_TRAPDOOR);

        magentaBlazeliteBrickPool.stairs(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_STAIRS);
        magentaBlazeliteBrickPool.slab(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_SLAB);
        magentaBlazeliteBrickPool.fence(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_FENCE);
        magentaBlazeliteBrickPool.fenceGate(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_FENCE_GATE);
        magentaBlazeliteBrickPool.wall(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_WALL);

        magentaBlazeliteTilePool.stairs(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_STAIRS);
        magentaBlazeliteTilePool.slab(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_SLAB);
        magentaBlazeliteTilePool.fence(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_FENCE);
        magentaBlazeliteTilePool.fenceGate(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_FENCE_GATE);
        magentaBlazeliteTilePool.wall(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_WALL);
    }
    private static void generatePinkBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.PINK_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool pinkBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.PINK_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool pinkBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.PINK_BLAZELITE_TILES);

        pinkBlazeliteBlockPool.stairs(BlazeliteBlocks.PINK_BLAZELITE_STAIRS);
        pinkBlazeliteBlockPool.slab(BlazeliteBlocks.PINK_BLAZELITE_SLAB);
        pinkBlazeliteBlockPool.button(BlazeliteBlocks.PINK_BLAZELITE_BUTTON);
        pinkBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.PINK_BLAZELITE_PRESSURE_PLATE);
        pinkBlazeliteBlockPool.fence(BlazeliteBlocks.PINK_BLAZELITE_FENCE);
        pinkBlazeliteBlockPool.fenceGate(BlazeliteBlocks.PINK_BLAZELITE_FENCE_GATE);
        pinkBlazeliteBlockPool.wall(BlazeliteBlocks.PINK_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.PINK_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.PINK_BLAZELITE_TRAPDOOR);

        pinkBlazeliteBrickPool.stairs(BlazeliteBlocks.PINK_BLAZELITE_BRICK_STAIRS);
        pinkBlazeliteBrickPool.slab(BlazeliteBlocks.PINK_BLAZELITE_BRICK_SLAB);
        pinkBlazeliteBrickPool.fence(BlazeliteBlocks.PINK_BLAZELITE_BRICK_FENCE);
        pinkBlazeliteBrickPool.fenceGate(BlazeliteBlocks.PINK_BLAZELITE_BRICK_FENCE_GATE);
        pinkBlazeliteBrickPool.wall(BlazeliteBlocks.PINK_BLAZELITE_BRICK_WALL);

        pinkBlazeliteTilePool.stairs(BlazeliteBlocks.PINK_BLAZELITE_TILE_STAIRS);
        pinkBlazeliteTilePool.slab(BlazeliteBlocks.PINK_BLAZELITE_TILE_SLAB);
        pinkBlazeliteTilePool.fence(BlazeliteBlocks.PINK_BLAZELITE_TILE_FENCE);
        pinkBlazeliteTilePool.fenceGate(BlazeliteBlocks.PINK_BLAZELITE_TILE_FENCE_GATE);
        pinkBlazeliteTilePool.wall(BlazeliteBlocks.PINK_BLAZELITE_TILE_WALL);
    }
    private static void generateRoseBlazeliteModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool roseBlazeliteBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool roseBlazeliteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool roseBlazeliteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlazeliteBlocks.ROSE_BLAZELITE_TILES);

        roseBlazeliteBlockPool.stairs(BlazeliteBlocks.ROSE_BLAZELITE_STAIRS);
        roseBlazeliteBlockPool.slab(BlazeliteBlocks.ROSE_BLAZELITE_SLAB);
        roseBlazeliteBlockPool.button(BlazeliteBlocks.ROSE_BLAZELITE_BUTTON);
        roseBlazeliteBlockPool.pressurePlate(BlazeliteBlocks.ROSE_BLAZELITE_PRESSURE_PLATE);
        roseBlazeliteBlockPool.fence(BlazeliteBlocks.ROSE_BLAZELITE_FENCE);
        roseBlazeliteBlockPool.fenceGate(BlazeliteBlocks.ROSE_BLAZELITE_FENCE_GATE);
        roseBlazeliteBlockPool.wall(BlazeliteBlocks.ROSE_BLAZELITE_WALL);
        blockStateModelGenerator.registerDoor(BlazeliteBlocks.ROSE_BLAZELITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlazeliteBlocks.ROSE_BLAZELITE_TRAPDOOR);

        roseBlazeliteBrickPool.stairs(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_STAIRS);
        roseBlazeliteBrickPool.slab(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_SLAB);
        roseBlazeliteBrickPool.fence(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_FENCE);
        roseBlazeliteBrickPool.fenceGate(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_FENCE_GATE);
        roseBlazeliteBrickPool.wall(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_WALL);

        roseBlazeliteTilePool.stairs(BlazeliteBlocks.ROSE_BLAZELITE_TILE_STAIRS);
        roseBlazeliteTilePool.slab(BlazeliteBlocks.ROSE_BLAZELITE_TILE_SLAB);
        roseBlazeliteTilePool.fence(BlazeliteBlocks.ROSE_BLAZELITE_TILE_FENCE);
        roseBlazeliteTilePool.fenceGate(BlazeliteBlocks.ROSE_BLAZELITE_TILE_FENCE_GATE);
        roseBlazeliteTilePool.wall(BlazeliteBlocks.ROSE_BLAZELITE_TILE_WALL);
    }
}
