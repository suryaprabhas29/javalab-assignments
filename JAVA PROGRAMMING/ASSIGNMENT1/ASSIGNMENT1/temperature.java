package samplejava;
import java.util.Scanner;
public class temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Celsius:");
	float C = sc.nextFloat();
	
	float F =((C*9)/5)+32;
	System.out.println("Converting celsius to Farenheit");
	System.out.println("Farenheit:"+F);
	sc.close();
	
		

	}

}
