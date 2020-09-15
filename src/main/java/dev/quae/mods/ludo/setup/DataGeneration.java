package dev.quae.mods.ludo.setup;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.data.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(bus = Bus.MOD, modid = Ludo.ID)
public final class DataGeneration {

    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent event) {
        final DataGenerator gen = event.getGenerator();
        final ExistingFileHelper efh = event.getExistingFileHelper();
        if (event.includeClient()) {
            gen.addProvider(new LudoLanguageProvider(gen, "en_us"));
            gen.addProvider(new LudoItemModelProvider(gen, efh));
        }

        if (event.includeServer()) {
            gen.addProvider(new LudoRecipeProvider(gen));
            gen.addProvider(new LudoLootTableProvider(gen));
            final LudoBlockTagsProvider blockTagsProvider = new LudoBlockTagsProvider(gen, efh);
            gen.addProvider(blockTagsProvider);
            gen.addProvider(new LudoItemTagsProvider(gen, blockTagsProvider, efh));
        }
    }
}
