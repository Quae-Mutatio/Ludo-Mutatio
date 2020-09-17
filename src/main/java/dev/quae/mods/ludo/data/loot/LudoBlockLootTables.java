package dev.quae.mods.ludo.data.loot;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.Blocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.functions.SetCount;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.stream.Collectors;

public final class LudoBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        this.registerLootTable(Blocks.CAMPFIRE_SMELTER, (unlit) -> droppingWithSilkTouch(unlit, withSurvivesExplosion(unlit, ItemLootEntry.builder(Items.CHARCOAL).acceptFunction(SetCount.builder(ConstantRange.of(2))))));
        // ORES
        this.registerDropSelfLootTable(Ludo.Blocks.ACANTHITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.BARYTE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.BAUXITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.BERYL_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.BORNITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.CASSITERITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.CHALCOCITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.CHALCOPYRITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.CHROMITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.CINNABAR_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.COBALTITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.COLTAN_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.GALENA_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.HEMATITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.ILMENITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.MAGNETITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.MALACHITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.MOLYBDENITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.PENTALANDITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.PYROLUSITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.SCHEELITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.SPERRYLITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.SPHALERITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.URANITITE_ORE);
        this.registerDropSelfLootTable(Ludo.Blocks.WOLFRAMITE_ORE);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(it -> Objects.equals(it.getRegistryName().getNamespace(), Ludo.ID)).collect(Collectors.toSet());
    }
}
