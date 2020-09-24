package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;

public enum Fluorine implements IIsotope {
    ISO14(new Isotope(Element.FLUORINE, 9, 5, 9)),
    ISO15(new Isotope(Element.FLUORINE, 9, 6, 9)),
    ISO16(new Isotope(Element.FLUORINE, 9, 7, 9)),
    ISO17(new Isotope(Element.FLUORINE, 9, 8, 9)),
    ISO18(new Isotope(Element.FLUORINE, 9, 9, 9)),
    ISO19(new Isotope(Element.FLUORINE, 9, 10, 9)),
    ISO20(new Isotope(Element.FLUORINE, 9, 11, 9)),
    ISO21(new Isotope(Element.FLUORINE, 9, 12, 9)),
    ISO22(new Isotope(Element.FLUORINE, 9, 13, 9)),
    ISO23(new Isotope(Element.FLUORINE, 9, 14, 9)),
    ISO24(new Isotope(Element.FLUORINE, 9, 15, 9)),
    ISO25(new Isotope(Element.FLUORINE, 9, 16, 9)),
    ISO26(new Isotope(Element.FLUORINE, 9, 17, 9)),
    ISO27(new Isotope(Element.FLUORINE, 9, 18, 9)),
    ISO28(new Isotope(Element.FLUORINE, 9, 19, 9)),
    ISO29(new Isotope(Element.FLUORINE, 9, 20, 9)),
    ISO30(new Isotope(Element.FLUORINE, 9, 21, 9)),
    ISO31(new Isotope(Element.FLUORINE, 9, 22, 9));

    Isotope iso;
    Fluorine(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.FLUORINE);
    }
}