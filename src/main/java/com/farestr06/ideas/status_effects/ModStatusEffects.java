package com.farestr06.ideas.status_effects;

import com.farestr06.ideas.FarestsIdeas;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModStatusEffects {

    public static final StatusEffect VOIDED = registerStatusEffect("voided", new VoidedEffect().addAttributeModifier(
            EntityAttributes.GENERIC_ARMOR,
            "d2c51945-bdf1-489a-a3ce-9d5e4633feb4",
            -0.2f,
            EntityAttributeModifier.Operation.MULTIPLY_TOTAL
    ).addAttributeModifier(
            EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
            "835838de-26f3-47f8-a37a-cc95295a2714",
            -0.3f,
            EntityAttributeModifier.Operation.MULTIPLY_TOTAL
    ));

    public static final StatusEffect SMALL = registerStatusEffect("small", new SmallEffect());
    public static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, FarestsIdeas.makeId(name), effect);
    }

    public static void registerModStatusEffects() {
        FarestsIdeas.LOGGER.info("Registering Mod Status Effects for " + FarestsIdeas.MOD_ID);
    }
}
