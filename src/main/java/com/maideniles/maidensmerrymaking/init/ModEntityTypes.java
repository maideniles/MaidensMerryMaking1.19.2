package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ChristmasCreeper;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import com.maideniles.maidensmerrymaking.entity.halloween.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;




public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,MaidensMerryMaking.MOD_ID);
    //CHRISTMAS ENTITIES//




    //BEGIN COLORED BUNNIES AND SIZES//
    //BEGIN PINK BUNNIES//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PINK_BUNNY = ENTITY_TYPES.register("pink_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "pink_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PINK_BUNNY_SMALL = ENTITY_TYPES.register("pink_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "pink_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PINK_BUNNY_LARGE = ENTITY_TYPES.register("pink_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "pink_bunny_large").toString()));

    //BEGIN BLUE BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> BLUE_BUNNY = ENTITY_TYPES.register("blue_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "blue_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> BLUE_BUNNY_SMALL = ENTITY_TYPES.register("blue_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "blue_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> BLUE_BUNNY_LARGE = ENTITY_TYPES.register("blue_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "blue_bunny_large").toString()));

    //BEGIN CYAN BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> CYAN_BUNNY = ENTITY_TYPES.register("cyan_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "cyan_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> CYAN_BUNNY_SMALL = ENTITY_TYPES.register("cyan_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "cyan_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> CYAN_BUNNY_LARGE = ENTITY_TYPES.register("cyan_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "cyan_bunny_large").toString()));

    //BEGIN PURPLE BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PURPLE_BUNNY = ENTITY_TYPES.register("purple_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "purple_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PURPLE_BUNNY_SMALL = ENTITY_TYPES.register("purple_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "purple_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PURPLE_BUNNY_LARGE = ENTITY_TYPES.register("purple_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "purple_bunny_large").toString()));

    //BEGIN YELLOW BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> YELLOW_BUNNY = ENTITY_TYPES.register("yellow_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "yellow_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> YELLOW_BUNNY_SMALL = ENTITY_TYPES.register("yellow_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "yellow_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> YELLOW_BUNNY_LARGE = ENTITY_TYPES.register("yellow_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "yellow_bunny_large").toString()));
//END BUNNIES//

    //CHICKEN//
    public static final RegistryObject<EntityType<ColoredChickenEntity>> COLORED_CHICKEN = ENTITY_TYPES.register("colored_chicken",
            () -> EntityType.Builder.of(ColoredChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "colored_chicken").toString()));

    //ADD HALLOWEEN COSTUMED MOBS//


    public static final RegistryObject<EntityType<ZombieCostumeEntity>> COSTUMED_ZOMBIE = ENTITY_TYPES.register("costumed_zombie",
            () -> EntityType.Builder.of(ZombieCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_zombie").toString()));

    public static final RegistryObject<EntityType<SkeletonCostumeEntity>> COSTUMED_SKELETON = ENTITY_TYPES.register("costumed_skeleton",
            () -> EntityType.Builder.of(SkeletonCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.99f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_skeleton").toString()));

  //  public static final RegistryObject<EntityType<WitherSkeletonCostumeEntity>> COSTUMED_WITHER_SKELETON = ENTITY_TYPES.register("costumed_wither_skeleton",
  //          () -> EntityType.Builder.of(WitherSkeletonCostumeEntity::new, MobCategory.MONSTER)
  //                  .sized(0.6f, 1.99f)
  //                  .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_wither_skeleton").toString()));

    public static final RegistryObject<EntityType<DrownedCostumeEntity>> COSTUMED_DROWNED = ENTITY_TYPES.register("costumed_drowned",
            () -> EntityType.Builder.of(DrownedCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_drowned").toString()));

    public static final RegistryObject<EntityType<DrownedCostumeEntity>> COSTUMED_DROWNED_MERMAID = ENTITY_TYPES.register("costumed_drowned_mermaid",
            () -> EntityType.Builder.of(DrownedCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_drowned_mermaid").toString()));

    public static final RegistryObject<EntityType<HuskCostumeEntity>> COSTUMED_HUSK = ENTITY_TYPES.register("costumed_husk",
            () -> EntityType.Builder.of(HuskCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_husk").toString()));

    public static final RegistryObject<EntityType<ZombieVillagerCostumeEntity>> COSTUMED_ZOMBIE_VILLAGER = ENTITY_TYPES.register("costumed_zombie_villager",
            () -> EntityType.Builder.of(ZombieVillagerCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_zombie_villager").toString()));

    public static final RegistryObject<EntityType<WitchCostumeEntity>> COSTUMED_WITCH = ENTITY_TYPES.register("costumed_witch",
            () -> EntityType.Builder.of(WitchCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_witch").toString()));

  //  public static final RegistryObject<EntityType<PillagerCostumeEntity>> COSTUMED_PILLAGER = ENTITY_TYPES.register("costumed_pillager",
   //         () -> EntityType.Builder.of(PillagerCostumeEntity::new, MobCategory.MONSTER)
  //                  .sized(0.6f, 0.95f)
  //                  .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_pillager").toString()));

  //  public static final RegistryObject<EntityType<EvokerCostumeEntity>> COSTUMED_EVOKER = ENTITY_TYPES.register("costumed_evoker",
  //          () -> EntityType.Builder.of(EvokerCostumeEntity::new, MobCategory.MONSTER)
  //                  .sized(0.6f, 1.95f)
   //                 .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_evoker").toString()));

  //  public static final RegistryObject<EntityType<VindicatorCostumeEntity>> COSTUMED_VINDICATOR = ENTITY_TYPES.register("costumed_vindicator",
 //           () -> EntityType.Builder.of(VindicatorCostumeEntity::new, MobCategory.MONSTER)
  //                  .sized(0.6f, 1.95f)
  //                  .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_vindicator").toString()));

    public static final RegistryObject<EntityType<CreeperCostumeEntity>> COSTUMED_CREEPER = ENTITY_TYPES.register("costumed_creeper",
            () -> EntityType.Builder.of(CreeperCostumeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.7f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_creeper").toString()));

    public static final RegistryObject<EntityType<SpiderCostumeEntity>> COSTUMED_SPIDER = ENTITY_TYPES.register("costumed_spider",
            () -> EntityType.Builder.of(SpiderCostumeEntity::new, MobCategory.MONSTER)
                    .sized(1.4f, 0.9f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "costumed_spider").toString()));

    public static final RegistryObject<EntityType<ChristmasCreeper>> CHRISTMAS_CREEPER = ENTITY_TYPES.register("christmas_creeper",
            () -> EntityType.Builder.of(ChristmasCreeper::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.7f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "christmas_creeper").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}







