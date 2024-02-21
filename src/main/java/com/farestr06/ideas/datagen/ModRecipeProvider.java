package com.farestr06.ideas.datagen;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.item.ModItems;
import com.farestr06.ideas.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.GRAPHITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAPHITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAPHENE_BLOCK, ModBlocks.GRAPHITE_BLOCK);
        offerSmelting(exporter, List.of(ModBlocks.GRAPHENE_BLOCK), RecipeCategory.MISC, Items.DIAMOND, 1.8f, 400, "diamond");
        offerBlasting(exporter, List.of(ModBlocks.GRAPHENE_BLOCK), RecipeCategory.MISC, Items.DIAMOND, 1.8f, 200, "diamond");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GUNPOWDER, 9)
                        .input(ItemTags.COALS)
                        .input(Items.BLAZE_POWDER)
                        .input(ModItems.SALTPETER)
                        .criterion(hasItem(ModItems.SALTPETER), conditionsFromItem(ModItems.SALTPETER))
                        .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(Items.GUNPOWDER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.FIREWORK_ROCKET, 3)
                        .input(Items.SUGAR)
                        .input(ModItems.SALTPETER)
                        .input(Items.PAPER)
                        .criterion(hasItem(ModItems.SALTPETER), conditionsFromItem(ModItems.SALTPETER))
                        .offerTo(exporter, FarestsIdeas.makeId("r_candy"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_ACORN, 1)
                        .pattern("###")
                        .pattern("#&#")
                        .pattern("###")
                        .input('#', Items.GOLD_NUGGET)
                        .input('&', ModItems.ACORN)
                        .criterion(hasItem(ModItems.ACORN), conditionsFromItem(ModItems.ACORN))
                        .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModItems.GOLDEN_ACORN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ENCHANTED_GOLDEN_ACORN, 1)
                        .pattern("###")
                        .pattern("#&#")
                        .pattern("###")
                        .input('#', Blocks.GOLD_BLOCK)
                        .input('&', ModItems.GOLDEN_ACORN)
                        .criterion(hasItem(ModItems.GOLDEN_ACORN), conditionsFromItem(ModItems.GOLDEN_ACORN))
                        .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModItems.ENCHANTED_GOLDEN_ACORN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLAZELITE_INGOT, 8)
                        .input(ModItems.OIL_BALL)
                        .input(ModItems.OIL_BALL)
                        .input(ModItems.OIL_BALL)
                        .input(Items.MAGMA_CREAM)
                        .criterion(hasItem(ModItems.OIL_BALL), conditionsFromItem(ModItems.OIL_BALL))
                        .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                        .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModItems.OIL_BALL)));

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
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZELITE_BLOCK, ModItems.BLAZELITE_INGOT);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.WHITE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.LIGHT_GRAY_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.DARK_GRAY_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.RED_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.ORANGE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ORANGE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.YELLOW_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.CHARTREUSE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.GREEN_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.CYAN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CYAN_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.CAPRI_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CAPRI_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.VIOLET_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.VIOLET_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.MAGENTA_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.MAGENTA_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.PINK_BLAZELITE_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_BLOCK)
                .input(ModTags.Items.BLAZELITE_BLOCK_ITEMS)
                .input(ModItems.ROSE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ROSE_BLAZELITE_BLOCK)));
    }
    private void offerBlazeliteBrickRecipes(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZELITE_BRICKS, ModBlocks.BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_BRICKS, ModBlocks.WHITE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS, ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_BRICKS, ModBlocks.DARK_GRAY_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_BRICKS, ModBlocks.RED_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_BRICKS, ModBlocks.ORANGE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_BRICKS, ModBlocks.YELLOW_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_BRICKS, ModBlocks.CHARTREUSE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_BRICKS, ModBlocks.GREEN_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS, ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_BRICKS, ModBlocks.CYAN_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_BRICKS, ModBlocks.CAPRI_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS, ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_BRICKS, ModBlocks.VIOLET_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_BRICKS, ModBlocks.MAGENTA_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_BRICKS, ModBlocks.PINK_BLAZELITE_BLOCK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_BRICKS, ModBlocks.ROSE_BLAZELITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.WHITE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.LIGHT_GRAY_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.DARK_GRAY_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.RED_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.ORANGE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ORANGE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.YELLOW_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.CHARTREUSE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.GREEN_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.CYAN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CYAN_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.CAPRI_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CAPRI_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.VIOLET_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.VIOLET_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.MAGENTA_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.MAGENTA_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.PINK_BLAZELITE_BRICKS)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_BRICKS)
                .input(ModTags.Items.BLAZELITE_BRICK_ITEMS)
                .input(ModItems.ROSE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ROSE_BLAZELITE_BRICKS)+"_pigmented"));
    }
    private void offerBlazeliteTileRecipes(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZELITE_TILES, ModBlocks.BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_TILES, ModBlocks.WHITE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_TILES, ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_TILES, ModBlocks.DARK_GRAY_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_TILES, ModBlocks.RED_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_TILES, ModBlocks.ORANGE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_TILES, ModBlocks.YELLOW_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_TILES, ModBlocks.CHARTREUSE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_TILES, ModBlocks.GREEN_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_TILES, ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_TILES, ModBlocks.CYAN_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_TILES, ModBlocks.CAPRI_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_TILES, ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_TILES, ModBlocks.VIOLET_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_TILES, ModBlocks.MAGENTA_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_TILES, ModBlocks.PINK_BLAZELITE_BRICKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_TILES, ModBlocks.ROSE_BLAZELITE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.WHITE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.LIGHT_GRAY_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.DARK_GRAY_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.DARK_GRAY_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.RED_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.ORANGE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ORANGE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.YELLOW_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.CHARTREUSE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CHARTREUSE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.GREEN_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.SPRING_GREEN_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.CYAN_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CYAN_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.CAPRI_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CAPRI_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ULTRAMARINE_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.VIOLET_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.VIOLET_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.MAGENTA_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.MAGENTA_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.PINK_BLAZELITE_TILES)+"_pigmented"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_TILES)
                .input(ModTags.Items.BLAZELITE_TILE_ITEMS)
                .input(ModItems.ROSE_PIGMENT)
                .criterion(hasItem(ModBlocks.BLAZELITE_BRICKS), conditionsFromItem(ModBlocks.BLAZELITE_BRICKS))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ROSE_BLAZELITE_TILES)+"_pigmented"));
    }
    private void offerPigmentRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.REDSTONE)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("red_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.GOLD_NUGGET)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("yellow_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTRAMARINE_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.LAPIS_LAZULI)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("ultramarine_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.QUARTZ)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("white_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.QUARTZ)
                .input(Items.CHARCOAL)
                .input(Items.QUARTZ)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("light_gray_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_GRAY_PIGMENT)
                .input(Items.BLAZE_POWDER)
                .input(Items.QUARTZ)
                .input(Items.CHARCOAL)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("dark_gray_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("pink_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAPRI_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("capri_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("orange_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.YELLOW_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("green_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VIOLET_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("violet_pigment"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHARTREUSE_PIGMENT)
                .group("chartreuse_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.GREEN_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("chartreuse_pigment_yg"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHARTREUSE_PIGMENT)
                .group("chartreuse_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("chartreuse_pigment_yyu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_PIGMENT)
                .group("cyan_pigment")
                .input(ModItems.SPRING_GREEN_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("cyan_pigment_su"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_PIGMENT)
                .group("cyan_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("cyan_pigment_yuuu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPRING_GREEN_PIGMENT)
                .group("spring_green_pigment")
                .input(ModItems.GREEN_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("spring_green_pigment_gu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPRING_GREEN_PIGMENT)
                .group("spring_green_pigment")
                .input(ModItems.YELLOW_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("spring_green_pigment_yuu"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_PIGMENT)
                .group("magenta_pigment")
                .input(ModItems.VIOLET_PIGMENT)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("magenta_pigment_vp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_PIGMENT)
                .group("magenta_pigment")
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.ULTRAMARINE_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("magenta_pigment_rruw"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_PIGMENT)
                .group("rose_pigment")
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.PINK_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("rose_pigment_rp"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_PIGMENT)
                .group("rose_pigment")
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.RED_PIGMENT)
                .input(ModItems.WHITE_PIGMENT)
                .criterion(hasItem(ModItems.BLAZELITE_INGOT), conditionsFromItem(ModItems.BLAZELITE_INGOT))
                .offerTo(exporter, FarestsIdeas.makeId("rose_pigment_rrw"));
    }
    private void offerBlazeliteSlabRecipes() {
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_TILES));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BLOCK));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BRICKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_TILES));

    }
    private void offerBlazeliteStairRecipes() {
        createStairsRecipe(ModBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.WHITE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.DARK_GRAY_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.RED_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.ORANGE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.YELLOW_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.CHARTREUSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.CYAN_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.CAPRI_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.VIOLET_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.MAGENTA_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.PINK_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_TILES));

        createStairsRecipe(ModBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BLOCK));
        createStairsRecipe(ModBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BRICKS));
        createStairsRecipe(ModBlocks.ROSE_BLAZELITE_STAIRS, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_TILES));

    }
    private void offerBlazeliteDoorRecipes() {
        createDoorRecipe(ModBlocks.BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.WHITE_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.DARK_GRAY_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.RED_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.ORANGE_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.YELLOW_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.CHARTREUSE_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.GREEN_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.CYAN_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.CAPRI_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.VIOLET_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.MAGENTA_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.PINK_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BLOCK));
        createDoorRecipe(ModBlocks.ROSE_BLAZELITE_DOOR, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BLOCK));
    }
    private void offerBlazeliteTrapdoorRecipes() {
        createTrapdoorRecipe(ModBlocks.BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.WHITE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.RED_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.ORANGE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.YELLOW_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.CYAN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.CAPRI_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.VIOLET_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.MAGENTA_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.PINK_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BLOCK));
        createTrapdoorRecipe(ModBlocks.ROSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BLOCK));
    }
    private void offerBlazeliteButtonRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLAZELITE_BUTTON, 1)
                .input(ModBlocks.BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.BLAZELITE_BUTTON)));
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.WHITE_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.WHITE_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.WHITE_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.WHITE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LIGHT_GRAY_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.LIGHT_GRAY_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARK_GRAY_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.DARK_GRAY_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RED_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.RED_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.RED_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.RED_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.RED_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORANGE_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.ORANGE_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.ORANGE_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.ORANGE_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ORANGE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOW_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.YELLOW_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.YELLOW_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.YELLOW_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.YELLOW_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CHARTREUSE_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CHARTREUSE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GREEN_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.GREEN_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.GREEN_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.GREEN_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.GREEN_BLAZELITE_BUTTON)));
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SPRING_GREEN_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.SPRING_GREEN_BLAZELITE_BUTTON)));
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CYAN_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.CYAN_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.CYAN_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.CYAN_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CYAN_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CAPRI_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.CAPRI_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.CAPRI_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.CAPRI_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.CAPRI_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ULTRAMARINE_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ULTRAMARINE_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.VIOLET_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.VIOLET_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.VIOLET_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.VIOLET_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.VIOLET_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MAGENTA_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.MAGENTA_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.MAGENTA_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.MAGENTA_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.MAGENTA_BLAZELITE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.PINK_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.PINK_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.PINK_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.PINK_BLAZELITE_BUTTON)));
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ROSE_BLAZELITE_BUTTON, 1)
                .input(ModBlocks.ROSE_BLAZELITE_BLOCK)
                .criterion(hasItem(ModBlocks.ROSE_BLAZELITE_BLOCK), conditionsFromItem(ModBlocks.ROSE_BLAZELITE_BLOCK))
                .offerTo(exporter, FarestsIdeas.makeId(getRecipeName(ModBlocks.ROSE_BLAZELITE_BUTTON)));
    }
    private void offerBlazelitePressurePlateRecipes() {
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.WHITE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.LIGHT_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.DARK_GRAY_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.RED_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.ORANGE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.YELLOW_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.CHARTREUSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.SPRING_GREEN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.CYAN_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.CAPRI_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.ULTRAMARINE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.VIOLET_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.MAGENTA_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.PINK_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_PRESSURE_PLATE));
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.ROSE_BLAZELITE_TRAPDOOR, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_PRESSURE_PLATE));
    }

    private void offerBlazeliteFenceRecipes() {
        createFenceRecipe(ModBlocks.BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.WHITE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.WHITE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.WHITE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.DARK_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.DARK_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.DARK_GRAY_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.RED_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.RED_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.RED_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.ORANGE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.ORANGE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.ORANGE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.YELLOW_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.YELLOW_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.YELLOW_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.CHARTREUSE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.CHARTREUSE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.CHARTREUSE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.GREEN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.GREEN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.GREEN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.CYAN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.CYAN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.CYAN_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.CAPRI_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.CAPRI_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.CAPRI_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.VIOLET_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.VIOLET_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.VIOLET_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.MAGENTA_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.MAGENTA_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.MAGENTA_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.PINK_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.PINK_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.PINK_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_TILES));

        createFenceRecipe(ModBlocks.ROSE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BLOCK));
        createFenceRecipe(ModBlocks.ROSE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BRICKS));
        createFenceRecipe(ModBlocks.ROSE_BLAZELITE_FENCE, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_TILES));

    }
    private void offerBlazeliteFenceGateRecipes() {
        createFenceGateRecipe(ModBlocks.BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.WHITE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.WHITE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.WHITE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.WHITE_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.LIGHT_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.DARK_GRAY_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.DARK_GRAY_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.RED_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.RED_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.RED_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.RED_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.ORANGE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.ORANGE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.ORANGE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ORANGE_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.YELLOW_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.YELLOW_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.YELLOW_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.YELLOW_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.CHARTREUSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CHARTREUSE_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.GREEN_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.SPRING_GREEN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.SPRING_GREEN_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.CYAN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.CYAN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.CYAN_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CYAN_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.CAPRI_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.CAPRI_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.CAPRI_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.CAPRI_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.ULTRAMARINE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ULTRAMARINE_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.VIOLET_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.VIOLET_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.VIOLET_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.VIOLET_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.MAGENTA_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.MAGENTA_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.MAGENTA_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.MAGENTA_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.PINK_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.PINK_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.PINK_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_BLAZELITE_TILES));

        createFenceGateRecipe(ModBlocks.ROSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BLOCK));
        createFenceGateRecipe(ModBlocks.ROSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_BRICKS));
        createFenceGateRecipe(ModBlocks.ROSE_BLAZELITE_FENCE_GATE, Ingredient.ofItems(ModBlocks.ROSE_BLAZELITE_TILES));

    }
}
