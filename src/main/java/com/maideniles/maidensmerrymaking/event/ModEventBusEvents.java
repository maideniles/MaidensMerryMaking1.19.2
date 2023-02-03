package com.maideniles.maidensmerrymaking.event;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.maideniles.maidensmerrymaking.items.armor.item.BunnyHoodArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.item.RedChristmasArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.item.ReindeerEarsArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.render.BunnyHoodArmorRenderer;
import com.maideniles.maidensmerrymaking.items.armor.render.RedChristmasArmorRenderer;
import com.maideniles.maidensmerrymaking.items.armor.render.ReindeerEarsArmorRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent

    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {

        //pink bun//
        event.put(ModEntityTypes.PINK_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PINK_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PINK_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //blue bun//
        event.put(ModEntityTypes.BLUE_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.BLUE_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.BLUE_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //purple bun//
        event.put(ModEntityTypes.PURPLE_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PURPLE_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PURPLE_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //cyan bun//
        event.put(ModEntityTypes.CYAN_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.CYAN_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.CYAN_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //yellow bun//
        event.put(ModEntityTypes.YELLOW_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.YELLOW_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.YELLOW_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());

        event.put(ModEntityTypes.COLORED_CHICKEN.get(), ColoredChickenEntity.setAttributes());
    }



}