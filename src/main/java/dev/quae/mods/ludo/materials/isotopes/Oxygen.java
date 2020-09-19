package dev.quae.mods.ludo.materials.isotopes;

public enum Oxygen implements IIsotope {
    ISO11(new Isotope(8, 3, 8, "oxygen.11")),
    ISO12(new Isotope(8, 4, 8, "oxygen.12")),
    ISO13(new Isotope(8, 5, 8, "oxygen.13")),
    ISO14(new Isotope(8, 6, 8, "oxygen.14")),
    ISO15(new Isotope(8, 7, 8, "oxygen.15")),
    ISO16(new Isotope(8, 8, 8, "oxygen.16")),
    ISO17(new Isotope(8, 9, 8, "oxygen.17")),
    ISO18(new Isotope(8, 10, 8, "oxygen.18")),
    ISO19(new Isotope(8, 11, 8, "oxygen.19")),
    ISO20(new Isotope(8, 12, 8, "oxygen.20")),
    ISO21(new Isotope(8, 13, 8, "oxygen.21")),
    ISO22(new Isotope(8, 14, 8, "oxygen.22")),
    ISO23(new Isotope(8, 15, 8, "oxygen.23")),
    ISO24(new Isotope(8, 16, 8, "oxygen.24")),
    ISO25(new Isotope(8, 17, 8, "oxygen.25")),
    ISO26(new Isotope(8, 18, 8, "oxygen.26")),
    ISO27(new Isotope(8, 19, 8, "oxygen.27")),
    ISO28(new Isotope(8, 20, 8, "oxygen.28"));

    Isotope iso;

    Oxygen(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return iso;
    }
}