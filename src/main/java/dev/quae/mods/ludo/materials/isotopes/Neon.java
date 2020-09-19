package dev.quae.mods.ludo.materials.isotopes;

public enum Neon implements IIsotope{
	ISO16(new Isotope(10, 6, 10, "neon.16")),
	ISO17(new Isotope(10, 7, 10, "neon.17")),
	ISO18(new Isotope(10, 8, 10, "neon.18")),
	ISO19(new Isotope(10, 9, 10, "neon.19")),
	ISO20(new Isotope(10, 10, 10, "neon.20")),
	ISO21(new Isotope(10, 11, 10, "neon.21")),
	ISO22(new Isotope(10, 12, 10, "neon.22")),
	ISO23(new Isotope(10, 13, 10, "neon.23")),
	ISO24(new Isotope(10, 14, 10, "neon.24")),
	ISO25(new Isotope(10, 15, 10, "neon.25")),
	ISO26(new Isotope(10, 16, 10, "neon.26")),
	ISO27(new Isotope(10, 17, 10, "neon.27")),
	ISO28(new Isotope(10, 18, 10, "neon.28")),
	ISO29(new Isotope(10, 19, 10, "neon.29")),
	ISO30(new Isotope(10, 20, 10, "neon.30")),
	ISO31(new Isotope(10, 21, 10, "neon.31")),
	ISO32(new Isotope(10, 22, 10, "neon.32")),
	ISO33(new Isotope(10, 23, 10, "neon.33")),
	ISO34(new Isotope(10, 24, 10, "neon.34"));
	
	Isotope iso;
	Neon(Isotope iso){
		this.iso = iso;
	}
	
	public Isotope getIso(){
		return iso;
	}
}