package com.java.assignment3;
import java.util.Scanner;

public class PrimeNumber {
	static boolean isprime(int num) {
		int cnt=0;
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				cnt++;
				if(num/i!=i) {
					cnt++;
				}
			}
			if (cnt>2) {
				return false;
			}
			
		}
		return cnt==2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		System.out.println(isprime(num));
			
		

	}

}
