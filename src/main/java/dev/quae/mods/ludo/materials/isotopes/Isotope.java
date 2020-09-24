package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.materials.elements.Element;
import java.util.Optional;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Isotope {
    private final Element element;
    private final int protons;
    private final int neutrons;
    private final int electrons;

    public Isotope(Element element, int p, int n, int e) {
        this.element = element;
        this.protons = p;
        this.neutrons = n;
        this.electrons = e;
    }

    public Element getElement() {
        return element;
    }

    public int getProtons() {
        return this.protons;
    }

    public int getNeutrons() {
        return this.neutrons;
    }

    public int getElectrons() {
        return this.electrons;
    }

    public String getTranslationKey(Element element){
        return Ludo.ID + ".isotopes." + element.getName() + "-" + getIsoNumber();
    }

    public int getIsoNumber(){
        return protons + neutrons;
    }
}