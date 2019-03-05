package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {
	
	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("There are different wheels.!");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	@Override
	public String printDataWhells() {
		StringBuilder stb = new StringBuilder();
		stb.append("Front Whells:");
		stb.append("\n* Left *\n");
		stb.append(this.wheels.get(0).print());
		stb.append("\n* Rigth *\n");
		stb.append(this.wheels.get(1).print());
		stb.append("\nBack Whells:");
		stb.append("\n* Left *\n");
		stb.append(this.wheels.get(2).print());
		stb.append("\n* Rigth *\n");
		stb.append(this.wheels.get(3).print());
		return stb.toString();
	}	

}
