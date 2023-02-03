package com.maideniles.maidensmerrymaking.blocks.tree;


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
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.ToIntFunction;

public class ChristmasTreeTopBlock extends BushBlock {

    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public static final IntegerProperty DECORATION = IntegerProperty.create("decoration",0,17);
    public static final BooleanProperty LIT = BlockStateProperties.LIT;


    public ChristmasTreeTopBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(DECORATION, Integer.valueOf(0)).setValue(LIT, false));
    }
    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(DECORATION,LIT);
    }

    public static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (state) -> state.getValue(LIT) ? pLightValue : 0;
    }


    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        boolean lights_only = state.getValue(DECORATION) == 1 || state.getValue(DECORATION) == 2;
        boolean lit_deco = false;
        int i;

        for(i = 6; i<18; ++i){
            if(state.getValue(DECORATION) == i){
                lit_deco = true;
            }
        }

        if(lights_only || lit_deco){
            return 5;
        }
        return super.getLightEmission(state, level, pos);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack deco = player.getItemInHand(handIn);
        boolean flag = false;
        if (!level.isClientSide()) {

 //TREE TOPPER PLACEMENTS//
    //STAR//
            if (deco.getItem() == ModItems.STAR.get()){
                level.setBlock(pos.above(), ModBlocks.STAR_TOPPER.get().defaultBlockState(),3);
                deco.shrink(1);
            }
    //BOW//
            if (deco.getItem() == ModItems.BOW.get()){
                level.setBlock(pos.above(), ModBlocks.BOW_TOPPER.get().defaultBlockState(),3);
                deco.shrink(1);
            }
//REMOVE TREE TOPPERS//
            if(player.isShiftKeyDown() && deco.isEmpty() && state.getBlock() == ModBlocks.BOW_TOPPER.get()){
                player.setItemInHand(handIn.MAIN_HAND, new ItemStack(ModItems.BOW.get()));
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(),3);
            }

            if(player.isShiftKeyDown() && deco.isEmpty() && state.getBlock() == ModBlocks.STAR_TOPPER.get()){
                player.setItemInHand(handIn.MAIN_HAND, new ItemStack(ModItems.STAR.get()));
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(),3);
            }

//WHITE LIGHTS ONLY//
            if (deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION, 1).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }

//MULTI LIGHTS ONLY//
            if (deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION, 2).setValue(LIT, true));

                deco.shrink(1);
                flag=true;
            }
//GARLAND ONLY//
            if (deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,3));
                deco.shrink(1);
                flag=true;
            }
//TRAD ORNAMENTS ONLY//
            if (deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,4));
                deco.shrink(1);
                flag=true;
            }
//MULTI ORNAMENTS ONLY//
            if (deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,5));
                deco.shrink(1);
                flag=true;
            }
//WHITE LIGHTS ON TREE//
            if (state.getValue(DECORATION) ==1 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,2).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==1 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,10).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==1 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,6).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==1 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,7).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
//MULTI LIGHTS ON TREE//
            if (state.getValue(DECORATION) ==2 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,1).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==2 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,11).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==2 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,8).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==2 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,9).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
//GARLAND//
            if (state.getValue(DECORATION) ==3 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,10).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==3 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,11).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==3 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,16));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==3 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,17));
                deco.shrink(1);
                flag=true;
            }
//ORNAMENTS-TRADITIONAL//
            if (state.getValue(DECORATION) ==4 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,6).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==4 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,8).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==4 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,16));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==4 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,5));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }

//ORNAMENTS--MULTI//
            if (state.getValue(DECORATION) ==5 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,7).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==5 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,9).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==5 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,17));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==5 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,4).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));
                deco.shrink(1);
                flag=true;
            }

//WHITE LIGHTS, TRAD ORNAMENTS//
            if (state.getValue(DECORATION) ==6 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,8).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==6 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,12).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==6 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,7).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }

//WHITE LIGHTS, MULTI ORNAMENTS//
            if (state.getValue(DECORATION) ==7 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,9).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==7 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,13).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==7 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,6).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));
                deco.shrink(1);
                flag=true;
            }

//MULTI LIGHTS, TRAD ORNAMENTS//
            if (state.getValue(DECORATION) ==8 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,6).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==8 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,14).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==8 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,9).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }
//MULTI LIGHTS, MULTI ORNAMENTS//
            if (state.getValue(DECORATION) ==9 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,7).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==9 && deco.getItem() == ModItems.TREE_GARLAND.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,15).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==9 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,8).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));
                deco.shrink(1);
                flag=true;
            }

