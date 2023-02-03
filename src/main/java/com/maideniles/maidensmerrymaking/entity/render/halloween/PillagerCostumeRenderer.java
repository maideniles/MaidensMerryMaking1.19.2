package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.ZombieVillagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class PillagerCostumeRenderer extends IllagerRenderer<Pillager> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/pillager_costume.png");

    protected PillagerCostumeRenderer(EntityRendererProvider.Context p_174182_, IllagerModel<Pillager> p_174183_, float p_174184_) {
        super(p_174182_, p_174183_, p_174184_);
    }


    @Override
    public ResourceLocation getTextureLocation(Pillager p_114482_) {
        return COSTUME_LOCATION;
    }

}