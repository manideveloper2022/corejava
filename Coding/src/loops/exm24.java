package loops;

import java.util.Scanner;

/*
I/p : 5

O/p

5  
 
5 4  
 
5 4 3  
 
5 4 3 2  
 
5 4 3 2 1 

 */

public class exm24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++)	{
	        for (int j = 1; j <= i; j++)	{
	          System.out.print(input - j + 1  + " ");
	        }

	System.out.println( );

	}
		

	}

}
