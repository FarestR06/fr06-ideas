package com.farestr06.ideas.mixin;

import com.farestr06.ideas.soul.SoulGathering;
import com.farestr06.ideas.util.IEntityDataSaver;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject(at = @At("HEAD"), method = "onKilledOther")
    private void injected(ServerWorld world, LivingEntity other, CallbackInfoReturnable<Boolean> cir){
        SoulGathering.addSoul((IEntityDataSaver) this);
    }
}
