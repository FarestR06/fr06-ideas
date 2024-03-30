package com.farestr06.deeperdepths.datagen;

import com.farestr06.deeperdepths.DeeperDepths;
import com.farestr06.deeperdepths.block.BlazeliteBlocks;
import com.farestr06.deeperdepths.item.ModItems;
import com.farestr06.deeperdepths.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLAZELITE_INGOT, 8)
                .input(ModItems.FOSSIL_SLIME)
                .input(ModItems.FOSSIL_SLIME)
                .input(ModItems.FOSSIL_SLIME)
                .input(Items.MAGMA_CREAM)
                .criterion(hasItem(ModItems.FOSSIL_SLIME), conditionsFromItem(ModItems.FOSSIL_SLIME))
                .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(ModItems.FOSSIL_SLIME)));
        
        offerPigmentRecipes(exporter);
        offerBlazeliteBlockRecipes(exporter);
        offerBlazeliteBrickRecipes(exporter);
        offerBlazeliteTileRecipes(exporter);
        offerBlazeliteSlabRecipes();
        offerBlazeliteStairRecipes();
        offerBlazeliteDoorRecipes();
        offerBlazeliteTrapdoorRecipes();
        offerBlazeliteButtonRecipes(exporter);
        offerBlazelitePressurePlateRecipes();
        offerBlazeliteFenceRecipes();
        offerBlazeliteFenceGateRecipes();
    }

    private void offerBlazeliteBlockRecipes(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.BLAZELITE_BLOCK, ModItems.BLAZELITE_INGOT);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.LIGHT_GRAY_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.DARK_GRAY_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.RED_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.ORANGE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.CHARTREUSE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.CYAN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.CAPRI_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.VIOLET_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.MAGENTA_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.PINK_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.ROSE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK)));
    }
    private void offerBlazeliteBrickRecipes(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.BLAZELITE_BRICKS, BlazeliteBlocks.BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_BRICKS, BlazeliteBlocks.WHITE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_BRICKS, BlazeliteBlocks.RED_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS, BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS, BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_BRICKS, BlazeliteBlocks.GREEN_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_BRICKS, BlazeliteBlocks.CYAN_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS, BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS, BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS, BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_BRICKS, BlazeliteBlocks.PINK_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_BRICKS, BlazeliteBlocks.ROSE_BLAZELITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.LIGHT_GRAY_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.DARK_GRAY_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.RED_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.ORANGE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.CHARTREUSE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.CYAN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.CAPRI_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.VIOLET_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.MAGENTA_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.PINK_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.ROSE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS)+"_pigmented"));
    }
    private void offerBlazeliteTileRecipes(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.BLAZELITE_TILES, BlazeliteBlocks.BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_TILES, BlazeliteBlocks.WHITE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES, BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_TILES, BlazeliteBlocks.RED_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_TILES, BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_TILES, BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES, BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_TILES, BlazeliteBlocks.GREEN_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_TILES, BlazeliteBlocks.CYAN_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_TILES, BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_TILES, BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_TILES, BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_TILES, BlazeliteBlocks.PINK_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_TILES, BlazeliteBlocks.ROSE_BLAZELITE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.WHITE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.LIGHT_GRAY_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.DARK_GRAY_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.RED_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.ORANGE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ORANGE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.YELLOW_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.CHARTREUSE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.GREEN_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.CYAN_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CYAN_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.CAPRI_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CAPRI_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.VIOLET_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.VIOLET_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.MAGENTA_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.PINK_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.ROSE_PIGMENT)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BRICKS), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ROSE_BLAZELITE_TILES)+"_pigmented"));
    }
    private void offerPigmentRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.REDSTONE)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("red_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.GOLD_NUGGET)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("yellow_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTRAMARINE_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.LAPIS_LAZULI)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("ultramarine_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.QUARTZ)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("white_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.QUARTZ)
                .input(Items.CHARCOAL)
                .input(Items.QUARTZ)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("light_gray_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_GRAY_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.QUARTZ)
                .input(Items.CHARCOAL)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("dark_gray_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("pink_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAPRI_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("capri_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("orange_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("green_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VIOLET_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("violet_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHARTREUSE_PIGMENT)
                .group("chartreuse_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("chartreuse_pigment_yg"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHARTREUSE_PIGMENT)
                .group("chartreuse_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("chartreuse_pigment_yyu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_PIGMENT)
                .group("cyan_pigment")
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("cyan_pigment_su"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_PIGMENT)
                .group("cyan_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("cyan_pigment_yuuu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPRING_GREEN_PIGMENT)
                .group("spring_green_pigment")
                .input(ModItems.GREEN_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("spring_green_pigment_gu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPRING_GREEN_PIGMENT)
                .group("spring_green_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("spring_green_pigment_yuu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_PIGMENT)
                .group("magenta_pigment")
                .input(ModItems.VIOLET_PIGMENT)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("magenta_pigment_vp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_PIGMENT)
                .group("magenta_pigment")
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("magenta_pigment_rruw"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_PIGMENT)
                .group("rose_pigment")
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("rose_pigment_rp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_PIGMENT)
                .group("rose_pigment")
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, DeeperDepths.makeId("rose_pigment_rrw"));
    }
    private void offerBlazeliteSlabRecipes() {
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlazeliteBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_TILES));

    }
    private void offerBlazeliteStairRecipes() {
        createStairsRecipe(BlazeliteBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_TILES));

        createStairsRecipe(BlazeliteBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK));
        createStairsRecipe(BlazeliteBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS));
        createStairsRecipe(BlazeliteBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_TILES));

    }
    private void offerBlazeliteDoorRecipes() {
        createDoorRecipe(BlazeliteBlocks.BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.WHITE_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.RED_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.GREEN_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.CYAN_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.PINK_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BLOCK));
        createDoorRecipe(BlazeliteBlocks.ROSE_BLAZELITE_DOOR, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK));
    }
    private void offerBlazeliteTrapdoorRecipes() {
        createTrapdoorRecipe(BlazeliteBlocks.BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.WHITE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.RED_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.CYAN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.PINK_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BLOCK));
        createTrapdoorRecipe(BlazeliteBlocks.ROSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK));
    }
    private void offerBlazeliteButtonRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.WHITE_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.WHITE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.DARK_GRAY_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.RED_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.RED_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.RED_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.RED_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.RED_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.ORANGE_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ORANGE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.YELLOW_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.YELLOW_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.CHARTREUSE_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.GREEN_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.GREEN_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.CYAN_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CYAN_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.CAPRI_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.CAPRI_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.VIOLET_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.VIOLET_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.MAGENTA_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.MAGENTA_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.PINK_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.PINK_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.PINK_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.PINK_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.PINK_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlazeliteBlocks.ROSE_BLAZELITE_BUTTON, 1)
                .input(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK)
                .criterion(hasItem(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK), conditionsFromItem(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK))
                .offerTo(exporter, DeeperDepths.makeId(getRecipeName(BlazeliteBlocks.ROSE_BLAZELITE_BUTTON)));
    }
    private void offerBlazelitePressurePlateRecipes() {
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.WHITE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.RED_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.ORANGE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.YELLOW_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.CYAN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.CAPRI_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.VIOLET_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.MAGENTA_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.PINK_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, BlazeliteBlocks.ROSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_PRESSURE_PLATE));
    }

    private void offerBlazeliteFenceRecipes() {
        createFenceRecipe(BlazeliteBlocks.BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.WHITE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.WHITE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.WHITE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.RED_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.RED_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.RED_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.GREEN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.GREEN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.GREEN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.CYAN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.CYAN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.CYAN_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.PINK_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.PINK_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.PINK_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_TILES));

        createFenceRecipe(BlazeliteBlocks.ROSE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK));
        createFenceRecipe(BlazeliteBlocks.ROSE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS));
        createFenceRecipe(BlazeliteBlocks.ROSE_BLAZELITE_FENCE, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_TILES));

    }
    private void offerBlazeliteFenceGateRecipes() {
        createFenceGateRecipe(BlazeliteBlocks.BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.WHITE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.WHITE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.WHITE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.WHITE_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.DARK_GRAY_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.RED_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.RED_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.RED_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.RED_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.ORANGE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ORANGE_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.YELLOW_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.YELLOW_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CHARTREUSE_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.GREEN_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.CYAN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.CYAN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.CYAN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CYAN_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.CAPRI_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.CAPRI_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.VIOLET_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.VIOLET_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.MAGENTA_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.MAGENTA_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.PINK_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.PINK_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.PINK_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.PINK_BLAZELITE_TILES));

        createFenceGateRecipe(BlazeliteBlocks.ROSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BLOCK));
        createFenceGateRecipe(BlazeliteBlocks.ROSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_BRICKS));
        createFenceGateRecipe(BlazeliteBlocks.ROSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(BlazeliteBlocks.ROSE_BLAZELITE_TILES));

    }
}
