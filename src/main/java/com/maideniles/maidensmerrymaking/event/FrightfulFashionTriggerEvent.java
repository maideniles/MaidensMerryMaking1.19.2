package com.maideniles.maidensmerrymaking.event;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModAdvancements;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class FrightfulFashionTriggerEvent {

    @SubscribeEvent
    public static void onAdvancementGet(AdvancementEvent event) {
        Player player = event.getEntity();
        if (player instanceof ServerPlayer) {
            ModAdvancements.FRIGHTFUL_FASHION.trigger((ServerPlayer) player, event.getAdvancement());
        }
    }
}