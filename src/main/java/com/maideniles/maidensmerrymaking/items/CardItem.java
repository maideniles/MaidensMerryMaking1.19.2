package com.maideniles.maidensmerrymaking.items;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class CardItem extends Item {
    public CardItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player entity, InteractionHand hand) {
        ItemStack stack = new ItemStack(Items.DIAMOND);

        if (!entity.getInventory().add(stack)) {
            entity.drop(stack, false);
        }
        entity.sendSystemMessage(Component.literal("Happy Easter! Don't spend it all in one place! Love, Grandma"));

        stack.shrink(1);

        return InteractionResultHolder.consume(stack);
    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        if(!Screen.hasShiftDown()){
            tooltip.add(Component.translatable("tooltip.maidensmerrymaking.easter_card_shift").withStyle(ChatFormatting.GRAY));
        }else {
            tooltip.add(Component.translatable("tooltip.maidensmerrymaking.easter_card").withStyle(ChatFormatting.GRAY));
        }


    }

}

