package com.farestr06.deeperdepths.client;

import com.farestr06.deeperdepths.entity.ModEntities;
import com.farestr06.deeperdepths.entity.client.PrimordialSlimeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class DeeperDepthsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PRIMORDIAL_SLIME, PrimordialSlimeEntityRenderer::new);
    }
}
