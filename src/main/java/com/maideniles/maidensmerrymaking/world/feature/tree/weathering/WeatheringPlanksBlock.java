package com.maideniles.maidensmerrymaking.world.feature.tree.weathering;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringPlanksBlock extends Block implements WeatheringLog {


    private final WeatheringLog.WeatherState weatherState;

    public WeatheringPlanksBlock(WeatheringLog.WeatherState pWeatherState, BlockBehaviour.Properties pProperties) {
        super(pProperties);
        this.weatherState = pWeatherState;

    }

    public void randomTick(BlockState p_222665_, ServerLevel p_222666_, BlockPos p_222667_, RandomSource p_222668_) {
        this.onRandomTick(p_222665_, p_222666_, p_222667_, p_222668_);
    }

    /**
     * @return whether this block needs random ticking.
     */
    public boolean isRandomlyTicking(BlockState pState) {
        return WeatheringLog.getNext(pState.getBlock()).isPresent();
    }

    public WeatheringLog.WeatherState getAge() {
        return this.weatherState;
    }

}
