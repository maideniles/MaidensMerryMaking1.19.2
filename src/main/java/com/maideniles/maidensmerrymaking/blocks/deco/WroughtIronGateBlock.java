package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class WroughtIronGateBlock extends FenceGateBlock {
    public WroughtIronGateBlock(Properties p_53356_) {
        super(p_53356_);
    }

@Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pState.getValue(OPEN)) {
            pState = pState.setValue(OPEN, Boolean.valueOf(false));
            pLevel.setBlock(pPos, pState, 10);
            pLevel.playSound((Player)null, pPos, ModSoundEvents.IRON_GATE_CLOSE.get(), SoundSource.BLOCKS, 5.0F, 1.0F);

        } else {
            Direction direction = pPlayer.getDirection();
            if (pState.getValue(FACING) == direction.getOpposite()) {
                pState = pState.setValue(FACING, direction);
            }

            pState = pState.setValue(OPEN, Boolean.valueOf(true));
            pLevel.setBlock(pPos, pState, 10);
            pLevel.playSound((Player)null, pPos, ModSoundEvents.IRON_GATE_OPEN.get(), SoundSource.BLOCKS, 5.0F, 1.0F);

        }

        boolean flag = pState.getValue(OPEN);
    pLevel.playSound((Player)null, pPos, ModSoundEvents.IRON_GATE_OPEN.get(), SoundSource.BLOCKS, 5.0F, 1.0F);

    pLevel.gameEvent(pPlayer, flag ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
        return InteractionResult.sidedSuccess(pLevel.isClientSide);

    }




    @Override
    public SoundType getSoundType(BlockState state, LevelReader level, BlockPos pos, @Nullable Entity entity) {
        return ModSoundEvents.IRON_GATE_SOUNDS;
    }
}
