package oppsexm;


/*

1.take input for " how many numbers"
2.take input for "what are the numbers"

i/p:
how many numbers : 5
what are the numbers :
20
30
15
12
14


o/p:
sum : 91

*/

import java.util.Scanner;

public class exm7 {

	public static void main(String[] args) {
		
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("how many number: ");
		int num = sc.nextInt();
		int sum  = 0;
		
		for (int i=0; i<num;i=i+1)
	    {		
			System.out.println("Enter Number: "+ (i+1));
			int num1 = sc.nextInt();
			sum = sum + num1;
			
		}
		
		System.out.println("sum = " +sum);

	}

}
