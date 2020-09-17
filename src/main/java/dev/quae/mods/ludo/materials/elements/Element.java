package dev.quae.mods.ludo.materials.elements;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.materials.isotopes.*;
import java.util.*;
import net.minecraft.util.text.*;
import static java.util.OptionalDouble.of;
import static java.util.OptionalDouble.empty;

public enum Element{
	HYDROGEN(1, "H", "hydrogen", 1.008, new byte[]{1}, of(2.20), of(14.01), of(20.28), of(72.8), of(0.0899), of(0.01805), empty(), of(14300), of(0.452), of(0.558), 75, 75, 2.4, 0.15, 11, 10, 1766, Hydrogen.values(), OptionalInt.empty(), "Hydrogen is the most common element!"),
	HELIUM(2, "He", "helium", 4.0026, new byte[]{2}, empty(), empty(), of(4.22), of(0), of(0.1785), of(0.1513), empty(), of(5193), of(0.083), of(0.02), 23, 23, 0, 5.5e-7, 7.2e-10, 0, 1895, Helium.values(), OptionalInt.empty(), "Helium is mostly used for party balloons :D");
	
	private byte atomicNumber;
	private String atomicSymbol;
	private ITextComponent name;
	private double weight;//u
	private byte[] electronShells;
	private OptionalDouble electroNegativity;
	private OptionalDouble meltingPoint;//Kelvin
	private OptionalDouble boilingPoint;//Kelvin
	private OptionalDouble electronAffinity;//kJ/mol
	private OptionalDouble density;//kg/m^3
	private OptionalDouble thermalConductivity;//W/mK
	private OptionalDouble electricConductivity;//MS/m
	private OptionalDouble specificHeat;//J/KgK
	private OptionalDouble vaporizationHeat;//kJ/mol
	private OptionalDouble fusionHeat;//kJ/mol
	private double abundanceUniverse;//%
	private double abundanceSolar;//%
	private double abundanceMeteor;//%
	private double abundanceCrust;//%
	private double abundanceOcean;//%
	private double abundanceHuman;//%
	private int discoveredYear;
	
	private IIsotope[] isotopes;
	private OptionalInt color;
	private String description;
	
	Element(int num,
	        String sym,
	        String name,
	        double weight,
	        byte[] electronShells,
	        OptionalDouble electroNegativity,
	        OptionalDouble meltingPoint,
	        OptionalDouble boilingPoint,
	        OptionalDouble electronAffinity,
	        OptionalDouble density,
	        OptionalDouble thermalConductivity,
	        OptionalDouble electricConductivity,
	        OptionalDouble specificHeat,
	        OptionalDouble vaporizationHeat,
	        OptionalDouble fusionHeat,
	        double abundanceUniverse,
	        double abundanceSolar,
	        double abundanceMeteor,
	        double abundanceCrust,
	        double abundanceOcean,
	        double abundanceHuman,
	        int discoveredYear,
	        IIsotope[] isotopes,
	        OptionalInt color,
	        String description){
		this.atomicNumber = (byte)num;
		this.atomicSymbol = sym;
		this.name = new TranslationTextComponent(Ludo.ID + "." + name);
		this.weight = weight;
		this.electronShells = electronShells;
		this.electroNegativity = electroNegativity;
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
		this.electronAffinity = electronAffinity;
		this.density = density;
		this.thermalConductivity = thermalConductivity;
		this.electricConductivity = electricConductivity;
		this.specificHeat = specificHeat;
		this.vaporizationHeat = vaporizationHeat;
		this.fusionHeat = fusionHeat;
		this.abundanceUniverse = abundanceUniverse;
		this.abundanceSolar = abundanceSolar;
		this.abundanceMeteor = abundanceMeteor;
		this.abundanceCrust = abundanceCrust;
		this.abundanceOcean = abundanceOcean;
		this.abundanceHuman = abundanceHuman;
		this.discoveredYear = discoveredYear;
		this.isotopes = isotopes;
		this.color = color;
		this.description = description;
	}
	
	public ITextComponent getName(){
		return name;
	}
}