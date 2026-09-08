package samplejava;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("principle:");
		int P = sc.nextInt();
		
		System.out.print("time:");
		int T = sc.nextInt();
		
		System.out.print("Rate:");
		int R = sc.nextInt();
	
	double SI = (P*T*R)/100;
	System.out.println("Simple intrest = " +SI);
	sc.close();
	}

}
