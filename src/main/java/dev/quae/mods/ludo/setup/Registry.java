package dev.quae.mods.ludo.setup;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.block.CampfireSmelterBlock;
import dev.quae.mods.ludo.item.ChiselItem;
import dev.quae.mods.ludo.item.StoneBowlItem;
import dev.quae.mods.ludo.itemgroup.LudoItemGroup;
import dev.quae.mods.ludo.recipe.TwoHandedRecipe;
import dev.quae.mods.ludo.tileentity.CampfireSmelterTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
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
                prepare("campfire_smelter", new CampfireSmelterBlock(true, 1, from(Blocks.CAMPFIRE)))
        );
    }

    @SubscribeEvent
    public static void onRegisterItems(final Register<Item> event) {
        LOGGER.debug("Registering items");
        event.getRegistry().registerAll(
                // BLOCKS

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
                // TOOLS
                prepare("wooden_chisel", new ChiselItem(ItemTier.WOOD, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isBurnable())),
                prepare("stone_chisel", new ChiselItem(ItemTier.STONE, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isBurnable())),
                prepare("iron_chisel", new ChiselItem(ItemTier.IRON, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isBurnable())),
                prepare("gold_chisel", new ChiselItem(ItemTier.GOLD, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isBurnable())),
                prepare("diamond_chisel", new ChiselItem(ItemTier.DIAMOND, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isBurnable())),
                prepare("netherite_chisel", new ChiselItem(ItemTier.NETHERITE, 1.0F, -2.5F, new Properties().group(LudoItemGroup.TOOLS).isBurnable()))
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
}
