package cdac.com;

import java.util.Scanner;
public class Simplecalculator {
	public static double calculate(double a,double b,char operator) {
		
		if(operator=='+') {
			return a+b;
		}else if(operator=='-') {
			return a-b;
		}else if(operator=='*') {
			return a*b;
		}else if(operator=='/') {
			if(b==0) {
				System.out.println("Cannot divide by zero");
			}
			return a/b;
		}else {
			System.out.println("Invalid operator");
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("A = ");
		double a=sc.nextDouble();
		System.out.print("B = ");
		double b=sc.nextDouble();
		System.out.print("Enter operator(+,-,*,/) : ");
		char operator=sc.next().charAt(0);
		double res=calculate(a,b,operator);
		System.out.println("Result = "+res);
		
		sc.close();
	}

}
