package dev.quae.mods.ludo.materials.alloys;

import com.google.common.collect.ImmutableMap;
import dev.quae.mods.ludo.materials.elements.Element;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public enum Alloy {
    ALNICO(new Object2IntOpenHashMap<>(ImmutableMap.of(
            Element.HYDROGEN, 1//todo
    ))), //Permanent magnet; 11.1%Aluminium, 22.2%Nickel, 22.2%Cobalt, 44.4%Iron;
    ALUMINIUM_SCANDIUM(new Object2IntOpenHashMap<>(ImmutableMap.of(
            Element.HELIUM, 1//todo
    ))), //Welding surface?; 75% Alu, 25% Scandium
    BIRMABRIGHT(new Object2IntOpenHashMap<>(ImmutableMap.of(
            Element.HELIUM, 1//todo
    ))); //car-bodies(corrosion-resistant); 0.7%Mn, 4.7%Mg, 94.6%%Al

    Object2IntMap elements;

    Alloy(Object2IntMap<Element> elements) {
        this.elements = elements;
    }
}