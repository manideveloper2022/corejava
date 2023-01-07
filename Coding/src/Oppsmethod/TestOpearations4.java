package Oppsmethod;

import java.util.Scanner;

public class TestOpearations4 {

	public static void main(String[] args) {


		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1= sc.next();
		System.out.println("Enter Number");
		int s2= sc.nextInt();
		
		
		operations op= new operations();
		
		
		op.process(s1);
		op.addten(s2);
		

	}

}
