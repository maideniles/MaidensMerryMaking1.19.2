package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModAdvancements;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import static net.minecraft.world.level.block.Block.popResource;


public class GreenBeerItem extends Item {
    private static final int DRINK_DURATION = 40;
    public int DRINK_COUNT;

    public GreenBeerItem(Item.Properties p_41346_) {
        super(p_41346_);
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity entityLiving) {
        super.finishUsingItem(pStack, pLevel, entityLiving);
        if (entityLiving instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
            pStack.shrink(1);
            DRINK_COUNT ++;
        }

        if (!pLevel.isClientSide()) {
            if (DRINK_COUNT == 1 ) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.LUCK, 1800,0));
            }

           if (DRINK_COUNT == 2 ) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.LUCK, 1800,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 0));
            }

             if (DRINK_COUNT == 3 ) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.LUCK, 1800,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,1800,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,1800,0));

                 }

             if (DRINK_COUNT == 4 ) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.LUCK,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.ABSORPTION,3600,0));
            }

             if (DRINK_COUNT >= 5 && DRINK_COUNT <= 10 ) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.UNLUCK,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.HUNGER,3600,0));
            }


            if (DRINK_COUNT == 10 ) {
                entityLiving.addEffect(new MobEffectInstance(MobEffects.UNLUCK,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.POISON,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.CONFUSION,3600,0));
                entityLiving.addEffect(new MobEffectInstance(MobEffects.BLINDNESS,3600,0));


                if (entityLiving instanceof ServerPlayer) {
                    BlockPos pos = entityLiving.getOnPos();
                    ModAdvancements.DRUNK_ON_GREEN_BEER.trigger((ServerPlayer) entityLiving);

                    popResource(pLevel, pos, new ItemStack(ModBlocks.GREEN_BEER_TROPHY.get()));
                }

            }

            if (DRINK_COUNT > 10) {
                DRINK_COUNT = 0;
            }

        }

        if (pStack.isEmpty()) {
            return new ItemStack(ModBlocks.GLASS_MUG.get());
        } else {
            if (entityLiving instanceof Player && !((Player)entityLiving).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(ModBlocks.GLASS_MUG.get());
                Player player = (Player)entityLiving;
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }

            return pStack;
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getUseDuration(ItemStack pStack) {
        return 40;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.HONEY_DRINK;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.HONEY_DRINK;
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * onItemUse
     */
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pHand);
    }
}
