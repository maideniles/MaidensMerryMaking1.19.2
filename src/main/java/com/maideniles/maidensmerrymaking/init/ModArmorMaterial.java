package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterial implements ArmorMaterial {
    MOB_CHRISTMAS_LEATHER("mob_santa_hat", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),

    RED_CHRISTMAS_LEATHER("red_christmas_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    GREEN_CHRISTMAS_LEATHER("green_christmas_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    RED_SANTA_HAT_LEATHER("red_santa_hat_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    REINDEER_EARS_LEATHER("reindeer_ears_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),

    RED_CHRISTMAS_IRON("red_christmas_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    GREEN_CHRISTMAS_IRON("green_christmas_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    RED_SANTA_HAT_IRON("red_santa_hat_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    REINDEER_EARS_IRON("reindeer_ears_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    
    RED_CHRISTMAS("red_christmas", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    GREEN_CHRISTMAS("green_christmas", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    RED_SANTA_HAT("red_santa_hat", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    REINDEER_EARS("reindeerEars", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    
    REINFORCED_RED_CHRISTMAS("reinforced_red_christmas", 37, new int[] {3, 6, 8, 3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_GREEN_CHRISTMAS("reinforced_green_christmas", 37, new int[] {3, 6, 8, 3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_RED_SANTA_HAT("reinforced_red_santa_hat", 37, new int[] {3, 6, 8, 3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_REINDEER_EARS("reinforced_reindeerEars", 37, new int[] {3, 6, 8, 3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),

    ANGORA_WOOL("angora", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    ANGORA_WOOL_LEATHER("angora_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    ANGORA_WOOL_IRON("angora_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    REINFORCED_ANGORA_WOOL("reinforced_angora", 37, new int[] {3, 6, 8, 3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),


    BRIDE_LEATHER("bride_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    CLOWN_LEATHER("clown_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    FRANKENSTEIN_LEATHER("frankenstein_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    MERMAID_LEATHER("mermaid_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    MERMAN_LEATHER("merman_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    MUMMY_LEATHER("mummy_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    PIRATE_LEATHER("pirate_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    REAPER_LEATHER("reaper_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),
    VAMPIRE_LEATHER("vampire_leather", 5, new int[] {1, 2, 3, 1}, 15, Items.LEATHER, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f),

    BRIDE_IRON("bride_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    CLOWN_IRON("clown_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    FRANKENSTEIN_IRON("frankenstein_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    MERMAID_IRON("mermaid_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    MERMAN_IRON("merman_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    MUMMY_IRON("mummy_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    PIRATE_IRON("pirate_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    REAPER_IRON("reaper_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    VAMPIRE_IRON("vampire_iron", 15, new int[] {2, 5, 6, 2}, 9, Items.IRON_INGOT, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f),
    
    BRIDE("bride", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    CLOWN("clown", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.0f),
    FRANKENSTEIN("frankenstein", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    MERMAID("mermaid", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    MERMAN("merman", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    MUMMY("mummy", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    PIRATE("pirate", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    REAPER("reaper", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    VAMPIRE("vampire", 25, new int[] {3,6,8,3}, 10, Items.DIAMOND, SoundEvents.ARMOR_EQUIP_LEATHER, 2.0f, 0.0f),
    REINFORCED_BRIDE("reinforced_bride", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_CLOWN("reinforced_clown", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_FRANKENSTEIN("reinforced_frankenstein", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_MERMAID("reinforced_mermaid", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_MERMAN("reinforced_merman", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_MUMMY("reinforced_mummy", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_PIRATE("reinforced_pirate", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_REAPER("reinforced_reaper", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f),
    REINFORCED_VAMPIRE("reinforced_vampire", 37, new int[] {3,6,8,3}, 15, Items.NETHERITE_INGOT, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f);

    private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
    private String name;
    private SoundEvent sound;
    private int durability, enchantability;
    private Item repairItem;
    private int[] damageReductionAmounts;
    private float toughness;
    private float knockbackResistance;

    private ModArmorMaterial(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, SoundEvent equipSound, float toughness, float knockbackResistance)
    {
        this.name = name;
        this.sound = equipSound;
        this.durability = durability;
        this.enchantability = enchantability;
        this.repairItem = repairItem;
        this.damageReductionAmounts = damageReductionAmounts;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public String getName()
    {
        return MaidensMerryMaking.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return max_damage_array[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return this.damageReductionAmounts[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(this.repairItem);
    }
}