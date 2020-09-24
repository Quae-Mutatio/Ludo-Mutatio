package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;
import net.minecraft.util.text.ITextComponent;

public enum Neon implements IIsotope {
    ISO16(new Isotope(Element.NEON, 10, 6, 10)),
    ISO17(new Isotope(Element.NEON, 10, 7, 10)),
    ISO18(new Isotope(Element.NEON, 10, 8, 10)),
    ISO19(new Isotope(Element.NEON, 10, 9, 10)),
    ISO20(new Isotope(Element.NEON, 10, 10, 10)),
    ISO21(new Isotope(Element.NEON, 10, 11, 10)),
    ISO22(new Isotope(Element.NEON, 10, 12, 10)),
    ISO23(new Isotope(Element.NEON, 10, 13, 10)),
    ISO24(new Isotope(Element.NEON, 10, 14, 10)),
    ISO25(new Isotope(Element.NEON, 10, 15, 10)),
    ISO26(new Isotope(Element.NEON, 10, 16, 10)),
    ISO27(new Isotope(Element.NEON, 10, 17, 10)),
    ISO28(new Isotope(Element.NEON, 10, 18, 10)),
    ISO29(new Isotope(Element.NEON, 10, 19, 10)),
    ISO30(new Isotope(Element.NEON, 10, 20, 10)),
    ISO31(new Isotope(Element.NEON, 10, 21, 10)),
    ISO32(new Isotope(Element.NEON, 10, 22, 10)),
    ISO33(new Isotope(Element.NEON, 10, 23, 10)),
    ISO34(new Isotope(Element.NEON, 10, 24, 10));

    Isotope iso;
    Neon(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.NEON);
    }
}