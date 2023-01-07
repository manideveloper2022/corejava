package Oppsmethod;

import java.util.Scanner;

public class TestOperations5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int s1=sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int s2=sc.nextInt();
		
		operations op= new operations();
		
		op.sum(s1, s2);
		
		
			
		
	}

}
