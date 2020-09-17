package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import javax.annotation.Nullable;
import net.minecraft.data.*;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class LudoItemTagsProvider extends ItemTagsProvider{
    public LudoItemTagsProvider(final DataGenerator dataGenerator, final BlockTagsProvider blockTagProvider, @Nullable final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Ludo.ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        this.getOrCreateBuilder(Tags.Items.ORES)
                .add(Ludo.Items.ACANTHITE_ORE)
                .add(Ludo.Items.BARYTE_ORE)
                .add(Ludo.Items.BAUXITE_ORE)
                .add(Ludo.Items.BERYL_ORE)
                .add(Ludo.Items.BORNITE_ORE)
                .add(Ludo.Items.CASSITERITE_ORE)
                .add(Ludo.Items.CHALCOCITE_ORE)
                .add(Ludo.Items.CHALCOPYRITE_ORE)
                .add(Ludo.Items.CHROMITE_ORE)
                .add(Ludo.Items.CINNABAR_ORE)
                .add(Ludo.Items.COBALTITE_ORE)
                .add(Ludo.Items.COLTAN_ORE)
                .add(Ludo.Items.GALENA_ORE)
                .add(Ludo.Items.HEMATITE_ORE)
                .add(Ludo.Items.ILMENITE_ORE)
                .add(Ludo.Items.MAGNETITE_ORE)
                .add(Ludo.Items.MALACHITE_ORE)
                .add(Ludo.Items.MOLYBDENITE_ORE)
                .add(Ludo.Items.PENTALANDITE_ORE)
                .add(Ludo.Items.PYROLUSITE_ORE)
                .add(Ludo.Items.SCHEELITE_ORE)
                .add(Ludo.Items.SPERRYLITE_ORE)
                .add(Ludo.Items.SPHALERITE_ORE)
                .add(Ludo.Items.URANITITE_ORE)
                .add(Ludo.Items.WOLFRAMITE_ORE);
        
        this.getOrCreateBuilder(Ludo.Tags.Items.WOODEN_PLATES)
                .add(Ludo.Items.OAK_WOODEN_PLATE)
                .add(Ludo.Items.BIRCH_WOODEN_PLATE)
                .add(Ludo.Items.SPRUCE_WOODEN_PLATE)
                .add(Ludo.Items.JUNGLE_WOODEN_PLATE)
                .add(Ludo.Items.DARK_OAK_WOODEN_PLATE)
                .add(Ludo.Items.ACACIA_WOODEN_PLATE)
                .add(Ludo.Items.CRIMSON_WOODEN_PLATE)
                .add(Ludo.Items.WARPED_WOODEN_PLATE);

        this.getOrCreateBuilder(Ludo.Tags.Items.STONE_PLATES)
                .add(Ludo.Items.STONE_PLATE)
                .add(Ludo.Items.GRANITE_STONE_PLATE)
                .add(Ludo.Items.DIORITE_STONE_PLATE)
                .add(Ludo.Items.ANDESITE_STONE_PLATE)
                .add(Ludo.Items.SANDSTONE_PLATE)
                .add(Ludo.Items.RED_SANDSTONE_PLATE)
                .add(Ludo.Items.ENDSTONE_PLATE);

        this.getOrCreateBuilder(Ludo.Tags.Items.CHISELS)
                .add(Ludo.Items.WOODEN_CHISEL)
                .add(Ludo.Items.STONE_CHISEL)
                .add(Ludo.Items.IRON_CHISEL)
                .add(Ludo.Items.GOLD_CHISEL)
                .add(Ludo.Items.DIAMOND_CHISEL)
                .add(Ludo.Items.NETHERITE_CHISEL);

        this.getOrCreateBuilder(Ludo.Tags.Items.LEAVES)
                .add(Ludo.Items.LEAF);
    }
}
