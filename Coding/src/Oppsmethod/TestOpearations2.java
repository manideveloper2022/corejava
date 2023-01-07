package Oppsmethod;

import java.util.Scanner;

public class TestOpearations2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter String");
		String s1= sc.next();
		
		operations op= new operations();

		op.process(s1);
		
	}

}
