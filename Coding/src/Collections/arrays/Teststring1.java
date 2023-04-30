package Collections.arrays;
import java.util.Scanner;
public class Teststring1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Names");
		int input =sc.nextInt();
		String[] s= new String[input];
		for (int x=0; x<input; x++) {
			System.out.println("Enter Name: "+ (x+1));
			String name = sc.next();
			s[x] = name;
		}
		System.out.println("*-*-*-*-*-*-*-*-*-*----Read All----*-*-*-*-*-*-*-*-*-*");
		for (String x:s) {
		System.out.println(x);
		}
	}
}
