package dev.quae.mods.ludo.materials.isotopes;

public enum Carbon implements IIsotope {
    ISO8(new Isotope(6, 2, 6, "carbon.8")),
    ISO9(new Isotope(6, 3, 6, "carbon.9")),
    ISO10(new Isotope(6, 4, 6, "carbon.10")),
    ISO11(new Isotope(6, 5, 6, "carbon.11")),
    ISO12(new Isotope(6, 6, 6, "carbon.12")),
    ISO13(new Isotope(6, 7, 6, "carbon.13")),
    ISO14(new Isotope(6, 8, 6, "carbon.14")),
    ISO15(new Isotope(6, 9, 6, "carbon.15")),
    ISO16(new Isotope(6, 10, 6, "carbon.16")),
    ISO17(new Isotope(6, 11, 6, "carbon.17")),
    ISO18(new Isotope(6, 12, 6, "carbon.18")),
    ISO19(new Isotope(6, 13, 6, "carbon.19")),
    ISO20(new Isotope(6, 14, 6, "carbon.20")),
    ISO21(new Isotope(6, 15, 6, "carbon.21")),
    ISO22(new Isotope(6, 16, 6, "carbon.22"));

    Isotope iso;

    Carbon(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return iso;
    }
}