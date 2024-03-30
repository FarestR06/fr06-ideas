package com.farestr06.deeperdepths.datagen;

import com.farestr06.deeperdepths.block.BlazeliteBlocks;
import com.farestr06.deeperdepths.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .add(BlazeliteBlocks.BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.PINK_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.RED_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK.asItem())
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK.asItem());
        getOrCreateTagBuilder(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .add(BlazeliteBlocks.BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.PINK_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.RED_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS.asItem())
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS.asItem());
        getOrCreateTagBuilder(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .add(BlazeliteBlocks.BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.CAPRI_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.CYAN_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.GREEN_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.ORANGE_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.PINK_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.RED_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.ROSE_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.VIOLET_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.WHITE_BLAZELITE_TILES.asItem())
                .add(BlazeliteBlocks.YELLOW_BLAZELITE_TILES.asItem());

    }
}
