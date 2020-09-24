package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Boron implements IIsotope {
    ISO6(new Isotope(Element.BORON, 5, 1, 5)),
    ISO7(new Isotope(Element.BORON, 5, 2, 5)),
    ISO8(new Isotope(Element.BORON, 5, 3, 5)),
    ISO9(new Isotope(Element.BORON, 5, 4, 5)),
    ISO10(new Isotope(Element.BORON, 5, 5, 5)),
    ISO11(new Isotope(Element.BORON, 5, 6, 5)),
    ISO12(new Isotope(Element.BORON, 5, 7, 5)),
    ISO13(new Isotope(Element.BORON, 5, 8, 5)),
    ISO14(new Isotope(Element.BORON, 5, 9, 5)),
    ISO15(new Isotope(Element.BORON, 5, 10, 5)),
    ISO16(new Isotope(Element.BORON, 5, 11, 5)),
    ISO17(new Isotope(Element.BORON, 5, 12, 5)),
    ISO18(new Isotope(Element.BORON, 5, 13, 5)),
    ISO19(new Isotope(Element.BORON, 5, 14, 5)),
    ISO20(new Isotope(Element.BORON, 5, 15, 5)),
    ISO21(new Isotope(Element.BORON, 5, 16, 5));

    Isotope iso;
    Boron(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.BORON);
    }
}