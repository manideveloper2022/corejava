
package oppsexm;

import java.util.Scanner;

/*
1.take the input for a number
2.print the factorial of a number
i/p: 5
o/p: 120 ( 1 * 2 * 3 * 4 *5)

*/


public class exm4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number ::");
		int input = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = i * fact;
		}
		System.out.println("total is " + fact);

	}

}
