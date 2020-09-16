package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public final class LudoBlockTagsProvider extends BlockTagsProvider {
    public LudoBlockTagsProvider(final DataGenerator generatorIn, @Nullable final ExistingFileHelper existingFileHelper) {
        super(generatorIn, Ludo.ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {

    }
}
