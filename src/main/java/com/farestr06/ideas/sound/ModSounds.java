package com.farestr06.ideas.sound;

import com.farestr06.ideas.FarestsIdeas;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent ITEM_ARMOR_EQUIP_BLAZELITE =  registerSoundEvent("item.armor.equip.blazelite");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = FarestsIdeas.makeId(name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {
        FarestsIdeas.LOGGER.info("Go go gadget " + FarestsIdeas.MOD_ID + ":registerModSounds!");
    }
}
