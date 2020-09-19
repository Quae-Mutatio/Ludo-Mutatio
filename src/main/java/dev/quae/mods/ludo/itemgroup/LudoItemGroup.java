package dev.quae.mods.ludo.itemgroup;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Blocks;
import dev.quae.mods.ludo.Ludo.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public abstract class LudoItemGroup extends ItemGroup {
    public static final LudoItemGroup MATERIALS = new LudoItemGroup("materials") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.HARD_PEBBLE);
        }
    };
    public static final LudoItemGroup TOOLS = new LudoItemGroup("tools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.WOODEN_CHISEL);
        }
    };
    public static final LudoItemGroup RESOURCES = new LudoItemGroup("resources") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.BAUXITE_ORE);
        }
    };

    public LudoItemGroup(final String subLabel) {
        super(Ludo.ID + '.' + subLabel);
    }
}
