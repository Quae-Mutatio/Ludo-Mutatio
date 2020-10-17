package dev.quae.mods.ludo.multiblock;

import java.util.function.IntPredicate;

public interface Amount extends IntPredicate {
    class Range implements Amount {
        private final int min;
        private final int max;

        public Range(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean test(int value) {
            return this.min <= value && value <= this.max;
        }
    }

    class Const implements Amount {
        private final int value;

        public Const(int value) {
            this.value = value;
        }

        @Override
        public boolean test(int value) {
            return this.value == value;
        }
    }
}
