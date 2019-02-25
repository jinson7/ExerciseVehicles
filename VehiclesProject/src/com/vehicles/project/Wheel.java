package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Wheel)) return super.equals(obj);
		return this.brand.equals(((Wheel)obj).brand) && this.diameter == ((Wheel)obj).diameter;
	}
}
