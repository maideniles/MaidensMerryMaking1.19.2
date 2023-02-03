package com.maideniles.maidensmerrymaking.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MerryMakingCommonConfig {
    public static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.IntValue INGREDIENTS_IN_CHESTS_SPAWN;
    public static ForgeConfigSpec.IntValue CHRISTMAS_PRESENT_CHEST_SPAWN;

    public static ForgeConfigSpec.IntValue TINY_SPRUCE_FROM_LEAVES_DROP;
    public static ForgeConfigSpec.BooleanValue CHRISTMAS_ENABLED;
    public static ForgeConfigSpec.BooleanValue MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED;
    public static ForgeConfigSpec.BooleanValue HOLLY_ENABLED;
    public static ForgeConfigSpec.BooleanValue TINY_SPRUCE_ENABLED;
    public static ForgeConfigSpec.BooleanValue ST_PATRICKS_DAY_ENABLED;
    public static ForgeConfigSpec.BooleanValue CLOVER_ENABLED;
    public static ForgeConfigSpec.BooleanValue EASTER_ENABLED;
    public static ForgeConfigSpec.BooleanValue HALLOWEEN_ENABLED;
    public static ForgeConfigSpec.BooleanValue GRAVESTONES_ENABLED;
    public static ForgeConfigSpec.BooleanValue COSTUMES_ENABLED;
    public static ForgeConfigSpec.BooleanValue PINE_ENABLED;
    public static ForgeConfigSpec.IntValue HALLOWEEN_DISC_CHEST_SPAWN;
    public static ForgeConfigSpec.BooleanValue COLORED_EGGS_ENABLED;
    public static ForgeConfigSpec.IntValue EASTER_BASKET_CHEST_SPAWN;
    public static ForgeConfigSpec.BooleanValue EASTER_LILY_ENABLED;
    public static ForgeConfigSpec.BooleanValue HYDRANGEA_ENABLED;
    public static ForgeConfigSpec.BooleanValue HYACINTH_ENABLED;
    public static ForgeConfigSpec.BooleanValue COLORED_CHICKEN_WORLD_SPAWN;
    public static ForgeConfigSpec.BooleanValue CHRISTMAS_CREEPER_WORLD_SPAWN;

    static {
        SERVER_BUILDER.push("Common Configs for MerryMaking Mod");
        INGREDIENTS_IN_CHESTS_SPAWN = SERVER_BUILDER.comment("mod recipe ingredients can spawn in chests. Set to 0 to disable")
                .defineInRange("ingredients_in_chests_spawn", 1, 0, Integer.MAX_VALUE);

        //BEGIN CHRISTMAS/WINTER CONTENT//
        CHRISTMAS_PRESENT_CHEST_SPAWN = SERVER_BUILDER.comment("Christmas presents can spawn in chests. Set to 0 to disable")
                .defineInRange("christmas_present_chest_spawn", 1, 0, Integer.MAX_VALUE);

        CHRISTMAS_CREEPER_WORLD_SPAWN = SERVER_BUILDER.comment("Enable Christmas Creepers to spawn naturally in the world. Set to False to disable")
                .define("christmas_creeper_enabled", true);


        MOBS_WEAR_CHRISTMAS_ARMOR_ENABLED = SERVER_BUILDER.comment("Enable mobs to spawn wearing Christmas sweaters and hats. Set to False to disable")
                .define("mob_wear_christmas_armor_enabled", true);

        TINY_SPRUCE_FROM_LEAVES_DROP = SERVER_BUILDER.comment("Tiny Spruce saplings will drop from Spruce Leaves. Set to 0 to disable")
                .defineInRange("tiny_spruce_from_leaves_drop", 1, 0, Integer.MAX_VALUE);

   //     CHRISTMAS_ENABLED = SERVER_BUILDER.comment("Enable Christmas Recipes such as armor, foods, decorations. Set to False to disable")
   //             .define("christmas_enabled", true);

        HOLLY_ENABLED = SERVER_BUILDER.comment("Enable Holly tree to spawn in world. Set to False to disable")
                .define("holly_enabled", true);

        TINY_SPRUCE_ENABLED = SERVER_BUILDER.comment("Enable Tiny Spruce tree to spawn in world. Set to False to disable")
                .define("tiny_spruce_enabled", true);

//BEGIN ST PATRICK'S DAY CONTENT//
  //      ST_PATRICKS_DAY_ENABLED = SERVER_BUILDER.comment("Enable Pot O Gold Spawn and St Patrick's Day Recipes.")
  //              .define("st_patricks_day_enabled", true);

        CLOVER_ENABLED = SERVER_BUILDER.comment("Enable Clover to grow naturally in the world. Set to False to disable")
                .define("clover_enabled", true);

//BEGIN EASTER CONTENT//
  //      EASTER_ENABLED = SERVER_BUILDER.comment("Enable Easter recipes.")
  //              .define("easter_enabled", true);

        COLORED_EGGS_ENABLED = SERVER_BUILDER.comment("Easter Eggs will appear naturally in the world. Set to False to disable.")
                .define("easter_egg_spawn", true);

        EASTER_BASKET_CHEST_SPAWN = SERVER_BUILDER.comment("Easter baskets can spawn in chests. Set to 0 to disable")
                .defineInRange("easter_basket_chest_spawn", 1, 0, Integer.MAX_VALUE);

        EASTER_LILY_ENABLED = SERVER_BUILDER.comment("Enable Easter Lily flower to grow naturally in the world. Set to False to disable")
                .define("easter_lily_enabled", true);

        HYDRANGEA_ENABLED = SERVER_BUILDER.comment("Enable Hydrangea flower to grow naturally in the world.  Set to False to disable")
                .define("hydrangea_enabled", true);

        HYACINTH_ENABLED = SERVER_BUILDER.comment("Enable Hyacinth flower to grow naturally in the world. Set to False to disable")
                .define("hyacinth_enabled", true);

        COLORED_CHICKEN_WORLD_SPAWN = SERVER_BUILDER.comment("Enable Colored Chickens to spawn naturally in the world. Set to False to disable")
                .define("colored_chicken_enabled", true);

//BEGIN HALLOWEEN CONTENT//
  //      HALLOWEEN_ENABLED = SERVER_BUILDER.comment("Enable Halloween recipes.")
  //              .define("halloween_enabled", true);

        COSTUMES_ENABLED = SERVER_BUILDER.comment("Enable Costumed Mobs to spawn in the world. Set to False to disable")
                .define("costumes_enabled", true);

        GRAVESTONES_ENABLED = SERVER_BUILDER.comment("Enable Gravestones to spawn in the world. Set to False to disable")
                .define("gravestones_enabled", true);

        HALLOWEEN_DISC_CHEST_SPAWN = SERVER_BUILDER.comment("Halloween Discs can spawn in chests. Set to 0 to disable")
                .defineInRange("halloween_disc_chest_spawn", 1, 0, Integer.MAX_VALUE);

        PINE_ENABLED = SERVER_BUILDER.comment("Enable Pine Tree to spawn in the world. Set to False to disable")
                .define("pine_enabled", true);

        SERVER_BUILDER.pop();
        SPEC = SERVER_BUILDER.build();
    }
}