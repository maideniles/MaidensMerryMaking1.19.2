package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.MantelDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Predicate;

public class MantelTopCenterStocking extends MantelDecoBlock {


    protected static final VoxelShape MANTEL_WEST_AABB = Block.box(0.0D, 8.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape MANTEL_EAST_AABB = Block.box(7.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape MANTEL_NORTH_AABB = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape MANTEL_SOUTH_AABB = Block.box(0.0D, 8.0D, 7.0D, 16.0D, 16.0D, 16.0D);

    public static final IntegerProperty DECORATION = IntegerProperty.create("decoration",0,7);

    public MantelTopCenterStocking(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING,Direction.NORTH).setValue(DECORATION, Integer.valueOf(0)));


    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return MANTEL_SOUTH_AABB;
            case NORTH:
            default:
                return MANTEL_NORTH_AABB;
            case WEST:
                return MANTEL_WEST_AABB;
            case EAST:
                return MANTEL_EAST_AABB;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(DIRECTION, context.getHorizontalDirection().getOpposite());

    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult pHit) {
        ItemStack deco = player.getItemInHand(hand);

        boolean flag = false;

        if (!level.isClientSide()) {

            if (state.getValue(DECORATION) ==0 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,1));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_HORIZONTAL.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,2));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,3));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,4));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is( ModBlocks.GARLAND_HORIZONTAL.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,5));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is( ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,6));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,7));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==2 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,5));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==3 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,6));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==4 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,7));
                deco.shrink(1);
                flag = true;
            }

        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);
        if (blockstate.getBlock() == this ) {


            if (state.getValue(MantelTopCenterStocking.FACING) == Direction.NORTH) {

                level.destroyBlock(pos, true);
                //destroy block to left//
                level.destroyBlock(pos.west(), true);

                //destroy block  to right//
                level.destroyBlock(pos.east(), true);

                //destroy block 1 block below and 1 to right//
                level.destroyBlock(pos.below().east(), true);

                //destroy block 1 blocks below and 1 to left//
                level.destroyBlock(pos.below().west(), true);
            }

            if (state.getValue(MantelTopCenterStocking.FACING) == Direction.SOUTH) {
                level.destroyBlock(pos, true);
                //destroy block to left//
                level.destroyBlock(pos.east(), true);
                //destroy block  to right//
                level.destroyBlock(pos.west(), true);
                //destroy block 1 block below and 1 to right//
                level.destroyBlock(pos.below().west(), true);
                //destroy block 1 blocks below and 1 to left//
                level.destroyBlock(pos.below().east(), true);
            }

            if (state.getValue(MantelTopCenterStocking.FACING) == Direction.EAST) {

                level.destroyBlock(pos, true);
                //destroy block to left//
                level.destroyBlock(pos.north(), true);
                //destroy block  to right//
                level.destroyBlock(pos.south(), true);
                //destroy block 1 block below and 1 to right//
                level.destroyBlock(pos.below().south(), true);
                //destroy block 1 blocks below and 1 to left//
                level.destroyBlock(pos.below().north(), true);
            }

            if (state.getValue(MantelTopCenterStocking.FACING) == Direction.WEST) {

                level.destroyBlock(pos, true);
                //destroy block to left//

                level.destroyBlock(pos.south(), true);
                //destroy block  to right//
                level.destroyBlock(pos.north(), true);
                //destroy block 1 block below and 1 to right//
                level.destroyBlock(pos.below().south(), true);
                //destroy block 1 blocks below and 1 to left//
                level.destroyBlock(pos.below().north(), true);
            }
        }

        if(blockstate.getValue(DECORATION) == 1){popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));}
        if(blockstate.getValue(DECORATION) == 2){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL.get()));}
        if(blockstate.getValue(DECORATION) == 3){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get()));}
        if(blockstate.getValue(DECORATION) == 4){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get()));}


        if(blockstate.getValue(DECORATION) == 5){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 6){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 7){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
}










    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(DECORATION);

    }

}





