package com.farestr06.ideas.datagen;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
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

    }
}
