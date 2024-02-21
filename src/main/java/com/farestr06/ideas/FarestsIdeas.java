package com.farestr06.ideas;

import com.farestr06.ideas.block.ModBlocks;
import com.farestr06.ideas.entity.ModEntities;
import com.farestr06.ideas.entity.custom.CavefowlEntity;
import com.farestr06.ideas.item.ModItemGroups;
import com.farestr06.ideas.item.ModItems;
import com.farestr06.ideas.item.potion.ModPotions;
import com.farestr06.ideas.status_effects.ModStatusEffects;
import com.farestr06.ideas.util.ModScaleTypes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarestsIdeas implements ModInitializer {

    public static final String MOD_ID = "fr06-ideas";
    public static final Logger LOGGER = LoggerFactory.getLogger("fr06-ideas");
    public static Identifier makeId(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitialize() {

        ModScaleTypes.registerModScaleTypes();
        ModStatusEffects.registerModStatusEffects();
        ModItemGroups.registerItemGroups();
        ModPotions.registerModPotions();
        ModPotions.registerModPotionRecipes();

        ModItems.registerModItems();
        ModItems.registerModFuels();
        ModBlocks.registerModBlocks();

        FabricDefaultAttributeRegistry.register(ModEntities.CAVEFOWL, CavefowlEntity.createCavefowlAttributes());
    }

}
