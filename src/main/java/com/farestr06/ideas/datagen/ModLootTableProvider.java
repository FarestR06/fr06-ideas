package com.farestr06.ideas.datagen;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.block.custom.OakSaplingCropBlock;
import com.farestr06.ideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addBlazeliteBlockDrops();
        addWhiteBlazeliteBlockDrops();
        addLightGrayBlazeliteBlockDrops();
        addDarkGrayBlazeliteBlockDrops();
        addRedBlazeliteBlockDrops();
        addOrangeBlazeliteBlockDrops();
        addYellowBlazeliteBlockDrops();
        addChartreuseBlazeliteBlockDrops();
        addGreenBlazeliteBlockDrops();
        addSpringGreenBlazeliteBlockDrops();
        addCyanBlazeliteBlockDrops();
        addCapriBlazeliteBlockDrops();
        addUltramarineBlazeliteBlockDrops();
        addVioletBlazeliteBlockDrops();
        addMagentaBlazeliteBlockDrops();
        addPinkBlazeliteBlockDrops();
        addRoseBlazeliteBlockDrops();
        addDrop(ModBlocks.OILY_DEEPSLATE, PlentifulOreDrops(ModBlocks.OILY_DEEPSLATE, ModItems.OIL_BALL, 1.0f, 4.0f));

        BlockStatePropertyLootCondition.Builder oakSaplingBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.OAK_SAPLING_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(OakSaplingCropBlock.AGE, 3));
        addDrop(ModBlocks.OAK_SAPLING_CROP, cropDrops(ModBlocks.OAK_SAPLING_CROP, Items.OAK_SAPLING, ModItems.ACORN, oakSaplingBuilder));
        addDrop(ModBlocks.OAK_SAPLING_CROP, cropDrops(ModBlocks.OAK_SAPLING_CROP, Items.OAK_SAPLING, ModItems.ACORN, oakSaplingBuilder));

    }

    private void addRoseBlazeliteBlockDrops() {
        addDrop(ModBlocks.ROSE_BLAZELITE_BLOCK);
        addDrop(ModBlocks.ROSE_BLAZELITE_SLAB, slabDrops(ModBlocks.ROSE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ROSE_BLAZELITE_STAIRS);
        addDrop(ModBlocks.ROSE_BLAZELITE_DOOR, doorDrops(ModBlocks.ROSE_BLAZELITE_DOOR));
        addDrop(ModBlocks.ROSE_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.ROSE_BLAZELITE_FENCE);
        addDrop(ModBlocks.ROSE_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.ROSE_BLAZELITE_WALL);
        addDrop(ModBlocks.ROSE_BLAZELITE_BUTTON);
        addDrop(ModBlocks.ROSE_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.ROSE_BLAZELITE_BRICKS);
        addDrop(ModBlocks.ROSE_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.ROSE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ROSE_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.ROSE_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.ROSE_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.ROSE_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.ROSE_BLAZELITE_TILES);
        addDrop(ModBlocks.ROSE_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.ROSE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ROSE_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.ROSE_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.ROSE_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.ROSE_BLAZELITE_TILE_WALL);
    }

    private void addPinkBlazeliteBlockDrops() {
        addDrop(ModBlocks.PINK_BLAZELITE_BLOCK);
        addDrop(ModBlocks.PINK_BLAZELITE_SLAB, slabDrops(ModBlocks.PINK_BLAZELITE_SLAB));
        addDrop(ModBlocks.PINK_BLAZELITE_STAIRS);
        addDrop(ModBlocks.PINK_BLAZELITE_DOOR, doorDrops(ModBlocks.PINK_BLAZELITE_DOOR));
        addDrop(ModBlocks.PINK_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.PINK_BLAZELITE_FENCE);
        addDrop(ModBlocks.PINK_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.PINK_BLAZELITE_WALL);
        addDrop(ModBlocks.PINK_BLAZELITE_BUTTON);
        addDrop(ModBlocks.PINK_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_BLAZELITE_BRICKS);
        addDrop(ModBlocks.PINK_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.PINK_BLAZELITE_SLAB));
        addDrop(ModBlocks.PINK_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.PINK_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.PINK_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.PINK_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.PINK_BLAZELITE_TILES);
        addDrop(ModBlocks.PINK_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.PINK_BLAZELITE_SLAB));
        addDrop(ModBlocks.PINK_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.PINK_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.PINK_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.PINK_BLAZELITE_TILE_WALL);
    }

    private void addMagentaBlazeliteBlockDrops() {
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BLOCK);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_SLAB, slabDrops(ModBlocks.MAGENTA_BLAZELITE_SLAB));
        addDrop(ModBlocks.MAGENTA_BLAZELITE_STAIRS);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_DOOR, doorDrops(ModBlocks.MAGENTA_BLAZELITE_DOOR));
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_FENCE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_WALL);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BUTTON);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BRICKS);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.MAGENTA_BLAZELITE_SLAB));
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TILES);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.MAGENTA_BLAZELITE_SLAB));
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_BLAZELITE_TILE_WALL);
    }

    private void addVioletBlazeliteBlockDrops() {
        addDrop(ModBlocks.VIOLET_BLAZELITE_BLOCK);
        addDrop(ModBlocks.VIOLET_BLAZELITE_SLAB, slabDrops(ModBlocks.VIOLET_BLAZELITE_SLAB));
        addDrop(ModBlocks.VIOLET_BLAZELITE_STAIRS);
        addDrop(ModBlocks.VIOLET_BLAZELITE_DOOR, doorDrops(ModBlocks.VIOLET_BLAZELITE_DOOR));
        addDrop(ModBlocks.VIOLET_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.VIOLET_BLAZELITE_FENCE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_WALL);
        addDrop(ModBlocks.VIOLET_BLAZELITE_BUTTON);
        addDrop(ModBlocks.VIOLET_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_BRICKS);
        addDrop(ModBlocks.VIOLET_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.VIOLET_BLAZELITE_SLAB));
        addDrop(ModBlocks.VIOLET_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.VIOLET_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.VIOLET_BLAZELITE_TILES);
        addDrop(ModBlocks.VIOLET_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.VIOLET_BLAZELITE_SLAB));
        addDrop(ModBlocks.VIOLET_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.VIOLET_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.VIOLET_BLAZELITE_TILE_WALL);
    }

    private void addUltramarineBlazeliteBlockDrops() {
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_SLAB, slabDrops(ModBlocks.ULTRAMARINE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_DOOR, doorDrops(ModBlocks.ULTRAMARINE_BLAZELITE_DOOR));
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_WALL);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BUTTON);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.ULTRAMARINE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TILES);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.ULTRAMARINE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_WALL);
    }

    private void addCapriBlazeliteBlockDrops() {
        addDrop(ModBlocks.CAPRI_BLAZELITE_BLOCK);
        addDrop(ModBlocks.CAPRI_BLAZELITE_SLAB, slabDrops(ModBlocks.CAPRI_BLAZELITE_SLAB));
        addDrop(ModBlocks.CAPRI_BLAZELITE_STAIRS);
        addDrop(ModBlocks.CAPRI_BLAZELITE_DOOR, doorDrops(ModBlocks.CAPRI_BLAZELITE_DOOR));
        addDrop(ModBlocks.CAPRI_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.CAPRI_BLAZELITE_FENCE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_WALL);
        addDrop(ModBlocks.CAPRI_BLAZELITE_BUTTON);
        addDrop(ModBlocks.CAPRI_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_BRICKS);
        addDrop(ModBlocks.CAPRI_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.CAPRI_BLAZELITE_SLAB));
        addDrop(ModBlocks.CAPRI_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.CAPRI_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.CAPRI_BLAZELITE_TILES);
        addDrop(ModBlocks.CAPRI_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.CAPRI_BLAZELITE_SLAB));
        addDrop(ModBlocks.CAPRI_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.CAPRI_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.CAPRI_BLAZELITE_TILE_WALL);
    }

    private void addCyanBlazeliteBlockDrops() {
        addDrop(ModBlocks.CYAN_BLAZELITE_BLOCK);
        addDrop(ModBlocks.CYAN_BLAZELITE_SLAB, slabDrops(ModBlocks.CYAN_BLAZELITE_SLAB));
        addDrop(ModBlocks.CYAN_BLAZELITE_STAIRS);
        addDrop(ModBlocks.CYAN_BLAZELITE_DOOR, doorDrops(ModBlocks.CYAN_BLAZELITE_DOOR));
        addDrop(ModBlocks.CYAN_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.CYAN_BLAZELITE_FENCE);
        addDrop(ModBlocks.CYAN_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.CYAN_BLAZELITE_WALL);
        addDrop(ModBlocks.CYAN_BLAZELITE_BUTTON);
        addDrop(ModBlocks.CYAN_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_BLAZELITE_BRICKS);
        addDrop(ModBlocks.CYAN_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.CYAN_BLAZELITE_SLAB));
        addDrop(ModBlocks.CYAN_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.CYAN_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.CYAN_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.CYAN_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.CYAN_BLAZELITE_TILES);
        addDrop(ModBlocks.CYAN_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.CYAN_BLAZELITE_SLAB));
        addDrop(ModBlocks.CYAN_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.CYAN_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.CYAN_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.CYAN_BLAZELITE_TILE_WALL);
    }

    private void addSpringGreenBlazeliteBlockDrops() {
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_SLAB, slabDrops(ModBlocks.SPRING_GREEN_BLAZELITE_SLAB));
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_DOOR, doorDrops(ModBlocks.SPRING_GREEN_BLAZELITE_DOOR));
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_WALL);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BUTTON);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.SPRING_GREEN_BLAZELITE_SLAB));
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TILES);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.SPRING_GREEN_BLAZELITE_SLAB));
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_WALL);
    }

    private void addGreenBlazeliteBlockDrops() {
        addDrop(ModBlocks.GREEN_BLAZELITE_BLOCK);
        addDrop(ModBlocks.GREEN_BLAZELITE_SLAB, slabDrops(ModBlocks.GREEN_BLAZELITE_SLAB));
        addDrop(ModBlocks.GREEN_BLAZELITE_STAIRS);
        addDrop(ModBlocks.GREEN_BLAZELITE_DOOR, doorDrops(ModBlocks.GREEN_BLAZELITE_DOOR));
        addDrop(ModBlocks.GREEN_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.GREEN_BLAZELITE_FENCE);
        addDrop(ModBlocks.GREEN_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.GREEN_BLAZELITE_WALL);
        addDrop(ModBlocks.GREEN_BLAZELITE_BUTTON);
        addDrop(ModBlocks.GREEN_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_BLAZELITE_BRICKS);
        addDrop(ModBlocks.GREEN_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.GREEN_BLAZELITE_SLAB));
        addDrop(ModBlocks.GREEN_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.GREEN_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.GREEN_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.GREEN_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.GREEN_BLAZELITE_TILES);
        addDrop(ModBlocks.GREEN_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.GREEN_BLAZELITE_SLAB));
        addDrop(ModBlocks.GREEN_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.GREEN_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.GREEN_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.GREEN_BLAZELITE_TILE_WALL);
    }

    private void addChartreuseBlazeliteBlockDrops() {
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_SLAB, slabDrops(ModBlocks.CHARTREUSE_BLAZELITE_SLAB));
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_STAIRS);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_DOOR, doorDrops(ModBlocks.CHARTREUSE_BLAZELITE_DOOR));
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_FENCE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_WALL);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BUTTON);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.CHARTREUSE_BLAZELITE_SLAB));
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TILES);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.CHARTREUSE_BLAZELITE_SLAB));
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.CHARTREUSE_BLAZELITE_TILE_WALL);
    }

    private void addYellowBlazeliteBlockDrops() {
        addDrop(ModBlocks.YELLOW_BLAZELITE_BLOCK);
        addDrop(ModBlocks.YELLOW_BLAZELITE_SLAB, slabDrops(ModBlocks.YELLOW_BLAZELITE_SLAB));
        addDrop(ModBlocks.YELLOW_BLAZELITE_STAIRS);
        addDrop(ModBlocks.YELLOW_BLAZELITE_DOOR, doorDrops(ModBlocks.YELLOW_BLAZELITE_DOOR));
        addDrop(ModBlocks.YELLOW_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_BLAZELITE_FENCE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_WALL);
        addDrop(ModBlocks.YELLOW_BLAZELITE_BUTTON);
        addDrop(ModBlocks.YELLOW_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_BRICKS);
        addDrop(ModBlocks.YELLOW_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.YELLOW_BLAZELITE_SLAB));
        addDrop(ModBlocks.YELLOW_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.YELLOW_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.YELLOW_BLAZELITE_TILES);
        addDrop(ModBlocks.YELLOW_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.YELLOW_BLAZELITE_SLAB));
        addDrop(ModBlocks.YELLOW_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.YELLOW_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_BLAZELITE_TILE_WALL);
    }

    private void addOrangeBlazeliteBlockDrops() {
        addDrop(ModBlocks.ORANGE_BLAZELITE_BLOCK);
        addDrop(ModBlocks.ORANGE_BLAZELITE_SLAB, slabDrops(ModBlocks.ORANGE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ORANGE_BLAZELITE_STAIRS);
        addDrop(ModBlocks.ORANGE_BLAZELITE_DOOR, doorDrops(ModBlocks.ORANGE_BLAZELITE_DOOR));
        addDrop(ModBlocks.ORANGE_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_BLAZELITE_FENCE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_WALL);
        addDrop(ModBlocks.ORANGE_BLAZELITE_BUTTON);
        addDrop(ModBlocks.ORANGE_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_BRICKS);
        addDrop(ModBlocks.ORANGE_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.ORANGE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ORANGE_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.ORANGE_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.ORANGE_BLAZELITE_TILES);
        addDrop(ModBlocks.ORANGE_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.ORANGE_BLAZELITE_SLAB));
        addDrop(ModBlocks.ORANGE_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.ORANGE_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_BLAZELITE_TILE_WALL);
    }

    private void addRedBlazeliteBlockDrops() {
        addDrop(ModBlocks.RED_BLAZELITE_BLOCK);
        addDrop(ModBlocks.RED_BLAZELITE_SLAB, slabDrops(ModBlocks.RED_BLAZELITE_SLAB));
        addDrop(ModBlocks.RED_BLAZELITE_STAIRS);
        addDrop(ModBlocks.RED_BLAZELITE_DOOR, doorDrops(ModBlocks.RED_BLAZELITE_DOOR));
        addDrop(ModBlocks.RED_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.RED_BLAZELITE_FENCE);
        addDrop(ModBlocks.RED_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.RED_BLAZELITE_WALL);
        addDrop(ModBlocks.RED_BLAZELITE_BUTTON);
        addDrop(ModBlocks.RED_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_BLAZELITE_BRICKS);
        addDrop(ModBlocks.RED_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.RED_BLAZELITE_SLAB));
        addDrop(ModBlocks.RED_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.RED_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.RED_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.RED_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.RED_BLAZELITE_TILES);
        addDrop(ModBlocks.RED_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.RED_BLAZELITE_SLAB));
        addDrop(ModBlocks.RED_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.RED_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.RED_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.RED_BLAZELITE_TILE_WALL);
    }

    private void addDarkGrayBlazeliteBlockDrops() {
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_SLAB, slabDrops(ModBlocks.DARK_GRAY_BLAZELITE_SLAB));
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_STAIRS);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_DOOR, doorDrops(ModBlocks.DARK_GRAY_BLAZELITE_DOOR));
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_FENCE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_WALL);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BUTTON);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.DARK_GRAY_BLAZELITE_SLAB));
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TILES);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.DARK_GRAY_BLAZELITE_SLAB));
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.DARK_GRAY_BLAZELITE_TILE_WALL);
    }

    private void addLightGrayBlazeliteBlockDrops() {
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_BLAZELITE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_BLAZELITE_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_BLAZELITE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_BLAZELITE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_WALL);
    }

    private void addWhiteBlazeliteBlockDrops() {
        addDrop(ModBlocks.WHITE_BLAZELITE_BLOCK);
        addDrop(ModBlocks.WHITE_BLAZELITE_SLAB, slabDrops(ModBlocks.WHITE_BLAZELITE_SLAB));
        addDrop(ModBlocks.WHITE_BLAZELITE_STAIRS);
        addDrop(ModBlocks.WHITE_BLAZELITE_DOOR, doorDrops(ModBlocks.WHITE_BLAZELITE_DOOR));
        addDrop(ModBlocks.WHITE_BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.WHITE_BLAZELITE_FENCE);
        addDrop(ModBlocks.WHITE_BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.WHITE_BLAZELITE_WALL);
        addDrop(ModBlocks.WHITE_BLAZELITE_BUTTON);
        addDrop(ModBlocks.WHITE_BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_BLAZELITE_BRICKS);
        addDrop(ModBlocks.WHITE_BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.WHITE_BLAZELITE_SLAB));
        addDrop(ModBlocks.WHITE_BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.WHITE_BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.WHITE_BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.WHITE_BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.WHITE_BLAZELITE_TILES);
        addDrop(ModBlocks.WHITE_BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.WHITE_BLAZELITE_SLAB));
        addDrop(ModBlocks.WHITE_BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.WHITE_BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.WHITE_BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.WHITE_BLAZELITE_TILE_WALL);
    }

    private void addBlazeliteBlockDrops() {
        addDrop(ModBlocks.BLAZELITE_BLOCK);
        addDrop(ModBlocks.BLAZELITE_SLAB, slabDrops(ModBlocks.BLAZELITE_SLAB));
        addDrop(ModBlocks.BLAZELITE_STAIRS);
        addDrop(ModBlocks.BLAZELITE_DOOR, doorDrops(ModBlocks.BLAZELITE_DOOR));
        addDrop(ModBlocks.BLAZELITE_TRAPDOOR);
        addDrop(ModBlocks.BLAZELITE_FENCE);
        addDrop(ModBlocks.BLAZELITE_FENCE_GATE);
        addDrop(ModBlocks.BLAZELITE_WALL);
        addDrop(ModBlocks.BLAZELITE_BUTTON);
        addDrop(ModBlocks.BLAZELITE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLAZELITE_BRICKS);
        addDrop(ModBlocks.BLAZELITE_BRICK_SLAB, slabDrops(ModBlocks.BLAZELITE_SLAB));
        addDrop(ModBlocks.BLAZELITE_BRICK_STAIRS);
        addDrop(ModBlocks.BLAZELITE_BRICK_FENCE);
        addDrop(ModBlocks.BLAZELITE_BRICK_FENCE_GATE);
        addDrop(ModBlocks.BLAZELITE_BRICK_WALL);
        addDrop(ModBlocks.BLAZELITE_TILES);
        addDrop(ModBlocks.BLAZELITE_TILE_SLAB, slabDrops(ModBlocks.BLAZELITE_SLAB));
        addDrop(ModBlocks.BLAZELITE_TILE_STAIRS);
        addDrop(ModBlocks.BLAZELITE_TILE_FENCE);
        addDrop(ModBlocks.BLAZELITE_TILE_FENCE_GATE);
        addDrop(ModBlocks.BLAZELITE_TILE_WALL);
    }

    public LootTable.Builder PlentifulOreDrops(Block drop, Item item, float min, float max) {
            return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                    ((LeafEntry.Builder)ItemEntry.builder(item)
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                    .create(min, max))))
                            .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
        }
}
