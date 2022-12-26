package oppsexm;

import java.util.Scanner;

/*
 * @author MRNB
 * 
 
 2.
Input = 5
O/p :
1
12
123
1234
12345
4

 *
 */
public class exm10 {

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
