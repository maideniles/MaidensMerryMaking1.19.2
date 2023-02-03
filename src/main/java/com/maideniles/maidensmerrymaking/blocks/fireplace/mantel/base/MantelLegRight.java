package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MantelLegRight extends HorizontalDecoBlock {

    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;

    private static final VoxelShape MANTEL_WEST_AABB = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 9.0D);
    private static final VoxelShape MANTEL_EAST_AABB = Block.box(7.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape MANTEL_NORTH_AABB = Block.box(7.0D, 0.0D, 0.0D, 15.0D, 16.0D, 8.0D);
    private static final VoxelShape MANTEL_SOUTH_AABB = Block.box(1.0D, 0.0D, 8.0D, 9.0D, 16.0D, 16.0D);

    public static final IntegerProperty DECORATION = IntegerProperty.create("decoration",0,3);


    public MantelLegRight(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {

            default:
            case NORTH:
                return MANTEL_NORTH_AABB;
            case SOUTH:
                return MANTEL_SOUTH_AABB;
            case WEST:
                return MANTEL_WEST_AABB;
            case EAST:

                return MANTEL_EAST_AABB;
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult pHit) {
        ItemStack deco = player.getItemInHand(hand);

        boolean flag = false;

        if (!level.isClientSide()) {

            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_VERTICAL_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,1));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_VERTICAL_LIGHTS_WHITE_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,2));
                deco.shrink(1);
                flag = true;
            }
            if (state.getValue(DECORATION) ==0 && deco.is(ModBlocks.GARLAND_VERTICAL_LIGHTS_MULTI_RIGHT.get().asItem())){
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FACING, state.getValue(this.FACING)).setValue(DECORATION,3));
                deco.shrink(1);
                flag = true;
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {




            if (state.getValue(MantelLegRight.FACING) == Direction.NORTH) {
                level.destroyBlock(pos, true);
                //destroy block above//
                level.destroyBlock(pos.above(), true);
                //destroy block 1 block above and to left//
                level.destroyBlock(pos.above().west(), true);
                //destroy block 1 block above and 2 blocks to left//
                level.destroyBlock(pos.above().west(2), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.west(2), true);
            }

            if (state.getValue(MantelLegRight.FACING) == Direction.SOUTH) {
                level.destroyBlock(pos, true);//destroy block above//
                level.destroyBlock(pos.above(), true);
                //destroy block 1 block above and to left//
                level.destroyBlock(pos.above().east(), true);
                //destroy block 1 block above and 2 blocks to left//
                level.destroyBlock(pos.above().east(2), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.east(2), true);
            }

            if (state.getValue(MantelLegRight.FACING) == Direction.EAST) {
                level.destroyBlock(pos, true);//destroy block above//
                level.destroyBlock(pos.above(), true);
                //destroy block 1 block above and to left//
                level.destroyBlock(pos.above().north(), true);
                //destroy block 1 block above and 2 blocks to left//
                level.destroyBlock(pos.above().north(2), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.north(2), true);
            }

            if (state.getValue(MantelLegRight.FACING) == Direction.WEST) {
                level.destroyBlock(pos, true); //destroy block above//
                level.destroyBlock(pos.above(), true);
                //destroy block 1 block above and to left//
                level.destroyBlock(pos.above().south(), true);
                //destroy block 1 block above and 2 blocks to left//
                level.destroyBlock(pos.above().south(2), true);
                //destroy block 2 blocks to left//
                level.destroyBlock(pos.south(2), true);
            }


        if(state.getValue(DECORATION) == 1){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_RIGHT.get()));}
        if(state.getValue(DECORATION) == 2){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_LIGHTS_WHITE_RIGHT.get()));}
        if(state.getValue(DECORATION) == 3){popResource(level, pos, new ItemStack(ModBlocks.GARLAND_VERTICAL_LIGHTS_MULTI_RIGHT.get()));}
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(DECORATION);

    }
}
