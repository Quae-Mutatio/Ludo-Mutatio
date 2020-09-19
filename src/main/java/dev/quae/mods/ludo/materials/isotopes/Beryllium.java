package dev.quae.mods.ludo.materials.isotopes;

public enum Beryllium implements IIsotope {
    ISO5(new Isotope(4, 1, 4, "beryllium.5")),
    ISO6(new Isotope(4, 2, 4, "beryllium.6")),
    ISO7(new Isotope(4, 3, 4, "beryllium.7")),
    ISO8(new Isotope(4, 4, 4, "beryllium.8")),
    ISO9(new Isotope(4, 5, 4, "beryllium.9")),
    ISO10(new Isotope(4, 6, 4, "beryllium.10")),
    ISO11(new Isotope(4, 7, 4, "beryllium.11")),
    ISO12(new Isotope(4, 8, 4, "beryllium.12")),
    ISO13(new Isotope(4, 9, 4, "beryllium.13")),
    ISO14(new Isotope(4, 10, 4, "beryllium.14")),
    ISO15(new Isotope(4, 11, 4, "beryllium.15")),
    ISO16(new Isotope(4, 12, 4, "beryllium.16"));

    Isotope iso;

    Beryllium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }
}