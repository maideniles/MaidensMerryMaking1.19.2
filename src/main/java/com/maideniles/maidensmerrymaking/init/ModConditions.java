package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.conditions.ChristmasEnabledCondition;
import com.maideniles.maidensmerrymaking.conditions.EasterEnabledCondition;
import com.maideniles.maidensmerrymaking.conditions.HalloweenEnabledCondition;
import com.maideniles.maidensmerrymaking.conditions.StPatricksDayEnabledCondition;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class ModConditions {



    @SubscribeEvent
    public static Object registerConditionSerializers(RegisterEvent event) {
        if(Objects.equals(event.getForgeRegistry(), ForgeRegistries.RECIPE_SERIALIZERS)) {

            CraftingHelper.register(new ChristmasEnabledCondition.Serializer());
            CraftingHelper.register(new StPatricksDayEnabledCondition.Serializer());
            CraftingHelper.register(new EasterEnabledCondition.Serializer());
            CraftingHelper.register(new HalloweenEnabledCondition.Serializer());

        }
        return null;
    }

}