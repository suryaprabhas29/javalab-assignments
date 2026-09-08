package asspoly.com;

import java.util.Scanner;

public class Car extends Vehicle {
	int seats;

	public Car(String vehicleNo, String brand, double rentPerDay, int seats) {
		super(vehicleNo, brand, rentPerDay);
		this.seats = seats;
	}
	
	void calculateRentAmount() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("No.of Days : ");
		int noofDays=s.nextInt();
		
		System.out.print("Insurance Charge : ");
		double insuranceCharge=s.nextDouble();
		
		double rentAmount;
		rentAmount=(rentPerDay*noofDays)+insuranceCharge;
		System.out.println("Total Rent Amount : "+rentAmount);
		
	}
	
	void displayCar() {
		System.out.println("Car Rental Details :");
		displayVehicle();
		calculateRentAmount();
		System.out.println("No.of Seats : "+seats);
		
	}
	
}
