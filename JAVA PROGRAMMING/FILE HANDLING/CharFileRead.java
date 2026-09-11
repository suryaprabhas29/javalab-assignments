package collections;

import java.io.FileReader;
import java.io.IOException;

public class CharFileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("java.txt");
		System.out.println("Data read from file :");
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		int spaces=0;
		
		int ch;
		while((ch=fr.read())!=-1) {
			char c=(char)ch;
			System.out.print(c);
			
			if(Character.isUpperCase(c)) {
				upper++;
			}else if(Character.isLowerCase(c)) {
				lower++;
			}else if(Character.isDigit(c)) {
				digit++;
			}else if(c==' ') {
				spaces++;
			}else {
				special++;
			}
		}
		
		fr.close();
		System.out.println("\n\nUpper case Characters : "+upper);
		System.out.println("Lower case Characters : "+lower);
		System.out.println("Digits : "+digit);
		System.out.println("Special Characters : "+special);
		System.out.println("Spaces : "+spaces);
	}

}
