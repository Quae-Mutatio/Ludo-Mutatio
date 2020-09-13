package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.setup.Registry.Items;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public final class LudoItemModelProvider extends ItemModelProvider {
    public LudoItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ludo.ID, existingFileHelper);
    }

    private ResourceLocation getModelLoc(Item item) {
        final ResourceLocation name = item.getRegistryName();
        assert name != null;
        return new ResourceLocation(name.getNamespace(), "item/" + name.getPath());
    }

    private void registerBasicItemModel(@Nullable Item item) {
        getBuilder(item.getRegistryName().getPath())
                .parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", getModelLoc(item));
    }

    @Override
    protected void registerModels() {
        registerBasicItemModel(Items.SOFT_PEBBLE);
        registerBasicItemModel(Items.HARD_PEBBLE);
        registerBasicItemModel(Items.STONE_BOWL);
    }
}
