package samplejava;
import java.util.Scanner;
public class Electricitybill {

	public static double calculatebill(int units) {
		double bill;
		if(units<=100) {
			bill=(units*2);
		}else if(units<=200) {
			bill=(100*2)+((units-100)*3);
		}else if(units<=300) {
			bill=(100*2)+(100*3)+((units-200)*5);
		}else {
			bill=(100*2)+(100*3)+(100*5)+((units-300)*7);
		}
		return bill;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Units :");
		int units=sc.nextInt();
		
		double bill=calculatebill(units);
		System.out.print("Electricity bill ="+bill);
		
		sc.close();
	}
}
