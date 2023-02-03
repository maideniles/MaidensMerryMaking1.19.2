package com.maideniles.maidensmerrymaking.modifiers.biome;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FeatureControls {

    public record CloverBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_clover"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.CLOVER_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.CloverBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.CloverBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.CloverBiomeModifier::plant)
            ).apply(builder, FeatureControls.CloverBiomeModifier::new));
        }
    }

    public record EasterLilyBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_easter_lily"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

               if (MerryMakingCommonConfig.EASTER_LILY_ENABLED.get()){
                   //add feature here
                   builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
               }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.EasterLilyBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.EasterLilyBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.EasterLilyBiomeModifier::plant)
            ).apply(builder, FeatureControls.EasterLilyBiomeModifier::new));
        }
    }

    public record HydrangeaBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_hydrangea"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.HYDRANGEA_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.HydrangeaBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.HydrangeaBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.HydrangeaBiomeModifier::plant)
            ).apply(builder, FeatureControls.HydrangeaBiomeModifier::new));
        }
    }

    public record HyacinthBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_hyacinth"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.HYACINTH_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.HyacinthBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.HyacinthBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.HyacinthBiomeModifier::plant)
            ).apply(builder, FeatureControls.HyacinthBiomeModifier::new));
        }
    }

    public record EasterEggsBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_easter_eggs"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.COLORED_EGGS_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.EasterEggsBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.EasterEggsBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.EasterEggsBiomeModifier::plant)
            ).apply(builder, FeatureControls.EasterEggsBiomeModifier::new));
        }
    }

    public record HollyBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_holly"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.HOLLY_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.HollyBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.HollyBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.HollyBiomeModifier::plant)
            ).apply(builder, FeatureControls.HollyBiomeModifier::new));
        }
    }

    public record TinySpruceBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_tiny_spruce"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.TINY_SPRUCE_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.TinySpruceBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.TinySpruceBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.TinySpruceBiomeModifier::plant)
            ).apply(builder, FeatureControls.TinySpruceBiomeModifier::new));
        }
    }

    public record PineBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_pine"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.PINE_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.PineBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.PineBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.PineBiomeModifier::plant)
            ).apply(builder, FeatureControls.PineBiomeModifier::new));
        }
    }

    public record GravestoneBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MaidensMerryMaking.MOD_ID, "add_gravestone"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MerryMakingCommonConfig.GRAVESTONES_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<FeatureControls.GravestoneBiomeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(FeatureControls.GravestoneBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(FeatureControls.GravestoneBiomeModifier::plant)
            ).apply(builder, FeatureControls.GravestoneBiomeModifier::new));
        }
    }
}
