package com.rainforestkongra.client.render;

import com.rainforestkongra.RainforestKongraMod;
import com.rainforestkongra.entity.JaguarEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.OcelotEntityModel;
import net.minecraft.util.Identifier;

public class JaguarRenderer extends MobEntityRenderer<JaguarEntity, OcelotEntityModel<JaguarEntity>> {
    private static final Identifier TEXTURE = new Identifier(RainforestKongraMod.MOD_ID, "textures/entity/jaguar.png");

    public JaguarRenderer(EntityRendererFactory.Context context) {
        super(context, new OcelotEntityModel<>(context.getPart(EntityModelLayers.OCELOT)), 0.5f);
    }

    @Override
    public Identifier getTexture(JaguarEntity entity) {
        return TEXTURE;
    }
}