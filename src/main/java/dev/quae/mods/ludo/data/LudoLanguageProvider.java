package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.data.LanguageProvider;

public final class LudoLanguageProvider extends LanguageProvider {
    public LudoLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Ludo.ID, locale);
    }

    @Override
    protected void addTranslations() {
        // MATERIAL ITEM NAMES
        this.add(Ludo.Items.SOFT_PEBBLE, "Soft Pebble");
        this.add(Ludo.Items.HARD_PEBBLE, "Hard Pebble");
        this.add(Ludo.Items.STONE_BOWL, "Stone Bowl");
        this.add(Ludo.Items.OAK_WOODEN_PLATE, "Oak Wooden Plate");
        this.add(Ludo.Items.BIRCH_WOODEN_PLATE, "Birch Wooden Plate");
        this.add(Ludo.Items.SPRUCE_WOODEN_PLATE, "Spruce Wooden Plate");
        this.add(Ludo.Items.JUNGLE_WOODEN_PLATE, "Jungle Wooden Plate");
        this.add(Ludo.Items.DARK_OAK_WOODEN_PLATE, "Dark Oak Wooden Plate");
        this.add(Ludo.Items.ACACIA_WOODEN_PLATE, "Acacia Wooden Plate");
        this.add(Ludo.Items.CRIMSON_WOODEN_PLATE, "Crimson Wooden Plate");
        this.add(Ludo.Items.WARPED_WOODEN_PLATE, "Warped Wooden Plate");
        this.add(Ludo.Items.STONE_PLATE, "Stone Plate");
        this.add(Ludo.Items.GRANITE_STONE_PLATE, "Granite Stone Plate");
        this.add(Ludo.Items.DIORITE_STONE_PLATE, "Diorite Stone Plate");
        this.add(Ludo.Items.ANDESITE_STONE_PLATE, "Andesite Stone Plate");
        this.add(Ludo.Items.SANDSTONE_PLATE, "Sandstone Plate");
        this.add(Ludo.Items.RED_SANDSTONE_PLATE, "Red Sandstone Plate");
        this.add(Ludo.Items.ENDSTONE_PLATE, "Endstone Plate");
        this.add(Ludo.Items.LEAF, "Leaf");

        // TOOL ITEM NAMES
        this.add(Ludo.Items.WOODEN_CHISEL, "Wooden Chisel");
        this.add(Ludo.Items.STONE_CHISEL, "Stone Chisel");
        this.add(Ludo.Items.IRON_CHISEL, "Iron Chisel");
        this.add(Ludo.Items.GOLD_CHISEL, "Gold Chisel");
        this.add(Ludo.Items.DIAMOND_CHISEL, "Diamond Chisel");
        this.add(Ludo.Items.NETHERITE_CHISEL, "Netherite Chisel");

        // TOOLTIPS
        this.add("tooltip.campfire_smelter.recipe", "Creates {0} when cooked in a bowl on a campfire");

        // ITEM GROUPS
        this.addItemGroup(LudoItemGroup.MATERIALS, "Ludo Mutatio Materials");
        this.addItemGroup(LudoItemGroup.TOOLS, "Ludo Mutatio Tools");

        // ERRORS
        this.add("error.leaf.not_enough", "You need 8 leaves to make a pile");
    }

    private void addItemGroup(ItemGroup group, String translation) {
        this.add("itemGroup." + group.getPath(), translation);
    }
}
