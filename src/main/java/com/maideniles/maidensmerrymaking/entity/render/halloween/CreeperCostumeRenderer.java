package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.CreeperModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;




public class CreeperCostumeRenderer extends MobRenderer<Creeper, CreeperModel<Creeper>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/creeper_costume.png");

    public CreeperCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new CreeperModel<>(p_173952_.bakeLayer(ModelLayers.CREEPER)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(Creeper p_114482_) {
        return COSTUME_LOCATION;
    }



}