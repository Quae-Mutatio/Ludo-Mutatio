package dev.quae.mods.ludo.item;

import net.minecraft.util.text.ITextComponent;

public class BasicDescribedItem extends DescribedItem{
    private final ITextComponent description;

    public BasicDescribedItem(Properties properties, ITextComponent description) {
        super(properties);
        this.description = description;
    }

    @Override
    public ITextComponent getDescription() {
        return description;
    }
}