package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.items.*;
import com.maideniles.maidensmerrymaking.items.armor.item.BunnyHoodArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.item.RedChristmasArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.item.ReindeerEarsArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaidensMerryMaking.MOD_ID);


    public static final RegistryObject<Item> CHRISTMAS_TREE = ITEMS.register("christmas_tree",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));
    public static final RegistryObject<Item> WHITE_CHRISTMAS_TREE = ITEMS.register("white_christmas_tree",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    // public static final RegistryObject<Item> CHRISTMAS_TREE_LIGHTS_WHITE = ITEMS.register("christmas_tree_white_lights",
    //          () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //  public static final RegistryObject<Item> CHRISTMAS_TREE_LIGHTS_MULTI = ITEMS.register("christmas_tree_multi_lights",
    //         () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> ROOF_TILES= ITEMS.register( "roof_tiles",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //MUSIC DISC//
    public static final RegistryObject<Item> CHRISTMAS_DISC = ITEMS.register("christmas_music_disc",
            () -> new RecordItem(1, ModSoundEvents.CHRISTMAS_MUSIC_DISC,
                    (new Item.Properties()).stacksTo(1).tab(ModItemGroups.MAIDENS_WINTER_GROUP)
                            .rarity(Rarity.RARE), 780 * 20));

    public static final RegistryObject<Item> CHRISTMAS_DISC_2 = ITEMS.register("christmas_music_disc_2",
            () -> new RecordItem(1, ModSoundEvents.CHRISTMAS_MUSIC_DISC_2,
                    (new Item.Properties()).stacksTo(1).tab(ModItemGroups.MAIDENS_WINTER_GROUP)
                            .rarity(Rarity.RARE), 660 * 20));

    public static final RegistryObject<Item> HALLOWEEN_DISC = ITEMS.register("halloween_disc",
            () -> new RecordItem(1, ModSoundEvents.HALLOWEEN_MUSIC_DISC,
                    (new Item.Properties()).stacksTo(1).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)
                            .rarity(Rarity.RARE), 1380 * 20));




    //TOPPERS//
    public static final RegistryObject<Item> BOW= ITEMS.register( "bow",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> STAR = ITEMS.register( "star",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> STOCKING = ITEMS.register("stocking",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> TREE_GARLAND = ITEMS.register("tree_garland",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));
    //RED CHRISTMAS OUTFIT-LEATHER//
    public static final RegistryObject<Item> MOB_SANTA_HAT_RED_LEATHER = ITEMS.register("mob_santa_hat",
            () -> new ArmorItem(ModArmorMaterial.MOB_CHRISTMAS_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> SANTA_HAT_RED_LEATHER = ITEMS.register("red_santa_hat_leather",
            () -> new RedChristmasArmorItem(ModArmorMaterial.RED_SANTA_HAT_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> UGLY_SWEATER_RED_LEATHER = ITEMS.register("red_ugly_christmas_sweater_leather",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> PLAID_PAJAMA_PANTS_LEATHER = ITEMS.register("plaid_pajama_pants_leather",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> REINDEER_SLIPPERS_LEATHER = ITEMS.register("reindeer_slippers_leather",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));
    //GREEN OUTFIT-LEATHER//
    public static final RegistryObject<Item> REINDEER_EARS_LEATHER = ITEMS.register("reindeer_ears_leather",
            () -> new ReindeerEarsArmorItem(ModArmorMaterial.REINDEER_EARS_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> UGLY_SWEATER_GREEN_LEATHER = ITEMS.register("green_ugly_christmas_sweater_leather",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> STRIPED_PAJAMA_PANTS_LEATHER = ITEMS.register("striped_pajama_pants_leather",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> SANTA_SLIPPERS_LEATHER = ITEMS.register("santa_slippers_leather",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //RED CHRISTMAS OUTFIT-IRON//
    public static final RegistryObject<Item> SANTA_HAT_RED_IRON = ITEMS.register("red_santa_hat_iron",
            () -> new RedChristmasArmorItem(ModArmorMaterial.RED_SANTA_HAT_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> UGLY_SWEATER_RED_IRON = ITEMS.register("red_ugly_christmas_sweater_iron",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PLAID_PAJAMA_PANTS_IRON = ITEMS.register("plaid_pajama_pants_iron",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINDEER_SLIPPERS_IRON = ITEMS.register("reindeer_slippers_iron",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));
    //GREEN OUTFIT-IRON//
    public static final RegistryObject<Item> REINDEER_EARS_IRON = ITEMS.register("reindeer_ears_iron",
            () -> new ReindeerEarsArmorItem(ModArmorMaterial.REINDEER_EARS_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> UGLY_SWEATER_GREEN_IRON = ITEMS.register("green_ugly_christmas_sweater_iron",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> STRIPED_PAJAMA_PANTS_IRON = ITEMS.register("striped_pajama_pants_iron",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> SANTA_SLIPPERS_IRON = ITEMS.register("santa_slippers_iron",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    //RED CHRISTMAS OUTFIT-DIAMOND//
    public static final RegistryObject<Item> SANTA_HAT_RED = ITEMS.register("red_santa_hat",
            () -> new RedChristmasArmorItem(ModArmorMaterial.RED_SANTA_HAT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> UGLY_SWEATER_RED = ITEMS.register("red_ugly_christmas_sweater",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PLAID_PAJAMA_PANTS = ITEMS.register("plaid_pajama_pants",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINDEER_SLIPPERS = ITEMS.register("reindeer_slippers",
            () -> new ArmorItem(ModArmorMaterial.RED_CHRISTMAS, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));
    //GREEN OUTFIT-DIAMOND//
    public static final RegistryObject<Item> REINDEER_EARS = ITEMS.register("reindeer_ears",
            () -> new ReindeerEarsArmorItem(ModArmorMaterial.REINDEER_EARS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> UGLY_SWEATER_GREEN = ITEMS.register("green_ugly_christmas_sweater",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> STRIPED_PAJAMA_PANTS = ITEMS.register("striped_pajama_pants",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> SANTA_SLIPPERS = ITEMS.register("santa_slippers",
            () -> new ArmorItem(ModArmorMaterial.GREEN_CHRISTMAS, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    //RED CHRISTMAS OUTFIT NETHERITE//
    public static final RegistryObject<Item> REINFORCED_SANTA_HAT_RED = ITEMS.register("reinforced_red_santa_hat",
            () -> new RedChristmasArmorItem(ModArmorMaterial.REINFORCED_RED_SANTA_HAT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_UGLY_SWEATER_RED = ITEMS.register("reinforced_red_ugly_christmas_sweater",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_RED_CHRISTMAS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_PLAID_PAJAMA_PANTS = ITEMS.register("reinforced_plaid_pajama_pants",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_RED_CHRISTMAS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_REINDEER_SLIPPERS = ITEMS.register("reinforced_reindeer_slippers",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_RED_CHRISTMAS, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));
    //GREEN OUTFIT-NETHERITE//
    public static final RegistryObject<Item> REINFORCED_REINDEER_EARS = ITEMS.register("reinforced_reindeer_ears",
            () -> new ReindeerEarsArmorItem(ModArmorMaterial.REINFORCED_REINDEER_EARS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_UGLY_SWEATER_GREEN = ITEMS.register("reinforced_green_ugly_christmas_sweater",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_GREEN_CHRISTMAS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_STRIPED_PAJAMA_PANTS = ITEMS.register("reinforced_striped_pajama_pants",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_GREEN_CHRISTMAS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_SANTA_SLIPPERS = ITEMS.register("reinforced_santa_slippers",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_GREEN_CHRISTMAS, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    //BULBS AND WIRES//
    public static final RegistryObject<Item> MULTI_BULBS = ITEMS.register("multi_bulbs",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> WHITE_BULBS = ITEMS.register( "white_bulbs",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> WHITE_WIRES = ITEMS.register("white_wires",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> GREEN_WIRES = ITEMS.register("green_wires",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //LIGHT STRANDS//
    public static final RegistryObject<Item> CLASSIC_LIGHTS_WHITE = ITEMS.register("classic_lights_white",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> CLASSIC_LIGHTS_MULTI = ITEMS.register("classic_lights_multi",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> ICICLE_LIGHTS_WHITE = ITEMS.register("icicle_lights_white",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> ICICLE_LIGHTS_MULTI = ITEMS.register("icicle_lights_multi",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> MINI_LIGHTS_WHITE = ITEMS.register("mini_lights_white",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> MINI_LIGHTS_MULTI = ITEMS.register("mini_lights_multi",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> TWINKLING_LIGHTS_WHITE = ITEMS.register("twinkling_lights_white",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> TWINKLING_LIGHTS_MULTI = ITEMS.register("twinkling_lights_multi",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> ORNAMENTS = ITEMS.register("ornaments",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> ORNAMENTS_WHITE = ITEMS.register("ornaments_white",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));





    //CROP SEEDS//
    public static final RegistryObject<Item> GINGER_ROOT = ITEMS.register( "ginger_root",
            () ->  new BlockItem(ModBlocks.GINGER_PLANT.get(), (new Item.Properties()).food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> MINT_SEEDS = ITEMS.register("mint_seeds",
            () -> new BlockItem(ModBlocks.MINT_PLANT.get(), new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build()).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //CROP ITEMS//
    public static final RegistryObject<Item> MINT_LEAF = ITEMS.register( "mint_leaf",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));


    public static final RegistryObject<Item> CORN_KERNELS = ITEMS.register("corn_kernels",
            () -> new BlockItem(ModBlocks.CORN_STALK.get(), new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build()).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //HANUKKAH TREAT//
    public static final RegistryObject<Item> RUGELACH = ITEMS.register("rugelach",
            ()-> new Item( new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //KWANZAA TREAT//

    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register( "sweet_potato",
            () ->  new BlockItem(ModBlocks.SWEET_POTATO_PLANT.get(), (new Item.Properties()).food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));


    public static final RegistryObject<Item>SWEET_POTATO_PIE = ITEMS.register("sweet_potato_pie",
            () -> new Item(new Item.Properties().food(Foods.PUMPKIN_PIE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));



    //CHRISTMAS TREATS AND INGREDIENTS//
    public static final RegistryObject<Item>TREE_CHRISTMAS_COOKIE = ITEMS.register("tree_christmas_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>STOCKING_CHRISTMAS_COOKIE = ITEMS.register("stocking_christmas_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>MITTEN_CHRISTMAS_COOKIE = ITEMS.register("mitten_christmas_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));


    public static final RegistryObject<Item>CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>GINGERBREAD_DOUGH = ITEMS.register("gingerbread_dough",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>COOKIE_DOUGH = ITEMS.register("cookie_dough",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));


    public static final RegistryObject<Item>HOT_COCOA = ITEMS.register("hot_cocoa",
            () -> new DrinkItem(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>EGG_NOG = ITEMS.register("egg_nog",
            () -> new DrinkItem(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>GINGERBREAD_COOKIE = ITEMS.register("gingerbread_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>FUDGE = ITEMS.register("fudge",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>PEPPERMINT_COCOA = ITEMS.register("peppermint_cocoa",
            () -> new DrinkItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build()).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>PEPPERMINT_EXTRACT = ITEMS.register("peppermint_extract",
            () -> new Item(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>GROUND_GINGER = ITEMS.register("ground_ginger",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>DRIED_SWEETBERRIES = ITEMS.register("dried_sweet_berries",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>ICING = ITEMS.register("icing",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item>FRUITCAKE = ITEMS.register("fruitcake",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    public static final RegistryObject<Item> BOTTLE_OF_MINT = ITEMS.register("bottle_of_mint",
            () -> new MintBottleItem(new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));


    //BEGIN ST PAT'S DAY ITEMS//
    public static final RegistryObject<Item> FOUR_LEAF_CLOVER = ITEMS.register("four_leaf_clover",
            () -> new CloverItem(new Item.Properties().durability(50).tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> GREEN_BEER = ITEMS.register("green_beer",
            () -> new GreenBeerItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> LUCKY_HAT = ITEMS.register("lucky_hat",
            () -> new Item(new Item.Properties().tab(null)));

    //BEGIN EASTER ITEMS//
    public static final RegistryObject<Item> ANGORA_WOOL = ITEMS.register("angora_wool",
            () -> new AngoraWoolItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> EASTER_CARD = ITEMS.register("easter_card",
            () -> new CardItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> CHOCOLATE_BUNNY = ITEMS.register("chocolate_bunny",
            () -> new ChocolateBunnyItem( new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1.2F)
                    .alwaysEat().build()).tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

//BEGIN CHICKEN EASTER EGG DROPS//

    public static final RegistryObject<Item> PURPLE_EGG = ITEMS.register("purple_egg",
            () -> new EggItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> PINK_EGG = ITEMS.register("pink_egg",
            () -> new EggItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> BLUE_EGG = ITEMS.register("blue_egg",
            () -> new EggItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> YELLOW_EGG = ITEMS.register("yellow_egg",
            () -> new EggItem(new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    //BEGIN EASTER ARMOR//

    //BEGIN EASTER MOB SPAWN EGGS//

    public static final RegistryObject<ForgeSpawnEggItem> COLORED_CHICKEN_SPAWN_EGG = ITEMS.register("colored_chicken_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.COLORED_CHICKEN, 16777215, 15789322,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));


    public static final RegistryObject<ForgeSpawnEggItem> PINK_BUNNY_SPAWN_EGG = ITEMS.register("pink_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PINK_BUNNY,15315927, 14109586,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> PINK_BUNNY_SMALL_SPAWN_EGG = ITEMS.register("pink_bunny_small_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PINK_BUNNY_SMALL,15315927, 14109586,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<ForgeSpawnEggItem> PINK_BUNNY_LARGE_SPAWN_EGG = ITEMS.register("pink_bunny_large_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PINK_BUNNY_LARGE,15315927, 14109586,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<ForgeSpawnEggItem> BLUE_BUNNY_SPAWN_EGG = ITEMS.register("blue_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BLUE_BUNNY,11455972, 3512029,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> BLUE_BUNNY_SMALL_SPAWN_EGG = ITEMS.register("blue_bunny_small_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BLUE_BUNNY_SMALL,11455972, 3512029,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<ForgeSpawnEggItem> BLUE_BUNNY_LARGE_SPAWN_EGG = ITEMS.register("blue_bunny_large_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BLUE_BUNNY_LARGE,11455972, 3512029,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<ForgeSpawnEggItem> YELLOW_BUNNY_SPAWN_EGG = ITEMS.register("yellow_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.YELLOW_BUNNY, 16448700, 13158233,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> YELLOW_BUNNY_SMALL_SPAWN_EGG = ITEMS.register("yellow_bunny_small_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.YELLOW_BUNNY_SMALL,16448700, 13158233,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<ForgeSpawnEggItem> YELLOW_BUNNY_LARGE_SPAWN_EGG = ITEMS.register("yellow_bunny_large_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.YELLOW_BUNNY_LARGE,16448700, 13158233,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<ForgeSpawnEggItem> PURPLE_BUNNY_SPAWN_EGG = ITEMS.register("purple_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PURPLE_BUNNY, 13811433, 8671172,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> PURPLE_BUNNY_SMALL_SPAWN_EGG = ITEMS.register("purple_bunny_small_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PURPLE_BUNNY_SMALL,13811433, 8671172,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<ForgeSpawnEggItem> PURPLE_BUNNY_LARGE_SPAWN_EGG = ITEMS.register("purple_bunny_large_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PURPLE_BUNNY_LARGE,13811433, 8671172,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<ForgeSpawnEggItem> CYAN_BUNNY_SPAWN_EGG = ITEMS.register("cyan_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CYAN_BUNNY, 11461860, 4243391,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> CYAN_BUNNY_SMALL_SPAWN_EGG = ITEMS.register("cyan_bunny_small_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CYAN_BUNNY_SMALL,11461860, 4243391,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<ForgeSpawnEggItem> CYAN_BUNNY_LARGE_SPAWN_EGG = ITEMS.register("cyan_bunny_large_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CYAN_BUNNY_LARGE,11461860, 4243391,
                    new Item.Properties().tab(null)));



    public static final RegistryObject<Item> BUNNY_HOOD = ITEMS.register("bunny_hood",
            () -> new BunnyHoodArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_COSTUME = ITEMS.register("bunny_costume",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_PANTS = ITEMS.register("bunny_pants",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_FEET = ITEMS.register("bunny_feet",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));
    //BUNNY OUTFIT-LEATHER//
    public static final RegistryObject<Item> BUNNY_HOOD_LEATHER = ITEMS.register("bunny_hood_leather",
            () -> new BunnyHoodArmorItem(ModArmorMaterial.ANGORA_WOOL_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> BUNNY_COSTUME_LEATHER = ITEMS.register("bunny_costume_leather",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> BUNNY_PANTS_LEATHER = ITEMS.register("bunny_pants_leather",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    public static final RegistryObject<Item> BUNNY_FEET_LEATHER = ITEMS.register("bunny_feet_leather",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_SPRING_GROUP)));

    //BUNNY OUTFIT-IRON//
    public static final RegistryObject<Item> BUNNY_HOOD_IRON = ITEMS.register("bunny_hood_iron",
            () -> new BunnyHoodArmorItem(ModArmorMaterial.ANGORA_WOOL_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_COSTUME_IRON = ITEMS.register("bunny_costume_iron",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_PANTS_IRON = ITEMS.register("bunny_pants_iron",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_FEET_IRON = ITEMS.register("bunny_feet_iron",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_BUNNY_HOOD = ITEMS.register("reinforced_bunny_hood",
            () -> new BunnyHoodArmorItem(ModArmorMaterial.REINFORCED_ANGORA_WOOL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_BUNNY_COSTUME = ITEMS.register("reinforced_bunny_costume",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_ANGORA_WOOL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_BUNNY_PANTS = ITEMS.register("reinforced_bunny_pants",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_ANGORA_WOOL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_BUNNY_FEET = ITEMS.register("reinforced_bunny_feet",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_ANGORA_WOOL, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BUNNY_FACE = ITEMS.register("bunny_face",
            () -> new Item(new Item.Properties().tab(null)));

//ADD HALLOWEEN COSTUMED MOB SPAWN EGGS//

    public static final RegistryObject<Item> COSTUMED_ZOMBIE_SPAWN_EGG = ITEMS.register("costumed_zombie_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_ZOMBIE.get(), 7836928, 16777215,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_SKELETON_SPAWN_EGG = ITEMS.register("costumed_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_SKELETON.get(), 12367527, 11418760,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    //  public static final RegistryObject<Item> COSTUMED_WITHER_SKELETON_SPAWN_EGG = ITEMS.register("costumed_wither_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_WITHER_SKELETON.get(), 3881787, 11418760,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_HUSK_SPAWN_EGG = ITEMS.register("costumed_husk_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_HUSK.get(), 14408133, 7827024,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_DROWNED_SPAWN_EGG = ITEMS.register("costumed_drowned_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_DROWNED.get(), 7580060, 2511240,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_DROWNED_MERMAID_SPAWN_EGG = ITEMS.register("costumed_drowned_mermaid_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_DROWNED_MERMAID.get(), 7580060, 13266838,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_ZOMBIE_VILLAGER_SPAWN_EGG = ITEMS.register("costumed_zombie_villager_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get(), 4151336, 1451585,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    //   public static final RegistryObject<Item> COSTUMED_PILLAGER_SPAWN_EGG = ITEMS.register("costumed_pillager_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_PILLAGER.get(), 10919858, 1315860,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    //   public static final RegistryObject<Item> COSTUMED_EVOKER_SPAWN_EGG = ITEMS.register("costumed_evoker_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_EVOKER.get(), 328965, 10392188,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

//    public static final RegistryObject<Item> COSTUMED_VINDICATOR_SPAWN_EGG = ITEMS.register("costumed_vindicator_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_VINDICATOR.get(), 16382968, 3878472,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_WITCH_SPAWN_EGG = ITEMS.register("costumed_witch_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_WITCH.get(), 16043186, 16316664,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_CREEPER_SPAWN_EGG = ITEMS.register("costumed_creeper_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_CREEPER.get(), 11644326, 7235936,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> COSTUMED_SPIDER_SPAWN_EGG = ITEMS.register("costumed_spider_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.COSTUMED_SPIDER.get(), 2498587, 15234561,  new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> CHRISTMAS_CREEPER_SPAWN_EGG = ITEMS.register("christmas_creeper_spawn_egg", () -> new ForgeSpawnEggItem(() -> ModEntityTypes.CHRISTMAS_CREEPER.get(), 38656, 16711697,  new Item.Properties().tab(ModItemGroups.MAIDENS_WINTER_GROUP)));

    //HALLOWEEN COSTUME ITEMS//
 /*   public static final RegistryObject<Item> REAPER_MASK = ITEMS.register("reaper_mask",
            () -> new ArmorItem(ModArmorMaterial.REAPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> REAPER_BODY = ITEMS.register("reaper_body",
            () -> new ArmorItem(ModArmorMaterial.REAPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> REAPER_LEGGINGS = ITEMS.register("reaper_leggings",
            () -> new ArmorItem(ModArmorMaterial.REAPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> REAPER_BOOTS = ITEMS.register("grim_greaves",
            () -> new ArmorItem(ModArmorMaterial.REAPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> CLOWN_MASK = ITEMS.register("clown_mask",
            () -> new ArmorItem(ModArmorMaterial.CLOWN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> CLOWN_BODY = ITEMS.register("clown_body",
            () -> new ArmorItem(ModArmorMaterial.CLOWN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> CLOWN_PANTS = ITEMS.register("clown_pants",
            () -> new ArmorItem(ModArmorMaterial.CLOWN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> CLOWN_SHOES = ITEMS.register("clown_shoes",
            () -> new ArmorItem(ModArmorMaterial.CLOWN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> VAMPIRE_MASK = ITEMS.register("vampire_mask",
            () -> new ArmorItem(ModArmorMaterial.VAMPIRE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> VAMPIRE_BODY = ITEMS.register("vampire_body",
            () -> new ArmorItem(ModArmorMaterial.VAMPIRE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> VAMPIRE_PANTS = ITEMS.register("vampire_trousers",
            () -> new ArmorItem(ModArmorMaterial.VAMPIRE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> VAMPIRE_SHOES = ITEMS.register("vampire_boots",
            () -> new ArmorItem(ModArmorMaterial.VAMPIRE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));
*/

    public static final RegistryObject<Item> PIRATE_MASK = ITEMS.register("pirate_mask",
            () -> new ArmorItem(ModArmorMaterial.PIRATE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PIRATE_BODY = ITEMS.register("pirate_body",
            () -> new ArmorItem(ModArmorMaterial.PIRATE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PIRATE_PANTS = ITEMS.register("pirate_pants",
            () -> new ArmorItem(ModArmorMaterial.PIRATE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PIRATE_BOOTS = ITEMS.register("pirate_plunderers",
            () -> new ArmorItem(ModArmorMaterial.PIRATE, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MUMMY_MASK = ITEMS.register("mummy_mask",
            () -> new ArmorItem(ModArmorMaterial.MUMMY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> MUMMY_BODY = ITEMS.register("mummy_body",
            () -> new ArmorItem(ModArmorMaterial.MUMMY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MUMMY_PANTS = ITEMS.register("mummy_leggings",
            () -> new ArmorItem(ModArmorMaterial.MUMMY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MUMMY_BOOTS = ITEMS.register("mummy_feet",
            () -> new ArmorItem(ModArmorMaterial.MUMMY, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_MASK = ITEMS.register("frankenstein_mask",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_BODY = ITEMS.register("frankenstein_body",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_PANTS = ITEMS.register("frankenstein_leggings",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_BOOTS = ITEMS.register("frankenstein_feet",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BRIDE_MASK = ITEMS.register("bride_mask",
            () -> new ArmorItem(ModArmorMaterial.BRIDE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> BRIDE_BODY = ITEMS.register("bride_body",
            () -> new ArmorItem(ModArmorMaterial.BRIDE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BRIDE_PANTS = ITEMS.register("bride_breeches",
            () -> new ArmorItem(ModArmorMaterial.BRIDE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BRIDE_BOOTS = ITEMS.register("bride_boots",
            () -> new ArmorItem(ModArmorMaterial.BRIDE, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> MERMAID_MASK = ITEMS.register("mermaid_mask",
            () -> new ArmorItem(ModArmorMaterial.MERMAID, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAID_BODY = ITEMS.register("mermaid_body",
            () -> new ArmorItem(ModArmorMaterial.MERMAID, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAID_PANTS = ITEMS.register("mermaid_tail",
            () -> new ArmorItem(ModArmorMaterial.MERMAID, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAID_BOOTS = ITEMS.register("mermaid_fins",
            () -> new ArmorItem(ModArmorMaterial.MERMAID, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> MERMAN_MASK = ITEMS.register("merman_mask",
            () -> new ArmorItem(ModArmorMaterial.MERMAN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAN_BODY = ITEMS.register("merman_body",
            () -> new ArmorItem(ModArmorMaterial.MERMAN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAN_PANTS = ITEMS.register("merman_tail",
            () -> new ArmorItem(ModArmorMaterial.MERMAN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAN_BOOTS = ITEMS.register("merman_fins",
            () -> new ArmorItem(ModArmorMaterial.MERMAN, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> PIRATE_MASK_LEATHER = ITEMS.register("pirate_mask_leather",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> PIRATE_BODY_LEATHER = ITEMS.register("pirate_body_leather",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> PIRATE_PANTS_LEATHER = ITEMS.register("pirate_pants_leather",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> PIRATE_BOOTS_LEATHER = ITEMS.register("pirate_plunderers_leather",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MUMMY_MASK_LEATHER = ITEMS.register("mummy_mask_leather",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> MUMMY_BODY_LEATHER = ITEMS.register("mummy_body_leather",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MUMMY_PANTS_LEATHER = ITEMS.register("mummy_leggings_leather",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MUMMY_BOOTS_LEATHER = ITEMS.register("mummy_feet_leather",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> FRANKENSTEIN_MASK_LEATHER = ITEMS.register("frankenstein_mask_leather",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> FRANKENSTEIN_BODY_LEATHER = ITEMS.register("frankenstein_body_leather",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> FRANKENSTEIN_PANTS_LEATHER = ITEMS.register("frankenstein_leggings_leather",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> FRANKENSTEIN_BOOTS_LEATHER = ITEMS.register("frankenstein_feet_leather",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> BRIDE_MASK_LEATHER = ITEMS.register("bride_mask_leather",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> BRIDE_BODY_LEATHER = ITEMS.register("bride_body_leather",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> BRIDE_PANTS_LEATHER = ITEMS.register("bride_breeches_leather",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> BRIDE_BOOTS_LEATHER = ITEMS.register("bride_boots_leather",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> MERMAID_MASK_LEATHER = ITEMS.register("mermaid_mask_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MERMAID_BODY_LEATHER = ITEMS.register("mermaid_body_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MERMAID_PANTS_LEATHER = ITEMS.register("mermaid_tail_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MERMAID_BOOTS_LEATHER = ITEMS.register("mermaid_fins_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> MERMAN_MASK_LEATHER = ITEMS.register("merman_mask_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_LEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MERMAN_BODY_LEATHER = ITEMS.register("merman_body_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_LEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MERMAN_PANTS_LEATHER = ITEMS.register("merman_tail_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_LEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> MERMAN_BOOTS_LEATHER = ITEMS.register("merman_fins_leather",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_LEATHER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item> PIRATE_MASK_IRON = ITEMS.register("pirate_mask_iron",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PIRATE_BODY_IRON = ITEMS.register("pirate_body_iron",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PIRATE_PANTS_IRON = ITEMS.register("pirate_pants_iron",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> PIRATE_BOOTS_IRON = ITEMS.register("pirate_plunderers_iron",
            () -> new ArmorItem(ModArmorMaterial.PIRATE_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MUMMY_MASK_IRON = ITEMS.register("mummy_mask_iron",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> MUMMY_BODY_IRON = ITEMS.register("mummy_body_iron",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MUMMY_PANTS_IRON = ITEMS.register("mummy_leggings_iron",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MUMMY_BOOTS_IRON = ITEMS.register("mummy_feet_iron",
            () -> new ArmorItem(ModArmorMaterial.MUMMY_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_MASK_IRON = ITEMS.register("frankenstein_mask_iron",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_BODY_IRON = ITEMS.register("frankenstein_body_iron",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_PANTS_IRON = ITEMS.register("frankenstein_leggings_iron",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FRANKENSTEIN_BOOTS_IRON = ITEMS.register("frankenstein_feet_iron",
            () -> new ArmorItem(ModArmorMaterial.FRANKENSTEIN_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BRIDE_MASK_IRON = ITEMS.register("bride_mask_iron",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> BRIDE_BODY_IRON = ITEMS.register("bride_body_iron",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BRIDE_PANTS_IRON = ITEMS.register("bride_breeches_iron",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> BRIDE_BOOTS_IRON = ITEMS.register("bride_boots_iron",
            () -> new ArmorItem(ModArmorMaterial.BRIDE_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> MERMAID_MASK_IRON = ITEMS.register("mermaid_mask_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAID_BODY_IRON = ITEMS.register("mermaid_body_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAID_PANTS_IRON = ITEMS.register("mermaid_tail_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAID_BOOTS_IRON = ITEMS.register("mermaid_fins_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAID_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> MERMAN_MASK_IRON = ITEMS.register("merman_mask_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_IRON, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAN_BODY_IRON = ITEMS.register("merman_body_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_IRON, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAN_PANTS_IRON = ITEMS.register("merman_tail_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_IRON, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> MERMAN_BOOTS_IRON = ITEMS.register("merman_fins_iron",
            () -> new ArmorItem(ModArmorMaterial.MERMAN_IRON, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

/*
    public static final RegistryObject<Item> REINFORCED_REAPER_MASK = ITEMS.register("reinforced_reaper_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_REAPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_REAPER_BODY = ITEMS.register("reinforced_reaper_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_REAPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_REAPER_LEGGINGS = ITEMS.register("reinforced_reaper_leggings",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_REAPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_REAPER_BOOTS = ITEMS.register("reinforced_grim_greaves",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_REAPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_CLOWN_MASK = ITEMS.register("reinforced_clown_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_CLOWN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_CLOWN_BODY = ITEMS.register("reinforced_clown_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_CLOWN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_CLOWN_PANTS = ITEMS.register("reinforced_clown_pants",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_CLOWN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_CLOWN_SHOES = ITEMS.register("reinforced_clown_shoes",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_CLOWN, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_VAMPIRE_MASK = ITEMS.register("reinforced_vampire_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_VAMPIRE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_VAMPIRE_BODY = ITEMS.register("reinforced_vampire_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_VAMPIRE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_VAMPIRE_PANTS = ITEMS.register("reinforced_vampire_trousers",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_VAMPIRE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_VAMPIRE_SHOES = ITEMS.register("reinforced_vampire_boots",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_VAMPIRE, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));
*/

    public static final RegistryObject<Item> REINFORCED_PIRATE_MASK = ITEMS.register("reinforced_pirate_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_PIRATE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_PIRATE_BODY = ITEMS.register("reinforced_pirate_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_PIRATE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_PIRATE_PANTS = ITEMS.register("reinforced_pirate_pants",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_PIRATE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_PIRATE_BOOTS = ITEMS.register("reinforced_pirate_plunderers",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_PIRATE, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MUMMY_MASK = ITEMS.register("reinforced_mummy_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MUMMY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_MUMMY_BODY = ITEMS.register("reinforced_mummy_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MUMMY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MUMMY_PANTS = ITEMS.register("reinforced_mummy_leggings",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MUMMY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MUMMY_BOOTS = ITEMS.register("reinforced_mummy_feet",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MUMMY, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_FRANKENSTEIN_MASK = ITEMS.register("reinforced_frankenstein_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_FRANKENSTEIN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_FRANKENSTEIN_BODY = ITEMS.register("reinforced_frankenstein_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_FRANKENSTEIN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_FRANKENSTEIN_PANTS = ITEMS.register("reinforced_frankenstein_leggings",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_FRANKENSTEIN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_FRANKENSTEIN_BOOTS = ITEMS.register("reinforced_frankenstein_feet",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_FRANKENSTEIN, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_BRIDE_MASK = ITEMS.register("reinforced_bride_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_BRIDE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_BRIDE_BODY = ITEMS.register("reinforced_bride_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_BRIDE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_BRIDE_PANTS = ITEMS.register("reinforced_bride_breeches",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_BRIDE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_BRIDE_BOOTS = ITEMS.register("reinforced_bride_boots",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_BRIDE, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_MERMAID_MASK = ITEMS.register("reinforced_mermaid_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAID, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MERMAID_BODY = ITEMS.register("reinforced_mermaid_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAID, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MERMAID_PANTS = ITEMS.register("reinforced_mermaid_tail",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAID, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MERMAID_BOOTS = ITEMS.register("reinforced_mermaid_fins",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAID, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));


    public static final RegistryObject<Item> REINFORCED_MERMAN_MASK = ITEMS.register("reinforced_merman_mask",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MERMAN_BODY = ITEMS.register("reinforced_merman_body",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MERMAN_PANTS = ITEMS.register("reinforced_merman_tail",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> REINFORCED_MERMAN_BOOTS = ITEMS.register("reinforced_merman_fins",
            () -> new ArmorItem(ModArmorMaterial.REINFORCED_MERMAN, EquipmentSlot.FEET,
                    new Item.Properties().tab(null)));

    public static final RegistryObject<Item> TRICK_OR_TREAT_BAG = ITEMS.register("trick_or_treat_bag",
            () -> new HalloweenTreatBagItem(new Item.Properties().stacksTo(1).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> NOISEMAKER = ITEMS.register("noisemaker",
            () -> new NoisemakerItem(new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));



    public static final RegistryObject<Item>CARAMEL = ITEMS.register("caramel",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item>CARAMEL_APPLE = ITEMS.register("caramel_apple",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item>CARAMEL_POPCORN = ITEMS.register("caramel_popcorn",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item>CANDY_CORN = ITEMS.register("candy_corn",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item>POPCORN = ITEMS.register("popcorn",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));


    public static final RegistryObject<Item>PUMPKIN_BREAD = ITEMS.register("pumpkin_bread",
            () -> new Item(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item>APPLE_CIDER = ITEMS.register("apple_cider",
            () -> new DrinkItem(new Item.Properties().food(Foods.APPLE).tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));

    public static final RegistryObject<Item> SUNFLOWER_OIL = ITEMS.register("sunflower_oil",
            () -> new SunflowerOilItem(new Item.Properties().tab(ModItemGroups.MAIDENS_HALLOWEEN_GROUP)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
