package com.maideniles.maidensmerrymaking.entity.render.halloween;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class VindicatorCostumeRenderer extends IllagerRenderer<Vindicator> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/vindicator_costume.png");

    public VindicatorCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new IllagerModel<>(p_173952_.bakeLayer(ModelLayers.VINDICATOR)), 0.3F);

    }

    @Override
    public ResourceLocation getTextureLocation(Vindicator p_114482_) {
        return COSTUME_LOCATION;
    }

}
