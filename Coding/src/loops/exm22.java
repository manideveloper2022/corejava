package loops;

import java.util.Scanner;

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
