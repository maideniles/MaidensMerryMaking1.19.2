package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModAdvancements;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;



public class ChocolateBunnyItem extends Item {
    public int DRINK_COUNT;



    public ChocolateBunnyItem(Item.Properties builder) {
        super(builder);

    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack finishUsingItem(ItemStack stack, Level pLevel, LivingEntity entityLiving) {
        ServerPlayer entity = (ServerPlayer)entityLiving;
        super.finishUsingItem(stack, pLevel, entityLiving);
        if (entityLiving instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, stack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
            stack.shrink(1);

            DRINK_COUNT++;


        }

        if (!pLevel.isClientSide()) {
            if (DRINK_COUNT >= 1 && DRINK_COUNT <5) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.JUMP,400));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0));
            }


            if (DRINK_COUNT == 5) {

                entityLiving.removeEffect(MobEffects.JUMP);
                entityLiving.removeEffect(MobEffects.MOVEMENT_SPEED);
                entityLiving.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 3600, 0));


                if (DRINK_COUNT > 10) {
                    DRINK_COUNT = 0;
                }
            }

        }

        return stack;

    }

    /**
     * How long it takes to use or consume an item
     */
    public int getUseDuration(ItemStack stack) {
        return 40;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    public SoundEvent getDrinkSound() {
        return SoundEvents.HONEY_DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.HONEY_DRINK;
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see

     */

}

