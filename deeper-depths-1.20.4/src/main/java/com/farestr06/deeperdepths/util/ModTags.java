package com.farestr06.deeperdepths.util;

import com.farestr06.deeperdepths.DeeperDepths;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> BLAZELITE_BLOCK_TAGS = createTag("blazelite_block_tags");
        public static final TagKey<Block> BLAZELITE_BLOCKS = createTag("blazelite_blocks");
        public static final TagKey<Block> BLAZELITE_BRICKS = createTag("blazelite_blocks");
        public static final TagKey<Block> BLAZELITE_TILES = createTag("blazelite_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, DeeperDepths.makeId(name));
        }

    }

    public static class Items {
        public static final TagKey<Item> BLAZELITE_BLOCK_ITEMS = createTag("blazelite_blocks");
        public static final TagKey<Item> BLAZELITE_BRICK_ITEMS = createTag("blazelite_bricks");
        public static final TagKey<Item> BLAZELITE_TILE_ITEMS = createTag("blazelite_tiles");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, DeeperDepths.makeId(name));
        }
    }
}
