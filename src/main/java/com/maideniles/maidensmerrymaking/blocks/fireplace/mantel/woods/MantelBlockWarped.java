package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.woods;

import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.*;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class MantelBlockWarped extends HorizontalMantelBase {
    public MantelBlockWarped(Properties properties) {
        super(properties);
    }




    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {

        if (state.getValue(this.FACING) == Direction.SOUTH) {

            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(-1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(-1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegLeft.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegRight.DECORATION,0));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

        if (state.getValue(this.FACING) == Direction.NORTH ) {

            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(-1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegLeft.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(-1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegRight.DECORATION,0));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

        if (state.getValue(this.FACING) == Direction.EAST ) {

            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 1, 1), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 1, -1), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 0, 1), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegLeft.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 0, -1), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegRight.DECORATION,0));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

        if (state.getValue(this.FACING) == Direction.WEST ) {

            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 1, -1), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 1, 1), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 0, -1), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegLeft.DECORATION,0));

            level.setBlockAndUpdate(pos.offset(0, 0, 1), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelLegRight.DECORATION,0));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }


    }


}
