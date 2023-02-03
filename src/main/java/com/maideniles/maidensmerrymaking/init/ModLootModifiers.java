package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.modifiers.*;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {

    //REGISTER LOOT MODIFIERS HERE//
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MaidensMerryMaking.MOD_ID);

    private static final RegistryObject<Codec<ChestLootModifier>> CHEST_LOOT = GLOBAL_LOOT_MODIFIERS.register("chest_loot", ChestLootModifier.CODEC);

    private static final RegistryObject<Codec<ChristmasChestLootModifier>> CHRISTMAS_CHEST_LOOT = GLOBAL_LOOT_MODIFIERS.register("christmas_chest_loot", ChristmasChestLootModifier.CODEC);

    private static final RegistryObject<Codec<EasterChestLootModifier>> EASTER_CHEST_LOOT = GLOBAL_LOOT_MODIFIERS.register("easter_chest_loot", EasterChestLootModifier.CODEC);

    private static final RegistryObject<Codec<HalloweenChestLootModifier>> HALLOWEEN_CHEST_LOOT = GLOBAL_LOOT_MODIFIERS.register("halloween_chest_loot", HalloweenChestLootModifier.CODEC);

    private static final RegistryObject<Codec<SpruceLeavesConverterModifier>> SPRUCE_LEAVES_DROP_TINY_SAPLING = GLOBAL_LOOT_MODIFIERS.register("spruce_leaves_drop_tiny_sapling", SpruceLeavesConverterModifier.CODEC);

    private static final RegistryObject<Codec<ZombieBabyHatDropModifier>> ZOMBIE_BABY_HAT_DROP = GLOBAL_LOOT_MODIFIERS.register("zombie_baby_hat_drop", ZombieBabyHatDropModifier.CODEC);

}
