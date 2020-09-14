package dev.quae.mods.ludo;

import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import dev.quae.mods.ludo.tileentity.CampfireSmelterTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.registries.ObjectHolder;

@Mod(Ludo.ID)
public class Ludo {
    public static final String ID = "ludomutatio";

    public Ludo() {
        SharedConstants.useDatafixers = false;
    }

    @CapabilityInject(IItemHandler.class)
    public static final Capability<IItemHandler> INV_CAP = null;

    @ObjectHolder(ID)
    public static final class Blocks {
        public static final Block CAMPFIRE_SMELTER = null;
    }

    @ObjectHolder(ID)
    public static final class Items {
        public static final Item SOFT_PEBBLE = null;
        public static final Item HARD_PEBBLE = null;
        public static final Item STONE_BOWL = null;
    }

    @ObjectHolder(ID)
    public static final class TileEntityTypes {
        public static final TileEntityType<CampfireSmelterTileEntity> CAMPFIRE_SMELTER = null;
    }

    @ObjectHolder(ID)
    public static final class ContainerTypes {

    }

    @ObjectHolder(ID)
    public static final class RecipeSerializers {
        public static final IRecipeSerializer<TwoHandedRecipe> TWO_HANDED = null;
    }

    public static final class RecipeTypes {
        public static final IRecipeType<TwoHandedRecipe> TWO_HANDED = IRecipeType.register(new ResourceLocation(ID, "two_handed").toString());
    }

    public static final class Stats {
        public static final ResourceLocation INTERACT_WITH_CAMPFIRE_SMELTER = new ResourceLocation(ID, "interact_with_campfire_smelter");
        public static final ResourceLocation CREATED_CAMPFIRE_SMELTER = new ResourceLocation(ID, "created_campfire_smelter");
    }
}
