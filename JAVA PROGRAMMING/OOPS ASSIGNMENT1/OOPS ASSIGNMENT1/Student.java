package oops.com;

public class Student {
	int rollNo;
	String name;
	int marks;
	void displayStudent() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);

	}
	void calculateGrade() {
		char Grade;
		if(marks>=90) {
			Grade='A';
		}else if(marks>=75) {
			Grade='B';
		}else if(marks>=60) {
			Grade='C';
		}else {
			Grade='D';
		}
		System.out.println("Grade of student : "+Grade);
	}

}
