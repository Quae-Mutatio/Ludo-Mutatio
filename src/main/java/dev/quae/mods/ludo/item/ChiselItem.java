package dev.quae.mods.ludo.item;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

import java.util.Set;

public class ChiselItem extends ToolItem {
    private static final Set<Block> effectiveBlocks = ImmutableSet.of(
            Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.END_STONE,
            Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.OAK_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.WARPED_PLANKS
    );

    public ChiselItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(attackDamageIn, attackSpeedIn, tier, effectiveBlocks, builder.addToolType(ToolType.get("chisel"), tier.getHarvestLevel()));
    }
}
