package dev.quae.mods.ludo.materials.isotopes;

public enum Sodium implements IIsotope {
    ISO18(new Isotope(11, 7, 11, "sodium.18")),
    ISO19(new Isotope(11, 8, 11, "sodium.19")),
    ISO20(new Isotope(11, 9, 11, "sodium.20")),
    ISO21(new Isotope(11, 10, 11, "sodium.21")),
    ISO22(new Isotope(11, 11, 11, "sodium.22")),
    ISO23(new Isotope(11, 12, 11, "sodium.23")),
    ISO24(new Isotope(11, 13, 11, "sodium.24")),
    ISO25(new Isotope(11, 14, 11, "sodium.25")),
    ISO26(new Isotope(11, 15, 11, "sodium.26")),
    ISO27(new Isotope(11, 16, 11, "sodium.27")),
    ISO28(new Isotope(11, 17, 11, "sodium.28")),
    ISO29(new Isotope(11, 18, 11, "sodium.29")),
    ISO30(new Isotope(11, 19, 11, "sodium.30")),
    ISO31(new Isotope(11, 20, 11, "sodium.31")),
    ISO32(new Isotope(11, 21, 11, "sodium.32")),
    ISO33(new Isotope(11, 22, 11, "sodium.33")),
    ISO34(new Isotope(11, 23, 11, "sodium.34")),
    ISO35(new Isotope(11, 24, 11, "sodium.35")),
    ISO36(new Isotope(11, 25, 11, "sodium.36")),
    ISO37(new Isotope(11, 26, 11, "sodium.37"));

    Isotope iso;

    Sodium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return iso;
    }
}