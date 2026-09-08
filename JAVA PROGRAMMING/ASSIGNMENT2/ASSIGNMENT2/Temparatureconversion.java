package samplejava;

import java.util.Scanner;
public class Temparatureconversion {
	public static float temparature(float C) {
		float F;
		F =((C*9)/5)+32;
		return F;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Celsius:");
		float C = sc.nextFloat();
		float F=temparature(C);
		System.out.println("Converting celsius to Farenheit");
		System.out.println("Farenheit:"+F);
		
		if(F>100) {
			System.out.println("Temparature is too high");
		}
		sc.close();

	}

}
