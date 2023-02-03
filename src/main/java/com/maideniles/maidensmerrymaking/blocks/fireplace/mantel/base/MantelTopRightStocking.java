package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.MantelDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MantelTopRightStocking extends MantelDecoBlock {
    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 8.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(7.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 8.0D, 7.0D, 16.0D, 16.0D, 16.0D);

    private static final VoxelShape LEG_WEST_AABB = Block.box(0.0D, 0.0D, 2.0D, 8.0D, 8.0D, 8.0D);
    private static final VoxelShape LEG_EAST_AABB = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 14.0D);
    private static final VoxelShape LEG_NORTH_AABB = Block.box(8.5D, 0.0D, 0.0D, 14.5D, 8.0D, 8.0D);
    private static final VoxelShape LEG_SOUTH_AABB = Block.box(2.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);

    public static VoxelShape WITH_LEG_WEST;
    public static VoxelShape WITH_LEG_EAST;
    public static VoxelShape WITH_LEG_NORTH;
    public static VoxelShape WITH_LEG_SOUTH;

    public static final IntegerProperty DECORATION = IntegerProperty.create("decoration",0,13);

    public MantelTopRightStocking(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING,Direction.NORTH).setValue(DECORATION, Integer.valueOf(0)));
        WITH_LEG_WEST = Shapes.join( WEST_AABB, LEG_WEST_AABB, BooleanOp.OR);
        WITH_LEG_EAST = Shapes.join( EAST_AABB, LEG_EAST_AABB, BooleanOp.OR);
        WITH_LEG_NORTH = Shapes.join( NORTH_AABB, LEG_NORTH_AABB, BooleanOp.OR);
        WITH_LEG_SOUTH = Shapes.join( SOUTH_AABB, LEG_SOUTH_AABB, BooleanOp.OR);


    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return WITH_LEG_SOUTH;
            case NORTH:
            default:
                return WITH_LEG_NORTH;
            case WEST:
                return WITH_LEG_WEST;
            case EAST:
                return WITH_LEG_EAST;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection().getOpposite());
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
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_VERTICAL_CORNER_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,5));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,6));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,7));
                deco.shrink(1);
                flag = true;
            }


            if (state.getValue(DECORATION) ==1 && deco.is( ModBlocks.GARLAND_HORIZONTAL.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,8));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is( ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,9));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,10));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is(ModBlocks.GARLAND_VERTICAL_CORNER_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,11));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,12));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==1 && deco.is(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,13));
                deco.shrink(1);
                flag = true;
            }


            if (state.getValue(DECORATION) ==2 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,8));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==3 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,9));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==4 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,10));
                deco.shrink(1);
                flag = true;
            }

            if (state.getValue(DECORATION) ==5 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,11));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==6 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,12));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==7 && deco.getItem() == ModItems.STOCKING.get()){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,13));
                deco.shrink(1);
                flag = true;
            }

        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState blockstate, Player player) {



            if (blockstate.getValue(MantelTopRightStocking.FACING) == Direction.NORTH) {

                level.destroyBlock(pos, true);
                //destroy block below//
                level.destroyBlock(pos.below(), true);
                //destroy block 1 block  to left//
                level.destroyBlock(pos.west(), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.west(2), true);
                //destroy block 1 blocks below and 2 blocks to left//
                level.destroyBlock(pos.below().west(2), true);

            }

            if (blockstate.getValue(MantelTopRightStocking.FACING) == Direction.SOUTH) {

                level.destroyBlock(pos, true);
                //destroy block below//
                level.destroyBlock(pos.below(), true);
                //destroy block 1 block to left//
                level.destroyBlock(pos.east(), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.east(2), true);
                //destroy block 1 block below and 2 blocks to left//
                level.destroyBlock(pos.below().east(2), true);

            }

            if (blockstate.getValue(MantelTopRightStocking.FACING) == Direction.EAST) {

                level.destroyBlock(pos, true);
                //destroy block below//
                level.destroyBlock(pos.below(), true);
                //destroy block 1 block below  left//
                level.destroyBlock(pos.north(), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.north(2), true);
                //destroy block 1 block below and 2 blocks to left//
                level.destroyBlock(pos.below().north(2), true);

            }

            if (blockstate.getValue(MantelTopRightStocking.FACING) == Direction.WEST) {

                level.destroyBlock(pos, true);
                //destroy block below//
                level.destroyBlock(pos.below(), true);
                //destroy block 1 block below  left//
                level.destroyBlock(pos.south(), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.south(2), true);
                //destroy block 1 block below and 2 blocks to left//
                level.destroyBlock(pos.below().south(2), true);


        }
        if(blockstate.getValue(DECORATION) == 1){popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));}
        if(blockstate.getValue(DECORATION) == 2){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL.get()));}
        if(blockstate.getValue(DECORATION) == 3){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get()));}
        if(blockstate.getValue(DECORATION) == 4){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get()));}
        if(blockstate.getValue(DECORATION) == 5){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_CORNER_RIGHT.get()));}
        if(blockstate.getValue(DECORATION) == 6){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT.get()));}
        if(blockstate.getValue(DECORATION) == 7){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_RIGHT.get()));}



        if(blockstate.getValue(DECORATION) == 8){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 9){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 10){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 11){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_CORNER_RIGHT.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 12){
                popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT.get()));
            popResource(level,pos, new ItemStack(ModItems.STOCKING.get()));
        }
        if(blockstate.getValue(DECORATION) == 13){
            popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_RIGHT.get()));
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
