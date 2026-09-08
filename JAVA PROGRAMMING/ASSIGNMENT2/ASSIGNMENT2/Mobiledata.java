package samplejava;

import java.util.Scanner;
public class Mobiledata {
	public static int calculateCharge(double data) {
		int charge;
		if(data>10) {
			charge=350;
		}else if(data>5) {
			charge=200;
		}else if(data>1) {
			charge=100;
		}else {
			charge=50;
		}
		return charge;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Data Usage in GB : ");
		double data=sc.nextDouble();
		int charge=calculateCharge(data);
		System.out.println("Charge for "+data+" GB is : "+charge);
		
		sc.close();

	}

}
