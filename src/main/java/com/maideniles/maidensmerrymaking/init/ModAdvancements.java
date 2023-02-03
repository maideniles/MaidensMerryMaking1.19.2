package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.advancement.EggstraordinaireTrigger;
import com.maideniles.maidensmerrymaking.advancement.FrightfulFashionTrigger;
import com.maideniles.maidensmerrymaking.advancement.GreenBeerDrunkTrigger;
import net.minecraft.advancements.CriteriaTriggers;

public class ModAdvancements {

    public static final GreenBeerDrunkTrigger DRUNK_ON_GREEN_BEER = CriteriaTriggers.register(new GreenBeerDrunkTrigger());

    public static final EggstraordinaireTrigger EGGSTRAORDINAIRE = CriteriaTriggers.register(new EggstraordinaireTrigger());

    public static final FrightfulFashionTrigger FRIGHTFUL_FASHION = CriteriaTriggers.register(new FrightfulFashionTrigger());


    public static void init() {}
}
