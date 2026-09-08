package asspoly.com;

public class TrainBooking extends TravelBooking{
	int trainNumber;
	String coachType;
	
	public TrainBooking(int bookingId, String passengerName, String source, String destination, double distance,
			int trainNumber, String coachType) {
		super(bookingId, passengerName, source, destination, distance);
		this.trainNumber = trainNumber;
		this.coachType = coachType;
	}
	
	public double calculateFare() {
		double farePrice ;
		if(distance<=100){
			if (coachType.equals("AC")) {
				farePrice=distance*2.0;
			}else if(coachType.equals("sleeper")){
				farePrice=distance*1.75;
			}else {
				farePrice=distance*1.5;
			}
		}else if(distance<=200) {
			if (coachType.equals("AC")) {
				farePrice=distance*1.75;
			}else if(coachType.equals("sleeper")){
				farePrice=distance*1.5;
			}else {
				farePrice=distance*1.0;
			}
		}else {
			if (coachType.equals("AC")) {
				farePrice=distance*1.5;
			}else if(coachType.equals("sleeper")){
				farePrice=distance*1.0;
			}else {
				farePrice=distance*0.5;
			}
		}
		
		return farePrice;
	}
	
	void displayTrainBooking() {
		super.displayTravelBooking();
		System.out.println("Train No :"+trainNumber);
		System.out.println("Coach Type : "+coachType);
		System.out.println("Fare Price : "+calculateFare());
	}
}
