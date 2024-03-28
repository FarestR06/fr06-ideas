package com.farestr06.ideas.datagen;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.util.ModTags;
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

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.OILY_DEEPSLATE)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BLOCK_TAGS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BLOCK_TAGS);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.BLAZELITE_FENCE)
                .add(ModBlocks.WHITE_BLAZELITE_FENCE)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_FENCE)
                .add(ModBlocks.RED_BLAZELITE_FENCE)
                .add(ModBlocks.ORANGE_BLAZELITE_FENCE)
                .add(ModBlocks.YELLOW_BLAZELITE_FENCE)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_FENCE)
                .add(ModBlocks.GREEN_BLAZELITE_FENCE)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE)
                .add(ModBlocks.CYAN_BLAZELITE_FENCE)
                .add(ModBlocks.CAPRI_BLAZELITE_FENCE)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE)
                .add(ModBlocks.VIOLET_BLAZELITE_FENCE)
                .add(ModBlocks.MAGENTA_BLAZELITE_FENCE)
                .add(ModBlocks.PINK_BLAZELITE_FENCE)
                .add(ModBlocks.ROSE_BLAZELITE_FENCE)

                .add(ModBlocks.BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.WHITE_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.RED_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.ORANGE_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.YELLOW_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.GREEN_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.CYAN_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.CAPRI_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.VIOLET_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.MAGENTA_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.PINK_BLAZELITE_BRICK_FENCE)
                .add(ModBlocks.ROSE_BLAZELITE_BRICK_FENCE)

                .add(ModBlocks.BLAZELITE_TILE_FENCE)
                .add(ModBlocks.WHITE_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.RED_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.ORANGE_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.YELLOW_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.GREEN_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.CYAN_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.CAPRI_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.VIOLET_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.MAGENTA_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.PINK_BLAZELITE_TILE_FENCE)
                .add(ModBlocks.ROSE_BLAZELITE_TILE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BLAZELITE_FENCE_GATE)
                .add(ModBlocks.WHITE_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.RED_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.ORANGE_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.YELLOW_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.GREEN_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.CYAN_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.CAPRI_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.VIOLET_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.MAGENTA_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.PINK_BLAZELITE_FENCE_GATE)
                .add(ModBlocks.ROSE_BLAZELITE_FENCE_GATE)

                .add(ModBlocks.BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.WHITE_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.RED_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.ORANGE_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.YELLOW_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.GREEN_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.CYAN_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.CAPRI_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.VIOLET_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.MAGENTA_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.PINK_BLAZELITE_BRICK_FENCE_GATE)
                .add(ModBlocks.ROSE_BLAZELITE_BRICK_FENCE_GATE)

                .add(ModBlocks.BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.WHITE_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.RED_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.ORANGE_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.YELLOW_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.GREEN_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.CYAN_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.CAPRI_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.VIOLET_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.MAGENTA_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.PINK_BLAZELITE_TILE_FENCE_GATE)
                .add(ModBlocks.ROSE_BLAZELITE_TILE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.BLAZELITE_WALL)
                .add(ModBlocks.WHITE_BLAZELITE_WALL)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_WALL)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_WALL)
                .add(ModBlocks.RED_BLAZELITE_WALL)
                .add(ModBlocks.ORANGE_BLAZELITE_WALL)
                .add(ModBlocks.YELLOW_BLAZELITE_WALL)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_WALL)
                .add(ModBlocks.GREEN_BLAZELITE_WALL)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_WALL)
                .add(ModBlocks.CYAN_BLAZELITE_WALL)
                .add(ModBlocks.CAPRI_BLAZELITE_WALL)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_WALL)
                .add(ModBlocks.VIOLET_BLAZELITE_WALL)
                .add(ModBlocks.MAGENTA_BLAZELITE_WALL)
                .add(ModBlocks.PINK_BLAZELITE_WALL)
                .add(ModBlocks.ROSE_BLAZELITE_WALL)

                .add(ModBlocks.BLAZELITE_BRICK_WALL)
                .add(ModBlocks.WHITE_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.RED_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.ORANGE_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.YELLOW_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.GREEN_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.CYAN_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.CAPRI_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.VIOLET_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.MAGENTA_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.PINK_BLAZELITE_BRICK_WALL)
                .add(ModBlocks.ROSE_BLAZELITE_BRICK_WALL)

                .add(ModBlocks.BLAZELITE_TILE_WALL)
                .add(ModBlocks.WHITE_BLAZELITE_TILE_WALL)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_TILE_WALL)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_TILE_WALL)
                .add(ModBlocks.RED_BLAZELITE_TILE_WALL)
                .add(ModBlocks.ORANGE_BLAZELITE_TILE_WALL)
                .add(ModBlocks.YELLOW_BLAZELITE_TILE_WALL)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_TILE_WALL)
                .add(ModBlocks.GREEN_BLAZELITE_TILE_WALL)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_TILE_WALL)
                .add(ModBlocks.CYAN_BLAZELITE_TILE_WALL)
                .add(ModBlocks.CAPRI_BLAZELITE_TILE_WALL)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_TILE_WALL)
                .add(ModBlocks.VIOLET_BLAZELITE_TILE_WALL)
                .add(ModBlocks.MAGENTA_BLAZELITE_TILE_WALL)
                .add(ModBlocks.PINK_BLAZELITE_TILE_WALL)
                .add(ModBlocks.ROSE_BLAZELITE_TILE_WALL);
        // Blazelite Stuff
        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_BLOCKS)
                .add(ModBlocks.BLAZELITE_BLOCK)
                .add(ModBlocks.CAPRI_BLAZELITE_BLOCK)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK)
                .add(ModBlocks.CYAN_BLAZELITE_BLOCK)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK)
                .add(ModBlocks.GREEN_BLAZELITE_BLOCK)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)
                .add(ModBlocks.MAGENTA_BLAZELITE_BLOCK)
                .add(ModBlocks.ORANGE_BLAZELITE_BLOCK)
                .add(ModBlocks.PINK_BLAZELITE_BLOCK)
                .add(ModBlocks.RED_BLAZELITE_BLOCK)
                .add(ModBlocks.ROSE_BLAZELITE_BLOCK)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK)
                .add(ModBlocks.VIOLET_BLAZELITE_BLOCK)
                .add(ModBlocks.WHITE_BLAZELITE_BLOCK)
                .add(ModBlocks.YELLOW_BLAZELITE_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_BRICKS)
                .add(ModBlocks.BLAZELITE_BRICKS)
                .add(ModBlocks.CAPRI_BLAZELITE_BRICKS)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS)
                .add(ModBlocks.CYAN_BLAZELITE_BRICKS)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS)
                .add(ModBlocks.GREEN_BLAZELITE_BRICKS)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS)
                .add(ModBlocks.MAGENTA_BLAZELITE_BRICKS)
                .add(ModBlocks.ORANGE_BLAZELITE_BRICKS)
                .add(ModBlocks.PINK_BLAZELITE_BRICKS)
                .add(ModBlocks.RED_BLAZELITE_BRICKS)
                .add(ModBlocks.ROSE_BLAZELITE_BRICKS)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS)
                .add(ModBlocks.VIOLET_BLAZELITE_BRICKS)
                .add(ModBlocks.WHITE_BLAZELITE_BRICKS)
                .add(ModBlocks.YELLOW_BLAZELITE_BRICKS);

        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_TILES)
                .add(ModBlocks.BLAZELITE_TILES)
                .add(ModBlocks.CAPRI_BLAZELITE_TILES)
                .add(ModBlocks.CHARTREUSE_BLAZELITE_TILES)
                .add(ModBlocks.CYAN_BLAZELITE_TILES)
                .add(ModBlocks.DARK_GRAY_BLAZELITE_TILES)
                .add(ModBlocks.GREEN_BLAZELITE_TILES)
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES)
                .add(ModBlocks.MAGENTA_BLAZELITE_TILES)
                .add(ModBlocks.ORANGE_BLAZELITE_TILES)
                .add(ModBlocks.PINK_BLAZELITE_TILES)
                .add(ModBlocks.RED_BLAZELITE_TILES)
                .add(ModBlocks.ROSE_BLAZELITE_TILES)
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_TILES)
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_TILES)
                .add(ModBlocks.VIOLET_BLAZELITE_TILES)
                .add(ModBlocks.WHITE_BLAZELITE_TILES)
                .add(ModBlocks.YELLOW_BLAZELITE_TILES);

        getOrCreateTagBuilder(ModTags.Blocks.BLAZELITE_BLOCK_TAGS)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BLOCKS)
                .forceAddTag(ModTags.Blocks.BLAZELITE_BRICKS)
                .forceAddTag(ModTags.Blocks.BLAZELITE_TILES);
    }
}
