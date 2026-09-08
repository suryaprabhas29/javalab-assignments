package cdac.com;

import java.util.Scanner;
public class Voteeligibile {
	public static boolean isEligible(int age) {
		boolean eligibility;
		if(age>=18) {
			eligibility= true;
		}else {
			eligibility= false;
			}
		return eligibility;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Age =");
		int age=sc.nextInt();
		
		boolean eligibility=isEligible(age);
		System.out.println("Eligible for vote : "+eligibility);
		
		sc.close();

	}

}
