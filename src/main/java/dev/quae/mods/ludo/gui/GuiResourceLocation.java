package dev.quae.mods.ludo.gui;

import net.minecraft.util.ResourceLocation;

/**
 * Helper class used for storing a location on a Gui texture. Used for binding textures when drawing guis and the given UV is used as a start.
 */
public class GuiResourceLocation {
    private final ResourceLocation background;
    private final int u;
    private final int v;

    public GuiResourceLocation(ResourceLocation background, int u, int v) {
        this.background = background;
        this.u = u;
        this.v = v;
    }

    public ResourceLocation getBackground() {
        return this.background;
    }

    public int getU() {
        return this.u;
    }

    public int getV() {
        return this.v;
    }
}
