package StringExm;

import java.util.Scanner;

public class exm20 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String ::");
		String input = sc.nextLine();


	String old ="kumar";
		String newStr ="shyam";
		
		String res1 = input.replaceAll(old, newStr);
		String res2 = input.replaceAll("kumar", "shyam");
		
		System.out.println(res2);
		
		
	}
	
	
}
