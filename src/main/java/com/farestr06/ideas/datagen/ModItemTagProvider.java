package com.farestr06.ideas.datagen;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.item.ModItems;
import com.farestr06.ideas.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.SNIFFER_FOOD)
                .add(ModItems.LANTERNBERRY);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLAZELITE_BOOTS)
                .add(ModItems.BLAZELITE_CHESTPLATE)
                .add(ModItems.BLAZELITE_HELMET)
                .add(ModItems.BLAZELITE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.MAPLE_PLANKS.asItem());
        
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .add(ModBlocks.BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.CAPRI_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.CYAN_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.GREEN_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.MAGENTA_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.ORANGE_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.PINK_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.RED_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.ROSE_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.VIOLET_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.WHITE_BLAZELITE_BLOCK.asItem())
                .add(ModBlocks.YELLOW_BLAZELITE_BLOCK.asItem());
        getOrCreateTagBuilder(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .add(ModBlocks.BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.CAPRI_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.CYAN_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.GREEN_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.MAGENTA_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.ORANGE_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.PINK_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.RED_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.ROSE_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.VIOLET_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.WHITE_BLAZELITE_BRICKS.asItem())
                .add(ModBlocks.YELLOW_BLAZELITE_BRICKS.asItem());
        getOrCreateTagBuilder(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .add(ModBlocks.BLAZELITE_TILES.asItem())
                .add(ModBlocks.CAPRI_BLAZELITE_TILES.asItem())
                .add(ModBlocks.CHARTREUSE_BLAZELITE_TILES.asItem())
                .add(ModBlocks.CYAN_BLAZELITE_TILES.asItem())
                .add(ModBlocks.DARK_GRAY_BLAZELITE_TILES.asItem())
                .add(ModBlocks.GREEN_BLAZELITE_TILES.asItem())
                .add(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES.asItem())
                .add(ModBlocks.MAGENTA_BLAZELITE_TILES.asItem())
                .add(ModBlocks.ORANGE_BLAZELITE_TILES.asItem())
                .add(ModBlocks.PINK_BLAZELITE_TILES.asItem())
                .add(ModBlocks.RED_BLAZELITE_TILES.asItem())
                .add(ModBlocks.ROSE_BLAZELITE_TILES.asItem())
                .add(ModBlocks.SPRING_GREEN_BLAZELITE_TILES.asItem())
                .add(ModBlocks.ULTRAMARINE_BLAZELITE_TILES.asItem())
                .add(ModBlocks.VIOLET_BLAZELITE_TILES.asItem())
                .add(ModBlocks.WHITE_BLAZELITE_TILES.asItem())
                .add(ModBlocks.YELLOW_BLAZELITE_TILES.asItem());
    }
}
