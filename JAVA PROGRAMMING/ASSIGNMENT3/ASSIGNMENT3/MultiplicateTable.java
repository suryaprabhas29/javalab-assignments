package samplejava;
import java.util.Scanner;
public class MultiplicateTable {
	public static void multiplicationtable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num=sc.nextInt();
		
		multiplicationtable(num);
		sc.close();
	}

}
