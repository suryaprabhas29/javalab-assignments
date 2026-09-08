package asspoly.com;

public class TravelBooking {
	int bookingId;
	String passengerName;
	String source;
	String destination;
	double distance;
		
	public TravelBooking(int bookingId, String passengerName, String source, String destination, double distance) {
		
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}

	public double calculateFare() {
		double farePrice ;
		if(distance<=50) {
			farePrice=distance*2;
		}else {
			farePrice=distance*1.5;
		}
		return farePrice;
	}
		
	void displayTravelBooking() {
		System.out.println("Booking Id : "+bookingId);
		System.out.println("passengerName : "+passengerName);
		System.out.println("Source : "+source);
		System.out.println("Destination : "+destination);
		System.out.println("Distance : "+distance);
	}
}

