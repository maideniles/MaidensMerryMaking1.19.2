package com.maideniles.maidensmerrymaking.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModItemGroups {

    public static final CreativeModeTab MAIDENS_WINTER_GROUP = new CreativeModeTab("maidens_winter_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get());
        }
    };


    public static final CreativeModeTab MAIDENS_SPRING_GROUP = new CreativeModeTab("maidens_spring_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.EASTER_BASKET_BLOCK.get());
        }
    };

    public static final CreativeModeTab MAIDENS_HALLOWEEN_GROUP = new CreativeModeTab("maidens_halloween_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GRAVESTONE_TOPPED.get());
        }
    };



}
