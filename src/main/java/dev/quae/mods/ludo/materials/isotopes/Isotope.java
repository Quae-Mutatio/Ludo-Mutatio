package dev.quae.mods.ludo.materials.isotopes;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Isotope {
    private final int protons;
    private final int neutrons;
    private final int electrons;
    private final ITextComponent name;

    public Isotope(int p, int n, int e, String name) {
        this.protons = p;
        this.neutrons = n;
        this.electrons = e;
        this.name = new TranslationTextComponent(Ludo.ID + "." + name);
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

    public ITextComponent getName() {
        return this.name;
    }
}