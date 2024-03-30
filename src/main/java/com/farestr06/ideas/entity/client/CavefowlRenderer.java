package com.farestr06.ideas.entity.client;

import com.farestr06.ideas.FarestsIdeas;
import com.farestr06.ideas.entity.custom.CavefowlEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class CavefowlRenderer extends MobEntityRenderer<CavefowlEntity, CavefowlModel<CavefowlEntity>> {

    private static final Identifier TEXTURE = FarestsIdeas.makeId("textures/entity/cavefowl.png");
    public CavefowlRenderer(EntityRendererFactory.Context context) {
        super(context, new CavefowlModel<>(context.getPart(ModModelLayers.CAVEFOWL)), 0.6f);
    }

    @Override
    public Identifier getTexture(CavefowlEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CavefowlEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected float getAnimationProgress(CavefowlEntity cavefowlEntity, float f) {
        float g = MathHelper.lerp(f, cavefowlEntity.prevFlapProgress, cavefowlEntity.flapProgress);
        float h = MathHelper.lerp(f, cavefowlEntity.prevMaxWingDeviation, cavefowlEntity.maxWingDeviation);
        return (MathHelper.sin(g) + 1.0f) * h;
    }
}
