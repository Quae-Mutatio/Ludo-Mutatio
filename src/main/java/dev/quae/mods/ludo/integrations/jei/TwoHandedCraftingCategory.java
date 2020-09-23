package dev.quae.mods.ludo.integrations.jei;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class TwoHandedCraftingCategory implements IRecipeCategory<TwoHandedRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Ludo.ID, "two_handed_crafting");
    private final TranslationTextComponent title = new TranslationTextComponent(Ludo.ID + ".jei.title.two_handed_crafting");
    private final IDrawable icon;
    private final IDrawable background;

    public TwoHandedCraftingCategory(IGuiHelper guiHelper){
        background = guiHelper.drawableBuilder(new ResourceLocation(Ludo.ID, "textures/gui/jei/two_handed_crafting.png"), 0, 0, 128, 28).setTextureSize(128, 28).build();
        icon = guiHelper.createDrawableIngredient(new ItemStack(Items.STONE_CHISEL));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends TwoHandedRecipe> getRecipeClass() {
        return TwoHandedRecipe.class;
    }

    @Override
    public String getTitle() {
        return title.getString();
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setIngredients(TwoHandedRecipe jeiTwoHandedCraftingRecipe, IIngredients iIngredients) {
        iIngredients.setInputIngredients(jeiTwoHandedCraftingRecipe.getIngredients());
        iIngredients.setOutput(VanillaTypes.ITEM, jeiTwoHandedCraftingRecipe.getRecipeOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout iRecipeLayout, TwoHandedRecipe jeiTwoHandedCraftingRecipe, IIngredients iIngredients) {
        IGuiItemStackGroup guiItemStacks = iRecipeLayout.getItemStacks();
        guiItemStacks.init(0, true, 5, 5);
        guiItemStacks.init(1, true, 105, 5);
        guiItemStacks.init(2, false, 55, 5);//todo scale the output item rendering to 1.50
        guiItemStacks.set(iIngredients);
    }
}