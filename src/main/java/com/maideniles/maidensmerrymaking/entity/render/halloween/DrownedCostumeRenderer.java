package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.DrownedModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class DrownedCostumeRenderer extends MobRenderer<Drowned, DrownedModel<Drowned>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/merman_costume.png");

    public DrownedCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new DrownedModel<>(p_173952_.bakeLayer(ModelLayers.DROWNED)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(Drowned p_114482_) {
        return COSTUME_LOCATION;
    }

}