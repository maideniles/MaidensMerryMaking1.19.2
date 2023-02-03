package com.maideniles.maidensmerrymaking.items.armor.render;

import com.maideniles.maidensmerrymaking.items.armor.item.BunnyHoodArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.model.BunnyHoodArmorModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BunnyHoodArmorRenderer extends GeoArmorRenderer<BunnyHoodArmorItem> {
    public BunnyHoodArmorRenderer() {
        super(new BunnyHoodArmorModel());

        this.headBone = "armorHead";

    }
}