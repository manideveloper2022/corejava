package StringExm;

import java.util.Scanner;

public class exm24 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();
	  
	  
	  
		System.out.println(input.substring(0,1));//from 0 to 0
			System.out.println(input.substring(0,2));//from 0 to 1
			System.out.println(input.substring(0,3));//from 0 to 2
			
			System.out.println(input.substring(3,7));//from 3 to 6
			
			System.out.println(input.substring(5,10));//from 5 to 9
			
		System.out.println("sub string from 6 to 10:: "+input.substring(5, 10));
		System.out.println("sub string from 6 to end:: "+input.substring(5));
		
		
	}
	
}
