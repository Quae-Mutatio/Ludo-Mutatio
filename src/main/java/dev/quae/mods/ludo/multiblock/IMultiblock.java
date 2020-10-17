package dev.quae.mods.ludo.multiblock;

import java.util.Map;
import java.util.function.Predicate;

public interface IMultiblock {
    Map<Type, Amount> getRequiredParts();

    Predicate<Master> getMasterTest();

    interface Type {

    }

    interface Part {
        IMultiblock getMultiblock();

        Type getType();
    }

    interface Master extends Part {
    }

    interface Slave extends Part {
    }
}
