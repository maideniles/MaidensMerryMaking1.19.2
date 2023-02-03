package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Random;

public class HalloweenTreatBagItem extends Item {
    public HalloweenTreatBagItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player entity, InteractionHand hand) {
        Random rand = new Random();
        Integer gift_id = rand.nextInt(6);


        ItemStack stack = entity.getItemInHand(hand);
        ItemStack rare1 = new ItemStack(ModItems.NOISEMAKER.get());
        ItemStack rare2 = new ItemStack(Items.DIAMOND);
        ItemStack treat1 = new ItemStack(Items.APPLE);
        ItemStack treat2 = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
        ItemStack treat3 = new ItemStack(Items.GOLD_INGOT);
        ItemStack trick1 = new ItemStack(Items.WHEAT_SEEDS);
        ItemStack trick2 = new ItemStack(Items.ROTTEN_FLESH);
        ItemStack trick3 = new ItemStack(Items.POISONOUS_POTATO);

        if(gift_id ==0 ) {

            if (rand.nextInt(20) == 0) {
                entity.drop(rare2, false);
            }
            else{
                entity.drop(treat1,false);
            }
        }
        if(gift_id ==1 ){
            entity.drop(treat2, false);
        }
        if(gift_id ==2 ){
            entity.drop(treat3, false);
        }
        if(gift_id ==3 ){
            entity.drop(trick1, false);
        }
        if(gift_id ==4 ){
            entity.drop(trick2, false);
        }
        if(gift_id ==5){
            entity.drop(trick3, false);
        }

        if (rand.nextInt(30) == 0){
            entity.drop(rare1,false);
        }



            stack.shrink(1);

        return InteractionResultHolder.consume(stack);
    }




}


