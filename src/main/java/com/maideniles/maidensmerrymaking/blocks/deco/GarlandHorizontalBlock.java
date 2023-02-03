package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class GarlandHorizontalBlock extends Block {


    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final IntegerProperty CARD = IntegerProperty.create("card",0,8);

    public GarlandHorizontalBlock(Properties properties) {
        super(properties);
    }





    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection());
    }

    @Override
    public BlockState rotate(BlockState blockState, net.minecraft.world.level.block.Rotation rotation) {
        return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState blockState, net.minecraft.world.level.block.Mirror mirror) {
        return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_49646_) {
        p_49646_.add(FACING,CARD);
    }
/*
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        int i;
        boolean flag = false;
        if(!level.isClientSide() ) {

            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(CARD, 1));
                itemstack.shrink(1);
                flag = true;
            }

            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(CARD, 1));
                itemstack.shrink(1);
                flag = true;
            }

            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(CARD, 1));
                itemstack.shrink(1);
                flag = true;
            }

            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(CARD, 1));
                itemstack.shrink(1);
                flag = true;
            }
            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(CARD, 1));
                itemstack.shrink(1);
                flag = true;
            }
            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(CARD,1));
                itemstack.shrink(1);
                flag=true;
            }
            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(CARD,1));
                itemstack.shrink(1);
                flag=true;
            }
            if (itemstack.getItem() == ModItems.CHRISTMAS_CARD_1.get()) {
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(CARD,1));
                itemstack.shrink(1);
                flag=true;
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }*/
}









