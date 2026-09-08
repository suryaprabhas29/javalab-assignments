package cdac.com;

import java.util.Scanner;
public class Positivenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		double num=sc.nextDouble();
		
		if(num>0) {
			System.out.println("Given number is a Positive number");
		}else if(num<0) {
			System.out.println("Given number is a Negative number");
		}else {
			System.out.println("Given number is a zero");
		}
		sc.close();
	}

}
