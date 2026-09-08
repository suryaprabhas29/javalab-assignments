package inheritance;

class Person{
	String name;
	int age;
	static String orgName="CGI";
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayPerson() {
		System.out.println("Person Name : "+name);
		System.out.println("Person Age : "+age);
	}
}


class Emp extends Person{
	int empId;
	float sal;
	public Emp(String name, int age, int empId, float sal) {
		super(name, age);
		this.empId = empId;
		this.sal = sal;
	}
	
	void displayEmployee() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Salary : "+sal);
		System.out.println("Organisation Name : "+orgName);
	}
}


class Mgr extends Emp{
	String depart;
	int teamSize;
	public Mgr(String name, int age, int empId, float sal, String depart, int teamSize) {
		super(name, age, empId, sal);
		this.depart = depart;
		this.teamSize = teamSize;
	}
	
	void calculateAnnualSalary() {
		float annualSalary;
		annualSalary=sal*12;
		System.out.println("Annual Salary : "+annualSalary);
	}

	void displayManager() {
		System.out.println("Department : "+depart);
		System.out.println("Team Size : "+teamSize);
	}
	
	void display() {
		displayPerson();
		displayEmployee();
		displayManager();
		calculateAnnualSalary();
	}
}


public class CompanyMultiInheritance {

	public static void main(String[] args) {
		
		Mgr m1=new Mgr("Harsha",23,101,50000,"IT",15);
		Mgr m2=new Mgr("Vardhan",25,102,100000,"HR",12);
		Mgr m3=new Mgr("Surya",29,103,75000,"Tech",10);
		
		
		m1.display();
		m2.display();
		m3.display();
	}

}
