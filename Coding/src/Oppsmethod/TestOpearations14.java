package Oppsmethod;

import java.util.Scanner;

public class TestOpearations14 {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int s1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int s2=sc.nextInt();
		
		
		operations op = new operations();
		
		int res5=op.div(s1, s2);
		System.out.println(res5);

	}

}
