package com.maideniles.maidensmerrymaking.items.armor.render;

import com.maideniles.maidensmerrymaking.items.armor.item.RedChristmasArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.model.RedChristmasArmorModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RedChristmasArmorRenderer extends GeoArmorRenderer<RedChristmasArmorItem> {
    public RedChristmasArmorRenderer() {
        super(new RedChristmasArmorModel());

        this.headBone = "armorHead";

    }
}