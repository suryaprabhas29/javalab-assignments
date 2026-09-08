package interfaces;

public class SMSNotification implements Notification {
	String mobileno;
	String provider;
	public SMSNotification(String mobileno, String provider) {
		this.mobileno = mobileno;
		this.provider = provider;
	}
	public void sendNotification(String message) {
		System.out.println("message sent through SMS");
	}
	public void showStatus() {
		System.out.println("Message Status : SMS delivered ");
	}
}