package Conditionsexm;


/*

Take number as input:

if number is equal to  1 , then print BLUE.
if number is equal to  2 , then print RED.
if number is equal to  3 , then print BLACK.
if number is equal to  4 , then print GREEEN.
For any other color print 'Invalid color'.

*/


import java.util.Scanner;

public class exm12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter Number:");
			int number = sc.nextInt();
		
		  	switch (number) {
		    
		    case 1:
					System.out.println("BLUE");
					break;
		      
		    case 2:
					System.out.println("RED");
					break;
		      
		    case 3:
					System.out.println("BLACK");
					break;
		      
			case 4:
					System.out.println("GREEN");
					break;
		      
				default:
					System.out.println("INVALID COLOR");
					break;
		    
		    
		    }
		
		

	}

}
