package interfaces;

public class PushNotification implements Notification {
	String deviceid;
	String appname;
	
	public PushNotification(String deviceid, String appname) {
		this.deviceid = deviceid;
		this.appname = appname;
	}
	public void sendNotification(String message) {
		System.out.println("message sent through PushNotification");
	}
	public void showStatus() {
		System.out.println("Message Status : Notification delivered ");
	}
}