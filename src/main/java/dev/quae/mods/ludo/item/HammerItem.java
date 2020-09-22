package dev.quae.mods.ludo.item;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

public class HammerItem extends ToolItem {
    public HammerItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(attackDamageIn, attackSpeedIn, tier, ImmutableSet.of(), builder.addToolType(ToolType.get("hammer"), tier.getHarvestLevel()));
    }
}
