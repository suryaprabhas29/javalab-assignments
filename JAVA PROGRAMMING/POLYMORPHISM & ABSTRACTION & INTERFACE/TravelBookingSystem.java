package asspoly.com;

public class TravelBookingSystem {

	public static void main(String[] args) {
		BusBooking bb=new BusBooking(101,"Harsha","Bangalore","Anantapur",180,"express",7);
		bb.displayBusbooking();
		
		TrainBooking tb=new TrainBooking(291,"Surya","Anantapur","Chennai",250,100236,"sleeper");
		tb.displayTrainBooking();
		
	}

}
