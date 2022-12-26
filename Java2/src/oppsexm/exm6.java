package oppsexm;

import java.util.Scanner;

public class exm6 {

	public static void main(String[] args) {


		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int input = sc.nextInt();

		
		for( int i=1; i<=10  ; i= i+1) {
			int res = input * i;
			System.out.println(  input + " * " + i +" = " +res);
			  
		}
		
		
	}

}
