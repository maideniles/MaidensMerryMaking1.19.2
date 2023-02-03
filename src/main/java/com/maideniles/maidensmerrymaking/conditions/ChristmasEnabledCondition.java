package com.maideniles.maidensmerrymaking.conditions;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ChristmasEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("christmas_enabled");
    }

    @Override
    public boolean test(IContext context) {
        return MerryMakingCommonConfig.CHRISTMAS_ENABLED.get();
    }



    public static class Serializer implements IConditionSerializer<ChristmasEnabledCondition> {


        @Override
        public void write(JsonObject json, ChristmasEnabledCondition value) { }

        @Override
        public ChristmasEnabledCondition read(JsonObject json) {
            return new ChristmasEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("christmas_enabled");
        }
    }
}
