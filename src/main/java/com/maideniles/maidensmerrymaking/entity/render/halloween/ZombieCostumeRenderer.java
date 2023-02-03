package com.maideniles.maidensmerrymaking.entity.render.halloween;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.AbstractZombieRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.entity.monster.Zombie;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class ZombieCostumeRenderer extends AbstractZombieRenderer<Zombie, ZombieModel<Zombie>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/zombie_costume.png");

    public ZombieCostumeRenderer(EntityRendererProvider.Context p_174456_) {
        this(p_174456_, ModelLayers.ZOMBIE, ModelLayers.ZOMBIE_INNER_ARMOR, ModelLayers.ZOMBIE_OUTER_ARMOR);
    }

    public ZombieCostumeRenderer(EntityRendererProvider.Context p_174458_, ModelLayerLocation p_174459_, ModelLayerLocation p_174460_, ModelLayerLocation p_174461_) {
        super(p_174458_, new ZombieModel<>(p_174458_.bakeLayer(p_174459_)), new ZombieModel<>(p_174458_.bakeLayer(p_174460_)), new ZombieModel<>(p_174458_.bakeLayer(p_174461_)));
    }

    @Override
    public ResourceLocation getTextureLocation(Zombie p_114482_) {
        return COSTUME_LOCATION;
    }

}

