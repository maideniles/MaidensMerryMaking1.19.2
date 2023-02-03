package com.maideniles.maidensmerrymaking.items.armor.model;// Made with Blockbench 4.0.5
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.items.armor.item.ReindeerEarsArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReindeerEarsArmorModel extends AnimatedGeoModel<ReindeerEarsArmorItem> {


    @Override
    public ResourceLocation getModelResource(ReindeerEarsArmorItem object) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "geo/reindeer_ears.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ReindeerEarsArmorItem object) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/models/armor/reindeer_ears.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ReindeerEarsArmorItem animatable) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "animations/armor_animation.json");
    }
}