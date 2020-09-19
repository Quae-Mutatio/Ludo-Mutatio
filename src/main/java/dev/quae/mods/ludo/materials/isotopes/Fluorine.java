package dev.quae.mods.ludo.materials.isotopes;

public enum Fluorine implements IIsotope {
    ISO14(new Isotope(9, 5, 9, "fluorine.14")),
    ISO15(new Isotope(9, 6, 9, "fluorine.15")),
    ISO16(new Isotope(9, 7, 9, "fluorine.16")),
    ISO17(new Isotope(9, 8, 9, "fluorine.17")),
    ISO18(new Isotope(9, 9, 9, "fluorine.18")),
    ISO19(new Isotope(9, 10, 9, "fluorine.19")),
    ISO20(new Isotope(9, 11, 9, "fluorine.20")),
    ISO21(new Isotope(9, 12, 9, "fluorine.21")),
    ISO22(new Isotope(9, 13, 9, "fluorine.22")),
    ISO23(new Isotope(9, 14, 9, "fluorine.23")),
    ISO24(new Isotope(9, 15, 9, "fluorine.24")),
    ISO25(new Isotope(9, 16, 9, "fluorine.25")),
    ISO26(new Isotope(9, 17, 9, "fluorine.26")),
    ISO27(new Isotope(9, 18, 9, "fluorine.27")),
    ISO28(new Isotope(9, 19, 9, "fluorine.28")),
    ISO29(new Isotope(9, 20, 9, "fluorine.29")),
    ISO30(new Isotope(9, 21, 9, "fluorine.30")),
    ISO31(new Isotope(9, 22, 9, "fluorine.31"));

    Isotope iso;

    Fluorine(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }
}