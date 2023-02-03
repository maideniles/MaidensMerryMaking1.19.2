package com.maideniles.maidensmerrymaking.init;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.world.feature.flower.ModConfiguredFlowers;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacements {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MaidensMerryMaking.MOD_ID);


    public static final RegistryObject<PlacedFeature> TINY_SPRUCE_PLACEMENT = PLACED_FEATURES.register("tiny_spruce_placement",
      () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModFeatures.TINY_SPRUCE_CONFIG,
              VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1), Blocks.OAK_SAPLING)));

    public static final RegistryObject<PlacedFeature> HOLLY_PLACEMENT = PLACED_FEATURES.register("holly_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModFeatures.HOLLY_TREE,
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1), Blocks.OAK_SAPLING)));

    public static final RegistryObject<PlacedFeature> EASTER_EGG_GEN_PLACEMENT = PLACED_FEATURES.register("easter_egg_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFlowers.EASTER_EGG_GEN_CONFIG, List.of(RarityFilter.onAverageOnceEvery(48),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> CLOVER_PLACEMENT = PLACED_FEATURES.register("clover_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFlowers.CLOVER_CONFIG, List.of(RarityFilter.onAverageOnceEvery(20),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> EASTER_LILY_PLACEMENT = PLACED_FEATURES.register("easter_lily_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFlowers.EASTER_LILY_CONFIG, List.of(RarityFilter.onAverageOnceEvery(10),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> HYDRANGEA_PLACEMENT = PLACED_FEATURES.register("hydrangea_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFlowers.HYDRANGEA_CONFIG, List.of(RarityFilter.onAverageOnceEvery(10),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> HYACINTH_PLACEMENT = PLACED_FEATURES.register("hyacinth_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFlowers.HYACINTH_CONFIG, List.of(RarityFilter.onAverageOnceEvery(10),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> GRAVESTONE_PLACEMENT = PLACED_FEATURES.register("gravestone_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFlowers.GRAVESTONE_CONFIG, List.of(RarityFilter.onAverageOnceEvery(64),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> PINE_PLACEMENT = PLACED_FEATURES.register("pine_placement",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModFeatures.PINE_TREE,
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1), Blocks.OAK_SAPLING)));



    //REGISTRATION
    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }








}

