package dev.quae.mods.ludo.block;

import dev.quae.mods.ludo.tileentity.CampfireSmelterTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CampfireSmelterBlock extends CampfireBlock {
    public CampfireSmelterBlock(boolean smokey, int fireDamage, Properties properties) {
        super(smokey, fireDamage, properties);
    }

    @Override
    public ActionResultType onBlockActivated(final BlockState state, final World world, final BlockPos pos, final PlayerEntity player, final Hand hand, final BlockRayTraceResult hit) {
        return this.getTileEntity(world, pos)
                .map(tile -> {
                    final ItemStack heldItem = player.getHeldItem(hand);
                    return tile.getRecipe(heldItem)
                            .map(recipe -> {
                                if (!world.isRemote() && tile.addItem(player.abilities.isCreativeMode ? heldItem.copy() : heldItem, recipe.getCookTime())) {
                                    //player.addStat(LudoStats.INTERACT_WITH_CAMPFIRE_SMELTER);
                                    return ActionResultType.SUCCESS;
                                }
                                return ActionResultType.CONSUME;
                            }).orElse(ActionResultType.PASS);
                }).orElse(ActionResultType.PASS);
    }

    private Optional<CampfireSmelterTileEntity> getTileEntity(IWorldReader world, BlockPos pos) {
        return Optional.ofNullable(world.getTileEntity(pos)).filter(CampfireSmelterTileEntity.class::isInstance).map(CampfireSmelterTileEntity.class::cast);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new CampfireSmelterTileEntity();
    }
}
