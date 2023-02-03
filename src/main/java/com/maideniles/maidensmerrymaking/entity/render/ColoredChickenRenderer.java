package com.maideniles.maidensmerrymaking.entity.render;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;



public class ColoredChickenRenderer extends MobRenderer<Chicken, ChickenModel<Chicken>> {
    private static final ResourceLocation CHICKEN_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID,"textures/entity/colored_chicken.png");

    public ColoredChickenRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new ChickenModel<>(p_173952_.bakeLayer(ModelLayers.CHICKEN)), 0.3F);
    }

    public ResourceLocation getTextureLocation(Chicken p_113998_) {
        return CHICKEN_LOCATION;
    }

    @Override
    protected float getBob(Chicken pLivingBase, float pPartialTicks) {
        float f = Mth.lerp(pPartialTicks, pLivingBase.oFlap, pLivingBase.flap);
        float f1 = Mth.lerp(pPartialTicks, pLivingBase.oFlapSpeed, pLivingBase.flapSpeed);
        return (Mth.sin(f) + 0.9F) * f1;
    }

}