package com.farestr06.ideas.status_effects;

import com.farestr06.ideas.util.ModScaleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import virtuoel.pehkui.api.ScaleTypes;

public class SmallEffect extends StatusEffect {
    private float scale;
    private LivingEntity targetEntity;

    protected SmallEffect() {
        super(
                StatusEffectCategory.NEUTRAL,
                0xD031C9
        );
    }

    private void determineScale(int amplifier){
        switch (amplifier) {
            case 0 -> scale = 0.75f;
            case 1 -> scale = 0.5f;
            case 2 -> scale = 0.25f;
            default -> scale = 1f;
        }
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        targetEntity = entity;
        determineScale(amplifier);
        ModScaleTypes.SHRINKWEED.getScaleData(entity).setScale(scale);
        ScaleTypes.JUMP_HEIGHT.getScaleData(entity).setScale(1);
    }

    @Override
    public void onRemoved(AttributeContainer attributeContainer) {
        super.onRemoved(attributeContainer);
        final LivingEntity entity = targetEntity;
        ModScaleTypes.SHRINKWEED.getScaleData(entity).setScale(1);
    }
}
