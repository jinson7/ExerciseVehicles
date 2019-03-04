package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static Wheel createWheel(int numWhell) throws Exception {
		double diameter;
		System.out.print("Brand wheel #" + numWhell + ": ");
		String brand = scanner.nextLine();
	
		System.out.print("Diameter wheel #" + numWhell + ": ");
		diameter = scanner.nextDouble();
		scanner.nextLine();
		
		return new Wheel(brand, diameter);
	}
	
	public static void createWheels(List<Wheel> wheels, String type) throws Exception {
		System.out.println("- " + type);
		wheels.add(createWheel(1));
		wheels.add(createWheel(2));
		System.out.println();
	}

	public static void main(String[] args) {
		List<Wheel> backWheels = new ArrayList<Wheel>();
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		System.out.println("** Enter data of a vehicle **");
		System.out.print("Plate: ");
		String plate = scanner.nextLine();
		System.out.print("Brand: ");
		String brand = scanner.nextLine();
		System.out.print("Color: ");
		String color = scanner.nextLine();
		Car car = null;
		try {
			car = new Car(plate, brand, color);
			createWheels(backWheels, "Back wheels");
			createWheels(frontWheels, "Front wheels");
			car.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
