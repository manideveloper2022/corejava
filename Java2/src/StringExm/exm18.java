package StringExm;

import java.util.Scanner;

public class exm18 {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();


	//compare  two string with exact match ex:: comparing password
		boolean result = input.equals("india");
		
		
		System.out.println(result);
		
		
	}
	
	
}
