package com.maideniles.maidensmerrymaking.conditions;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class HalloweenEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("christmas_enabled");
    }

    @Override
    public boolean test(IContext context) {
        return MerryMakingCommonConfig.HALLOWEEN_ENABLED.get();
    }


    public static class Serializer implements IConditionSerializer<HalloweenEnabledCondition> {


        @Override
        public void write(JsonObject json, HalloweenEnabledCondition value) { }

        @Override
        public HalloweenEnabledCondition read(JsonObject json) {
            return new HalloweenEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("halloween_enabled");
        }
    }
}
