package cdac.com;

import java.util.Scanner;
public class Largernumber {
	public static String findLargest(double a, double b) {
		String largernumber;
		if(a>b) {
			largernumber="A";
		}else if(a<b) {
			largernumber="B";
		}else {
			largernumber="equal";
		}
		return largernumber;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("A =");
		double A=sc.nextDouble();
		
		System.out.print("B =");
		double B=sc.nextDouble();
		
		String largernumber=findLargest(A,B);
		System.out.println("Largest number is : "+largernumber);
		sc.close();
			
	}

}
