package com.maideniles.maidensmerrymaking.conditions;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class EasterEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("easter_enabled");
    }

    @Override
    public boolean test(IContext context) {
        return MerryMakingCommonConfig.EASTER_ENABLED.get();
    }



    public static class Serializer implements IConditionSerializer<EasterEnabledCondition> {


        @Override
        public void write(JsonObject json, EasterEnabledCondition value) { }

        @Override
        public EasterEnabledCondition read(JsonObject json) {
            return new EasterEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("easter_enabled");
        }
    }
}
