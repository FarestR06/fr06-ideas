package com.farestr06.ideas.datagen;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.block.custom.OakSaplingCropBlock;
import com.farestr06.ideas.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
        addDrop(ModBlocks.GRAPHITE_BLOCK);
        addDrop(ModBlocks.GRAPHENE_BLOCK);

        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);

        addDrop(ModBlocks.MAPLE_LEAVES, leavesDrops(ModBlocks.MAPLE_LEAVES, Blocks.OAK_SAPLING, LEAVES_STICK_DROP_CHANCE));

        BlockStatePropertyLootCondition.Builder oakSaplingBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.OAK_SAPLING_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(OakSaplingCropBlock.AGE, 3));
        addDrop(ModBlocks.OAK_SAPLING_CROP, cropDrops(ModBlocks.OAK_SAPLING_CROP, Items.OAK_SAPLING, ModItems.ACORN, oakSaplingBuilder));
        addDrop(ModBlocks.OAK_SAPLING_CROP, cropDrops(ModBlocks.OAK_SAPLING_CROP, Items.OAK_SAPLING, ModItems.ACORN, oakSaplingBuilder));

    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public LootTable.Builder PlentifulOreDrops(Block drop, Item item, float min, float max) {
            return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                    ((LeafEntry.Builder)ItemEntry.builder(item)
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                    .create(min, max))))
                            .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
        }
}
