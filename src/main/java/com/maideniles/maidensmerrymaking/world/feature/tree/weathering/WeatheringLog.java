package com.maideniles.maidensmerrymaking.world.feature.tree.weathering;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface WeatheringLog
        extends ChangeOverTimeBlock<WeatheringLog.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                .put(ModBlocks.PINE_LOG.get(), ModBlocks.EXPOSED_PINE_LOG.get())
                .put(ModBlocks.EXPOSED_PINE_LOG.get(), ModBlocks.WEATHERED_PINE_LOG.get())
                .put(ModBlocks.WEATHERED_PINE_LOG.get(), ModBlocks.AGED_PINE_LOG.get())

                .put(ModBlocks.STRIPPED_PINE_LOG.get(), ModBlocks.STRIPPED_EXPOSED_PINE_LOG.get())
                .put(ModBlocks.STRIPPED_EXPOSED_PINE_LOG.get(), ModBlocks.STRIPPED_WEATHERED_PINE_LOG.get())
                .put(ModBlocks.STRIPPED_WEATHERED_PINE_LOG.get(), ModBlocks.STRIPPED_AGED_PINE_LOG.get())

                .put(ModBlocks.PINE_WOOD.get(), ModBlocks.EXPOSED_PINE_WOOD.get())
                .put(ModBlocks.EXPOSED_PINE_WOOD.get(), ModBlocks.WEATHERED_PINE_WOOD.get())
                .put(ModBlocks.WEATHERED_PINE_WOOD.get(), ModBlocks.AGED_PINE_WOOD.get())

                .put(ModBlocks.STRIPPED_PINE_WOOD.get(), ModBlocks.STRIPPED_EXPOSED_PINE_WOOD.get())
                .put(ModBlocks.STRIPPED_EXPOSED_PINE_WOOD.get(), ModBlocks.STRIPPED_WEATHERED_PINE_WOOD.get())
                .put(ModBlocks.STRIPPED_WEATHERED_PINE_WOOD.get(), ModBlocks.STRIPPED_AGED_PINE_WOOD.get())

                .put(ModBlocks.PINE_PLANKS.get(), ModBlocks.EXPOSED_PINE_PLANKS.get())
                .put(ModBlocks.EXPOSED_PINE_PLANKS.get(), ModBlocks.WEATHERED_PINE_PLANKS.get())
                .put(ModBlocks.WEATHERED_PINE_PLANKS.get(), ModBlocks.AGED_PINE_PLANKS.get())



                .build();









    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return NEXT_BY_BLOCK.get().inverse();
    });

    static Optional<Block> getPrevious(Block p_154891_) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
    }

    static Block getFirst(Block p_154898_) {
        Block block = p_154898_;

        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(p_154898_); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState p_154900_) {
        return getPrevious(p_154900_.getBlock()).map((p_154903_) -> {
            return p_154903_.withPropertiesOf(p_154900_);
        });
    }

    static Optional<Block> getNext(Block p_154905_) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(p_154905_));
    }

    static BlockState getFirst(BlockState p_154907_) {
        return getFirst(p_154907_.getBlock()).withPropertiesOf(p_154907_);
    }

    default Optional<BlockState> getNext(BlockState p_154893_) {
        return getNext(p_154893_.getBlock()).map((p_154896_) -> {
            return p_154896_.withPropertiesOf(p_154893_);
        });
    }

    default float getChanceModifier() {
        return this.getAge() == WeatheringLog
                .WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        AGED;
    }
}
