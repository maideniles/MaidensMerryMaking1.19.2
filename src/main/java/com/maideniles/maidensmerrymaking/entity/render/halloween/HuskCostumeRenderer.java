package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Husk;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class HuskCostumeRenderer extends MobRenderer<Husk, ZombieModel<Husk>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/husk_costume.png");

    public HuskCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new ZombieModel<>(p_173952_.bakeLayer(ModelLayers.HUSK)), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(Husk p_114482_) {
        return COSTUME_LOCATION;
    }

}