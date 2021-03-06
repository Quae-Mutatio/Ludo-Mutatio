package dev.quae.mods.ludo.worldgen;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;

// TODO: Create accurate ore features then add them to accurate biomes in WorldGenEventHandler#onBiomeLoading(BiomeLoadingEvent).
public class Ores {
    public static final ConfiguredFeature<?, ?> ACANTHITE_ORE = register("acanthite_ore", Feature.ORE.withConfiguration(
            new OreFeatureConfig(FillerBlockType.BASE_STONE_OVERWORLD, Blocks.ACANTHITE_ORE.getDefaultState(), 9)) // 9 = Vein Size
            .range(64) // Range = 0 - 64 on Y and other axis are min-max
            .square() // Square Placement
            .count(20) // Instances per chunk? and 32_b adds a second param for adding variance
    );

    private static ConfiguredFeature<?, ?> register(final String name, final ConfiguredFeature<?, ?> feature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Ludo.ID + ":" + name, feature);
    }
}
