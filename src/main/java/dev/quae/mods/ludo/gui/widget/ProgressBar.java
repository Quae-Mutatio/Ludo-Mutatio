package dev.quae.mods.ludo.gui.widget;

import com.mojang.blaze3d.matrix.MatrixStack;
import dev.quae.mods.ludo.gui.GuiResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.text.StringTextComponent;

public class ProgressBar extends Widget {
    private final Panel background;
    private final Panel foreground;
    private final IntReferenceHolder progress;

    /**
     * @param x The X position of the progress bar
     * @param y The Y position of the progress bar
     * @param width The width of the progress bar
     * @param height The height of the progress bar
     * @param progress A Int reference holder which holds an int value between 0 and 100 which represents the percentage full the progress bar should be
     * @param emptyBar The gui location of the empty bar. Note: this should be the same width as the bar
     * @param fullBar The gui location of the full bar. Note: this should be the same width as the bar
     */
    public ProgressBar(int x, int y, int width, int height, IntReferenceHolder progress, GuiResourceLocation emptyBar, GuiResourceLocation fullBar) {
        super(x, y, width, height, new StringTextComponent(""));
        this.progress = progress;
        this.background = new Panel(x, y, width, height, emptyBar);
        this.foreground = new Panel(x, y, 0, height, fullBar);
    }

    @Override
    protected void renderBg(MatrixStack matrixStack, Minecraft minecraft, int mouseX, int mouseY) {
        super.renderBg(matrixStack, minecraft, mouseX, mouseY);
        this.background.renderBg(matrixStack, minecraft, mouseX, mouseY);
        this.foreground.setWidth((int) ((this.progress.get() / 100.0D) * this.width));
        this.foreground.renderBg(matrixStack, minecraft, mouseX, mouseY);
    }
}
