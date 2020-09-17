package dev.quae.mods.ludo.materials.elements;

import java.util.*;
import static java.util.OptionalDouble.of;
import static java.util.OptionalDouble.empty;

public enum Element{
	HYDROGEN(1, "H", 1.008, new byte[]{1}, of(2.20), of(14.01), of(20.28), of(72.8), of(0.0899), of(0.01805), empty(), of(14300), of(0.452), of(0.558), 75, 75, 2.4, 0.15, 11, 10, 1766, OptionalInt.empty(), "Hydrogen is the most common element!");
	
	private byte atomicNumber;
	private String atomicSymbol;
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
	
	private OptionalInt color;
	private String description;
	
	Element(int num,
	        String sym,
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
	        OptionalInt color,
	        String description){
		this.atomicNumber = (byte)num;
		this.atomicSymbol = sym;
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
		this.color = color;
		this.description = description;
	}
}