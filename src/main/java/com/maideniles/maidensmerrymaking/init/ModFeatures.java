package com.maideniles.maidensmerrymaking.init;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModFeatures {





    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> TINY_SPRUCE_CONFIG = FeatureUtils.register("tiny_spruce",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TINY_SPRUCE.get().defaultBlockState()))));



    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> HOLLY_TREE =
            FeatureUtils.register("holly_tree", Feature.TREE,
                    (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.SPRUCE_LOG),
                            new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.simple(ModBlocks.SPRUCE_LEAVES_HOLLY.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                                    UniformInt.of(1, 2)),
                            new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PINE_TREE =
            FeatureUtils.register("pine_tree", Feature.TREE,
                    (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LIVING_PINE_LOG.get()),
                            new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.simple(ModBlocks.PINE_LEAVES.get()),
                            new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2),
                                    UniformInt.of(1, 2)),
                            new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());





}