package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public final class LudoBlockTagsProvider extends BlockTagsProvider {
    public LudoBlockTagsProvider(final DataGenerator generatorIn, @Nullable final ExistingFileHelper existingFileHelper) {
        super(generatorIn, Ludo.ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        this.getOrCreateBuilder(Tags.Blocks.ORES)
                .add(Ludo.Blocks.ACANTHITE_ORE)
                .add(Ludo.Blocks.BARYTE_ORE)
                .add(Ludo.Blocks.BAUXITE_ORE)
                .add(Ludo.Blocks.BERYL_ORE)
                .add(Ludo.Blocks.BORNITE_ORE)
                .add(Ludo.Blocks.CASSITERITE_ORE)
                .add(Ludo.Blocks.CHALCOCITE_ORE)
                .add(Ludo.Blocks.CHALCOPYRITE_ORE)
                .add(Ludo.Blocks.CHROMITE_ORE)
                .add(Ludo.Blocks.CINNABAR_ORE)
                .add(Ludo.Blocks.COBALTITE_ORE)
                .add(Ludo.Blocks.COLTAN_ORE)
                .add(Ludo.Blocks.GALENA_ORE)
                .add(Ludo.Blocks.HEMATITE_ORE)
                .add(Ludo.Blocks.ILMENITE_ORE)
                .add(Ludo.Blocks.MAGNETITE_ORE)
                .add(Ludo.Blocks.MALACHITE_ORE)
                .add(Ludo.Blocks.MOLYBDENITE_ORE)
                .add(Ludo.Blocks.PENTALANDITE_ORE)
                .add(Ludo.Blocks.PYROLUSITE_ORE)
                .add(Ludo.Blocks.SCHEELITE_ORE)
                .add(Ludo.Blocks.SPERRYLITE_ORE)
                .add(Ludo.Blocks.SPHALERITE_ORE)
                .add(Ludo.Blocks.URANITITE_ORE)
                .add(Ludo.Blocks.WOLFRAMITE_ORE);
    }
}
