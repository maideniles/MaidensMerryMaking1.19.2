package com.maideniles.maidensmerrymaking;

import com.maideniles.maidensmerrymaking.config.MerryMakingClientConfig;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import com.maideniles.maidensmerrymaking.entity.render.ChristmasCreeperRenderer;
import com.maideniles.maidensmerrymaking.entity.render.ColoredChickenRenderer;
import com.maideniles.maidensmerrymaking.entity.render.bunny.*;
import com.maideniles.maidensmerrymaking.entity.render.halloween.*;
import com.maideniles.maidensmerrymaking.event.HalloweenEntityEvents;
import com.maideniles.maidensmerrymaking.init.*;
import com.maideniles.maidensmerrymaking.items.armor.item.BunnyHoodArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.item.RedChristmasArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.item.ReindeerEarsArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.render.BunnyHoodArmorRenderer;
import com.maideniles.maidensmerrymaking.items.armor.render.RedChristmasArmorRenderer;
import com.maideniles.maidensmerrymaking.items.armor.render.ReindeerEarsArmorRenderer;
import com.maideniles.maidensmerrymaking.modifiers.biome.FeatureControls;
import com.maideniles.maidensmerrymaking.modifiers.biome.SpawnControls;
import com.mojang.serialization.Codec;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import java.util.Locale;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MaidensMerryMaking.MOD_ID)
public class MaidensMerryMaking {
    public static final String MOD_ID = "maidensmerrymaking";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();




    public MaidensMerryMaking() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;



        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEntityTypes.register(eventBus);
        ModPlacements.register(eventBus);
        ModLootModifiers.GLOBAL_LOOT_MODIFIERS.register(eventBus);



        ModSoundEvents.register(eventBus);
        ModAdvancements.init();



        //    ModStructures.register(eventBus);

        //HALLOWEEN COSTUMED MOBS
        eventBus.addListener(HalloweenEntityEvents::registerEntityAttributes);

        //   forgeBus.addListener(ModConditions::registerConditionSerializers);
        eventBus.addListener(this::setup);

        //MOB SPAWNS IN SPAWNCONTROLS//
        final DeferredRegister<Codec<? extends BiomeModifier>> serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        serializers.register(eventBus);
        serializers.register("mobspawns", SpawnControls.ModSpawnModifier::makeCodec);

        //FLOWER/FEATURE SPAWNS IN FEATURECONTROLS//
        final DeferredRegister<Codec<? extends BiomeModifier>> lily_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        lily_serializers.register(eventBus);
        lily_serializers.register("add_easter_lily", FeatureControls.EasterLilyBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> hydrangea_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        hydrangea_serializers.register(eventBus);
        hydrangea_serializers.register("add_hydrangea", FeatureControls.HydrangeaBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> hyacinth_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        hyacinth_serializers.register(eventBus);
        hyacinth_serializers.register("add_hyacinth", FeatureControls.HyacinthBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> easter_eggs_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        easter_eggs_serializers.register(eventBus);
        easter_eggs_serializers.register("add_easter_eggs", FeatureControls.EasterEggsBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> clover_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        hydrangea_serializers.register(eventBus);
        hydrangea_serializers.register("add_clover", FeatureControls.CloverBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> pine_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        hyacinth_serializers.register(eventBus);
        hyacinth_serializers.register("add_pine", FeatureControls.PineBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> holly_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        easter_eggs_serializers.register(eventBus);
        easter_eggs_serializers.register("add_holly", FeatureControls.HollyBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> tiny_spruce_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        easter_eggs_serializers.register(eventBus);
        easter_eggs_serializers.register("add_tiny_spruce", FeatureControls.TinySpruceBiomeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> gravestone_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        easter_eggs_serializers.register(eventBus);
        easter_eggs_serializers.register("add_gravestone", FeatureControls.TinySpruceBiomeModifier::makeCodec);

        //REGISTER CONFIG CLASSES//
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MerryMakingClientConfig.SPEC, "merrymaking-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MerryMakingCommonConfig.SPEC, "merrymaking-common.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ;
    }

    // add a comment
    public void setup(final FMLCommonSetupEvent event) {





        event.enqueueWork(() -> {


            HalloweenEntityEvents.initializeMobs();


        });

        // some preinit code



    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {



            EntityRenderers.register(ModEntityTypes.COLORED_CHICKEN.get(), ColoredChickenRenderer::new);


            EntityRenderers.register(ModEntityTypes.PINK_BUNNY.get(), PinkBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.PINK_BUNNY_SMALL.get(), PinkBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.PINK_BUNNY_LARGE.get(), PinkBunnyRendererLarge::new);

//BUNNY//
            EntityRenderers.register(ModEntityTypes.BLUE_BUNNY.get(), BlueBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.BLUE_BUNNY_SMALL.get(), BlueBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.BLUE_BUNNY_LARGE.get(), BlueBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.CYAN_BUNNY.get(), CyanBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.CYAN_BUNNY_SMALL.get(), CyanBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.CYAN_BUNNY_LARGE.get(), CyanBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.PURPLE_BUNNY.get(), PurpleBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.PURPLE_BUNNY_SMALL.get(), PurpleBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.PURPLE_BUNNY_LARGE.get(), PurpleBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.YELLOW_BUNNY.get(), YellowBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.YELLOW_BUNNY_SMALL.get(), YellowBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.YELLOW_BUNNY_LARGE.get(), YellowBunnyRendererLarge::new);
//HALLOWEEN//
            EntityRenderers.register(ModEntityTypes.COSTUMED_ZOMBIE.get(), ZombieCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_SKELETON.get(), SkeletonCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_HUSK.get(), HuskCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_DROWNED.get(), DrownedCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_DROWNED_MERMAID.get(), DrownedMermaidCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get(), ZombieVillagerCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_WITCH.get(), WitchCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_CREEPER.get(), CreeperCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.COSTUMED_SPIDER.get(), SpiderCostumeRenderer::new);
            EntityRenderers.register(ModEntityTypes.CHRISTMAS_CREEPER.get(), ChristmasCreeperRenderer::new);


            GeoArmorRenderer.registerArmorRenderer(BunnyHoodArmorItem.class, () -> new BunnyHoodArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(ReindeerEarsArmorItem.class, () -> new ReindeerEarsArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(RedChristmasArmorItem.class, () -> new RedChristmasArmorRenderer());
        }
    }



    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }




}
