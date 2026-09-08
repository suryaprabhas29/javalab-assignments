package samplejava;

import java.util.Scanner;
public class Studentgradecalculation {
	public static char calculategrade(int marks) {
		char grade;
		if(marks>=90) {
			grade='A';
		}else if(marks>=75) {
			grade='B';
		}else if(marks>=60) {
			grade='C';
		}else if(marks>=50) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
	}


	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Marks : ");
		int m=sc.nextInt();
		
		char grade=calculategrade(m);
		System.out.println("Grade :"+grade);
		sc.close();

	}

}
