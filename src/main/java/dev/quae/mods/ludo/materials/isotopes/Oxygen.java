package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;
import net.minecraft.util.text.ITextComponent;

public enum Oxygen implements IIsotope {
    ISO11(new Isotope(Element.OXYGEN, 8, 3, 8)),
    ISO12(new Isotope(Element.OXYGEN, 8, 4, 8)),
    ISO13(new Isotope(Element.OXYGEN, 8, 5, 8)),
    ISO14(new Isotope(Element.OXYGEN, 8, 6, 8)),
    ISO15(new Isotope(Element.OXYGEN, 8, 7, 8)),
    ISO16(new Isotope(Element.OXYGEN, 8, 8, 8)),
    ISO17(new Isotope(Element.OXYGEN, 8, 9, 8)),
    ISO18(new Isotope(Element.OXYGEN, 8, 10, 8)),
    ISO19(new Isotope(Element.OXYGEN, 8, 11, 8)),
    ISO20(new Isotope(Element.OXYGEN, 8, 12, 8)),
    ISO21(new Isotope(Element.OXYGEN, 8, 13, 8)),
    ISO22(new Isotope(Element.OXYGEN, 8, 14, 8)),
    ISO23(new Isotope(Element.OXYGEN, 8, 15, 8)),
    ISO24(new Isotope(Element.OXYGEN, 8, 16, 8)),
    ISO25(new Isotope(Element.OXYGEN, 8, 17, 8)),
    ISO26(new Isotope(Element.OXYGEN, 8, 18, 8)),
    ISO27(new Isotope(Element.OXYGEN, 8, 19, 8)),
    ISO28(new Isotope(Element.OXYGEN, 8, 20, 8));

    Isotope iso;
    Oxygen(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.OXYGEN);
    }
}