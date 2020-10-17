package dev.quae.mods.ludo.multiblock.example;

import dev.quae.mods.ludo.multiblock.Amount;
import dev.quae.mods.ludo.multiblock.Amount.Const;
import dev.quae.mods.ludo.multiblock.Amount.Range;
import dev.quae.mods.ludo.multiblock.IMultiblock;
import dev.quae.mods.ludo.multiblock.ITask;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipe;

public class FurnaceMultiblock implements IMultiblock {
    @Override
    public Map<Type, Amount> getRequiredParts() {
        final HashMap<Type, Amount> requiredParts = new HashMap<>();
        requiredParts.put(BasicType.INVENTORY, new Range(2, 4));
        requiredParts.put(AdvancedType.ELECTRICAL_FURNACE, new Const(1));
        requiredParts.put(BasicType.ENERGY_IN, new Range(1, 2));
        return requiredParts;
    }

    @Override
    public Predicate<Master> getMasterTest() {
        return it -> it.getType() == AdvancedType.ELECTRICAL_FURNACE && it instanceof ITask.Executor;
    }

    public static class FurnaceTask implements ITask {
        private final FurnaceRecipe recipe;
        private final Consumer<ItemStack> resultConsumer;
        private final Runnable ingredientConsumer;
        private final BooleanSupplier powerEater;
        private int progress;
        private final int cookTime;
        private final int cookSpeed;
        private boolean finished;

        public FurnaceTask(FurnaceRecipe recipe, Consumer<ItemStack> resultConsumer, Runnable ingredientConsumer, BooleanSupplier powerConsumer, int cookSpeed) {
            this.recipe = recipe;
            this.resultConsumer = resultConsumer;
            this.ingredientConsumer = ingredientConsumer;
            this.powerEater = powerConsumer;
            this.cookSpeed = cookSpeed;
            this.cookTime = recipe.getCookTime();
            this.progress = 0;
            this.finished = false;
        }

        @Override
        public void tick() {
            if (!this.powerEater.getAsBoolean() || this.finished) {
                return;
            }
            this.progress += this.cookSpeed;
            if (this.progress < this.cookTime) {
                return;
            }
            this.ingredientConsumer.run();
            this.resultConsumer.accept(this.recipe.getRecipeOutput().copy());
            this.finished = true;
        }

        @Override
        public boolean isDone() {
            return this.finished;
        }
    }
}
