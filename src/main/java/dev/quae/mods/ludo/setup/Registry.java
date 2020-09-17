package dev.quae.mods.ludo.setup;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Blocks;
import dev.quae.mods.ludo.block.CampfireSmelterBlock;
import dev.quae.mods.ludo.block.LeavesPileBlock;
import dev.quae.mods.ludo.item.ChiselItem;
import dev.quae.mods.ludo.item.ItemLeaf;
import dev.quae.mods.ludo.item.StoneBowlItem;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import dev.quae.mods.ludo.tileentity.CampfireSmelterTileEntity;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.*;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraft.block.AbstractBlock.Properties.from;
import static net.minecraft.tileentity.TileEntityType.Builder.create;
import static net.minecraft.util.registry.Registry.CUSTOM_STAT;
import static net.minecraft.util.registry.Registry.register;

@EventBusSubscriber(bus = Bus.MOD, modid = Ludo.ID)
public final class Registry {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onRegisterBlocks(final Register<Block> event) {
        LOGGER.debug("Registering blocks");
        event.getRegistry().registerAll(
                prepare("campfire_smelter", new CampfireSmelterBlock(true, 1, from(Blocks.CAMPFIRE))),
                prepare("leaves_pile", new LeavesPileBlock(AbstractBlock.Properties.create(Material.LEAVES).sound(SoundType.WET_GRASS).hardnessAndResistance(2.0f).notSolid().setOpaque((p_test_1_, p_test_2_, p_test_3_) -> false).setAllowsSpawn((p_test_1_, p_test_2_, p_test_3_, p_test_4_) -> false).setSuffocates((p_test_1_, p_test_2_, p_test_3_) -> false).noDrops()))
                
                //Ores
                prepare("acanthite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("baryte_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("bauxite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("beryl_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("bornite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("cassiterite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("chalcocite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("chalcopyrite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("chromite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("cinnabar_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("cobaltite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("coltan_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("galena_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("hematite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("ilmenite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("magnetite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("malachite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("molybdenite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("pentalandite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("pyrolusite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("scheelite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("sperrylite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("sphalerite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("uranitite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5))),
                prepare("wolframite_ore", new OreBlock(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5)))
        );
    }

    @SubscribeEvent
    public static void onRegisterItems(final Register<Item> event) {
        LOGGER.debug("Registering items");
        event.getRegistry().registerAll(
                //ORE BLOCKS
                prepare("acanthite_ore", new BlockItem(Blocks.ACANTHITE_ORE, new Item.Properties())),
                prepare("baryte_ore", new BlockItem(Blocks.BARYTE_ORE, new Item.Properties())),
                prepare("bauxite_ore", new BlockItem(Blocks.BAUXITE_ORE, new Item.Properties())),
                prepare("beryl_ore", new BlockItem(Blocks.BERYL_ORE, new Item.Properties())),
                prepare("bornite_ore", new BlockItem(Blocks.BORNITE_ORE, new Item.Properties())),
                prepare("cassiterite_ore", new BlockItem(Blocks.CASSITERITE_ORE, new Item.Properties())),
                prepare("chalcocite_ore", new BlockItem(Blocks.CHALCOCITE_ORE, new Item.Properties())),
                prepare("chalcopyrite_ore", new BlockItem(Blocks.CHALCOPYRITE_ORE, new Item.Properties())),
                prepare("chromite_ore", new BlockItem(Blocks.CHROMITE_ORE, new Item.Properties())),
                prepare("cinnabar_ore", new BlockItem(Blocks.CINNABAR_ORE, new Item.Properties())),
                prepare("cobaltite_ore", new BlockItem(Blocks.COBALTITE_ORE, new Item.Properties())),
                prepare("coltan_ore", new BlockItem(Blocks.COLTAN_ORE, new Item.Properties())),
                prepare("galena_ore", new BlockItem(Blocks.GALENA_ORE, new Item.Properties())),
                prepare("hematite_ore", new BlockItem(Blocks.HEMATITE_ORE, new Item.Properties())),
                prepare("ilmenite_ore", new BlockItem(Blocks.ILMENITE_ORE, new Item.Properties())),
                prepare("magnetite_ore", new BlockItem(Blocks.MAGNETITE_ORE, new Item.Properties())),
                prepare("malachite_ore", new BlockItem(Blocks.MALACHITE_ORE, new Item.Properties())),
                prepare("molybdenite_ore", new BlockItem(Blocks.MOLYBDENITE_ORE, new Item.Properties())),
                prepare("pentalandite_ore", new BlockItem(Blocks.PENTALANDITE_ORE, new Item.Properties())),
                prepare("pyrolusite_ore", new BlockItem(Blocks.PYROLUSITE_ORE, new Item.Properties())),
                prepare("scheelite_ore", new BlockItem(Blocks.SCHEELITE_ORE, new Item.Properties())),
                prepare("sperrylite_ore", new BlockItem(Blocks.SPERRYLITE_ORE, new Item.Properties())),
                prepare("sphalerite_ore", new BlockItem(Blocks.SPHALERITE_ORE, new Item.Properties())),
                prepare("uranitite_ore", new BlockItem(Blocks.URANITITE_ORE, new Item.Properties())),
                prepare("wolframite_ore", new BlockItem(Blocks.WOLFRAMITE_ORE, new Item.Properties())),
                // MATERIALS
                prepare("soft_pebble", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("hard_pebble", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("stone_bowl", new StoneBowlItem(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("oak_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("birch_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("spruce_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("jungle_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("dark_oak_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("acacia_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("crimson_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("warped_wooden_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("stone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("granite_stone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("diorite_stone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("andesite_stone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("sandstone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("red_sandstone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("endstone_plate", new Item(new Properties().group(LudoItemGroup.MATERIALS))),
                prepare("leaf", new ItemLeaf(new Properties().group(LudoItemGroup.MATERIALS))),
                // TOOLS
                prepare("wooden_chisel", new ChiselItem(ItemTier.WOOD, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS))),
                prepare("stone_chisel", new ChiselItem(ItemTier.STONE, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS))),
                prepare("iron_chisel", new ChiselItem(ItemTier.IRON, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS))),
                prepare("gold_chisel", new ChiselItem(ItemTier.GOLD, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS))),
                prepare("diamond_chisel", new ChiselItem(ItemTier.DIAMOND, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS))),
                prepare("netherite_chisel", new ChiselItem(ItemTier.NETHERITE, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isImmuneToFire()))
        );
    }

    @SubscribeEvent
    public static void onRegisterTileEntityTypes(final Register<TileEntityType<?>> event) {
        LOGGER.debug("Registering tile entity types");
        event.getRegistry().registerAll(
                prepare("campfire_smelter", create(CampfireSmelterTileEntity::new, Ludo.Blocks.CAMPFIRE_SMELTER))
        );
    }

    @SubscribeEvent
    public static void onRegisterContainerTypes(final Register<ContainerType<?>> event) {
        LOGGER.debug("Registering container types");
        event.getRegistry().registerAll(

        );
    }

    @SubscribeEvent
    public static void onRegisterRecipeSerializers(final Register<IRecipeSerializer<?>> event) {
        LOGGER.debug("Registering recipe serializers");
        event.getRegistry().registerAll(
                prepare("two_handed", new TwoHandedRecipe.Serializer())
        );
    }

    @SubscribeEvent
    public static void onRegisterStatTypes(final Register<StatType<?>> event) {
        LOGGER.debug("Registering stat types");
        addStat(Ludo.Stats.INTERACT_WITH_CAMPFIRE_SMELTER, IStatFormatter.DEFAULT);
        addStat(Ludo.Stats.CREATED_CAMPFIRE_SMELTER, IStatFormatter.DEFAULT);
    }

    private static <T extends IForgeRegistryEntry<T>> T prepare(String name, T t) {
        return t.setRegistryName(new ResourceLocation(Ludo.ID, name));
    }

    @SuppressWarnings("unchecked")
    private static <T extends TileEntity> TileEntityType<T> prepare(String name, TileEntityType.Builder<T> builder) {
        return (TileEntityType<T>) prepare(name, builder.build(null));
    }

    private static void addStat(ResourceLocation name, IStatFormatter formatter) {
        register(CUSTOM_STAT, name, name);
        Stats.CUSTOM.get(name, formatter);
    }

    public static void onRegisterBlockColors() {
        Minecraft.getInstance().getBlockColors().register((state, world, pos, tintIndex) -> {
            if (world != null && pos != null) {
                return BiomeColors.getFoliageColor(world, pos);
            }
            return FoliageColors.getDefault();
        }, Ludo.Blocks.LEAVES_PILE);
    }

    public static void onRegisterBlockRenderLayers() {
        RenderTypeLookup.setRenderLayer(Ludo.Blocks.LEAVES_PILE, RenderType.getCutoutMipped());
    }
}
