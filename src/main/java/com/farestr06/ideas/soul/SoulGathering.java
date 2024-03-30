package com.farestr06.ideas.soul;

import com.farestr06.ideas.util.IEntityDataSaver;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

import java.util.ArrayList;
import java.util.List;

public class SoulGathering {

    private final List<Integer> soulModifiers = new ArrayList<>();
    private PlayerEntity player;

    public SoulGathering(int modifier) {
        soulModifiers.add(modifier);
    }



    public void setPlayer(PlayerEntity player) {
        this.player = player;
    }

    private int getTotalSoulCap() {
        int soulCap = 0;
        for(int i = 0; i <= soulModifiers.size(); i++){
            soulCap += soulModifiers.get(i);
        }
        return soulCap;
    }

    // NBT

    public void updateSoulCap(IEntityDataSaver player) {
        NbtCompound nbt = player.fr06_ideas$getPersistentData();
        nbt.putInt("soul_cap", getTotalSoulCap());
    }

    public int getSoulAmount(IEntityDataSaver player) {
        NbtCompound nbt = player.fr06_ideas$getPersistentData();
        return nbt.getInt("soul_counter");
    }

    public static void addSoul(IEntityDataSaver player) {
        NbtCompound nbt = player.fr06_ideas$getPersistentData();
        nbt.putInt("soul_counter", nbt.getInt("soul_counter") + 1);
    }

    public void subtractSouls(IEntityDataSaver player, int cost) {
        NbtCompound nbt = player.fr06_ideas$getPersistentData();
        nbt.putInt("soul_counter", nbt.getInt("soul_counter") - cost);
    }
}
