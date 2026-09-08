package samplejava;

import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		double a=sc.nextInt();
		System.out.println("Enter B :");
		double b=sc.nextInt();
		if(a>b) {
			System.out.println("A is Largest");
		}else if(a==b){
			System.out.println("A and B are equal");
		}else {
			System.out.println("B is Lagest");
		}
		sc.close();
	}

}
