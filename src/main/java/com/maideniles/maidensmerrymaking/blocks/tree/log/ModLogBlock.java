package com.maideniles.maidensmerrymaking.blocks.tree.log;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;

import javax.annotation.Nullable;

public class ModLogBlock extends RotatedPillarBlock {

    public ModLogBlock(Properties p_55926_) {
        super(p_55926_);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {


            if(state.is(ModBlocks.PRESERVED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_PRESERVED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.PRESERVED_EXPOSED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_PRESERVED_EXPOSED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.PRESERVED_WEATHERED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_PRESERVED_WEATHERED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.PRESERVED_AGED_PINE_LOG.get())) {
                return ModBlocks.STRIPPED_PRESERVED_AGED_PINE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.PRESERVED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_PRESERVED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModBlocks.PRESERVED_EXPOSED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_PRESERVED_EXPOSED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.PRESERVED_WEATHERED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_PRESERVED_WEATHERED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.PRESERVED_AGED_PINE_WOOD.get())) {
                return ModBlocks.STRIPPED_PRESERVED_AGED_PINE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
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
