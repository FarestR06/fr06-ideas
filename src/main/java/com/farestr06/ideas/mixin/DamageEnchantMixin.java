package com.farestr06.ideas.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DamageEnchantment.class)
public abstract class DamageEnchantMixin {
	@ModifyReturnValue(method = "isAcceptableItem", at = @At("RETURN"))
	public boolean isAcceptableItem(boolean original, ItemStack stack) { return stack.getItem() instanceof TridentItem || original;
	}
}