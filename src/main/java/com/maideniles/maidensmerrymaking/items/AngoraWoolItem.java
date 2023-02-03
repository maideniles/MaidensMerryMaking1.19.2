package com.maideniles.maidensmerrymaking.items;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class AngoraWoolItem extends Item {


    public AngoraWoolItem(Properties p_41383_) {
        super(p_41383_);
    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        if(!Screen.hasShiftDown()){
            tooltip.add(Component.translatable("tooltip.maidensmerrymaking.angora_wool_shift").withStyle(ChatFormatting.GRAY));
        }else {
            tooltip.add(Component.translatable("tooltip.maidensmerrymaking.angora_wool").withStyle(ChatFormatting.GRAY));
        }


    }
}
