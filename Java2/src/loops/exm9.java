package loops;

import java.util.Scanner;

/**
 * @author MRNB
 * 
 
 2.
Input = 5
O/p :
1
22
333
4444
55555

 *
 */
public class exm9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number: ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print (" " + i);
			}
			System.out.println();
		}
		System.out.println("");

	}

}
