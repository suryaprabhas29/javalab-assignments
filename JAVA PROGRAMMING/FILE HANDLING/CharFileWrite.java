package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharFileWrite {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Write data to file :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		FileWriter fw=new FileWriter("java.txt");
		
		for(int i=0;i<str.length();i++) {
			fw.write(str.charAt(i));
		}
		
		fw.close();
		System.out.println("Data Written to file Successfully");
		sc.close();
		
	}

}
