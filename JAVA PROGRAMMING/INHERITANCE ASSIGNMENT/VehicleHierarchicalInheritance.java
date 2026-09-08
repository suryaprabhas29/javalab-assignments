package inheritance;

class Vehicle{
	int vehicleNo;
	String brand;
	float price;
	static String Dealername = "Vehicledealername";
	public Vehicle(int vehicleNo, String brand, float price) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}
	void displayvehicle() {
		System.out.println("vehicle no:"+vehicleNo);
		System.out.println("brand:" +brand);
		System.out.println("price:" +price);
	}
}
class Car extends Vehicle{
	int numberofDoors;
	String Fueltype;
	public Car(int vehicleNo, String brand, float price, int numberofDoors, String Fueltype) {
		super(vehicleNo, brand, price);
		this.numberofDoors = numberofDoors;
		this.Fueltype = Fueltype;
	}
	void displayCar() {
		super.displayvehicle();
		System.out.println("Number of Doors:"+numberofDoors);
		System.out.println("Fuel type:"+Fueltype);
		insuranceCar();
	}
	void insuranceCar() {
		float insurance;
		float finalprice;
		insurance=price*0.08f;
		System.out.println("Insurance amount:"+insurance);
		finalprice=price+insurance;
		System.out.println("Final Price:"+finalprice);
	}
	
}
class Bike extends Vehicle{
	int engineCC;
	Boolean helmetIncluded;
	public Bike(int vehicleNo, String brand, float price, int engineCC, Boolean helmetIncluded) {
		super(vehicleNo, brand, price);
		this.engineCC = engineCC;
		this.helmetIncluded = helmetIncluded;
	}
	void displayBike() {
		super.displayvehicle();
		System.out.println("EngineCC:" +engineCC);
		System.out.println("helmetIncluded:" +helmetIncluded);
		insuranceBike();
	}
	void insuranceBike() {
		float insurance;
		float finalprice;
		insurance=price*0.05f;
		System.out.println("Insurance amount:"+insurance);
		finalprice=price+insurance;
		System.out.println("Final Price:"+finalprice);
	}
}

public class VehicleHierarchicalInheritance {

	public static void main(String[] args) {
		Car c = new Car(8055,"bmw",200000,4,"diesel");
		Bike b = new Bike(9999,"Royal Enfield",300000,550,true);
		c.displayCar();
		b.displayBike();
	}
	
}
