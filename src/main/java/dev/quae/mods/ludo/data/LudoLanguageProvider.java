package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public final class LudoLanguageProvider extends LanguageProvider {
    public LudoLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Ludo.ID, locale);
    }

    @Override
    protected void addTranslations() {
        this.add(Ludo.Items.SOFT_PEBBLE, "Soft Pebble");
        this.add(Ludo.Items.HARD_PEBBLE, "Hard Pebble");
        this.add(Ludo.Items.STONE_BOWL, "Stone Bowl");
    }
}
