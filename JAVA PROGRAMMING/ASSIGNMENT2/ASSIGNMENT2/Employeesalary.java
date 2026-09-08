package cdac.com;

import java.util.Scanner;
public class Employeesalary {
	public static double calculateSalary(double salary) {
		double finalsalary;
		if(salary>=50000) {
			finalsalary=salary+(salary*0.2);
		}else {
			finalsalary=salary+(salary*0.1);
		}
		return finalsalary;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Basic Salary : ");
		double salary=sc.nextDouble();
		double finalsalary=calculateSalary(salary);
		System.out.println("Final Salary : "+finalsalary);
		
		sc.close();
	}

}
