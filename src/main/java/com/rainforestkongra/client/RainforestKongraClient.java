package com.rainforestkongra.client;

import com.rainforestkongra.client.render.JaguarRenderer;
import com.rainforestkongra.client.render.KongraRenderer;
import com.rainforestkongra.client.render.ToucanRenderer;
import com.rainforestkongra.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RainforestKongraClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.KONGRA, KongraRenderer::new);
        EntityRendererRegistry.register(ModEntities.JAGUAR, JaguarRenderer::new);
        EntityRendererRegistry.register(ModEntities.TOUCAN, ToucanRenderer::new);
    }
}