package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Tags;
import dev.quae.mods.ludo.data.recipe.TwoHandedRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public final class LudoRecipeProvider extends RecipeProvider {
    public LudoRecipeProvider(final DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(final Consumer<IFinishedRecipe> consumer) {
        TwoHandedRecipeBuilder.create(Ludo.Items.STONE_BOWL)
                .addIngredient(Ludo.Items.HARD_PEBBLE)
                .addIngredient(Ludo.Items.SOFT_PEBBLE)
                .build(consumer);

        TwoHandedRecipeBuilder.create(Ludo.Items.OAK_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.OAK_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.BIRCH_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.BIRCH_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.SPRUCE_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.SPRUCE_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.JUNGLE_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.JUNGLE_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.DARK_OAK_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.DARK_OAK_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.ACACIA_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.ACACIA_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.CRIMSON_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.CRIMSON_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.WARPED_WOODEN_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.WARPED_PLANKS)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.STONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.STONE)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.GRANITE_STONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.GRANITE)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.DIORITE_STONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.DIORITE)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.ANDESITE_STONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.ANDESITE)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.SANDSTONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.SANDSTONE)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.RED_SANDSTONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.RED_SANDSTONE)
                .build(consumer);
        TwoHandedRecipeBuilder.create(Ludo.Items.ENDSTONE_PLATE, 4)
                .addIngredient(Tags.Items.CHISELS)
                .addIngredient(Items.END_STONE)
                .build(consumer);
    }
}
