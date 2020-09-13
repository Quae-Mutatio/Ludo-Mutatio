package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.setup.Registry.Items;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public final class LudoLanguageProvider extends LanguageProvider {
    public LudoLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Ludo.ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Items.SOFT_PEBBLE, "Soft Pebble");
        add(Items.HARD_PEBBLE, "Hard Pebble");
    }
}
