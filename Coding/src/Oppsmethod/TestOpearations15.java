package Oppsmethod;

import java.util.Scanner;

public class TestOpearations15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Enter 1st Number");
		int s1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int s2=sc.nextInt();
		System.out.println("Enter 3rd Number");
		int s3=sc.nextInt();
		
		
		operations op = new operations();
		
		int m=op.bigof3(s1, s2, s3);
		System.out.println(m);
	}

}
