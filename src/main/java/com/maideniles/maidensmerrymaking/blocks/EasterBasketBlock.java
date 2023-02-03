package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Objects;
import java.util.Random;

import static com.maideniles.maidensmerrymaking.blocks.PresentBlock.inclusiveBoundedRandom;

public class EasterBasketBlock extends Block {
public Random rand = new Random();


    protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 12.0D, 13.0D);


    public EasterBasketBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }



    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        Random rand = new Random();
        Integer gift_id = rand.nextInt(15);
        Integer bunny_chance = rand.nextInt(40);
        Integer gift_count = inclusiveBoundedRandom(rand,1,5);
        Integer egg_id = inclusiveBoundedRandom(rand, 0, 4);


        if(egg_id == 0){
           popResource(level, pos, new ItemStack(ModItems.PINK_EGG.get(),gift_count));}
        else if(egg_id== 1){
           popResource(level, pos, new ItemStack(ModItems.PURPLE_EGG.get(),gift_count));}
        else if(egg_id ==2){
           popResource(level, pos, new ItemStack(ModItems.BLUE_EGG.get(),gift_count));}
        else if(egg_id == 3){
           popResource(level, pos, new ItemStack(ModItems.YELLOW_EGG.get(),gift_count));}

       popResource(level, pos, new ItemStack(ModItems.CHOCOLATE_BUNNY.get(),1));
       popResource(level, pos, new ItemStack(ModItems.ANGORA_WOOL.get(),1));
       popResource(level, pos, new ItemStack(ModBlocks.RAINBOW_ZIGZAG_EASTER_EGG_BLOCK.get(),1));

        if (level instanceof ServerLevel) {

            if (gift_id == 0) {

                this.spawnPinkBunny((ServerLevel) level, pos);

            } else if (gift_id == 1) {
                this.spawnPurpleBunny((ServerLevel) level, pos);

            }


            else if (gift_id == 2) {
                this.spawnBlueBunny((ServerLevel) level, pos);

            }


            else if (gift_id == 3) {
                this.spawnCyanBunny((ServerLevel) level, pos);

            }


            else if (gift_id == 4) {
                this.spawnYellowBunny((ServerLevel) level, pos);

            }

            else if (gift_id == 5) {
                popResource(level, pos, new ItemStack(Items.DIAMOND, gift_count));
            }

            else if (gift_id == 6) {
                popResource(level, pos, new ItemStack(Items.NETHERITE_INGOT, 1));
            }

            else if (gift_id == 7) {
                popResource(level, pos, new ItemStack(Items.NETHER_STAR, 1));
            }

            else if (gift_id == 8) {
                popResource(level, pos, new ItemStack(Items.HEART_OF_THE_SEA, 1));
            }
            else if (gift_id == 9) {
                popResource(level, pos, new ItemStack(Items.LODESTONE, gift_count));
            }
            else if (gift_id == 10) {
                popResource(level, pos, new ItemStack(Items.DIAMOND_BLOCK, 1));
            }

            else if (gift_id == 11) {
                popResource(level, pos, new ItemStack(Items.EMERALD_BLOCK, gift_count));
            }

            else if (gift_id == 12) {
                popResource(level, pos, new ItemStack(Items.BEACON, gift_count));
            }

            else if (gift_id == 13) {
                popResource(level, pos, new ItemStack(ModItems.EASTER_CARD.get(), gift_count));
            }

            else if (gift_id == 14) {
                popResource(level, pos, new ItemStack(Items.SPORE_BLOSSOM, gift_count));
            }

        }


    }



    private static void spawnPinkBunny(ServerLevel p_54181_, BlockPos p_54182_) {
        Random rand = new Random();
        int rng = rand.nextInt(3);
        ColoredBunnyEntity bunnyEntity = null;
         if(rng == 0){
            bunnyEntity = ModEntityTypes.PINK_BUNNY.get().create(p_54181_);
        } else if(rng == 1){
            bunnyEntity = ModEntityTypes.PINK_BUNNY_SMALL.get().create(p_54181_);
        } else if(rng == 2){
            bunnyEntity = ModEntityTypes.PINK_BUNNY_LARGE.get().create(p_54181_);
        }
        if(bunnyEntity != null){
            p_54181_.addFreshEntity(bunnyEntity);
            bunnyEntity.moveTo((double)p_54182_.getX() + 0.5D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 0.5D, 0.0F, 0.0F);
            bunnyEntity.spawnAnim();
        }

    }

    private static void spawnPurpleBunny(ServerLevel p_54181_, BlockPos p_54182_) {
        Random rand = new Random();
        int rng = rand.nextInt(3);
        ColoredBunnyEntity bunnyEntity = null;
    if(rng == 0){
            bunnyEntity = ModEntityTypes.PURPLE_BUNNY.get().create(p_54181_);
        } else if(rng == 1){
            bunnyEntity = ModEntityTypes.PURPLE_BUNNY_SMALL.get().create(p_54181_);
        } else if(rng == 2){
            bunnyEntity = ModEntityTypes.PURPLE_BUNNY_LARGE.get().create(p_54181_);
        }
        if(bunnyEntity != null){
            p_54181_.addFreshEntity(bunnyEntity);
            bunnyEntity.moveTo((double)p_54182_.getX() + 0.5D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 0.5D, 0.0F, 0.0F);
            bunnyEntity.spawnAnim();
        }

    }

    private static void spawnBlueBunny(ServerLevel p_54181_, BlockPos p_54182_) {
        Random rand = new Random();
        int rng = rand.nextInt(3);
        ColoredBunnyEntity bunnyEntity = null;
  if(rng == 0){
            bunnyEntity = ModEntityTypes.BLUE_BUNNY.get().create(p_54181_);
        } else if(rng == 1){
            bunnyEntity = ModEntityTypes.BLUE_BUNNY_SMALL.get().create(p_54181_);
        } else if(rng == 2){
            bunnyEntity = ModEntityTypes.BLUE_BUNNY_LARGE.get().create(p_54181_);
        }
        if(bunnyEntity != null){
            p_54181_.addFreshEntity(bunnyEntity);
            bunnyEntity.moveTo((double)p_54182_.getX() + 0.5D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 0.5D, 0.0F, 0.0F);
            bunnyEntity.spawnAnim();
        }

    }

    private static void spawnCyanBunny(ServerLevel p_54181_, BlockPos p_54182_) {
        Random rand = new Random();
        int rng = rand.nextInt(3);
        ColoredBunnyEntity bunnyEntity = null;
   if(rng == 0){
            bunnyEntity = ModEntityTypes.CYAN_BUNNY.get().create(p_54181_);
        } else if(rng == 1){
            bunnyEntity = ModEntityTypes.CYAN_BUNNY_SMALL.get().create(p_54181_);
        } else if(rng == 2){
            bunnyEntity = ModEntityTypes.CYAN_BUNNY_LARGE.get().create(p_54181_);
        }
        if(bunnyEntity != null){
            p_54181_.addFreshEntity(bunnyEntity);
            bunnyEntity.moveTo((double)p_54182_.getX() + 0.5D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 0.5D, 0.0F, 0.0F);
            bunnyEntity.spawnAnim();
        }

    }

    private static void spawnYellowBunny(ServerLevel p_54181_, BlockPos p_54182_) {
        Random rand = new Random();
        int rng = rand.nextInt(3);
        ColoredBunnyEntity bunnyEntity = null;
   if(rng == 0){
            bunnyEntity = ModEntityTypes.YELLOW_BUNNY.get().create(p_54181_);
        } else if(rng == 1){
            bunnyEntity = ModEntityTypes.YELLOW_BUNNY_SMALL.get().create(p_54181_);
        } else if(rng == 2){
            bunnyEntity = ModEntityTypes.YELLOW_BUNNY_LARGE.get().create(p_54181_);
        }
        if(bunnyEntity != null){
            p_54181_.addFreshEntity(bunnyEntity);
            bunnyEntity.moveTo((double)p_54182_.getX() + 0.5D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 0.5D, 0.0F, 0.0F);
            bunnyEntity.spawnAnim();
        }

    }



}
