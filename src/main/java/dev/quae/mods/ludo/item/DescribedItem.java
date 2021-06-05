package dev.quae.mods.ludo.item;

import net.minecraft.item.Item;

public abstract class DescribedItem extends Item implements IDescribedItem{
    public DescribedItem(Item.Properties properties) {
        super(properties);
    }
}