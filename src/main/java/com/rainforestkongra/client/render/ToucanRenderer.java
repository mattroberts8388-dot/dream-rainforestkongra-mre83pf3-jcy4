package com.rainforestkongra.client.render;

import com.rainforestkongra.RainforestKongraMod;
import com.rainforestkongra.entity.ToucanEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.ParrotEntityModel;
import net.minecraft.util.Identifier;

public class ToucanRenderer extends MobEntityRenderer<ToucanEntity, ParrotEntityModel<ToucanEntity>> {
    private static final Identifier TEXTURE = new Identifier(RainforestKongraMod.MOD_ID, "textures/entity/toucan.png");

    public ToucanRenderer(EntityRendererFactory.Context context) {
        super(context, new ParrotEntityModel<>(context.getPart(EntityModelLayers.PARROT)), 0.3f);
    }

    @Override
    public Identifier getTexture(ToucanEntity entity) {
        return TEXTURE;
    }
}