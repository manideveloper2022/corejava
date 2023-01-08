package loops;

import java.util.Scanner;



/* i/p:5
O/p:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

public class exm23 {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	 
	System.out.println("Enter the number ");
	int input = sc.nextInt();
	
	
	for (int i = 1; i <= input; i++)	{

	        for (int j = input; j >= i; j--)	{

	        System.out.print(j + " ");

	        }

	System.out.println();

	}
	
	}

}
