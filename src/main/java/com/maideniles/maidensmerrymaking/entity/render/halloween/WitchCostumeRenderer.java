package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.WitchModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.layers.WitchItemLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Witch;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class WitchCostumeRenderer extends MobRenderer<Witch, WitchModel<Witch>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/witch_costume.png");


    public WitchCostumeRenderer(EntityRendererProvider.Context p_174443_) {
        super(p_174443_, new WitchModel<>(p_174443_.bakeLayer(ModelLayers.WITCH)), 0.5F);
        this.addLayer(new WitchItemLayer<>(this, p_174443_.getItemInHandRenderer()));
    }

    public void render(Witch p_116412_, float p_116413_, float p_116414_, PoseStack p_116415_, MultiBufferSource p_116416_, int p_116417_) {
        this.model.setHoldingItem(!p_116412_.getMainHandItem().isEmpty());
        super.render(p_116412_, p_116413_, p_116414_, p_116415_, p_116416_, p_116417_);
    }

    @Override
    public ResourceLocation getTextureLocation(Witch p_114482_) {
        return COSTUME_LOCATION;
    }

}
