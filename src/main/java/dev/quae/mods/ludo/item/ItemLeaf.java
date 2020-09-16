package dev.quae.mods.ludo.item;

import dev.quae.mods.ludo.Ludo.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class ItemLeaf extends Item {
    public ItemLeaf(final Properties props) {
        super(props);
    }

    @Override
    public ActionResultType onItemUse(final ItemUseContext context) {
        final World world = context.getWorld();
        if (world.isRemote()) {
            return ActionResultType.SUCCESS;
        }
        final Direction face = context.getFace();
        if (face != Direction.UP) {
            return ActionResultType.FAIL;
        }
        final ItemStack leafItem = context.getItem();
        final PlayerEntity player = context.getPlayer();
        if (leafItem.getCount() < 8) {
            player.sendStatusMessage(new TranslationTextComponent("error.leaf.not_enough"), true);
            return ActionResultType.CONSUME;
        }
        final BlockPos pos = context.getPos().up();
        final BlockState stateForPlacement = Blocks.LEAVES_PILE.getStateForPlacement(new BlockItemUseContext(context));
        world.setBlockState(pos, stateForPlacement);
        Blocks.LEAVES_PILE.onBlockPlacedBy(world, pos, stateForPlacement, player, leafItem);
        leafItem.split(8);
        return ActionResultType.SUCCESS;
    }
}
