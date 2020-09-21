package dev.quae.mods.ludo.integrations.jei;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Items;
import dev.quae.mods.ludo.Ludo.RecipeTypes;
import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import java.util.Collections;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.resources.DataPackRegistries;
import net.minecraft.server.MinecraftServer;
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
            world.getRecipeManager().getRecipesForType(RecipeTypes.TWO_HANDED).forEach(twoHandedRecipe -> {
                registration.addRecipes(Collections.singletonList(twoHandedRecipe), TwoHandedCraftingCategory.UID);
                //registration.addRecipes(TwoHandedCraftingRecipeMaker.getTwoHandedCraftingRecipes(), TwoHandedCraftingCategory.UID);
                //TODO load this in based on actual recipes from the RecipeManager class
            });
        }
        registration.addIngredientInfo(new ItemStack(Items.STONE_BOWL), VanillaTypes.ITEM, "Use a stone bowl on a campfire to access some early game resources!");
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(Items.STONE_CHISEL), TwoHandedCraftingCategory.UID);
    }
}