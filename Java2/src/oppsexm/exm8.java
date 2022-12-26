package oppsexm;

import java.util.Scanner;

public class exm8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("how many number: ");
		int num = sc.nextInt();
		int big = 0;

		for (int i = 0; i < num; i = i + 1) {
			System.out.println("Enter Number: " + (i + 1));
			int num1 = sc.nextInt();
		}

		System.out.println("sum = " + big);

	}

}
