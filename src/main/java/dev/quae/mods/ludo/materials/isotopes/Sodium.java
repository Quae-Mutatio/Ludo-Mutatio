package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;
import net.minecraft.util.text.ITextComponent;

public enum Sodium implements IIsotope {
    ISO18(new Isotope(Element.SODIUM, 11, 7, 11)),
    ISO19(new Isotope(Element.SODIUM, 11, 8, 11)),
    ISO20(new Isotope(Element.SODIUM, 11, 9, 11)),
    ISO21(new Isotope(Element.SODIUM, 11, 10, 11)),
    ISO22(new Isotope(Element.SODIUM, 11, 11, 11)),
    ISO23(new Isotope(Element.SODIUM, 11, 12, 11)),
    ISO24(new Isotope(Element.SODIUM, 11, 13, 11)),
    ISO25(new Isotope(Element.SODIUM, 11, 14, 11)),
    ISO26(new Isotope(Element.SODIUM, 11, 15, 11)),
    ISO27(new Isotope(Element.SODIUM, 11, 16, 11)),
    ISO28(new Isotope(Element.SODIUM, 11, 17, 11)),
    ISO29(new Isotope(Element.SODIUM, 11, 18, 11)),
    ISO30(new Isotope(Element.SODIUM, 11, 19, 11)),
    ISO31(new Isotope(Element.SODIUM, 11, 20, 11)),
    ISO32(new Isotope(Element.SODIUM, 11, 21, 11)),
    ISO33(new Isotope(Element.SODIUM, 11, 22, 11)),
    ISO34(new Isotope(Element.SODIUM, 11, 23, 11)),
    ISO35(new Isotope(Element.SODIUM, 11, 24, 11)),
    ISO36(new Isotope(Element.SODIUM, 11, 25, 11)),
    ISO37(new Isotope(Element.SODIUM, 11, 26, 11));

    Isotope iso;
    Sodium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.SODIUM);
    }
}