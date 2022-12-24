package Conditionsexm;

import java.util.Scanner;

public class exm3 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		 
		System.out.println("Enter string1: ");
		String a = sc.next();
		
		System.out.println("Enter string2: ");
		String b = sc.next();
		
		 /*
	 	if( a == b) {
			System.out.println("strings are equal.");
		}else {
			System.out.println("strings are not equal.");
		}
	  */
	  //don't use == for comparing two strings
	// use "equals()" method for comparing two strings


	  
	  	if( a.equals( b)) {
			System.out.println("strings are equal.");
		}else {
			System.out.println("strings are not equal.");
		}
		
		
	}
	
	
}
