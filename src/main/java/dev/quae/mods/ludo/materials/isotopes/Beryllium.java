package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Beryllium implements IIsotope {
    ISO5(new Isotope(Element.BERYLLIUM, 4, 1, 4)),
    ISO6(new Isotope(Element.BERYLLIUM, 4, 2, 4)),
    ISO7(new Isotope(Element.BERYLLIUM, 4, 3, 4)),
    ISO8(new Isotope(Element.BERYLLIUM, 4, 4, 4)),
    ISO9(new Isotope(Element.BERYLLIUM, 4, 5, 4)),
    ISO10(new Isotope(Element.BERYLLIUM, 4, 6, 4)),
    ISO11(new Isotope(Element.BERYLLIUM, 4, 7, 4)),
    ISO12(new Isotope(Element.BERYLLIUM, 4, 8, 4)),
    ISO13(new Isotope(Element.BERYLLIUM, 4, 9, 4)),
    ISO14(new Isotope(Element.BERYLLIUM, 4, 10, 4)),
    ISO15(new Isotope(Element.BERYLLIUM, 4, 11, 4)),
    ISO16(new Isotope(Element.BERYLLIUM, 4, 12, 4));

    Isotope iso;
    Beryllium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.BERYLLIUM);
    }
}