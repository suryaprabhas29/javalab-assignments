package com.java.assignment3;
import java.util.*;

public class CountEvenAndOdd {
	static int cunteven(int[] value) {
		int evencount=0;
		for(int i=0;i<value.length;i++) {
			if(value[i]%2==0) {
				evencount+=1;
			}
		}
		return evencount;
	}
	static int cuntodd(int[] value) {
		int oddcount=0;
		for(int i=0;i<value.length;i++) {
			if(value[i]%2!=0) {
				oddcount+=1;
			}
		}
		return oddcount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Write a Java program to read n integers into an array in the main() method and count the number of even and odd elements. Use a static method to perform the required logic. Pass the array as a parameter to the method and return the even and odd counts to the main() method. Display both counts.
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE INTEGER LENGTH  :");
		int arr = sc.nextInt();
		int [] value = new int[arr];
	
		for(int i=0;i<arr;i++) {
			value[i] =sc.nextInt();	
		}
		
		System.out.println("the number of even elements"+cunteven(value));
		System.out.println("the number of odd elements"+cuntodd(value));

	}

}
