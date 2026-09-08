package samplejava;

import java.util.Scanner;
public class Reversenumber {
	public static int reversedNumber(int num) {
		int reverse=0;
		while(num>0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int reversenum=reversedNumber(num);
		System.out.println("Reverse number of "+num+" is : "+reversenum);
		sc.close();
	}

}
