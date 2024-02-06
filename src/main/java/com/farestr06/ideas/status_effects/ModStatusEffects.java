package com.farestr06.ideas.status_effects;

import com.farestr06.ideas.FarestsIdeas;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    public static final StatusEffect VOIDED = registerStatusEffect("voided", new VoidedEffect().addAttributeModifier(
            EntityAttributes.GENERIC_ARMOR,
            "F869BF21-6283-8ABC-E201-A67BD9EF91A3",
            -0.2f,
            EntityAttributeModifier.Operation.MULTIPLY_TOTAL
    ).addAttributeModifier(
            EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
            "F869BF21-6283-8ABC-E271-A67BD2DF91A3",
            -0.3f,
            EntityAttributeModifier.Operation.MULTIPLY_TOTAL
    ));
    public static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(FarestsIdeas.MOD_ID, name), effect);
    }

    public static void registerModStatusEffects() {
        FarestsIdeas.LOGGER.info("Registering Mod Status Effects for " + FarestsIdeas.MOD_ID);
    }
}
