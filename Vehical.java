package com.tka.CO;

public class Vehical {
	int vehicalId;
	String vehicalName;
	String brand;
	double price;
	float mileage;
	int speed;
	int modelYear;
	String fuelType;
	int engineCapacity;
	boolean isElectric;
	char vehicalType;

	public void displayVehicalDetails() {
		System.out.println("Vehical Id--->" + vehicalId);
		System.out.println("Vehical Name--->" + vehicalName);
		System.out.println("Brand--->" + brand);
		System.out.println("Price--->" + price);
		System.out.println("Mileage--->" + mileage);
		System.out.println("Speed--->" + speed);
		System.out.println("Model Year--->" + modelYear);
		System.out.println("Fuel Type--->" + fuelType);
		System.out.println("Engine Capacity--->" + engineCapacity);
		System.out.println("Is Electric--->" + isElectric);
		System.out.println("Vehical Type--->" + vehicalType);

	}

	void startVehical() {
		System.out.println(vehicalName + " is starting...");
	}

	void calculateMileage() {
		System.out.println("Mileage:" + mileage + "km/1");
	}

}
