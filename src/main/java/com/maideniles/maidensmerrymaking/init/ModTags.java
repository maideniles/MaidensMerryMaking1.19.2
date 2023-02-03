package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PINE_LOGS = tag("pine_logs");
        public static final TagKey<Block> EXPOSED_PINE_LOGS = tag("exposed_pine_logs");
        public static final TagKey<Block> WEATHERED_PINE_LOGS = tag("weathered_pine_logs");
        public static final TagKey<Block> AGED_PINE_LOGS = tag("aged_pine_logs");

        public static final TagKey<Block> PINE_LOGS_F = forgeTag("pine_logs");
        public static final TagKey<Block> EXPOSED_PINE_LOGS_F = forgeTag("exposed_pine_logs");
        public static final TagKey<Block> WEATHERED_PINE_LOGS_F = forgeTag("weathered_pine_logs");
        public static final TagKey<Block> AGED_PINE_LOGS_F = forgeTag("aged_pine_logs");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MaidensMerryMaking.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}