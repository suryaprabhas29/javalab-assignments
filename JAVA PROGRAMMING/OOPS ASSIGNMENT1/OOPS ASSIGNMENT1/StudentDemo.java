package oops.com;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollNo=101;
		s1.name="Harsha";
		s1.marks=70;
		System.out.println("Student1 details:");
		s1.displayStudent();
		s1.calculateGrade();
		
		Student s2=new Student();
		s2.rollNo=102;
		s2.name="Prabhas";
		s2.marks=80;
		System.out.println("Student2 details:");
		s2.displayStudent();
		s2.calculateGrade();
		
		Student s3=new Student();
		s3.rollNo=103;
		s3.name="Surya";
		s3.marks=65;
		System.out.println("Student3 details:");
		s3.displayStudent();
		s3.calculateGrade();
	}
	

}
