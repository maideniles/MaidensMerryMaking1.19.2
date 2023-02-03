package com.maideniles.maidensmerrymaking.items.armor.render;

import com.maideniles.maidensmerrymaking.items.armor.item.ReindeerEarsArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.model.ReindeerEarsArmorModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ReindeerEarsArmorRenderer extends GeoArmorRenderer<ReindeerEarsArmorItem> {
    public ReindeerEarsArmorRenderer() {
        super(new ReindeerEarsArmorModel());

        this.headBone = "armorHead";

    }
}