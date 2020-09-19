package dev.quae.mods.ludo.materials.isotopes;

public enum Lithium implements IIsotope {
    ISO3(new Isotope(3, 0, 3, "lithium.3")),
    ISO4(new Isotope(3, 1, 3, "lithium.4")),
    ISO5(new Isotope(3, 2, 3, "lithium.5")),
    ISO6(new Isotope(3, 3, 3, "lithium.6")),
    ISO7(new Isotope(3, 4, 3, "lithium.7")),
    ISO8(new Isotope(3, 5, 3, "lithium.8")),
    ISO9(new Isotope(3, 6, 3, "lithium.9")),
    ISO10(new Isotope(3, 7, 3, "lithium.10")),
    ISO11(new Isotope(3, 8, 3, "lithium.11")),
    ISO12(new Isotope(3, 9, 3, "lithium.12")),
    ISO13(new Isotope(3, 10, 3, "lithium.13"));

    Isotope iso;

    Lithium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return iso;
    }
}