package dev.quae.mods.ludo;

import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import dev.quae.mods.ludo.setup.Registry;
import dev.quae.mods.ludo.tileentity.CampfireSmelterTileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tags.ItemTags;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.registries.ObjectHolder;

@Mod(Ludo.ID)
public class Ludo {
    public static final String ID = "ludomutatio";

    public Ludo() {
        SharedConstants.useDatafixers = false;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    @SuppressWarnings("Convert2MethodRef")
    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> Registry.onRegisterBlockColors());
        event.enqueueWork(() -> Registry.onRegisterBlockRenderLayers());
    }

    @CapabilityInject(IItemHandler.class)
    public static final Capability<IItemHandler> INV_CAP = null;

    @ObjectHolder(ID)
    public static final class Blocks {
        public static final Block CAMPFIRE_SMELTER = null;
        public static final Block LEAVES_PILE = null;
    }

    @ObjectHolder(ID)
    public static final class Items {
        public static final Item SOFT_PEBBLE = null;
        public static final Item HARD_PEBBLE = null;
        public static final Item STONE_BOWL = null;
        public static final Item OAK_WOODEN_PLATE = null;
        public static final Item BIRCH_WOODEN_PLATE = null;
        public static final Item SPRUCE_WOODEN_PLATE = null;
        public static final Item JUNGLE_WOODEN_PLATE = null;
        public static final Item DARK_OAK_WOODEN_PLATE = null;
        public static final Item ACACIA_WOODEN_PLATE = null;
        public static final Item CRIMSON_WOODEN_PLATE = null;
        public static final Item WARPED_WOODEN_PLATE = null;
        public static final Item STONE_PLATE = null;
        public static final Item GRANITE_STONE_PLATE = null;
        public static final Item DIORITE_STONE_PLATE = null;
        public static final Item ANDESITE_STONE_PLATE = null;
        public static final Item SANDSTONE_PLATE = null;
        public static final Item RED_SANDSTONE_PLATE = null;
        public static final Item ENDSTONE_PLATE = null;
        public static final Item LEAF = null;

        public static final Item WOODEN_CHISEL = null;
        public static final Item STONE_CHISEL = null;
        public static final Item IRON_CHISEL = null;
        public static final Item GOLD_CHISEL = null;
        public static final Item DIAMOND_CHISEL = null;
        public static final Item NETHERITE_CHISEL = null;
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

    public static final class Tags {
        public static final class Items {
            public static final IOptionalNamedTag<Item> WOODEN_PLATE = tag("wooden_plate");
            public static final IOptionalNamedTag<Item> STONE_PLATE = tag("stone_plate");
            public static final IOptionalNamedTag<Item> CHISEL = tag("chisel");
            public static final IOptionalNamedTag<Item> LEAF = tag("leaf");


            private static IOptionalNamedTag<Item> tag(String name) {
                return ItemTags.createOptional(new ResourceLocation(ID, name));
            }
        }

        public static final class Blocks {

        }
    }
}
