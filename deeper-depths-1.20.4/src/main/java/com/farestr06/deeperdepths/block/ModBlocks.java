package com.farestr06.deeperdepths.block;

import com.farestr06.deeperdepths.DeeperDepths;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;

public class ModBlocks {

    public static final Block SOUL_SILT = registerBlock("soul_silt",
            new ColoredFallingBlock(new ColorCode(0x49372c), FabricBlockSettings.copyOf(Blocks.SAND).sounds(BlockSoundGroup.SOUL_SAND)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, DeeperDepths.makeId(name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, DeeperDepths.makeId(name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DeeperDepths.LOGGER.info("Registering ModBlocks for " + DeeperDepths.MOD_ID);
    }
}
