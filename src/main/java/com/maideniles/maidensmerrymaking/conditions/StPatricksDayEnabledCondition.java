package com.maideniles.maidensmerrymaking.conditions;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class StPatricksDayEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("st_patricks_day_enabled");
    }

    @Override
    public boolean test(IContext context) {
        return MerryMakingCommonConfig.ST_PATRICKS_DAY_ENABLED.get();
    }



    public static class Serializer implements IConditionSerializer<StPatricksDayEnabledCondition> {


        @Override
        public void write(JsonObject json, StPatricksDayEnabledCondition value) { }

        @Override
        public StPatricksDayEnabledCondition read(JsonObject json) {
            return new StPatricksDayEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("st_patricks_day_enabled");
        }
    }
}
