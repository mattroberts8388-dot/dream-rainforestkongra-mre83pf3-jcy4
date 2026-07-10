package com.rainforestkongra;

import com.rainforestkongra.entity.JaguarEntity;
import com.rainforestkongra.entity.KongraEntity;
import com.rainforestkongra.entity.ToucanEntity;
import com.rainforestkongra.item.ModItems;
import com.rainforestkongra.rain.RainDamageHandler;
import com.rainforestkongra.registry.ModEntities;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RainforestKongraMod implements ModInitializer {
    public static final String MOD_ID = "rainforestkongra";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Rainforest Ecosystem & Kongra");

        ModItems.register();
        ModEntities.register();

        FabricDefaultAttributeRegistry.register(ModEntities.KONGRA, KongraEntity.createKongraAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.JAGUAR, JaguarEntity.createJaguarAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TOUCAN, ToucanEntity.createToucanAttributes());

        RainDamageHandler.register();

        LOGGER.info("Rainforest Ecosystem & Kongra loaded!");
    }
}