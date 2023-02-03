package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MaidensMerryMaking.MOD_ID);



    public static final RegistryObject<SoundEvent> CHRISTMAS_MUSIC_DISC =
            registerSoundEvent("christmas_disc");

    public static final RegistryObject<SoundEvent> CHRISTMAS_MUSIC_DISC_2 =
            registerSoundEvent("christmas_disc_2");

    public static final RegistryObject<SoundEvent> HALLOWEEN_MUSIC_DISC =
                registerSoundEvent("halloween_disc");

    public static final RegistryObject<SoundEvent> IRON_GATE_OPEN =
            registerSoundEvent("iron_gate_open");
    public static final RegistryObject<SoundEvent> IRON_GATE_CLOSE =
            registerSoundEvent("iron_gate_close");
    public static final RegistryObject<SoundEvent> IRON_GATE_FALL =
            registerSoundEvent("iron_gate_fall");

    public static final RegistryObject<SoundEvent> IRON_GATE_STEP =
            registerSoundEvent("iron_gate_step");

    public static final RegistryObject<SoundEvent> IRON_GATE_BREAK =
            registerSoundEvent("iron_gate_break");

    public static final RegistryObject<SoundEvent> IRON_GATE_PLACE =
            registerSoundEvent("iron_gate_place");

    public static final RegistryObject<SoundEvent> IRON_GATE_HIT =
            registerSoundEvent("iron_gate_hit");

    public static final ForgeSoundType IRON_GATE_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSoundEvents.IRON_GATE_BREAK, ModSoundEvents.IRON_GATE_STEP, ModSoundEvents.IRON_GATE_PLACE,
           ModSoundEvents.IRON_GATE_HIT, ModSoundEvents.IRON_GATE_FALL);



    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(MaidensMerryMaking.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
