package Oppsmethod;

import java.util.Scanner;

public class TestOpearations9 {
	  // method with i/p args and return value
	
	public static void main(String[] args) {
		
		
		/*
		
		operations op = new operations();
		
		int s = op.add(12, 18);
		System.out.println(s);
		*/
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int s1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int s2=sc.nextInt();
		
		operations op = new operations();
		
		int res1 = op.add(s1, s2);
	   		System.out.println(res1);
	}
}
