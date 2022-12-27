package loops;


/*
 * @author MRNB
 * 
 
 2.
i/p:5
O/p:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 *
 */

import java.util.Scanner;

public class exm21 {

	
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int input = sc.nextInt();
	    		
	    int number = 1;

	    for(int i = 1; i <= input; i++) {

	      for(int j = 1; j <= i; j++) {
	        System.out.print(number + " ");
	        number++;
	      }

	      System.out.println();
	    }
	  }
	
	
}
