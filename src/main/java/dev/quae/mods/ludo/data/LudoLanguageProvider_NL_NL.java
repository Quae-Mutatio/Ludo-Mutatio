package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import dev.quae.mods.ludo.materials.elements.Element;
import dev.quae.mods.ludo.materials.isotopes.Helium;
import dev.quae.mods.ludo.materials.isotopes.Hydrogen;
import dev.quae.mods.ludo.materials.isotopes.Isotope;
import dev.quae.mods.ludo.materials.isotopes.Lithium;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.text.TranslationTextComponent;

public final class LudoLanguageProvider_NL_NL extends LudoLanguageProvider {
    public LudoLanguageProvider_NL_NL(DataGenerator gen, String locale) {
        super(gen, locale);
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
        this.add(Ludo.Items.WOODEN_HAMMER, "Houten Hamer");
        this.add(Ludo.Items.STONE_HAMMER, "Stenen Hamer");
        this.add(Ludo.Items.IRON_HAMMER, "IJzeren Hamer");
        this.add(Ludo.Items.GOLD_HAMMER, "Gouden Hamer");
        this.add(Ludo.Items.DIAMOND_HAMMER, "Diamanten Hamer");
        this.add(Ludo.Items.NETHERITE_HAMMER, "Netherite Hamer");

        // TOOLTIPS
        this.add("tooltip.campfire_smelter.recipe", "Maakt {0} wanneer gekookt in een kom op een kampvuur");

        // ITEM GROUPS
        this.addItemGroup(LudoItemGroup.MATERIALS, "Ludo Mutatio Materialen");
        this.addItemGroup(LudoItemGroup.TOOLS, "Ludo Mutatio Gereedschappen");
        this.addItemGroup(LudoItemGroup.RESOURCES, "Ludo Mutatio Grondstoffen");

        //JEI
        this.add(Ludo.ID + ".jei.title.two_handed_crafting", "Tweehandig Vervaardigen");

        //Element
        this.addElement(Element.HYDROGEN, "Waterstof");
        this.addElement(Element.HELIUM, "Helium");
        this.addElement(Element.LITHIUM, "Lithium");
        this.addElement(Element.BERYLLIUM, "Beryllium");
        this.addElement(Element.BORON, "Boor");
        this.addElement(Element.CARBON, "Koolstof");
        this.addElement(Element.NITROGEN, "Stikstof");
        this.addElement(Element.OXYGEN, "Zuurstof");
        this.addElement(Element.FLUORINE, "Fluor");
        this.addElement(Element.NEON, "Neon");
        this.addElement(Element.SODIUM, "Natrium");

        //ISOTOPES
        this.add(Hydrogen.ISO1.getTranslationKey(), "Protium");
        this.add(Hydrogen.ISO2.getTranslationKey(), "Deuterium");
        this.add(Hydrogen.ISO3.getTranslationKey(), "Tritium");
        this.add(Helium.ISO2.getTranslationKey(), "Diproton");
        this.add(Lithium.ISO3.getTranslationKey(), "Triproton");

        // ERRORS
        this.add("error.leaf.not_enough", "Je hebt 8 bladeren nodig om een hoopje te maken");
    }

    private void addItemGroup(ItemGroup group, String translation) {
        this.add("itemGroup." + group.getPath(), translation);
    }

    private void addElement(Element element, String translation) {
        this.add(((TranslationTextComponent) element.getTranslation()).getKey(), translation);
    }
}
