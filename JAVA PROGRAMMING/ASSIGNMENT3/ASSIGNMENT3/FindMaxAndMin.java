package com.java.assignment3;
import java.util.Scanner;


public class FindMaxAndMin {
	
	static int[] maxmin(int[] numarr) {
		int max=numarr[0];
		int min=numarr[0];
	for(int i=0 ;i<numarr.length;i++) {
		if(numarr[i]>max) {
			max=numarr[i];
		}
		else if(numarr[i]<min){
			min=numarr[i];
		}
		
	}
	return  new int[] {max,min};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the the size od trhe array: ");
		int sizeArr=sc.nextInt();
		int[] numarr= new int[sizeArr];
		if (sizeArr <= 0) {
            System.out.println("Invalid array size! Size must be greater than 0.");
            return;
        }
		System.out.println("the number in array");
		
		for(int i=0;i<sizeArr;i++) {
			numarr[i]=sc.nextInt();
		}
		int[] res=maxmin(numarr);
		
		System.out.println("the max number in array "+res[0]+"\nthe min number in array : "+res[1]);
		

	}

}
