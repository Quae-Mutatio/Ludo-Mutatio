package dev.quae.mods.ludo.recipe;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.quae.mods.ludo.Ludo.RecipeSerializers;
import dev.quae.mods.ludo.Ludo.RecipeTypes;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.RecipeMatcher;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

public class TwoHandedRecipe implements IRecipe<PlayerInventory> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> ingredients;

    public TwoHandedRecipe(final ResourceLocation id, final ItemStack output, final NonNullList<Ingredient> ingredients) {
        this.id = id;
        this.output = output;
        this.ingredients = ingredients;
    }

    @Override
    public boolean matches(final PlayerInventory inv, final World worldIn) {
        return RecipeMatcher.findMatches(ImmutableList.of(inv.mainInventory.get(0), inv.offHandInventory.get(0)), this.ingredients) != null;
    }

    @Override
    public ItemStack getCraftingResult(final PlayerInventory inv) {
        return this.output.copy();
    }

    @Override
    public boolean canFit(final int width, final int height) {
        return width * height == 2;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return this.output;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return RecipeSerializers.TWO_HANDED;
    }

    @Override
    public IRecipeType<?> getType() {
        return RecipeTypes.TWO_HANDED;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<TwoHandedRecipe> {
        @Override
        public TwoHandedRecipe read(final ResourceLocation id, final JsonObject json) {
            // Read Ingredients
            NonNullList<Ingredient> ingredients = NonNullList.create();
            final JsonArray ingredientsJson = JSONUtils.getJsonArray(json, "ingredients");
            for (int i = 0; i < ingredientsJson.size(); i++) {
                Ingredient ingredient = Ingredient.deserialize(ingredientsJson.get(i));
                if (!ingredient.hasNoMatchingItems()) {
                    ingredients.add(ingredient);
                }
            }
            // Read Result
            final ItemStack result = ShapedRecipe.deserializeItem(JSONUtils.getJsonObject(json, "result"));
            return new TwoHandedRecipe(id, result, ingredients);
        }

        @Nullable
        @Override
        public TwoHandedRecipe read(final ResourceLocation id, final PacketBuffer buffer) {
            NonNullList<Ingredient> ingredients = NonNullList.withSize(2, Ingredient.EMPTY);
            ingredients.set(0, Ingredient.read(buffer));
            ingredients.set(1, Ingredient.read(buffer));
            ItemStack result = buffer.readItemStack();
            return new TwoHandedRecipe(id, result, ingredients);
        }

        @Override
        public void write(final PacketBuffer buffer, final TwoHandedRecipe recipe) {
            for (final Ingredient ingredient : recipe.ingredients) {
                ingredient.write(buffer);
            }
            buffer.writeItemStack(recipe.output);
        }
    }
}
