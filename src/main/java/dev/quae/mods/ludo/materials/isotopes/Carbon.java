package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Carbon implements IIsotope {
    ISO8(new Isotope(Element.CARBON, 6, 2, 6)),
    ISO9(new Isotope(Element.CARBON, 6, 3, 6)),
    ISO10(new Isotope(Element.CARBON, 6, 4, 6)),
    ISO11(new Isotope(Element.CARBON, 6, 5, 6)),
    ISO12(new Isotope(Element.CARBON, 6, 6, 6)),
    ISO13(new Isotope(Element.CARBON, 6, 7, 6)),
    ISO14(new Isotope(Element.CARBON, 6, 8, 6)),
    ISO15(new Isotope(Element.CARBON, 6, 9, 6)),
    ISO16(new Isotope(Element.CARBON, 6, 10, 6)),
    ISO17(new Isotope(Element.CARBON, 6, 11, 6)),
    ISO18(new Isotope(Element.CARBON, 6, 12, 6)),
    ISO19(new Isotope(Element.CARBON, 6, 13, 6)),
    ISO20(new Isotope(Element.CARBON, 6, 14, 6)),
    ISO21(new Isotope(Element.CARBON, 6, 15, 6)),
    ISO22(new Isotope(Element.CARBON, 6, 16, 6));

    Isotope iso;
    Carbon(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.CARBON);
    }
}