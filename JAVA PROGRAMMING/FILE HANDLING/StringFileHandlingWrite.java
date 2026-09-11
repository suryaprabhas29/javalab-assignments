package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringFileHandlingWrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("java.txt");
		System.out.println("Give a string input sentence :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		fw.write(str);
		
		fw.close();
	}

}
