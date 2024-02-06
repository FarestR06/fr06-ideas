package com.farestr06.ideas.status_effects;

import com.farestr06.ideas.ModDamageTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class VoidedEffect extends StatusEffect {
    protected VoidedEffect() {
        super(
            StatusEffectCategory.HARMFUL,
            0xcc00fa
        );
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        super.onApplied(entity, amplifier);
        entity.damage(ModDamageTypes.of(entity.getWorld(), ModDamageTypes.VOIDED), (0.75f*(amplifier+1)));
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);
        entity.damage(ModDamageTypes.of(entity.getWorld(), ModDamageTypes.VOIDED), ((amplifier + 1)*0.8f));
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 30 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }

}
