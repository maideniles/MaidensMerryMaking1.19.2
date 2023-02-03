package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.config.MerryMakingCommonConfig;
import com.maideniles.maidensmerrymaking.entity.halloween.DrownedCostumeEntity;
import com.maideniles.maidensmerrymaking.entity.halloween.HuskCostumeEntity;
import com.maideniles.maidensmerrymaking.entity.halloween.SkeletonCostumeEntity;
import com.maideniles.maidensmerrymaking.entity.halloween.ZombieCostumeEntity;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class GravestoneBlock extends HorizontalDecoBlock {
    protected static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 12.0D, 12.0D);


    public GravestoneBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return pLevel.getBlockState(pPos.below()).is(BlockTags.BAMBOO_PLANTABLE_ON);
    }
    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState p_49849_, @Nullable LivingEntity p_49850_, ItemStack p_49851_) {
        Random rand = new Random();

        Integer undead_id = rand.nextInt(4);

        if (level instanceof ServerLevel) {

//CHECK IF HALLOWEEN EVENTS ARE ACTIVE//
            if (MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
//IF SO, CHOOSE BETWEEN 0 AND 3, SPAWN MOB ACCORDINGLY.
                if (undead_id == 0) {
                    this.spawnCostumedZombie((ServerLevel) level, pos);
                }

                if (undead_id == 1) {
                    this.spawnCostumedDrowned((ServerLevel) level, pos);
                }
                if (undead_id == 2) {
                    this.spawnCostumedHusk((ServerLevel) level, pos);
                }
                if (undead_id == 3) {
                    this.spawnCostumedSkeleton((ServerLevel) level, pos);
                }


            } else {
//IF HALLOWEEN IS NOT ACTIVE, CHOOSE BETWEEN 0-3 AND SPAWN VANILLA UNDEAD ACCORDINGLY.//
                if (undead_id == 0) {
                    this.spawnZombie((ServerLevel) level, pos);
                }

                if (undead_id == 1) {
                    this.spawnDrowned((ServerLevel) level, pos);
                }
                if (undead_id == 2) {
                    this.spawnHusk((ServerLevel) level, pos);
                }
                if (undead_id == 3) {
                    this.spawnSkeleton((ServerLevel) level, pos);
                }

            }

        }

    }
    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState p_49854_, Player p_49855_) {
        Random rand = new Random();

        Integer undead_id = rand.nextInt(4);

        if (level instanceof ServerLevel) {

//CHECK IF HALLOWEEN EVENTS ARE ACTIVE//
            if (MerryMakingCommonConfig.COSTUMES_ENABLED.get()) {
//IF SO, CHOOSE BETWEEN 0 AND 3, SPAWN MOB ACCORDINGLY.
                if (undead_id == 0) {
                    this.spawnCostumedZombie((ServerLevel) level, pos);
                }

                if (undead_id == 1) {
                    this.spawnCostumedDrowned((ServerLevel) level, pos);
                }
                if (undead_id == 2) {
                    this.spawnCostumedHusk((ServerLevel) level, pos);
                }
                if (undead_id == 3) {
                    this.spawnCostumedSkeleton((ServerLevel) level, pos);
                }


            } else {
//IF HALLOWEEN IS NOT ACTIVE, CHOOSE BETWEEN 0-3 AND SPAWN VANILLA UNDEAD ACCORDINGLY.//
                if (undead_id == 0) {
                    this.spawnZombie((ServerLevel) level, pos);
                }

                if (undead_id == 1) {
                    this.spawnDrowned((ServerLevel) level, pos);
                }
                if (undead_id == 2) {
                    this.spawnHusk((ServerLevel) level, pos);
                }
                if (undead_id == 3) {
                    this.spawnSkeleton((ServerLevel) level, pos);
                }

            }

        }
    }

    private static void spawnZombie(ServerLevel p_54181_, BlockPos p_54182_) {
            Zombie zombie = EntityType.ZOMBIE.create(p_54181_);
              if(zombie != null){
            p_54181_.addFreshEntity(zombie);
            zombie.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            zombie.spawnAnim();
        }

    }

    private static void spawnHusk(ServerLevel p_54181_, BlockPos p_54182_) {
        Zombie zombie = EntityType.HUSK.create(p_54181_);
        if(zombie != null){
            p_54181_.addFreshEntity(zombie);
            zombie.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            zombie.spawnAnim();
        }

    }

    private static void spawnDrowned(ServerLevel p_54181_, BlockPos p_54182_) {
        Zombie zombie = EntityType.DROWNED.create(p_54181_);
        if(zombie != null){
            p_54181_.addFreshEntity(zombie);
            zombie.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            zombie.spawnAnim();
        }

    }

    private static void spawnSkeleton(ServerLevel p_54181_, BlockPos p_54182_) {
        Skeleton skele = EntityType.SKELETON.create(p_54181_);
        if(skele != null){
            p_54181_.addFreshEntity(skele);
            skele.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            skele.spawnAnim();
        }

    }

    private static void spawnCostumedZombie(ServerLevel p_54181_, BlockPos p_54182_) {
        ZombieCostumeEntity zombie = ModEntityTypes.COSTUMED_ZOMBIE.get().create(p_54181_);
        if(zombie != null){
            p_54181_.addFreshEntity(zombie);
            zombie.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            zombie.spawnAnim();
        }

    }

    private static void spawnCostumedDrowned(ServerLevel p_54181_, BlockPos p_54182_) {
        Random rand = new Random();
        int rng = rand.nextInt(2);
        DrownedCostumeEntity zombie = null;

        if(rng == 0){
            zombie = ModEntityTypes.COSTUMED_DROWNED.get().create(p_54181_);
        } else if(rng == 1) {
            zombie = ModEntityTypes.COSTUMED_DROWNED_MERMAID.get().create(p_54181_);
        }
        if(zombie != null){
            p_54181_.addFreshEntity(zombie);
            zombie.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            zombie.spawnAnim();
        }

    }

    private static void spawnCostumedHusk(ServerLevel p_54181_, BlockPos p_54182_) {
        HuskCostumeEntity zombie = ModEntityTypes.COSTUMED_HUSK.get().create(p_54181_);
        if(zombie != null){
            p_54181_.addFreshEntity(zombie);
            zombie.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            zombie.spawnAnim();
        }

    }

    private static void spawnCostumedSkeleton(ServerLevel p_54181_, BlockPos p_54182_) {
        SkeletonCostumeEntity skele = ModEntityTypes.COSTUMED_SKELETON.get().create(p_54181_);
        if(skele != null){
            p_54181_.addFreshEntity(skele);
            skele.moveTo((double)p_54182_.getX() + 1.0D, (double)p_54182_.getY(), (double)p_54182_.getZ() + 1.0D, 0.0F, 0.0F);
            skele.spawnAnim();
        }

    }


}
