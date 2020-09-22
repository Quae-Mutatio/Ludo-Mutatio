package dev.quae.mods.ludo.integrations.jei;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.Ludo.RecipeTypes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

@JeiPlugin
public class LudoPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Ludo.ID, "ludo");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new TwoHandedCraftingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        World world = Minecraft.getInstance().world;
        if(world!=null){
            registration.addRecipes(world.getRecipeManager().getRecipesForType(RecipeTypes.TWO_HANDED), TwoHandedCraftingCategory.UID);
        }
        registration.addIngredientInfo(new ItemStack(Items.STONE_BOWL), VanillaTypes.ITEM, "Use a stone bowl on a campfire to access some early game resources!");
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(Items.STONE_CHISEL), TwoHandedCraftingCategory.UID);
    }
}