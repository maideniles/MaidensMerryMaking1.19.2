package com.maideniles.maidensmerrymaking.event;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import com.maideniles.maidensmerrymaking.entity.custom.ChristmasCreeper;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HalloweenEntityEvents {





    public static void initializeMobs() {
        SpawnPlacements.register(ModEntityTypes.COSTUMED_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_SKELETON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        //     SpawnPlacements.register(ModEntityTypes.COSTUMED_WITHER_SKELETON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_HUSK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_DROWNED.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_DROWNED_MERMAID.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);

        SpawnPlacements.register(ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        //     SpawnPlacements.register(ModEntityTypes.COSTUMED_PILLAGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        //    SpawnPlacements.register(ModEntityTypes.COSTUMED_VINDICATOR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        //     SpawnPlacements.register(ModEntityTypes.COSTUMED_EVOKER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_WITCH.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_CREEPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_SPIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.CHRISTMAS_CREEPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);

    }


    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {

        event.put(ModEntityTypes.COSTUMED_ZOMBIE.get(), Zombie.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_SKELETON.get(), Skeleton.createAttributes().build());
        //    event.put(ModEntityTypes.COSTUMED_WITHER_SKELETON.get(), WitherSkeleton.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_HUSK.get(), Husk.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get(), ZombieVillager.createAttributes().build());
        //    event.put(ModEntityTypes.COSTUMED_PILLAGER.get(), Pillager.createAttributes().build());
        //     event.put(ModEntityTypes.COSTUMED_VINDICATOR.get(), Vindicator.createAttributes().build());
        //  event.put(ModEntityTypes.COSTUMED_EVOKER.get(), Evoker.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_WITCH.get(), Witch.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_DROWNED.get(), Drowned.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_DROWNED_MERMAID.get(), Drowned.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_CREEPER.get(), Creeper.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_SPIDER.get(), Spider.createAttributes().build());
        event.put(ModEntityTypes.CHRISTMAS_CREEPER.get(),Creeper.createAttributes().build());


    }

    @SubscribeEvent
    public static void onEntitySpawn(LivingSpawnEvent.SpecialSpawn event) {

        LivingEntity entity = event.getEntity();

        boolean isBaby = entity.isBaby();
        Random rand = new Random();
        Integer choose_hat = rand.nextInt(2);
        Integer choose_sweater = rand.nextInt(2);
        Integer choose_both = rand.nextInt(4);
        Integer armor_chance = rand.nextInt(3);
        Integer baby_armor_chance = rand.nextInt(2);
        Integer spawn_chance = rand.nextInt(4);
        ItemStack sweater_green_leather = new ItemStack(ModItems.UGLY_SWEATER_GREEN_LEATHER.get());
        ItemStack sweater_red_leather = new ItemStack(ModItems.UGLY_SWEATER_RED_LEATHER.get());
        ItemStack hat_red_leather = new ItemStack(ModItems.SANTA_HAT_RED_LEATHER.get());
        ItemStack hat_green_leather = new ItemStack(ModItems.REINDEER_EARS_LEATHER.get());
        ItemStack mob_santa_hat = new ItemStack(ModItems.MOB_SANTA_HAT_RED_LEATHER.get());

        if (baby_armor_chance == 0 && MerryMakingCommonConfig.MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED.get()) {
            if (entity instanceof Zombie && isBaby) {

                if (armor_chance == 1) {
                    if (choose_hat == 1) {
                        entity.setItemSlot(EquipmentSlot.HEAD, mob_santa_hat);


                    }

                    if (choose_sweater == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                    }
                    if (choose_sweater == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                    }


                    ((Zombie) entity).setDropChance(EquipmentSlot.CHEST, 0.7f);
                }

            }
        }
        if (spawn_chance == 0 && MerryMakingCommonConfig.MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED.get()) {
            if (entity instanceof Zombie && !isBaby) {

                if (armor_chance == 0 ) {
                    if (choose_hat == 0) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_hat == 1) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }

                }

                if (armor_chance == 1) {
                    if (choose_sweater == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                    }
                    if (choose_sweater == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                    }
                }

                if (armor_chance == 2) {
                    if (choose_both == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_both == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 2) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 3) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                }

                ((Zombie) entity).setDropChance(EquipmentSlot.HEAD, 0.7f);
                ((Zombie) entity).setDropChance(EquipmentSlot.CHEST, 0.7f);
            }

        }


        if (spawn_chance == 1 && MerryMakingCommonConfig.MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED.get()) {
            if (entity instanceof Skeleton) {

                if (armor_chance == 0) {
                    if (choose_hat == 0) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_hat == 1) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }

                }

                if (armor_chance == 1) {
                    if (choose_sweater == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                    }
                    if (choose_sweater == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                    }
                }

                if (armor_chance == 2) {
                    if (choose_both == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_both == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 2) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 3) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                }

                ((Skeleton) entity).setDropChance(EquipmentSlot.HEAD, 0.7f);
                ((Skeleton) entity).setDropChance(EquipmentSlot.CHEST, 0.7f);
            }

        }

        if (spawn_chance == 2 && MerryMakingCommonConfig.MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED.get()) {
            if (entity instanceof WitherSkeleton) {

                if (armor_chance == 0) {
                    if (choose_hat == 0) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_hat == 1) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }

                }

                if (armor_chance == 1) {
                    if (choose_sweater == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                    }
                    if (choose_sweater == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                    }
                }

                if (armor_chance == 2) {
                    if (choose_both == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_both == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 2) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 3) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                }

                ((WitherSkeleton) entity).setDropChance(EquipmentSlot.HEAD, 0.7f);
                ((WitherSkeleton) entity).setDropChance(EquipmentSlot.CHEST, 0.7f);
            }

        }

        if (spawn_chance == 3 && MerryMakingCommonConfig.MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED.get()) {
            if (entity instanceof Stray) {

                if (armor_chance == 0) {
                    if (choose_hat == 0) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_hat == 1) {
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }

                }

                if (armor_chance == 1) {
                    if (choose_sweater == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                    }
                    if (choose_sweater == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                    }
                }

                if (armor_chance == 2) {
                    if (choose_both == 0) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                    if (choose_both == 1) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_green_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 2) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_red_leather);
                    }
                    if (choose_both == 3) {
                        entity.setItemSlot(EquipmentSlot.CHEST, sweater_red_leather);
                        entity.setItemSlot(EquipmentSlot.HEAD, hat_green_leather);
                    }
                }

                ((Stray) entity).setDropChance(EquipmentSlot.HEAD, 0.7f);
                ((Stray) entity).setDropChance(EquipmentSlot.CHEST, 0.7f);
            }

        }



    }
}
