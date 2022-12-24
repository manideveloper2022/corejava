package StringExm;

import java.util.Scanner;

public class exm16 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();
		//convert to upper
 String upperCase = input.toUpperCase();
		
		System.out.println(upperCase);
		
	}
	
}
