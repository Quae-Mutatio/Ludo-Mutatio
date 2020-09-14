package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.data.recipe.TwoHandedRecipeBuilder;
import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import java.util.function.Consumer;

public class LudoRecipeProvider extends RecipeProvider {
    public LudoRecipeProvider(final DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(final Consumer<IFinishedRecipe> consumer) {
        TwoHandedRecipeBuilder.create(Items.STONE_BOWL)
                .addIngredient(Items.HARD_PEBBLE)
                .addIngredient(Items.SOFT_PEBBLE)
                .build(consumer);
    }
}
