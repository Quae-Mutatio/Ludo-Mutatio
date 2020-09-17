package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.data.LanguageProvider;

public final class LudoLanguageProvider_NL_NL extends LanguageProvider {
    public LudoLanguageProvider_NL_NL(DataGenerator gen, String locale) {
        super(gen, Ludo.ID, locale);
    }

    @Override
    protected void addTranslations() {
        // MATERIAL ITEM NAMES
        this.add(Items.SOFT_PEBBLE, "Zacht Steentje Pebble");
        this.add(Items.HARD_PEBBLE, "Hard Steentje");
        this.add(Items.STONE_BOWL, "Stenen Kom");
        this.add(Items.OAK_WOODEN_PLATE, "Eiken Plaat");
        this.add(Items.BIRCH_WOODEN_PLATE, "Beuken Plaat");
        this.add(Items.SPRUCE_WOODEN_PLATE, "Sparren Plaat");
        this.add(Items.JUNGLE_WOODEN_PLATE, "Oerwouden Plaat");
        this.add(Items.DARK_OAK_WOODEN_PLATE, "Donker Eiken Plaat");
        this.add(Items.ACACIA_WOODEN_PLATE, "Acacia Plaat");
        this.add(Items.CRIMSON_WOODEN_PLATE, "Helrode Plaat");
        this.add(Items.WARPED_WOODEN_PLATE, "Spookachtige Houten Plaat");
        this.add(Items.STONE_PLATE, "Stenen Plaat");
        this.add(Items.GRANITE_STONE_PLATE, "Granieten Stenen Plaat");
        this.add(Items.DIORITE_STONE_PLATE, "Diorieten Stenen Plaat");
        this.add(Items.ANDESITE_STONE_PLATE, "Andesieten Stenen Plaat");
        this.add(Items.SANDSTONE_PLATE, "Zandstenen Plaat");
        this.add(Items.RED_SANDSTONE_PLATE, "Rood Zandstenen Plaat");
        this.add(Items.ENDSTONE_PLATE, "Eindstenen Plaat");
        this.add(Items.LEAF, "Blad");

        // TOOL ITEM NAMES
        this.add(Items.WOODEN_CHISEL, "Houten Beitel");
        this.add(Items.STONE_CHISEL, "Stenen Beitel");
        this.add(Items.IRON_CHISEL, "IJzeren Beitel");
        this.add(Items.GOLD_CHISEL, "Gouden Beitel");
        this.add(Items.DIAMOND_CHISEL, "Diamanten Beitel");
        this.add(Items.NETHERITE_CHISEL, "Netherite Beitel");

        // TOOLTIPS
        this.add("tooltip.campfire_smelter.recipe", "Maakt {0} wanneer gekookt in een kom op een kampvuur");

        // ITEM GROUPS
        this.addItemGroup(LudoItemGroup.MATERIALS, "Ludo Mutatio Materialen");
        this.addItemGroup(LudoItemGroup.TOOLS, "Ludo Mutatio Gereedschappen");
        this.addItemGroup(LudoItemGroup.RESOURCES, "Ludo Mutatio Grondstoffen");

        // ERRORS
        this.add("error.leaf.not_enough", "Je hebt 8 bladeren nodig om een hoopje te maken");
    }

    private void addItemGroup(ItemGroup group, String translation) {
        this.add("itemGroup." + group.getPath(), translation);
    }
}
