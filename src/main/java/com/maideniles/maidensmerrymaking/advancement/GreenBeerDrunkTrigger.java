package com.maideniles.maidensmerrymaking.advancement;

import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.PlayerAdvancements;
import net.minecraft.server.level.ServerPlayer;
public class GreenBeerDrunkTrigger extends SimpleCriterionTrigger<GreenBeerDrunkTrigger.Instance> {

    public static final ResourceLocation ID = MaidensMerryMaking.prefix("drunk_on_green_beer");

    @Override
    public ResourceLocation getId() {
        return ID;
    }

    @Override
    protected GreenBeerDrunkTrigger.Instance createInstance(JsonObject json, EntityPredicate.Composite player, DeserializationContext ctx) {
        return new GreenBeerDrunkTrigger.Instance(player);
    }

    public void trigger(ServerPlayer player) {
        this.trigger(player, (instance) -> true);
    }


    public static class Instance extends AbstractCriterionTriggerInstance {
        public Instance(EntityPredicate.Composite player) {
            super(GreenBeerDrunkTrigger.ID, player);
        }

        public static Instance drinkBeer() {
            return new Instance(EntityPredicate.Composite.ANY);
        }

    }
}