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

public class LudoBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        this.registerLootTable(Blocks.CAMPFIRE_SMELTER, (unlit) -> droppingWithSilkTouch(unlit, withSurvivesExplosion(unlit, ItemLootEntry.builder(Items.CHARCOAL).acceptFunction(SetCount.builder(ConstantRange.of(2))))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(it -> Objects.equals(it.getRegistryName().getNamespace(), Ludo.ID)).collect(Collectors.toSet());
    }
}
