package asspoly.com;

import java.util.Scanner;
public class Vehicle {
	String vehicleNo;
	String brand;
	double rentPerDay;
	public Vehicle(String vehicleNo, String brand, double rentPerDay) {
		
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}
	void calculateRentAmount() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("No.of Days : ");
		int noofDays=s.nextInt();
		
		double rentAmount;
		rentAmount=rentPerDay*noofDays;
		System.out.println("Total Rent Amount : "+rentAmount);
		
	}
		
	void displayVehicle() {
		System.out.println("Vehicle No : "+vehicleNo);
		System.out.println("Brand : "+brand);
		System.out.println("Rent Per Day : "+rentPerDay);

	}
	
	
}
