package com.farestr06.deeperdepths.item;

import com.farestr06.deeperdepths.DeeperDepths;
import com.farestr06.deeperdepths.block.BlazeliteBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final ItemGroup BLAZELITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            DeeperDepths.makeId("blazelite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.deeper-depths.blazelite"))
                    .icon(() -> new ItemStack(ModItems.BLAZELITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLAZELITE_INGOT);
                        entries.add(ModItems.WHITE_PIGMENT);
                        entries.add(ModItems.LIGHT_GRAY_PIGMENT);
                        entries.add(ModItems.DARK_GRAY_PIGMENT);
                        entries.add(ModItems.RED_PIGMENT);
                        entries.add(ModItems.ORANGE_PIGMENT);
                        entries.add(ModItems.YELLOW_PIGMENT);
                        entries.add(ModItems.CHARTREUSE_PIGMENT);
                        entries.add(ModItems.GREEN_PIGMENT);
                        entries.add(ModItems.SPRING_GREEN_PIGMENT);
                        entries.add(ModItems.CYAN_PIGMENT);
                        entries.add(ModItems.CAPRI_PIGMENT);
                        entries.add(ModItems.ULTRAMARINE_PIGMENT);
                        entries.add(ModItems.VIOLET_PIGMENT);
                        entries.add(ModItems.MAGENTA_PIGMENT);
                        entries.add(ModItems.PINK_PIGMENT);
                        entries.add(ModItems.ROSE_PIGMENT);

                        entries.add(BlazeliteBlocks.BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.RED_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.PINK_BLAZELITE_TILE_WALL);

                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_SLAB);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_STAIRS);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_DOOR);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_TRAPDOOR);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_FENCE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_WALL);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BUTTON);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_PRESSURE_PLATE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_SLAB);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_STAIRS);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_FENCE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_WALL);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_SLAB);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_STAIRS);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_FENCE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_FENCE_GATE);
                        entries.add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_WALL);

                    }).build());

    public static void registerItemGroups() {
        DeeperDepths.LOGGER.info("Go go gadget " + DeeperDepths.MOD_ID + ":registerItemGroups!");
    }
}