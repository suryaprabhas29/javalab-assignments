package com.java.assignment3;
import java.util.Scanner;

public class StudentMarksAnalysis {
	
	static double[] marksanalysis(int[] marks) {
		int total=0;
		int highest=marks[0];
		int lowest=marks[0];
		int average=0;
		for(int i=0;i<marks.length;i++) {
			total+=marks[i];
			average=total/(i+1);
			if(marks[i]>highest) {
				highest=marks[i];
			}else if(marks[i]<lowest) {
				lowest=marks[i];
			}
		}
		double[] res= {total,average,highest,lowest};
		return  res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student : ");
		int numstud=sc.nextInt();
		int[] marks=new int[numstud];
		for(int i=0;i<numstud;i++) {
			marks[i]=sc.nextInt();
		}
		double[] result=marksanalysis(marks);
		System.out.println("the total marks : "+result[0]+"\nthe average : "+result[1]+"\nthe highest marks : "+result[2]+"\nthe lowest marks : "+result[3]);

	}

}
