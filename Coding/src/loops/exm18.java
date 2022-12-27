package loops;


/*
Find whether reverse string is equal to actual string.

reverse value == original value  ====> palindrome

i/p: abcba  
o/p: palindrome

i/p: apple
o/p: not palindrome


*/


import java.util.Scanner;

public class exm18 {

	public static void main(String[] args) {
		
		 //input
		 Scanner sc = new  Scanner(System.in);
				System.out.println("enter a string: ");
				String str1 = sc.next();
		 	String reverse = "";
		 
		 //process
		 
		 int len = str1.length();
		 for(int i=len-1 ; i >=0 ; i--) {
		  String ch = ""+str1.charAt(i);
		  reverse = reverse + ch;
		 }
		 
		 
		 //output
		   
				//check
				if(str1.equals(reverse)) {
					System.out.println("string is palindrome");
				}else {
					System.out.println("string is not palindrome");
				}
		

	}

}
