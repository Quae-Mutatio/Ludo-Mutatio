package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Hydrogen implements IIsotope {
    ISO1(new Isotope(Element.HYDROGEN, 1, 0, 1)),
    ISO2(new Isotope(Element.HYDROGEN, 1, 1, 1)),
    ISO3(new Isotope(Element.HYDROGEN, 1, 2, 1)),
    ISO4(new Isotope(Element.HYDROGEN, 1, 3, 1)),
    ISO5(new Isotope(Element.HYDROGEN, 1, 4, 1)),
    ISO6(new Isotope(Element.HYDROGEN, 1, 5, 1)),
    ISO7(new Isotope(Element.HYDROGEN, 1, 6, 1));

    Isotope iso;
    Hydrogen(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.HYDROGEN);
    }
}