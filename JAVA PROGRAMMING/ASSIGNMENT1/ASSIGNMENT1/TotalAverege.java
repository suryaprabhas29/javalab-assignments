package samplejava;
import java.util.Scanner;
public class TotalAverege {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("java :");
		int jmark=sc.nextInt();
		System.out.println("python :");
		int pmark=sc.nextInt();
		System.out.println("C :");
		int cmark=sc.nextInt();
		
		int total=jmark+pmark+cmark;
		System.out.println("Total marks ="+total);
		float avg = total/3;
		System.out.println("Äverage:" +avg);
		sc.close();
	}

}
