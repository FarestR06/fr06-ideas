package com.farestr06.ideas.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class BagOfSoulsEnchantment extends Enchantment {
    protected BagOfSoulsEnchantment() {
        super(Rarity.COMMON, EnchantmentTarget.ARMOR, new EquipmentSlot[] {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    @Override
    public int getMinPower(int level) {
        return super.getMinPower(level);
    }
}
