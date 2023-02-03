package com.maideniles.maidensmerrymaking.items.armor.model;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.items.armor.item.BunnyHoodArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BunnyHoodArmorModel extends AnimatedGeoModel<BunnyHoodArmorItem> {


    @Override
    public ResourceLocation getModelResource(BunnyHoodArmorItem object) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "geo/bunny_hood.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BunnyHoodArmorItem object) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/models/armor/bunny_hood.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BunnyHoodArmorItem animatable) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "animations/armor_animation.json");
    }
}