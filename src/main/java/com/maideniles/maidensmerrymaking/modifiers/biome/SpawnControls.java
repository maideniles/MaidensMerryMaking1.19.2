package com.maideniles.maidensmerrymaking.modifiers.biome;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SpawnControls {

    public record ModSpawnModifier(HolderSet<Biome> biomes,
                                   MobSpawnSettings.SpawnerData spawn) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(new ResourceLocation(MaidensMerryMaking.MOD_ID, "mobspawns"), ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {


                if (this.spawn.type == ModEntityTypes.COSTUMED_ZOMBIE.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }

                if (this.spawn.type == ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.COSTUMED_HUSK.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.COSTUMED_DROWNED_MERMAID.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.COSTUMED_DROWNED.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.COSTUMED_SKELETON.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.COSTUMED_CREEPER.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.COSTUMED_WITCH.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }

                if (this.spawn.type == ModEntityTypes.COSTUMED_SPIDER.get() && MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 20, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }

                if (this.spawn.type == ModEntityTypes.COLORED_CHICKEN.get() && MerryMakingCommonConfig.COLORED_CHICKEN_WORLD_SPAWN.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 10, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }
                if (this.spawn.type == ModEntityTypes.CHRISTMAS_CREEPER.get() && MerryMakingCommonConfig.CHRISTMAS_CREEPER_WORLD_SPAWN.get()) {
                    MobSpawnSettings.SpawnerData data = new MobSpawnSettings.SpawnerData(this.spawn.type, 30, 1, 3);
                    builder.getMobSpawnSettings().addSpawn(this.spawn.type.getCategory(), data);
                }

            }

    }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }



        public static Codec<ModSpawnModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(SpawnControls.ModSpawnModifier::biomes),
                    MobSpawnSettings.SpawnerData.CODEC.fieldOf("spawn").forGetter(SpawnControls.ModSpawnModifier::spawn)
            ).apply(builder, ModSpawnModifier::new));
        }
    }

}


