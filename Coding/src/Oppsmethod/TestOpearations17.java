package Oppsmethod;


/*multipication table*/

import java.util.Scanner;

public class TestOpearations17 {

	public static void main(String[] args) {


Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int input = sc.nextInt();
		
		operations op=new operations();
		
		op.table(input);

	}

}
