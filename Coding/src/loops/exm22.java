package loops;

import java.util.Scanner;


/* 

 I/p: 5
 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 
*/


public class exm22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print (" " + j);
			}
			System.out.println();
		}
		

	}

}
