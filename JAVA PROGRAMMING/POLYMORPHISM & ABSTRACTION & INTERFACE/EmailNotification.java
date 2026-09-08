package interfaces;

public class EmailNotification implements Notification {
	String emailid;
	String subject;
	public EmailNotification(String emailid, String subject) {
		this.emailid = emailid;
		this.subject = subject;
	}
	public void sendNotification(String message) {
		System.out.println("Message Sent through email");
	}
	public void showStatus() {
		System.out.println("Message Status : Email delivered ");
		
	}
}
