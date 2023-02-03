package com.maideniles.maidensmerrymaking.world.feature.tree.weathering;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraftforge.common.ToolAction;

import javax.annotation.Nullable;

public class WeatheringLogBlock extends Block implements WeatheringLog {
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

    private final WeatheringLog.WeatherState weatherState;

    public WeatheringLogBlock(WeatheringLog.WeatherState pWeatherState, BlockBehaviour.Properties pProperties) {
        super(pProperties);
        this.weatherState = pWeatherState;
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
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

    public BlockState rotate(BlockState pState, Rotation pRot) {
        return rotatePillar(pState, pRot);
    }

    public static BlockState rotatePillar(BlockState pState, Rotation pRotation) {
        switch (pRotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch ((Direction.Axis)pState.getValue(AXIS)) {
                    case X:
                        return pState.setValue(AXIS, Direction.Axis.Z);
                    case Z:
                        return pState.setValue(AXIS, Direction.Axis.X);
                    default:
                        return pState;
                }
            default:
                return pState;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AXIS);
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(AXIS, pContext.getClickedFace().getAxis());
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {

            if(state.is(ModBlocks.PINE_LOG.get())) {
                return ModBlocks.STRIPPED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.EXPOSED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_EXPOSED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.WEATHERED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_WEATHERED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.AGED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_AGED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.EXPOSED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_EXPOSED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.WEATHERED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_WEATHERED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.AGED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_AGED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }


        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }
}
