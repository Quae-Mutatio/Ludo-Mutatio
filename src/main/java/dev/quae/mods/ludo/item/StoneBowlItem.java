package dev.quae.mods.ludo.item;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Stats;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StoneBowlItem extends Item {
    public StoneBowlItem(final Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(final ItemUseContext context) {
        final World world = context.getWorld();
        final BlockPos pos = context.getPos();
        final BlockState state = world.getBlockState(pos);
        if (state.getBlock() != Blocks.CAMPFIRE) {
            return ActionResultType.PASS;
        }
        final PlayerEntity player = context.getPlayer();
        player.getHeldItem(context.getHand()).shrink(1);
        world.setBlockState(pos, Ludo.Blocks.CAMPFIRE_SMELTER.getDefaultState());
        // TODO: maybe play a sound here
        player.addStat(Stats.CREATED_CAMPFIRE_SMELTER, 1);
        return ActionResultType.SUCCESS;
    }
}
