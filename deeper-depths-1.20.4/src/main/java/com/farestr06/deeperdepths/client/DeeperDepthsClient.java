package com.farestr06.deeperdepths.client;

import com.farestr06.deeperdepths.block.BlazeliteBlocks;
import com.farestr06.deeperdepths.entity.ModEntities;
import com.farestr06.deeperdepths.entity.client.PrimordialSlimeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class DeeperDepthsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PRIMORDIAL_SLIME, PrimordialSlimeEntityRenderer::new);
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.WHITE_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.LIGHT_GRAY_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.DARK_GRAY_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.RED_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.ORANGE_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.YELLOW_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.CHARTREUSE_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.GREEN_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.SPRING_GREEN_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.CYAN_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.CAPRI_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.ULTRAMARINE_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.VIOLET_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.MAGENTA_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.PINK_BLAZELITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlazeliteBlocks.ROSE_BLAZELITE_DOOR, RenderLayer.getCutout());
    }
}
