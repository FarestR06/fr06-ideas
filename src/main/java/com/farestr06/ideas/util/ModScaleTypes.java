package com.farestr06.ideas.util;

import com.farestr06.ideas.FarestsIdeas;
import virtuoel.pehkui.api.*;

public class ModScaleTypes {
    public static ScaleType SHRINKWEED;
    public static ScaleModifier SHRINKWEED_MODIFIER;
    public static void registerModScaleTypes(){
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModScaleTypes!");

        SHRINKWEED_MODIFIER = ScaleRegistries.register(ScaleRegistries.SCALE_MODIFIERS, FarestsIdeas.makeId("lush_weed_modifier"),
                new TypedScaleModifier(() -> SHRINKWEED));
        ScaleTypes.WIDTH.getDefaultBaseValueModifiers().add(SHRINKWEED_MODIFIER);
        ScaleTypes.HEIGHT.getDefaultBaseValueModifiers().add(SHRINKWEED_MODIFIER);
        ScaleTypes.ATTACK.getDefaultBaseValueModifiers().add(SHRINKWEED_MODIFIER);
        ScaleTypes.HEALTH.getDefaultBaseValueModifiers().add(SHRINKWEED_MODIFIER);

        SHRINKWEED = ScaleRegistries.register(ScaleRegistries.SCALE_TYPES, FarestsIdeas.makeId("lush_weed_type"),
                ScaleType.Builder.create().affectsDimensions().addDependentModifier(SHRINKWEED_MODIFIER).addDependentModifier(ScaleModifiers.MOTION_DIVISOR).build());
    }
}
