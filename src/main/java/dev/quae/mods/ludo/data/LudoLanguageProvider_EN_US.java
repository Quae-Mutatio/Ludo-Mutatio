package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import dev.quae.mods.ludo.materials.elements.Element;
import dev.quae.mods.ludo.materials.isotopes.Helium;
import dev.quae.mods.ludo.materials.isotopes.Hydrogen;
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
        this.addElement(Element.HYDROGEN, "Hydrogen");
        this.addElement(Element.HELIUM, "Helium");
        this.addElement(Element.LITHIUM, "Lithium");
        this.addElement(Element.BERYLLIUM, "Beryllium");
        this.addElement(Element.BORON, "Boron");
        this.addElement(Element.CARBON, "Carbon");
        this.addElement(Element.NITROGEN, "Nitrogen");
        this.addElement(Element.OXYGEN, "Oxygen");
        this.addElement(Element.FLUORINE, "Fluorine");
        this.addElement(Element.NEON, "Neon");
        this.addElement(Element.SODIUM, "Sodium");

        //ISOTOPES
        this.add(Hydrogen.ISO1.getTranslationKey(), "Protium");
        this.add(Hydrogen.ISO2.getTranslationKey(), "Deuterium");
        this.add(Hydrogen.ISO3.getTranslationKey(), "Tritium");
        this.add(Helium.ISO2.getTranslationKey(), "Diproton");
        this.add(Lithium.ISO3.getTranslationKey(), "Triproton");
    }

    private void addItemGroup(ItemGroup group, String translation) {
        this.add("itemGroup." + group.getPath(), translation);
    }

    private void addElement(Element element, String translation) {
        this.add(((TranslationTextComponent) element.getTranslation()).getKey(), translation);
    }
}