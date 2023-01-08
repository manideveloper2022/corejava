package loops;

import java.util.Scanner;


/*
 
.input 3:

O/p:
1 2 3
4 5 6
7 8 9

 */

public class exm25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int input = sc.nextInt();
        int p=1;
		for(int i= 1; i<=input; i++)
		{
			for(int j= 1; j<=input; j++)
			{
				System.out.print(" " + p);  
				p++;
			}
			System.out.println(); 
		}	
		

	}

}
