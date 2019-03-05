package com.vehicles.project;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public void addWheel(Wheel frontWheel, Wheel backWheel) throws Exception {
		if (!frontWheel.equals(backWheel))
			throw new Exception("There are different wheels.!");
		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}
	
	@Override
	public String printDataWhells() {
		StringBuilder stb = new StringBuilder();
		stb.append("Front Whell:\n");
		stb.append(this.wheels.get(0).print());
		stb.append("\nBack Whell:\n");
		stb.append(this.wheels.get(1).print());
		return stb.toString();
	}
}
