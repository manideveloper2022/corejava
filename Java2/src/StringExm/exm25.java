package StringExm;

import java.util.Scanner;

public class exm25 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 String mainString ="Hello india is my country";
			   
			String s1 = "Hello india is my country";
			String s2 = "india is my country";
			String s3 = "my country";
			String s4 = "hell how are you";
		  
		  
		    System.out.println(mainString.indexOf(s1));
			System.out.println(mainString.indexOf(s2));
			System.out.println(mainString.indexOf(s3));
			System.out.println(mainString.indexOf(s4));
		
			
			  // indexOf retuns the position number
			// if indexOf returns -1 , second string is not a substring of the 1st string
			// if indexOf returns >=0 , second string is a substring of the 1st string
			
		
	}
	
	
}
