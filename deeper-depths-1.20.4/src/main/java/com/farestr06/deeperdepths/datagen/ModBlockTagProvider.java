package com.farestr06.deeperdepths.datagen;

import com.farestr06.deeperdepths.block.BlazeliteBlocks;
import com.farestr06.deeperdepths.block.ModBlocks;
import com.farestr06.deeperdepths.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(ModBlocks.SOUL_SILT);

        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(ModBlocks.SOUL_SILT);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BLOCK_TAGS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BLOCK_TAGS);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(BlazeliteBlocks.BLAZELITE_FENCE)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.RED_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.PINK_BLAZELITE_FENCE)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_FENCE)

                .add(BlazeliteBlocks.BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.RED_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_FENCE)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_FENCE)

                .add(BlazeliteBlocks.BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.RED_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.PINK_BLAZELITE_TILE_FENCE)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(BlazeliteBlocks.BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.RED_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.PINK_BLAZELITE_FENCE_GATE)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_FENCE_GATE)

                .add(BlazeliteBlocks.BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.RED_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_FENCE_GATE)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_FENCE_GATE)

                .add(BlazeliteBlocks.BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.RED_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.PINK_BLAZELITE_TILE_FENCE_GATE)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BlazeliteBlocks.BLAZELITE_WALL)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_WALL)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_WALL)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_WALL)
                .add(BlazeliteBlocks.RED_BLAZELITE_WALL)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_WALL)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_WALL)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_WALL)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_WALL)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_WALL)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_WALL)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_WALL)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_WALL)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_WALL)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_WALL)
                .add(BlazeliteBlocks.PINK_BLAZELITE_WALL)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_WALL)

                .add(BlazeliteBlocks.BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.RED_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.PINK_BLAZELITE_BRICK_WALL)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BRICK_WALL)

                .add(BlazeliteBlocks.BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.RED_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.PINK_BLAZELITE_TILE_WALL)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_TILE_WALL);
        // Blazelite Stuff
        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_BLOCKS)
                .add(BlazeliteBlocks.BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.PINK_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.RED_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.PINK_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.RED_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS);

        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_TILES)
                .add(BlazeliteBlocks.BLAZELITE_TILES)
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_TILES)
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES)
                .add(BlazeliteBlocks.CYAN_BLAZELITE_TILES)
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES)
                .add(BlazeliteBlocks.GREEN_BLAZELITE_TILES)
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES)
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES)
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_TILES)
                .add(BlazeliteBlocks.PINK_BLAZELITE_TILES)
                .add(BlazeliteBlocks.RED_BLAZELITE_TILES)
                .add(BlazeliteBlocks.ROSE_BLAZELITE_TILES)
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES)
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES)
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_TILES)
                .add(BlazeliteBlocks.WHITE_BLAZELITE_TILES)
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_TILES);

        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_BLOCK_TAGS)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BLOCKS)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BRICKS)
                .forceAddTag(ModTags.Blocks.BLAZELITE_TILES);
    }
}
