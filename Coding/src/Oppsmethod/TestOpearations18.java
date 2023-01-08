package Oppsmethod;

//factorial

import java.util.Scanner;

public class TestOpearations18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Enter Number");
		int s1=sc.nextInt();
		
		operations op = new operations();
		
		int m=op.fact(s1);
		System.out.println(m);
	}

}