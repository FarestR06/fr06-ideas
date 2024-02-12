package com.farestr06.ideas.item.custom;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.soul.SoulGathering;
import com.farestr06.ideas.util.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class SoulItem extends Item {

    private final SoulGathering soulGathering;
    private final int usageCost;

    public SoulItem(Settings settings, SoulGathering soulGathering, int usageCost) {
        super(settings.rarity(Rarity.valueOf("SOUL")));
        this.soulGathering = soulGathering;
        this.usageCost = usageCost;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        IEntityDataSaver dataSaver = ((IEntityDataSaver) user);
        if (usageCost >= soulGathering.getSoulAmount(dataSaver)) {
            user.sendMessage(Text.translatable("soul.fr06-ideas.cancelled.not_enough"));
            return ActionResult.FAIL;
        } else {
            soulGathering.subtractSouls(dataSaver, usageCost);
        }
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        try {
            assert context.getPlayer() != null: "Soul Item wasn't used by player!";
            PlayerEntity user = context.getPlayer();
            IEntityDataSaver dataSaver = (IEntityDataSaver) user;
            if (usageCost >= soulGathering.getSoulAmount(dataSaver)) {
                user.sendMessage(Text.translatable("soul.fr06-ideas.cancelled.not_enough"));
                return ActionResult.FAIL;
            } else {
                soulGathering.subtractSouls(dataSaver, usageCost);
                return super.useOnBlock(context);
            }
        } catch (Exception e) {
            FarestsIdeas.LOGGER.debug(e.getMessage());
            return ActionResult.FAIL;
        }
    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        soulGathering.setPlayer(player);
        soulGathering.updateSoulCap((IEntityDataSaver) player);
        return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

    }
}
