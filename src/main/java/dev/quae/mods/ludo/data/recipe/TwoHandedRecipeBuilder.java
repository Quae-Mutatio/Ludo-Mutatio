package dev.quae.mods.ludo.data.recipe;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.quae.mods.ludo.Ludo.RecipeSerializers;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public final class TwoHandedRecipeBuilder {
    private final Item result;
    private final int count;
    private final List<Ingredient> ingredients = Lists.newArrayList();

    private TwoHandedRecipeBuilder(final IItemProvider result, final int count) {
        this.result = result.asItem();
        this.count = count;
    }

    public static TwoHandedRecipeBuilder create(final IItemProvider result, final int count) {
        return new TwoHandedRecipeBuilder(result, count);
    }

    public static TwoHandedRecipeBuilder create(final IItemProvider result) {
        return create(result, 1);
    }

    public TwoHandedRecipeBuilder addIngredient(IItemProvider item, int count) {
        for (int i = 0; i < count; i++) {
            this.addIngredient(item);
        }
        return this;
    }

    public TwoHandedRecipeBuilder addIngredient(IItemProvider item) {
        return this.addIngredient(Ingredient.fromItems(item));
    }

    public TwoHandedRecipeBuilder addIngredient(ITag<Item> item) {
        return this.addIngredient(Ingredient.fromTag(item));
    }

    public TwoHandedRecipeBuilder addIngredient(IItemProvider... stackOptions) {
        return this.addIngredient(Ingredient.fromItems(stackOptions));
    }

    public TwoHandedRecipeBuilder addIngredient(final Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public void build(Consumer<IFinishedRecipe> consumer) {
        ResourceLocation id = this.result.getRegistryName();
        consumer.accept(new Result(id, this.result, this.count, this.ingredients));
    }

    public static final class Result implements IFinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final List<Ingredient> ingredients;

        public Result(final ResourceLocation id, final Item result, final int count, final List<Ingredient> ingredients) {
            this.id = id;
            this.result = result;
            this.count = count;
            this.ingredients = ingredients;
        }

        @Override
        public void serialize(final JsonObject json) {
            // Serialize Ingredients
            final JsonArray ingredients = new JsonArray();
            for (final Ingredient ingredient : this.ingredients) {
                ingredients.add(ingredient.serialize());
            }
            json.add("ingredients", ingredients);

            // Serialize Result
            final JsonObject result = new JsonObject();
            result.addProperty("item", this.result.getRegistryName().toString());
            result.addProperty("count", this.count);
            json.add("result", result);
        }

        @Override
        public ResourceLocation getID() {
            return this.id;
        }

        @Override
        public IRecipeSerializer<?> getSerializer() {
            return RecipeSerializers.TWO_HANDED;
        }

        @Nullable
        @Override
        public JsonObject getAdvancementJson() {
            return null;
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementID() {
            return null;
        }
    }
}
