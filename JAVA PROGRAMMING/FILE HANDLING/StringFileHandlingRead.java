package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringFileHandlingRead {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("java.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			
//			1.count words
			String[] w=str.split(" ");
			System.out.println("\nNumber of Words : "+w.length);
			
//			2.count vowels  and  3.count consonants
			int vowels=0;
			int consonants=0;
			for(int i=0;i<str.length();i++) {
				char ch=Character.toLowerCase(str.charAt(i));
				if(ch>='a' && ch<='z') {
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
						vowels++;
					}else {
						consonants++;
					}
				}
			}
			System.out.println("Number of Vowels : "+vowels);
			System.out.println("Number of Consonants : "+consonants);
			
//			4. Find longest word
			String longest="";
			for(String ele:w) {
				if(ele.length()>longest.length()) {
					longest=ele;
				}
			}
			System.out.println("Longest word : "+longest);
			
//			5.Reverse the complete string
			String reverse="";
			for(int i=str.length()-1;i>=0;i--) {
				reverse=reverse+str.charAt(i);
			}
			System.out.println("Reverse string : "+reverse);
			
//			6.convert to uppercase
			String uppercase=str.toUpperCase();
			System.out.println("Uppercase : "+uppercase);
			
		}	
	}

}
