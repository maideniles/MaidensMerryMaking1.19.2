package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Spider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class SpiderCostumeRenderer<T extends Spider> extends MobRenderer<T, SpiderModel<T>> {
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/spider_costume.png");

    public SpiderCostumeRenderer(EntityRendererProvider.Context p_174401_) {
        this(p_174401_, ModelLayers.SPIDER);
    }

    public SpiderCostumeRenderer(EntityRendererProvider.Context p_174403_, ModelLayerLocation p_174404_) {
        super(p_174403_, new SpiderModel<>(p_174403_.bakeLayer(p_174404_)), 0.8F);
       // this.addLayer(new SpiderEyesLayer<>(this));
    }

    protected float getFlipDegrees(T p_116011_) {
        return 180.0F;
    }

    @Override
    public ResourceLocation getTextureLocation(Spider p_114482_) {
        return COSTUME_LOCATION;
    }
}