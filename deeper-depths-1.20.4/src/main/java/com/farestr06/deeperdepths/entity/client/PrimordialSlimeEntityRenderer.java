package com.farestr06.deeperdepths.entity.client;

import com.farestr06.deeperdepths.DeeperDepths;
import com.farestr06.deeperdepths.entity.custom.PrimordialSlimeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class PrimordialSlimeEntityRenderer extends
        MobEntityRenderer<PrimordialSlimeEntity, SlimeEntityModel<PrimordialSlimeEntity>> {

    private static final Identifier TEXTURE = DeeperDepths.makeId("textures/entity/primordial_slime.png");

    public PrimordialSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 1);
    }

    @Override
    public void render(PrimordialSlimeEntity primordialSlimeEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        this.shadowRadius = 0.25f * (float)primordialSlimeEntity.getSize();
        super.render(primordialSlimeEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected void scale(PrimordialSlimeEntity primordialSlimeEntity, MatrixStack matrixStack, float f) {
        // I shouldn't be copying code from Mojang, but eh...
        float g = 0.750f;
        matrixStack.scale(0.750f, 0.750f, 0.999f);
        matrixStack.translate(0.0f, 0.001f, 0.0f);
        float h = primordialSlimeEntity.getSize();
        float i = MathHelper.lerp(f, primordialSlimeEntity.lastStretch, primordialSlimeEntity.stretch) / (h * 0.5f + 1.0f);
        float j = 1.0f / (i + 1.0f);
        matrixStack.scale(j * h, 1.0f / j * h, j * h);
    }

    @Override
    public Identifier getTexture(PrimordialSlimeEntity entity) {
        return TEXTURE;
    }
}
