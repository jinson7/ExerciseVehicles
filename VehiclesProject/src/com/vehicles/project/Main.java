package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Car car = null;
	private static Bike bike = null;
	
	public static Wheel createWheel() throws Exception {
		double diameter;
		System.out.print("Brand wheel: ");
		String brand = scanner.nextLine();
	
		System.out.print("Diameter wheel: ");
		diameter = scanner.nextDouble();
		scanner.nextLine();
		return new Wheel(brand, diameter);
	}
	
	public static void createWheels(List<Wheel> wheels, String type) throws Exception {
		System.out.println();
		System.out.println("- " + type);
		wheels.add(createWheel());
		wheels.add(createWheel());
	}
	
	public static void createVehicle(int option) {
		String typeVehicle = option == 1 ? "Car" : "Bike";
		System.out.println("** Enter data of a " + typeVehicle + " **");
		scanner.nextLine();
		System.out.print("Plate: ");
		String plate = scanner.nextLine();
		System.out.print("Brand: ");
		String brand = scanner.nextLine();
		System.out.print("Color: ");
		String color = scanner.nextLine();
		if (option == 1) createCar(plate, brand, color);
		else if (option == 2) createBike(plate, brand, color);
	}
	
	public static void createCar(String plate, String brand, String color) {
		List<Wheel> backWheels = new ArrayList<Wheel>();
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		try {
			car = new Car(plate, brand, color);
			createWheels(backWheels, "Back wheels");
			createWheels(frontWheels, "Front wheels");
			car.addWheels(frontWheels, backWheels);
			System.out.println(car.print());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void createBike(String plate, String brand, String color) {
		try {
			bike = new Bike(plate, brand, color);
			Wheel frontWheel = createWheel();
			Wheel backWheel = createWheel();
			bike.addWheel(frontWheel, backWheel);
			System.out.println(bike.print());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	
	public static void executar() {
		System.out.println("** Vehicles **");
		System.out.println("1. Car");
		System.out.println("2. Bike");
		System.out.println("0. Exit");
		System.out.print("Choose the vehicle you want to create: ");
		try {
			int option = scanner.nextInt();
			if (option < 0 || option > 2) throw new Exception("Incorrect option.!");
			if (option != 0) createVehicle(option);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		executar();
	}
}
