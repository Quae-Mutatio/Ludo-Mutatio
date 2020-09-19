package dev.quae.mods.ludo.materials.elements;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.materials.isotopes.*;
import java.util.*;
import net.minecraft.util.text.*;
import static java.util.OptionalDouble.*;

public enum Element{
	HYDROGEN( 1, "H", "hydrogen", 1.008, new byte[]{1}, of(2.20), of(14.01), of(20.28), of(72.8), of(0.0899), of(0.01805), empty(), of(14300), of(0.452), of(0.558), 75, 75, 2.4, 0.15, 11, 10, 1766, Hydrogen.values(), OptionalInt.empty(), "Hydrogen is the most common element!"),
	HELIUM( 2, "He", "helium", 4.0026, new byte[]{2}, empty(), empty(), of(4.22), of(0), of(0.1785), of(0.1513), empty(), of(5193), of(0.083), of(0.02), 23, 23, 0, 5.5e-7, 7.2e-10, 0, 1895, Helium.values(), OptionalInt.empty(), "Helium is mostly used for party balloons :D"),
	LITHIUM( 3, "Li", "lithium", 6.94, new byte[]{2, 1}, of(0.98), of(453.69), of(1615), of(59.6), of(535), of(85), of(11), of(3570), of(147), of(3), 6.0e-7, 6.0e-9, 0.00017, 0.0017, 0.000018, 3.0e-6, 1817, Lithium.values(), OptionalInt.of(0xFFFFFF), "Battery powered!"),
	BERYLLIUM( 4, "Be", "beryllium", 9.012183, new byte[]{2, 2}, of(1.57), of(1560), of(2743), of(0), of(1848), of(190), of(25), of(1820), of(297), of(7.95), 1.00e-7, 1.0e-8, 2.9e-6, 0.00019, 6.0e-11, 4.0e-8, 1797, Beryllium.values(), OptionalInt.of(0x888888), "Tick Tock goes the Clock"),
	BORON( 5, "B", "boron", 10.81, new byte[]{2, 3}, of(2.04), of(2348), of(4273), of(26.7), of(2460), of(27), of(1.0e-10), of(1030), of(507), of(50), 1.00e-7, 2.0e-7, 0.00016, 0.00086, 0.00044, 0.000070, 1808, Boron.values(), OptionalInt.of(0x888888), "Hole in one!"),
	CARBON( 6, "C", "carbon", 12.011, new byte[]{2, 4}, of(2.55), of(3823), of(4300), of(153.9), of(2260), of(140), of(0.10), of(710), of(715), of(105), 0.50, 0.30, 1.5, 0.18, 0.0028, 23, -3750, Carbon.values(), OptionalInt.of(0x000000), "Ormagically material"),
	NITROGEN( 7, "N", "nitrogen", 14.007, new byte[]{2, 5}, of(3.04), of(63.05), of(77.36), of(7), of(1.251), of(0.02583), empty(), of(1040), of(2.79), of(0.36), 0.100, 0.10, 0.14, 0.0020, 0.000050, 2.6, 1772, Nitrogen.values(), OptionalInt.empty(), "Have a laugh"),
	OXYGEN( 8, "O", "oxygen", 15.999, new byte[]{2, 6}, of(3.44), of(54.8), of(90.2), of(141), of(1.429), of(0.02658), empty(), of(919), of(3.41), of(0.222), 1.00, 0.90, 40, 46, 86, 61, 1774, Oxygen.values(), OptionalInt.empty(), "Start a fire"),
	FLUORINE( 9, "F", "fluorine", 18.99840, new byte[]{2, 7}, of(3.98), of(53.5), of(85.03), of(328), of(1.696), of(0.0277), empty(), of(824), of(3.27), of(0.26), 0.000040, 0.000050, 0.0087, 0.054, 0.00013, 0.0037, 1886, Fluorine.values(), OptionalInt.empty(), "I dont want to go to the dentist"),
	NEON( 10, "Ne", "neon", 20.1797, new byte[]{2, 8}, empty(), of(24.56), of(27.07), of(0), of(0.900), of(0.0491), empty(), of(1030.0), of(1.75), of(0.34), 0.13, 0.10, 0, 3.0e-7, 1.2e-8, 0, 1898, Neon.values(), OptionalInt.empty(), "Fancy street-signs"),
	SODIUM( 11, "Na", "sodium", 22.98977, new byte[]{2, 8, 1}, of(0.93), of(370.87), of(1156), of(52.8), of(968), of(141), of(21), of(1230), of(97.7), of(2.60), 0.0020, 0.0040, 0.55, 2.3, 1.1, 0.14, 1807, Sodium.values(), OptionalInt.of(0x888888), "Dont get salty Kappa");
	
	private final byte atomicNumber;
	private final String atomicSymbol;
	private final ITextComponent name;
	private final double weight;//u
	private final byte[] electronShells;
	private final OptionalDouble electroNegativity;
	private final OptionalDouble meltingPoint;//Kelvin
	private final OptionalDouble boilingPoint;//Kelvin
	private final OptionalDouble electronAffinity;//kJ/mol
	private final OptionalDouble density;//kg/m^3
	private final OptionalDouble thermalConductivity;//W/mK
	private final OptionalDouble electricConductivity;//MS/m
	private final OptionalDouble specificHeat;//J/KgK
	private final OptionalDouble vaporizationHeat;//kJ/mol
	private final OptionalDouble fusionHeat;//kJ/mol
	private final double abundanceUniverse;//%
	private final double abundanceSolar;//%
	private final double abundanceMeteor;//%
	private final double abundanceCrust;//%
	private final double abundanceOcean;//%
	private final double abundanceHuman;//%
	private final int discoveredYear;
	
	private final IIsotope[] isotopes;
	private final OptionalInt color;
	private final String description;
	
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
	
	public byte getAtomicNumber(){
		return atomicNumber;
	}
	
	public String getAtomicSymbol(){
		return atomicSymbol;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public ITextComponent getName(){
		return name;
	}
	
	public byte[] getElectronShells(){
		return electronShells;
	}
	
	public OptionalDouble getElectroNegativity(){
		return electroNegativity;
	}
	
	public OptionalDouble getMeltingPoint(){
		return meltingPoint;
	}
	
	public OptionalDouble getBoilingPoint(){
		return boilingPoint;
	}
	
	public OptionalDouble getElectronAffinity(){
		return electronAffinity;
	}
	
	public OptionalDouble getDensity(){
		return density;
	}
	
	public OptionalDouble getThermalConductivity(){
		return thermalConductivity;
	}
	
	public OptionalDouble getElectricConductivity(){
		return electricConductivity;
	}
	
	public OptionalDouble getSpecificHeat(){
		return specificHeat;
	}
	
	public OptionalDouble getVaporizationHeat(){
		return vaporizationHeat;
	}
	
	public OptionalDouble getFusionHeat(){
		return fusionHeat;
	}
	
	public double getAbundanceUniverse(){
		return abundanceUniverse;
	}
	
	public double getAbundanceSolar(){
		return abundanceSolar;
	}
	
	public double getAbundanceMeteor(){
		return abundanceMeteor;
	}
	
	public double getAbundanceCrust(){
		return abundanceCrust;
	}
	
	public double getAbundanceOcean(){
		return abundanceOcean;
	}
	
	public double getAbundanceHuman(){
		return abundanceHuman;
	}
	
	public int getDiscoveredYear(){
		return discoveredYear;
	}
	
	public OptionalInt getColor(){
		return color;
	}
	
	public String getDescription(){
		return description;
	}
	
	public IIsotope[] getIsotopes(){
		return isotopes;
	}
}