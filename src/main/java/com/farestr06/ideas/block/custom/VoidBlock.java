package com.farestr06.ideas.block.custom;

import com.farestr06.ideas.ModDamageTypes;
import com.farestr06.ideas.status_effects.ModStatusEffects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class VoidBlock extends Block {

    private final StatusEffectInstance voided = new StatusEffectInstance
            (ModStatusEffects.VOIDED, 200, 0);

    public VoidBlock(Settings settings) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if(entity instanceof LivingEntity){
            ((LivingEntity) entity).addStatusEffect(voided);
        }else if (entity instanceof ItemEntity){
            entity.damage(ModDamageTypes.of(entity.getWorld(), ModDamageTypes.VOIDED), 5);
        }
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}
