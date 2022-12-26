package StringExm;

import java.util.Scanner;

public class exm23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();
	  
	  
	  

		   //how to find the substring for the given string : use substring() method
	    System.out.println(input.substring(0));//print from 1st char till end 
			System.out.println(input.substring(1));
			System.out.println(input.substring(2));
			System.out.println(input.substring(3));
			System.out.println(input.substring(4));
			System.out.println(input.substring(5));//print from 2nd char till end
			System.out.println(input.substring(6));
			System.out.println(input.substring(7));
			System.out.println(input.substring(8));
			System.out.println(input.substring(9));
	}
	
	
}
