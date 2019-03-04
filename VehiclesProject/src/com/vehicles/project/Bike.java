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
	public void printDataWhells() {
		System.out.println("Front Whell:");
		this.wheels.get(0).print();
		System.out.println("Back Whell:");
		this.wheels.get(1).print();
	}
}
