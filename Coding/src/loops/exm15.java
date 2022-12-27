package loops;

import java.util.Scanner;

/*
don't take any size as input
take the numbers as input continuously.
find the sum of all input numbers.
if the sum reaches 100 then stop the program and print the final sum.
if the input number is negative then don't perform any sum

*/


public class exm15 {

	public static void main(String[] args) {
		
		 int sum =0;
			Scanner sc = new Scanner(System.in);
		  
		  
		  while(sum <= 100) {
		  System.out.println("Enter number: ");
				int num = sc.nextInt();
		  
		    if(num > 0) {
		     sum = sum + num;
		     }
		  
		  }
		  
		  
		  System.out.println("sum = " + sum);	
		

	}

}
