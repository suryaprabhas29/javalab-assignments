package asspoly.com;

import java.util.Scanner;

public class Bike extends Vehicle{
	int helmet;

	public Bike(String vehicleNo, String brand, double rentPerDay, int helmet) {
		super(vehicleNo, brand, rentPerDay);
		this.helmet = helmet;
	}
	
	void calculateRentAmount() {
		Scanner s=new Scanner(System.in);
		
		System.out.print("No.of Days : ");
		int noofDays=s.nextInt();
		
		System.out.print("Maintenance Charge : ");
		double maintenanceCharge=s.nextDouble();
		
		double rentAmount;
		rentAmount=(rentPerDay*noofDays)+maintenanceCharge;
		System.out.println("Total Rent Amount : "+rentAmount);
		
	}
	
	void displayBike() {
		System.out.println("Bike Rental Details :");
		displayVehicle();
		calculateRentAmount();
		System.out.println("No.of Helmets : "+helmet);
	}
}
