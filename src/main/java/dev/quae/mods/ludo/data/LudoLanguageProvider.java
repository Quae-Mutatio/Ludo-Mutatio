package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraftforge.common.data.LanguageProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class LudoLanguageProvider extends LanguageProvider {
    protected static final Logger LOGGER = LogManager.getLogger();
    private static final Set<String> allKeys = new HashSet<>();
    private final Set<String> myKeys = new HashSet<>();
    private final String locale;

    public LudoLanguageProvider(DataGenerator gen, String locale) {
        super(gen, Ludo.ID, locale);
        this.locale = locale;
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {
        super.act(cache);
        this.validate();
    }

    public void validate() {
        // Check if all the required translations are added
        final HashSet<String> diff = new HashSet<>(allKeys);
        diff.removeAll(this.myKeys);
        for (String missingKey : diff) {
            LOGGER.error("Missing translation for {} in {}.lang.", missingKey, this.locale);
        }
    }

    @Override
    public void add(String key, String value) {
        allKeys.add(key);
        this.myKeys.add(key);
        super.add(key, value);
    }
}
