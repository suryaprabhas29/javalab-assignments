package cdac.com;

import java.util.Scanner;
public class Busticket {
	public static int calculateFare(int age) {
		int fare;
		if(age<5) {
			fare=0;
		}else if(age<=12) {
			fare=20;
		}else if(age<=59) {
			fare=40;
		}else {
			fare=25;
		}
		return fare;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String pname = sc.next();
		int age=sc.nextInt();
		int fare=calculateFare(age);
		
		System.out.println("Passenger Name :"+pname);
		System.out.println("Age :"+age);
		System.out.println("Fare :"+fare);
		
		sc.close();
		
	}

}
