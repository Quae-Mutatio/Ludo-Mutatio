package dev.quae.mods.ludo.setup;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.block.CampfireSmelterBlock;
import dev.quae.mods.ludo.item.PebbleItem;
import dev.quae.mods.ludo.item.StoneBowlItem;
import dev.quae.mods.ludo.tileentity.CampfireSmelterTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
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
                prepare("soft_pebble", new PebbleItem(new Properties())),
                prepare("hard_pebble", new PebbleItem(new Properties())),
                prepare("stone_bowl", new StoneBowlItem(new Properties()))
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
    public static void onRegisterStatTypes(final Register<StatType<?>> event) {
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
