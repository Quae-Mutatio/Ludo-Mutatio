package dev.quae.mods.ludo.materials.isotopes;

public enum Helium implements IIsotope {
    ISO2(new Isotope(2, 0, 2, "helium.2")),
    ISO3(new Isotope(2, 1, 2, "helium.3")),
    ISO4(new Isotope(2, 2, 2, "helium.4")),
    ISO5(new Isotope(2, 3, 2, "helium.5")),
    ISO6(new Isotope(2, 4, 2, "helium.6")),
    ISO7(new Isotope(2, 5, 2, "helium.7")),
    ISO8(new Isotope(2, 6, 2, "helium.8")),
    ISO9(new Isotope(2, 7, 2, "helium.9")),
    ISO10(new Isotope(2, 8, 2, "helium.10"));

    Isotope iso;

    Helium(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }
}