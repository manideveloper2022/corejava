package StringExm;

import java.util.Scanner;

public class exm14 {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();
		
		boolean check2 = input.startsWith("Hi");
		
		
		System.out.println(check2);
		
	}

}
