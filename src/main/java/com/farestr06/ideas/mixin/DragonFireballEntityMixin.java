package com.farestr06.ideas.mixin;

import com.farestr06.ideas.status_effects.ModStatusEffects;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.projectile.DragonFireballEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DragonFireballEntity.class)
public class DragonFireballEntityMixin {
    @Redirect(method = "onCollision(Lnet/minecraft/util/hit/HitResult;)V",at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/AreaEffectCloudEntity;addEffect(Lnet/minecraft/entity/effect/StatusEffectInstance;)V"))
    private void injected(AreaEffectCloudEntity instance, StatusEffectInstance effect) {
        instance.addEffect(new StatusEffectInstance(ModStatusEffects.VOIDED, 150, 1));
    }
}
