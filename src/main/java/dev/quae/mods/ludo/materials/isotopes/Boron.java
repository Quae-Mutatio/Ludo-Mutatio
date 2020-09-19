package dev.quae.mods.ludo.materials.isotopes;

public enum Boron implements IIsotope {
    ISO6(new Isotope(5, 1, 5, "boron.6")),
    ISO7(new Isotope(5, 2, 5, "boron.7")),
    ISO8(new Isotope(5, 3, 5, "boron.8")),
    ISO9(new Isotope(5, 4, 5, "boron.9")),
    ISO10(new Isotope(5, 5, 5, "boron.10")),
    ISO11(new Isotope(5, 6, 5, "boron.11")),
    ISO12(new Isotope(5, 7, 5, "boron.12")),
    ISO13(new Isotope(5, 8, 5, "boron.13")),
    ISO14(new Isotope(5, 9, 5, "boron.14")),
    ISO15(new Isotope(5, 10, 5, "boron.15")),
    ISO16(new Isotope(5, 11, 5, "boron.16")),
    ISO17(new Isotope(5, 12, 5, "boron.17")),
    ISO18(new Isotope(5, 13, 5, "boron.18")),
    ISO19(new Isotope(5, 14, 5, "boron.19")),
    ISO20(new Isotope(5, 15, 5, "boron.20")),
    ISO21(new Isotope(5, 16, 5, "boron.21"));

    Isotope iso;

    Boron(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return iso;
    }
}