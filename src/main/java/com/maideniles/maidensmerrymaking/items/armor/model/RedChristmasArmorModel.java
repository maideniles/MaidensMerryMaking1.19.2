package com.maideniles.maidensmerrymaking.items.armor.model;// Made with Blockbench 4.0.5
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.items.armor.item.RedChristmasArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedChristmasArmorModel extends AnimatedGeoModel<RedChristmasArmorItem> {


	@Override
	public ResourceLocation getModelResource(RedChristmasArmorItem object) {
		return new ResourceLocation(MaidensMerryMaking.MOD_ID, "geo/red_santa_hat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedChristmasArmorItem object) {
		return new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/models/armor/red_santa_hat.png");
	}

	@Override
	public ResourceLocation getAnimationResource(RedChristmasArmorItem animatable) {
		return new ResourceLocation(MaidensMerryMaking.MOD_ID, "animations/armor_animation.json");
	}
}