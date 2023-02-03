package com.maideniles.maidensmerrymaking.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CloverItem extends Item {

    public CloverItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player entity, InteractionHand hand) {
        ItemStack stack = entity.getItemInHand(hand);

        entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 2600, 0));

        stack.getItem().setDamage(stack, 1);

        return InteractionResultHolder.consume(stack);
    }


}