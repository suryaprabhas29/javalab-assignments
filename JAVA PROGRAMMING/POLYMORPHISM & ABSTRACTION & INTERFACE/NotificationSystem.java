package interfaces;

public class NotificationSystem {

	public static void main(String[] args) {
		
		EmailNotification e = new EmailNotification("harsha123@gmail.com","Account Update");
		System.out.println("---Email Notification---");
		System.out.println("Mail : "+e.emailid);
		System.out.println("Subject : "+e.subject);
		e.sendNotification("Account Update");
		e.showStatus();
		
		SMSNotification s=new SMSNotification("9126345678","Airtel");
		System.out.println("\n---SMS Notification---");
		System.out.println("Mobileno : "+s.mobileno);
		System.out.println("Provider : "+s.provider);
		s.sendNotification("Account Update");
		s.showStatus();
		
		PushNotification p=new PushNotification("DAC70","Eclipse");
		System.out.println("\n---Push Notification---");
		System.out.println("Deviceid: "+p.deviceid);
		System.out.println("App name : "+p.appname);
		s.sendNotification("Account Update");
		s.showStatus();
		
	
	
	
	
	}

}
