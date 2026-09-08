package asspoly.com;

public class BusBooking extends TravelBooking{
	String busType;
	int seatNumber;
	
	
	public BusBooking(int bookingId, String passengerName, String source, String destination, double distance,
			String busType, int seatNumber) {
		super(bookingId, passengerName, source, destination, distance);
		this.busType = busType;
		this.seatNumber = seatNumber;
	}


	public double calculateFare() {
		double farePrice ;
		if (distance<=100) {
			if(busType.equals("sleeper")) {
				farePrice=distance*2.0;
			}else {
				farePrice=distance*1.5;
			}
		}else if(distance<=200) {
			if(busType.equals("sleeper")) {
				farePrice=distance*1.5;
			}else {
				farePrice=distance*1.25;
			}
		}else {
			farePrice=distance*1.0;
		}
		return farePrice;
	}
	
	void displayBusbooking() {
		super.displayTravelBooking();
		System.out.println("Bus Type : "+busType);
		System.out.println("Seat Number : "+seatNumber);
		System.out.println("Fare Price : "+calculateFare());
		
	}
}