//WHITE LIGHTS, GARLAND//
            if (state.getValue(DECORATION) ==10 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,1).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==10 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,12).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==10 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,13).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }

//MULTI LIGHTS, GARLAND//
            if (state.getValue(DECORATION) ==11 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,12).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==11 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,14).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==11 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,15).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }

//WHITE LIGHTS, TRAD ORNAMENTS, GARLAND//
            if (state.getValue(DECORATION) ==12 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,14).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==12 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,13).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }

//WHITE LIGHTS, MULTI ORNAMENTS, GARLAND//
            if (state.getValue(DECORATION) ==13 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,15).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==13 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,12).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));
                deco.shrink(1);
                flag=true;
            }

//MULTI LIGHTS, TRAD ORNAMENTS, GARLAND//
            if (state.getValue(DECORATION) ==14 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,12).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==14 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,15).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }

//MULTI LIGHTS, MULTI ORNAMENTS, GARLAND//
            if (state.getValue(DECORATION) ==15 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,13).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==15 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,14).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));
                deco.shrink(1);
                flag=true;
            }

//GARLAND, TRAD ORNAMENTS//
            if (state.getValue(DECORATION) ==16 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,12).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==16 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,14).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==16 && deco.getItem() == ModItems.ORNAMENTS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,13).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
                deco.shrink(1);
                flag=true;
            }

//GARLAND, MULTI ORNAMENTS//
            if (state.getValue(DECORATION) ==17 && deco.getItem() == ModItems.MINI_LIGHTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,13).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==17 && deco.getItem() == ModItems.MINI_LIGHTS_MULTI.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,15).setValue(LIT, true));
                deco.shrink(1);
                flag=true;
            }
            if (state.getValue(DECORATION) ==12 && deco.getItem() == ModItems.ORNAMENTS_WHITE.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(DECORATION,14).setValue(LIT, true));
                popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));
                deco.shrink(1);
                flag=true;
            }

        }
        return InteractionResult.PASS;

    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        Block block = state.getBlock();
        return block == ModBlocks.CHRISTMAS_TREE_MIDDLE.get() ;
    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos blockpos = pPos.below();
        if (pState.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return pLevel.getBlockState(blockpos).canSustainPlant(pLevel, blockpos, Direction.UP, this);
        return this.mayPlaceOn(pLevel.getBlockState(blockpos), pLevel, blockpos);
    }


    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if (blockstate.getBlock() == this ) {

            level.destroyBlock(pos,true);
            level.destroyBlock(pos.below(), true);
            level.destroyBlock(pos.below(2),true);
            level.destroyBlock(pos.above(),true);

        }

        if(blockstate.getValue(DECORATION) == 1){popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));}
        if(blockstate.getValue(DECORATION) == 2){popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));}
        if(blockstate.getValue(DECORATION) == 3){popResource(level, pos, new ItemStack(ModItems.TREE_GARLAND.get()));}
        if(blockstate.getValue(DECORATION) == 4){popResource(level, pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));}
        if(blockstate.getValue(DECORATION) == 5){popResource(level, pos, new ItemStack(ModItems.ORNAMENTS.get()));}

        if(blockstate.getValue(DECORATION) == 6){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
        }
        if(blockstate.getValue(DECORATION) == 7){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS.get()));
        }
        if(blockstate.getValue(DECORATION) == 8){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
        }
        if(blockstate.getValue(DECORATION) == 9){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS.get()));
        }
        if(blockstate.getValue(DECORATION) == 10){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
        }
        if(blockstate.getValue(DECORATION) == 11){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
        }
        if(blockstate.getValue(DECORATION) == 12){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
        }
        if(blockstate.getValue(DECORATION) == 13){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_WHITE.get()));
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS.get()));
        }
        if(blockstate.getValue(DECORATION) == 14){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
        }
        if(blockstate.getValue(DECORATION) == 15){
            popResource(level, pos, new ItemStack(ModItems.MINI_LIGHTS_MULTI.get()));
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS.get()));
        }
        if(blockstate.getValue(DECORATION) == 16){
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS_WHITE.get()));
        }
        if(blockstate.getValue(DECORATION) == 17){
            popResource(level,pos, new ItemStack(ModItems.TREE_GARLAND.get()));
            popResource(level,pos, new ItemStack(ModItems.ORNAMENTS.get()));
        }

    }


}
