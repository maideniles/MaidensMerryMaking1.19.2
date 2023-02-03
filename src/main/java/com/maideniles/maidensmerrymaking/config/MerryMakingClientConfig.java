package com.maideniles.maidensmerrymaking.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MerryMakingClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Client Configs for MaidensMerryMaking Mod");

        // HERE DEFINE YOUR CONFIGS

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
