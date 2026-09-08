package samplejava;
import java.util.Scanner;
public class ProductDiscount {

	public static double calculatefinalprice(double amount) {
		double discount;
		
		if(amount>=10000)
			discount=amount*0.2;
		else if(amount>=5000)
			discount=amount*0.1;
		else if(amount>=2000)
			discount=amount*0.05;
		else
			discount=amount;
		
		return discount;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pid:");
		int Pid = sc.nextInt();
		
		System.out.println("Pname:");
		String Pname = sc.next();
		
		System.out.println("Price:");
		double amount = sc.nextDouble();
		
		double discount = calculatefinalprice(amount);
		System.out.println("Discount amount:" +discount);
		
		double finalprice = amount - discount;
		System.out.println("Final Price:" + finalprice);
		sc.close();
	}

}
