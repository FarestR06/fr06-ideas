package com.farestr06.ideas.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.InfestedBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;

public class CreepingLeavesBlock extends InfestedBlock {
    public CreepingLeavesBlock(Block regularBlock, Settings settings) {
        super(regularBlock, settings);
    }

    private void spawnCreeper(ServerWorld world, BlockPos pos) {
        CreeperEntity creeperEntity = EntityType.CREEPER.create(world);
        if (creeperEntity != null) {
            creeperEntity.refreshPositionAndAngles((double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, 0.0f, 0.0f);
            world.spawnEntity(creeperEntity);
            creeperEntity.playSpawnEffects();
        }
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, tool) == 0 || tool.isOf(Items.SHEARS))) {
            this.spawnCreeper(world, pos);
        }
    }
}
