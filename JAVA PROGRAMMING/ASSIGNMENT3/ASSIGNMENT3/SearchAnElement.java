package com.java.assignment3;
import java.util.Scanner;


public class SearchAnElement {
	
	static int searchelement(int[] arr,int searchnum) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchnum) {
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int sizearr=sc.nextInt();
		int[] arr=new int[sizearr];
		System.out.println("enetr the numbers in array : ");
		for (int i = 0; i < sizearr; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.println("Enter the element to search : ");
		int searchnum=sc.nextInt();
		int postion=searchelement(arr,searchnum);
		if(postion!=-1) {
			System.out.println("the element is presennt in the position of "+postion);
		}
		else{
			System.out.println("the is search element not present");
		}

	}

}
