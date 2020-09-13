package dev.quae.mods.ludo.setup;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@EventBusSubscriber(bus = Bus.MOD, modid = Ludo.ID)
public final class Registry {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onRegisterBlocks(final Register<Block> event) {
        LOGGER.debug("Registering blocks");
        event.getRegistry().registerAll(

        );
    }

    @SubscribeEvent
    public static void onRegisterItems(final Register<Item> event) {
        LOGGER.debug("Registering items");
        event.getRegistry().registerAll(
                new Item(new Properties()).setRegistryName("soft_pebble"),
                new Item(new Properties()).setRegistryName("hard_pebble"),
                new Item(new Properties()).setRegistryName("stone_bowl")
        );
    }

    @SubscribeEvent
    public static void onRegisterTileEntityTypes(final Register<TileEntityType<?>> event) {
        LOGGER.debug("Registering tile entity types");
        event.getRegistry().registerAll(

        );
    }

    @SubscribeEvent
    public static void onRegisterContainerTypes(final Register<ContainerType<?>> event) {
        LOGGER.debug("Registering container types");
        event.getRegistry().registerAll(

        );
    }

    @ObjectHolder(Ludo.ID)
    public static final class Blocks {

    }

    @ObjectHolder(Ludo.ID)
    public static final class Items {
        public static final Item SOFT_PEBBLE = null;
        public static final Item HARD_PEBBLE = null;
        public static final Item STONE_BOWL = null;
    }

    @ObjectHolder(Ludo.ID)
    public static final class TileEntityTypes {

    }

    @ObjectHolder(Ludo.ID)
    public static final class ContainerTypes {

    }
}
