package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		this.brand = brand;
		if (!isValidDiameter(diameter))
			throw new Exception("ERROR: The diameter of the wheel must be 0.4 to 4");
		this.diameter = diameter;
	}
	
	public boolean isValidDiameter(double diameter) {
		return diameter > 0.4 && diameter <= 4;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Wheel)) return super.equals(obj);
		return this.brand.equals(((Wheel)obj).brand) && this.diameter == ((Wheel)obj).diameter;
	}
	
	public String print() {
		StringBuilder stb = new StringBuilder();
		stb.append("  - Brand: " + this.brand);
		stb.append("\n  - Diametre: " + this.diameter);
		return stb.toString();
	}
}
