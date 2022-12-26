package YTex;

import java.util.Scanner;

public class Exm2 {

	public static void main(String[] args) {
		
	
		      int numberOne, numberTwo, numberThree;
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.print("Enter the First Number: ");
		      numberOne = scan.nextInt();
		      System.out.print("Enter the Second Number: ");
		      numberTwo = scan.nextInt();
		      System.out.print("Enter the Third Number: ");
		      numberThree = scan.nextInt();
		      
		      if(numberOne > numberTwo && numberOne > numberThree)
		        {
		            System.out.println("Largest number is:"+numberOne);
		        }
		        else if(numberTwo > numberThree)
		        {
		            System.out.println("Largest number is:"+numberTwo);
		        }
		        else
		        {
		            System.out.println("Largest number is:"+numberThree);
		        }
		      
		     
		      
	} 
}
 