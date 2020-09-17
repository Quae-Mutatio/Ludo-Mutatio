package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class LudoItemModelProvider extends ItemModelProvider {
    public LudoItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ludo.ID, existingFileHelper);
    }

    private ResourceLocation getItemTexture(Item item) {
        final ResourceLocation name = item.getRegistryName();
        assert name != null;
        return this.getTextureLoc("item/", name);
    }

    private ResourceLocation getBlockTexture(Block block) {
        final ResourceLocation name = block.getRegistryName();
        assert name != null;
        return this.getTextureLoc("block/", name);
    }

    private ResourceLocation getTextureLoc(String root, ResourceLocation name) {
        return new ResourceLocation(name.getNamespace(), root + name.getPath());
    }

    private void registerBasicItemModel(Item item) {
        this.getBuilder(item.getRegistryName().getPath())
                .parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", this.getItemTexture(item));
    }

    private void registerBasicItemModelWithBlockTexture(Item item, Block block) {
        this.getBuilder(item.getRegistryName().getPath())
                .parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", this.getBlockTexture(block));
    }

    @Override
    protected void registerModels() {
        // MATERIALS
        this.registerBasicItemModel(Ludo.Items.SOFT_PEBBLE);
        this.registerBasicItemModel(Ludo.Items.HARD_PEBBLE);
        this.registerBasicItemModel(Ludo.Items.STONE_BOWL);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.OAK_WOODEN_PLATE, Blocks.OAK_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.BIRCH_WOODEN_PLATE, Blocks.BIRCH_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.SPRUCE_WOODEN_PLATE, Blocks.SPRUCE_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.JUNGLE_WOODEN_PLATE, Blocks.JUNGLE_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.DARK_OAK_WOODEN_PLATE, Blocks.DARK_OAK_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.ACACIA_WOODEN_PLATE, Blocks.ACACIA_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.CRIMSON_WOODEN_PLATE, Blocks.CRIMSON_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.WARPED_WOODEN_PLATE, Blocks.WARPED_PLANKS);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.STONE_PLATE, Blocks.STONE);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.GRANITE_STONE_PLATE, Blocks.GRANITE);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.DIORITE_STONE_PLATE, Blocks.DIORITE);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.ANDESITE_STONE_PLATE, Blocks.ANDESITE);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.SANDSTONE_PLATE, Blocks.SANDSTONE);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.RED_SANDSTONE_PLATE, Blocks.RED_SANDSTONE);
        this.registerBasicItemModelWithBlockTexture(Ludo.Items.ENDSTONE_PLATE, Blocks.END_STONE);
        this.registerBasicItemModel(Items.LEAF);

        // TOOLS
        this.registerBasicItemModel(Items.WOODEN_CHISEL);
//        this.registerBasicItemModel(Items.STONE_CHISEL);  // TODO: create texture
//        this.registerBasicItemModel(Items.IRON_CHISEL);  // TODO: create texture
//        this.registerBasicItemModel(Items.GOLD_CHISEL);  // TODO: create texture
//        this.registerBasicItemModel(Items.DIAMOND_CHISEL);  // TODO: create texture
//        this.registerBasicItemModel(Items.NETHERITE_CHISEL);  // TODO: create texture
    }
}
