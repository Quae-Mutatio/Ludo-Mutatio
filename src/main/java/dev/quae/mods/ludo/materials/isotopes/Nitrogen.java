package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.materials.elements.Element;
import net.minecraft.util.text.ITextComponent;

public enum Nitrogen implements IIsotope {
    ISO10(new Isotope(Element.NITROGEN, 7, 3, 7)),
    ISO11(new Isotope(Element.NITROGEN, 7, 4, 7)),
    ISO12(new Isotope(Element.NITROGEN, 7, 5, 7)),
    ISO13(new Isotope(Element.NITROGEN, 7, 6, 7)),
    ISO14(new Isotope(Element.NITROGEN, 7, 7, 7)),
    ISO15(new Isotope(Element.NITROGEN, 7, 8, 7)),
    ISO16(new Isotope(Element.NITROGEN, 7, 9, 7)),
    ISO17(new Isotope(Element.NITROGEN, 7, 10, 7)),
    ISO18(new Isotope(Element.NITROGEN, 7, 11, 7)),
    ISO19(new Isotope(Element.NITROGEN, 7, 12, 7)),
    ISO20(new Isotope(Element.NITROGEN, 7, 13, 7)),
    ISO21(new Isotope(Element.NITROGEN, 7, 14, 7)),
    ISO22(new Isotope(Element.NITROGEN, 7, 15, 7)),
    ISO23(new Isotope(Element.NITROGEN, 7, 16, 7)),
    ISO24(new Isotope(Element.NITROGEN, 7, 17, 7)),
    ISO25(new Isotope(Element.NITROGEN, 7, 18, 7));

    Isotope iso;
    Nitrogen(Isotope iso) {
        this.iso = iso;
    }

    public Isotope getIso() {
        return this.iso;
    }

    public String getTranslationKey(){
        return iso.getTranslationKey(Element.NITROGEN);
    }
}