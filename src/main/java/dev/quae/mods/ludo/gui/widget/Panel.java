package dev.quae.mods.ludo.gui.widget;

import com.mojang.blaze3d.matrix.MatrixStack;
import dev.quae.mods.ludo.gui.GuiResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.text.StringTextComponent;

public class Panel extends Widget {
    private final GuiResourceLocation background;

    public Panel(int x, int y, int width, int height, GuiResourceLocation background) {
        super(x, y, width, height, new StringTextComponent(""));
        this.background = background;
    }

    @Override
    protected void renderBg(MatrixStack matrixStack, Minecraft minecraft, int mouseX, int mouseY) {
        minecraft.getTextureManager().bindTexture(this.background.getBackground());
        this.blit(matrixStack, this.x, this.y, this.background.getU(), this.background.getV(), this.width, this.height);
    }
}
