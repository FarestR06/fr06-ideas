package com.farestr06.ideas.datagen;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.block.custom.OakSaplingCropBlock;
import com.farestr06.ideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALTPETER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPHITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COFFEE_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHRINKWEED, Models.GENERATED);

        itemModelGenerator.register(ModItems.LANTERNBERRY, Models.GENERATED);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAPHITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAPHENE_BLOCK);

        blockStateModelGenerator.registerCrop(ModBlocks.OAK_SAPLING_CROP, OakSaplingCropBlock.AGE, 0,1,2,3);

        blockStateModelGenerator.registerLog(ModBlocks.MAPLE_LOG).log(ModBlocks.MAPLE_LOG).wood(ModBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAPLE_LOG).log(ModBlocks.STRIPPED_MAPLE_LOG).wood(ModBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAPLE_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_OAK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_SPRUCE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_BIRCH_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_JUNGLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_ACACIA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_DARK_OAK_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_AZALEA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_FLOWERING_AZALEA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_MANGROVE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_CHERRY_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CREEPING_MAPLE_LEAVES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_BLOCK);
    }
}
