package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.Ludo.Tags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public final class LudoItemTagsProvider extends ItemTagsProvider {
    public LudoItemTagsProvider(final DataGenerator dataGenerator, final BlockTagsProvider blockTagProvider, @Nullable final ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Ludo.ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        this.getOrCreateBuilder(Tags.Items.WOODEN_PLATE)
                .add(Items.OAK_WOODEN_PLATE)
                .add(Items.BIRCH_WOODEN_PLATE)
                .add(Items.SPRUCE_WOODEN_PLATE)
                .add(Items.JUNGLE_WOODEN_PLATE)
                .add(Items.DARK_OAK_WOODEN_PLATE)
                .add(Items.ACACIA_WOODEN_PLATE)
                .add(Items.CRIMSON_WOODEN_PLATE)
                .add(Items.WARPED_WOODEN_PLATE);

        this.getOrCreateBuilder(Tags.Items.STONE_PLATE)
                .add(Items.STONE_PLATE)
                .add(Items.GRANITE_STONE_PLATE)
                .add(Items.DIORITE_STONE_PLATE)
                .add(Items.ANDESITE_STONE_PLATE)
                .add(Items.SANDSTONE_PLATE)
                .add(Items.RED_SANDSTONE_PLATE)
                .add(Items.ENDSTONE_PLATE);

        this.getOrCreateBuilder(Tags.Items.CHISEL)
                .add(Items.WOODEN_CHISEL)
                .add(Items.STONE_CHISEL)
                .add(Items.IRON_CHISEL)
                .add(Items.GOLD_CHISEL)
                .add(Items.DIAMOND_CHISEL)
                .add(Items.NETHERITE_CHISEL);
    }
}
