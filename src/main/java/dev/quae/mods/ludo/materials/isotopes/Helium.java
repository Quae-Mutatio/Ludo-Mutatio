package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Helium implements IIsotope {
    ISO2(new Isotope(Element.HELIUM, 2, 0, 2)),
    ISO3(new Isotope(Element.HELIUM, 2, 1, 2)),
    ISO4(new Isotope(Element.HELIUM, 2, 2, 2)),
    ISO5(new Isotope(Element.HELIUM, 2, 3, 2)),
    ISO6(new Isotope(Element.HELIUM, 2, 4, 2)),
    ISO7(new Isotope(Element.HELIUM, 2, 5, 2)),
    ISO8(new Isotope(Element.HELIUM, 2, 6, 2)),
    ISO9(new Isotope(Element.HELIUM, 2, 7, 2)),
    ISO10(new Isotope(Element.HELIUM, 2, 8, 2));

    Isotope iso;
    Helium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.HELIUM);
    }
}