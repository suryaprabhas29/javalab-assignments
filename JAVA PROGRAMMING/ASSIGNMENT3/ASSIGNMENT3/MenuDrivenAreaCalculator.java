package com.java.assignment3;
import java.util.Scanner;

public class MenuDrivenAreaCalculator {
	static double areacricle(int r) {
		return (3.14*r*r);
	}
	static double arearectangle(int length,int breath) {
		return length*breath;
	}
	static double areatriangle(int base,int height) {
		return 0.5*base*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("1 to areaof the cricle:");
			System.out.println("2 to areaof the Rectangle:");
			System.out.println("3 to areaof the Triangle:");
			System.out.println("4 to areaof the Exit:");
			System.out.println("enter your choice : ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter the radius of the cricle");
				int radius=sc.nextInt();
				System.out.println("area od cricle : "+ areacricle(radius));
				break;
			}
			case 2:{
				System.out.println("Enter the length :");
				int length=sc.nextInt();
				System.out.println("Enter the breath :");
				int breath=sc.nextInt();
				System.out.println("the Area od rectangle is : "+ arearectangle(length, breath));
				break;
			}
			case 3:{
				System.out.println("Enter the base :");
				int base=sc.nextInt();
				System.out.println("Enter the height :");
				int height=sc.nextInt();
				System.out.println("the Area od rectangle is : "+ areatriangle(base, height));
				break;
			}
			case 4:{
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Enter the correct choice: ");
			}	
			
			}
		}

	}

}
