package oops.com;

import java.util.Scanner;

public class Employee {
	int empId;
	String empName;
	float salary;
	
	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emp Id : ");
		empId=sc.nextInt();
		System.out.println("Emp Name : ");
		empName=sc.next();
		System.out.println("Emp Salary : ");
		salary=sc.nextFloat();
	}
	
	void display() {
		System.out.println("ID : "+empId);
		System.out.println("Name : "+empName);
		System.out.println("Salary : "+salary);
	}
	
	void calculateBonus() {
		double Bonus;
		if(salary>=50000) {
			Bonus=salary*0.1;
		}else {
			Bonus=salary*0.05;
		}
		System.out.println("Bonus salary : "+Bonus);
	}
	

}
