package dev.quae.mods.ludo.events;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.worldgen.Ores;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(bus = Bus.FORGE, modid = Ludo.ID)
public final class WorldGenEventHandler {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoading(final BiomeLoadingEvent event) {
        if (event.getCategory().equals(Category.NETHER)
                || event.getCategory().equals(Category.THEEND)
                || event.getCategory().equals(Category.NONE)) {
            return;
        }

//        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Ores.ACANTHITE_ORE);
    }

}
