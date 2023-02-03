package com.maideniles.maidensmerrymaking.entity.render.halloween;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class EvokerCostumeRenderer extends IllagerRenderer<Evoker> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/evoker_costume.png");

    public EvokerCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new IllagerModel<>(p_173952_.bakeLayer(ModelLayers.EVOKER)), 0.3F);
        //this.addLayer(new ItemInHandLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Evoker p_114482_) {
        return COSTUME_LOCATION;
    }

}
