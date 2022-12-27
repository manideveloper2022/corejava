package loops;


/*
Reverse a string

i/p: kumar  

o/p: ramuk

*/


import java.util.Scanner;

public class exm17 {

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
		     System.out.println(reverse);

	}

}
