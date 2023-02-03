package com.maideniles.maidensmerrymaking.items;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class SunflowerOilItem extends Item {
    public static final Supplier<BiMap<Block, Block>> PRESERVABLES = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
   .put(ModBlocks.PINE_LOG.get(), ModBlocks.PRESERVED_PINE_LOG.get())
   .put(ModBlocks.EXPOSED_PINE_LOG.get(), ModBlocks.PRESERVED_EXPOSED_PINE_LOG.get())
   .put(ModBlocks.WEATHERED_PINE_LOG.get(), ModBlocks.PRESERVED_WEATHERED_PINE_LOG.get())
   .put(ModBlocks.AGED_PINE_LOG.get(), ModBlocks.PRESERVED_AGED_PINE_LOG.get())

   .put(ModBlocks.STRIPPED_PINE_LOG.get(), ModBlocks.STRIPPED_PRESERVED_PINE_LOG.get())
   .put(ModBlocks.STRIPPED_EXPOSED_PINE_LOG.get(), ModBlocks.STRIPPED_PRESERVED_EXPOSED_PINE_LOG.get())
   .put(ModBlocks.STRIPPED_WEATHERED_PINE_LOG.get(), ModBlocks.STRIPPED_PRESERVED_WEATHERED_PINE_LOG.get())
   .put(ModBlocks.STRIPPED_AGED_PINE_LOG.get(), ModBlocks.STRIPPED_PRESERVED_AGED_PINE_LOG.get())

   .put(ModBlocks.EXPOSED_PINE_WOOD.get(), ModBlocks.PRESERVED_EXPOSED_PINE_WOOD.get())
   .put(ModBlocks.WEATHERED_PINE_WOOD.get(), ModBlocks.PRESERVED_WEATHERED_PINE_WOOD.get())
   .put(ModBlocks.AGED_PINE_WOOD.get(), ModBlocks.PRESERVED_AGED_PINE_WOOD.get())

   .put(ModBlocks.STRIPPED_PINE_WOOD.get(), ModBlocks.STRIPPED_PRESERVED_PINE_WOOD.get())
   .put(ModBlocks.STRIPPED_EXPOSED_PINE_WOOD.get(), ModBlocks.STRIPPED_PRESERVED_EXPOSED_PINE_WOOD.get())
   .put(ModBlocks.STRIPPED_WEATHERED_PINE_WOOD.get(), ModBlocks.STRIPPED_PRESERVED_WEATHERED_PINE_WOOD.get())
   .put(ModBlocks.STRIPPED_AGED_PINE_WOOD.get(), ModBlocks.STRIPPED_PRESERVED_AGED_PINE_WOOD.get())


   .put(ModBlocks.PINE_PLANKS.get(), ModBlocks.PRESERVED_PINE_PLANKS.get())
   .put(ModBlocks.EXPOSED_PINE_PLANKS.get(), ModBlocks.PRESERVED_EXPOSED_PINE_PLANKS.get())
   .put(ModBlocks.WEATHERED_PINE_PLANKS.get(), ModBlocks.PRESERVED_WEATHERED_PINE_PLANKS.get())
   .put(ModBlocks.AGED_PINE_PLANKS.get(), ModBlocks.PRESERVED_AGED_PINE_PLANKS.get())




                .build();
    });
  //  public static final Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> {
 //       return PRESERVABLES.get().inverse();
 //   });

    public SunflowerOilItem(Item.Properties p_150867_) {
        super(p_150867_);
    }

    /**
     * Called when this item is used when targetting a Block
     */
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = level.getBlockState(blockpos);
        return getWaxed(blockstate).map((p_238251_) -> {
            Player player = pContext.getPlayer();
            ItemStack itemstack = pContext.getItemInHand();
            if (player instanceof ServerPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockpos, itemstack);
            }

            itemstack.shrink(1);
            level.setBlock(blockpos, p_238251_, 11);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockpos, GameEvent.Context.of(player, p_238251_));
            level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);

            return InteractionResult.sidedSuccess(level.isClientSide);
        }).orElse(InteractionResult.PASS);
    }

    public static Optional<BlockState> getWaxed(BlockState pState) {
        return Optional.ofNullable(PRESERVABLES.get().get(pState.getBlock())).map((p_150877_) -> {
            return p_150877_.withPropertiesOf(pState);
        });
    }
}