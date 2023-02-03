package com.maideniles.maidensmerrymaking.world.feature.flower;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.InclusiveRange;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public class ModConfiguredFlowers {



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CLOVER_CONFIG = FeatureUtils.register("clover_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER.get()))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> EASTER_LILY_CONFIG = FeatureUtils.register("easter_lily_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.EASTER_LILY_BLOCK.get()))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HYDRANGEA_CONFIG = FeatureUtils.register("hdrangea_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HYDRANGEA_BLOCK.get()))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HYACINTH_CONFIG = FeatureUtils.register("hyacinth_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HYACINTH_BLOCK.get()))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> GRAVESTONE_CONFIG = FeatureUtils.register("gravestone_config",
            Feature.FLOWER, grassPatch(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                    .add(ModBlocks.GRAVESTONE_PLAIN.get().defaultBlockState(), 1)
                    .add(ModBlocks.GRAVESTONE_CROSS.get().defaultBlockState(), 1)
                    .add(ModBlocks.GRAVESTONE_OBELISK.get().defaultBlockState(), 1)
                    .add(ModBlocks.GRAVESTONE_TOPPED.get().defaultBlockState(), 1)), 64));



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> EASTER_EGG_GEN_CONFIG = FeatureUtils.register("egg_gen_config",
            Feature.FLOWER, new RandomPatchConfiguration(1, 0, 0, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<Integer>(1, 3),
                            new NormalNoise.NoiseParameters(-10, 1.0D), 1.0F, 2345L,
                            new NormalNoise.NoiseParameters(-3, 1.0D), 1.0F,
                            List.of(
                                    ModBlocks.BLUE_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_CYAN_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_CYAN_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_CYAN_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PURPLE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PURPLE_PINK_FLOWER_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PURPLE_STRIPES_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.RAINBOW_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.RAINBOW_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.RAINBOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_PINK_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_PINK_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_PINK_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState()))))));

    private static RandomPatchConfiguration grassPatch(BlockStateProvider p_195203_, int p_195204_) {
        return FeatureUtils.simpleRandomPatchConfiguration(p_195204_, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(p_195203_)));
    }
}