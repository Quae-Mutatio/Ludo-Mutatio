package dev.quae.mods.ludo.materials;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;

public enum VanillaMaterials {
    WOOD(ItemTier.WOOD, 0x20180A, 0x372910, 0x493615, 0x6A501E, 0x755821, 0x896727),
    STONE(ItemTier.STONE, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0),
    IRON(ItemTier.IRON, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0),
    GOLD(ItemTier.GOLD, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0),
    DIAMOND(ItemTier.DIAMOND, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0),
    NETHERITE(ItemTier.NETHERITE, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0),
    ;

    private final IItemTier tier;
    private final int darkestColour;
    private final int darkerColour;
    private final int darkColour;
    private final int lightColour;
    private final int lighterColour;
    private final int lightestColour;

    /**
     * @param tier           The IItemTier of this material
     * @param darkestColour  The darkest colour that appears on the textures of its items (hex colour using '0xFFFFFF' code)
     * @param darkerColour   The darker colour that appears on the textures of its items (hex colour using '0xFFFFFF' code)
     * @param darkColour     The dark colour that appears on the textures of its items (hex colour using '0xFFFFFF' code)
     * @param lightColour    The light colour that appears on the textures of its items (hex colour using '0xFFFFFF' code)
     * @param lighterColour  The lighter colour that appears on the textures of its items (hex colour using '0xFFFFFF' code)
     * @param lightestColour The lightest colour that appears on the textures of its items (hex colour using '0xFFFFFF' code)
     */
    VanillaMaterials(IItemTier tier, int darkestColour, int darkerColour, int darkColour, int lightColour, int lighterColour, int lightestColour) {
        this.tier = tier;
        this.darkestColour = darkestColour;
        this.darkerColour = darkerColour;
        this.darkColour = darkColour;
        this.lightColour = lightColour;
        this.lighterColour = lighterColour;
        this.lightestColour = lightestColour;
    }

    public int getColorFromTintIndex(int tintIndex) {
        switch (tintIndex) {
            case 0:
            default:
                return -1;                  // DEFAULT
            case 1:
                return this.darkestColour;  // DARKEST
            case 2:
                return this.darkerColour;   // DARKER
            case 3:
                return this.darkColour;     // DARK
            case 4:
                return this.lightColour;    // LIGHT
            case 5:
                return this.lighterColour;  // LIGHTER
            case 6:
                return this.lightestColour; // LIGHTEST
        }
    }
}
