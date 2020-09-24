package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Lithium implements IIsotope {
    ISO3(new Isotope(Element.LITHIUM, 3, 0, 3)),
    ISO4(new Isotope(Element.LITHIUM, 3, 1, 3)),
    ISO5(new Isotope(Element.LITHIUM, 3, 2, 3)),
    ISO6(new Isotope(Element.LITHIUM, 3, 3, 3)),
    ISO7(new Isotope(Element.LITHIUM, 3, 4, 3)),
    ISO8(new Isotope(Element.LITHIUM, 3, 5, 3)),
    ISO9(new Isotope(Element.LITHIUM, 3, 6, 3)),
    ISO10(new Isotope(Element.LITHIUM, 3, 7, 3)),
    ISO11(new Isotope(Element.LITHIUM, 3, 8, 3)),
    ISO12(new Isotope(Element.LITHIUM, 3, 9, 3)),
    ISO13(new Isotope(Element.LITHIUM, 3, 10, 3));

    Isotope iso;
    Lithium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.LITHIUM);
    }
}