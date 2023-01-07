package Oppsmethod;

import java.util.Scanner;

public class TestOpearations16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Enter 1st Number");
		int s1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int s2=sc.nextInt();
		System.out.println("Enter 3rd Number");
		int s3=sc.nextInt();
		System.out.println("Enter 4th Number");
		int s4=sc.nextInt();
		
		
		operations op = new operations();
		
		int m1 = op.big(s1,s2);
		int m2 = op.big(m1, s3);
		int m3 = op.big(m2, s4);
		
		//int m=op.big( s1 , op.big(s2, s3));
		System.out.println(m2);
	}

}
