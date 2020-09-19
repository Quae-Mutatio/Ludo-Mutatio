package dev.quae.mods.ludo.materials.isotopes;

public enum Hydrogen implements IIsotope {
    ISO1(new Isotope(1, 0, 1, "hydrogen.1")),
    ISO2(new Isotope(1, 1, 1, "hydrogen.2")),
    ISO3(new Isotope(1, 2, 1, "hydrogen.3")),
    ISO4(new Isotope(1, 3, 1, "hydrogen.4")),
    ISO5(new Isotope(1, 4, 1, "hydrogen.5")),
    ISO6(new Isotope(1, 5, 1, "hydrogen.6")),
    ISO7(new Isotope(1, 6, 1, "hydrogen.7"));

    Isotope iso;

    Hydrogen(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return iso;
    }
}