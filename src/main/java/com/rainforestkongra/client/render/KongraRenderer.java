package com.rainforestkongra.client.render;

import com.rainforestkongra.RainforestKongraMod;
import com.rainforestkongra.entity.KongraEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;

public class KongraRenderer extends MobEntityRenderer<KongraEntity, ZombieEntityModel<KongraEntity>> {
    private static final Identifier TEXTURE = new Identifier(RainforestKongraMod.MOD_ID, "textures/entity/kongra.png");

    public KongraRenderer(EntityRendererFactory.Context context) {
        super(context, new ZombieEntityModel<>(context.getPart(EntityModelLayers.ZOMBIE)), 0.9f);
    }

    @Override
    public Identifier getTexture(KongraEntity entity) {
        return TEXTURE;
    }

    @Override
    protected void scale(KongraEntity entity, net.minecraft.client.util.math.MatrixStack matrices, float amount) {
        matrices.scale(1.6f, 1.6f, 1.6f);
        super.scale(entity, matrices, amount);
    }
}