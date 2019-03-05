package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		this.plate = plate;
		validatePlate(plate);
		this.brand = brand;
		this.color = color;
	}
	
	public void validatePlate(String Plate) throws Exception {
		if (plate.length() == 6 || plate.length() == 7) {
			char c;
			for (int i=4; i<plate.length(); ++i) {
				c = plate.charAt(i);
				if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
					throw new Exception("x The plate has to end with 2 or 3 lleters.!");
			}
			try {
				Integer.parseInt(plate.substring(0, 4));
			}catch (Exception e) {
				throw new Exception("x The plate has to start with 4 numbers.!");
			}
		}
		else {
			throw new Exception("x Incorrect format.!\n - "
					+ "Enrollment should be (XXXXYY or XXXXYYY) where X is a number and Y is a letter.");
		}
	}
	
	public abstract String printDataWhells();
	
	public String print() {
		StringBuilder stb = new StringBuilder();
		stb.append("\n+++ Data of a " + this.getClass().getSimpleName() + " +++");
		stb.append("\nPlate: " + this.plate);
		stb.append("\nBrand: " + this.brand);
		stb.append("\nColor: " + this.color);
		stb.append("\nData of wheels:\n");
		stb.append(printDataWhells());
		return stb.toString();
	}
}
