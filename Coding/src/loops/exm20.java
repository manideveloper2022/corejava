package loops;


/*
dont take any size as input
take words as input continuosly.
if word value == 'END' then stop the program
and print all the words

solution):
use while loop as we dont know the number of runs.

*/


import java.util.Scanner;

public class exm20 {

	public static void main(String[] args) {


		 //input
		   Scanner sc = new Scanner(System.in);
		   
		   
		    //process
		    String word ="";
		    String finalWords= "";
		    while(!word.equals("END")) {
		      
		        finalWords = finalWords + " " +word ;
		      	System.out.println("Enter word: ");
			    	word = sc.next();
		      
		      }
		      
		  
		  
		  //output
		  System.out.println("finalWords = " + finalWords);
		
		

	}

}
