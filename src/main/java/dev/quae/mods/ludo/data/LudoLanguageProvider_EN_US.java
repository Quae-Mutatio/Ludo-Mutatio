package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import dev.quae.mods.ludo.materials.elements.Element;
import dev.quae.mods.ludo.materials.isotopes.Helium;
import dev.quae.mods.ludo.materials.isotopes.Hydrogen;
import dev.quae.mods.ludo.materials.isotopes.Isotope;
import dev.quae.mods.ludo.materials.isotopes.Lithium;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.text.TranslationTextComponent;

public final class LudoLanguageProvider_EN_US extends LudoLanguageProvider {
    public LudoLanguageProvider_EN_US(DataGenerator gen, String locale) {
        super(gen, locale);
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
        this.add(Ludo.Items.WOODEN_HAMMER, "Wooden Hammer");
        this.add(Ludo.Items.STONE_HAMMER, "Stone Hammer");
        this.add(Ludo.Items.IRON_HAMMER, "Iron Hammer");
        this.add(Ludo.Items.GOLD_HAMMER, "Gold Hammer");
        this.add(Ludo.Items.DIAMOND_HAMMER, "Diamond Hammer");
        this.add(Ludo.Items.NETHERITE_HAMMER, "Netherite Hammer");

        // TOOLTIPS
        this.add("tooltip.campfire_smelter.recipe", "Creates {0} when cooked in a bowl on a campfire");

        // ITEM GROUPS
        this.addItemGroup(LudoItemGroup.MATERIALS, "Ludo Mutatio Materials");
        this.addItemGroup(LudoItemGroup.TOOLS, "Ludo Mutatio Tools");
        this.addItemGroup(LudoItemGroup.RESOURCES, "Ludo Mutatio Resources");

        //JEI
        this.add(Ludo.ID + ".jei.title.two_handed_crafting", "Two Handed Crafting");

        // ERRORS
        this.add("error.leaf.not_enough", "You need 8 leaves to make a pile");

        //Element
        this.add(Element.HYDROGEN, "Hydrogen");
        this.add(Element.HELIUM, "Helium");
        this.add(Element.LITHIUM, "Lithium");
        this.add(Element.BERYLLIUM, "Beryllium");
        this.add(Element.BORON, "Boron");
        this.add(Element.CARBON, "Carbon");
        this.add(Element.NITROGEN, "Nitrogen");
        this.add(Element.OXYGEN, "Oxygen");
        this.add(Element.FLUORINE, "Fluorine");
        this.add(Element.NEON, "Neon");
        this.add(Element.SODIUM, "Sodium");

        //ISOTOPES
        this.add(Hydrogen.ISO1.getIso(), "Protium");
        this.add(Hydrogen.ISO2.getIso(), "Deuterium");
        this.add(Hydrogen.ISO3.getIso(), "Tritium");
        this.add(Hydrogen.ISO4.getIso(), "Hydrogen-4");
        this.add(Hydrogen.ISO5.getIso(), "Hydrogen-5");
        this.add(Hydrogen.ISO6.getIso(), "Hydrogen-6");
        this.add(Hydrogen.ISO7.getIso(), "Hydrogen-7");

        this.add(Helium.ISO2.getIso(), "Diproton");
        this.add(Helium.ISO3.getIso(), "Helium-3");
        this.add(Helium.ISO4.getIso(), "Helium-4");
        this.add(Helium.ISO5.getIso(), "Helium-5");
        this.add(Helium.ISO6.getIso(), "Helium-6");
        this.add(Helium.ISO7.getIso(), "Helium-7");
        this.add(Helium.ISO8.getIso(), "Helium-8");
        this.add(Helium.ISO9.getIso(), "Helium-9");
        this.add(Helium.ISO10.getIso(), "Helium-10");

        this.add(Lithium.ISO3.getIso(), "Triproton");
        this.add(Lithium.ISO4.getIso(), "Lithium-4");
        this.add(Lithium.ISO5.getIso(), "Lithium-5");
        this.add(Lithium.ISO6.getIso(), "Lithium-6");
        this.add(Lithium.ISO7.getIso(), "Lithium-7");
        this.add(Lithium.ISO8.getIso(), "Lithium-8");
        this.add(Lithium.ISO9.getIso(), "Lithium-9");
        this.add(Lithium.ISO10.getIso(), "Lithium-10");
        this.add(Lithium.ISO11.getIso(), "Lithium-11");
        this.add(Lithium.ISO12.getIso(), "Lithium-12");
        this.add(Lithium.ISO13.getIso(), "Lithium-13");
    }

    private void addItemGroup(ItemGroup group, String translation) {
        this.add("itemGroup." + group.getPath(), translation);
    }

    private void add(Isotope isotope, String translation) {
        this.add(((TranslationTextComponent) isotope.getName()).getKey(), translation);
    }

    private void add(Element element, String translation) {
        this.add(((TranslationTextComponent) element.getName()).getKey(), translation);
    }
}