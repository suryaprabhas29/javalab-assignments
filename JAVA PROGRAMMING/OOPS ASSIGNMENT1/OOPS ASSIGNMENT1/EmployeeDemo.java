package oops.com;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println("Enter Employee1 details : ");
		e1.read();
		System.out.println("Employee1 details : ");
		e1.display();
		e1.calculateBonus();
		
		
		Employee e2=new Employee();
		System.out.println("Enter Employee2 details : ");
		e2.read();
		System.out.println("Employee2 details : ");
		e2.display();
		e2.calculateBonus();

		
		Employee e3=new Employee();
		System.out.println("Enter Employee3 details : ");
		e3.read();
		System.out.println("Employee3 details : ");
		e3.display();
		e3.calculateBonus();

		
		Employee e4=new Employee();
		System.out.println("Enter Employee4 details : ");
		e4.read();
		System.out.println("Employee4 details : ");
		e4.display();
		e4.calculateBonus();

	}

}
