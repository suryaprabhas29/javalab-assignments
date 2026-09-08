package inheritance;

class Employee{
	int empId;
	String empName;
	float sal;
	static String companyName="TCS";
	Employee(int empId, String empName, float sal) {
	
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	
	void displayEmployee() {
		System.out.println("EmployeeId : "+empId);
		System.out.println("Emp Name :"+empName);
		System.out.println("Salary :"+sal);
		System.out.println("Company Name :"+companyName);
	}
}

class Manager extends Employee{
	String depart;
	int teamSize;

	Manager(int empId, String empName, float sal,String depart,int teamSize) {
		super(empId, empName, sal);
		this.depart=depart;
		this.teamSize=teamSize;
	}
	void displayManger() {
		
		System.out.println("Department :"+depart);
		System.out.println("Team Size :"+teamSize);
	}
	void display() {
		displayEmployee();
		displayManger();
	}
		
}

public class CompanySimpleInheritance {

	
	public static void main(String[] args) {
		Manager m1=new Manager(101,"Harsha",50000,"HR",10);
		Manager m2=new Manager(102,"Vardhan",75000,"Sales",7);
		Manager m3=new Manager(103,"Surya",90000,"Marketing",8);
		
		m1.display();
		m2.display();
		m3.display();
			
	}

}
