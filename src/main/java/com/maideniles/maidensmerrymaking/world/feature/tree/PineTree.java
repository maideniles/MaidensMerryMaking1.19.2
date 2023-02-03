package com.maideniles.maidensmerrymaking.world.feature.tree;


import com.maideniles.maidensmerrymaking.init.ModFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PineTree extends AbstractTreeGrower {


    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_, boolean p_222911_) {
        return ModFeatures.PINE_TREE;
    }
}