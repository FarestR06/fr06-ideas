package com.farestr06.ideas.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class SaltItem extends Item {
    public SaltItem(Settings settings) {
        super(settings);
    }

    @SuppressWarnings("resource")
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient){
            BlockPos positionClicked = context.getBlockPos();

            int sx = positionClicked.getX();
            int sy = positionClicked.getY();
            int sz = positionClicked.getZ();
            boolean iceBroken = false;
            BlockState state;

            for(int i1 = -2; i1 <= 2; i1++){
                for(int i2 = -1; i2 <= 0; i2++) {
                    for (int i3 = -2; i3 <= 2; i3++) {
                        BlockPos iceSearchCoords = new BlockPos(sx + i1, sy + i2, sz + i3);
                        state = context.getWorld().getBlockState(iceSearchCoords);
                        if (isIceBlock(state)) {
                            Block.replace(state, Blocks.AIR.getDefaultState(), context.getWorld(), iceSearchCoords, 0);
                            iceBroken = true;
                        }
                    }
                }
            }
            if(iceBroken) {
                context.getStack().decrement(1);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    private boolean isIceBlock(BlockState state) {
        return state.isOf(Blocks.ICE) || state.isOf(Blocks.PACKED_ICE);
    }
}
