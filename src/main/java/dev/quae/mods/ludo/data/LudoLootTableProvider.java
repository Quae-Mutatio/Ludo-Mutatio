package dev.quae.mods.ludo.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import dev.quae.mods.ludo.data.loot.LudoBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LudoLootTableProvider extends LootTableProvider {
    private static final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> LOOT_TABLES = ImmutableList.of(
            Pair.of(LudoBlockLootTables::new, LootParameterSets.BLOCK)
    );

    @Override
    protected void validate(final Map<ResourceLocation, LootTable> map, final ValidationTracker validationtracker) {
        // No validation plz :)
    }

    public LudoLootTableProvider(final DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables() {
        return LOOT_TABLES;
    }
}
