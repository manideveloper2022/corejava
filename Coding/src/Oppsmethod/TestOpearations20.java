package Oppsmethod;

import java.util.Scanner;

public class TestOpearations20 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int s1 = sc.nextInt();
		
		
		operations op=new operations();
		
		op.numbers(s1);	

	}

}
