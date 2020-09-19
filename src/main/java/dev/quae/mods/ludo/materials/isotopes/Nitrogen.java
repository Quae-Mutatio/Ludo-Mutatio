package dev.quae.mods.ludo.materials.isotopes;

public enum Nitrogen implements IIsotope{
	ISO10(new Isotope(7, 3, 7, "nitrogen.10")),
	ISO11(new Isotope(7, 4, 7, "nitrogen.11")),
	ISO12(new Isotope(7, 5, 7, "nitrogen.12")),
	ISO13(new Isotope(7, 6, 7, "nitrogen.13")),
	ISO14(new Isotope(7, 7, 7, "nitrogen.14")),
	ISO15(new Isotope(7, 8, 7, "nitrogen.15")),
	ISO16(new Isotope(7, 9, 7, "nitrogen.16")),
	ISO17(new Isotope(7, 10, 7, "nitrogen.17")),
	ISO18(new Isotope(7, 11, 7, "nitrogen.18")),
	ISO19(new Isotope(7, 12, 7, "nitrogen.19")),
	ISO20(new Isotope(7, 13, 7, "nitrogen.20")),
	ISO21(new Isotope(7, 14, 7, "nitrogen.21")),
	ISO22(new Isotope(7, 15, 7, "nitrogen.22")),
	ISO23(new Isotope(7, 16, 7, "nitrogen.23")),
	ISO24(new Isotope(7, 17, 7, "nitrogen.24")),
	ISO25(new Isotope(7, 18, 7, "nitrogen.25"));
	
	Isotope iso;
	Nitrogen(Isotope iso){
		this.iso = iso;
	}
	
	public Isotope getIso(){
		return iso;
	}
}