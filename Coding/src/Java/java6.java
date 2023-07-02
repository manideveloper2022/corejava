package Java;
import java.util.Scanner;
public class java6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int x =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int y =sc.nextInt();
		if(x>y) 
				System.out.println("X is Greater");
			
		else
				System.out.println("Y is Greater");
	}
}
