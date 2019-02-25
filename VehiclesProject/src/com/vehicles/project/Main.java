package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static Wheel createWheel(int numWhell) {
		System.out.print("Brand wheel #" + numWhell + ": ");
		String brand = scanner.nextLine();
		System.out.print("Diameter wheel #" + numWhell + ": ");
		double diameter = scanner.nextDouble();
		scanner.nextLine();
		return new Wheel(brand, diameter);
	}

	public static void main(String[] args) {
		System.out.println("** Enter data of a vehicle **");
		System.out.print("Plate: ");
		String plate = scanner.nextLine();
		System.out.print("Brand: ");
		String brand = scanner.nextLine();
		System.out.print("Color: ");
		String color = scanner.nextLine();
		Car car = new Car(plate, brand, color);
		System.out.println();
		System.out.println("- Back wheels");
		List<Wheel> backWheels = new ArrayList<Wheel>();
		backWheels.add(createWheel(1));
		backWheels.add(createWheel(2));
		System.out.println();
		System.out.println("- Front wheels");
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		frontWheels.add(createWheel(1));
		frontWheels.add(createWheel(2));
		
		System.out.println("Car created correctly.!");
		try {
			car.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			System.err.println("There are different wheels.!");
		}
	}

}
