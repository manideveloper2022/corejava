package StringExm;

import java.util.Scanner;

public class exm19 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();

	  //compare two string by ingnoring the case ex:: comparing user name 
			boolean res = input.equalsIgnoreCase("india");
		System.out.println(res);
		
		
		
		
	}
	
	
}
