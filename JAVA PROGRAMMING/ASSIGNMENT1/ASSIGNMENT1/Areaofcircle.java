package samplejava;

import java.util.Scanner;
public class Areaofcircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius :");
		float r=sc.nextFloat();
		
		double area=Math.PI*r*r;
		System.out.println("Area of given Circle is:"+area);
		double circum=2*Math.PI*r;
		System.out.println("Circumference of given Circle is :"+circum);
		
		sc.close();
	}

}
