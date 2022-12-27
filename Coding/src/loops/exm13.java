package loops;

import java.util.Scanner;

public class exm13 {

	public static void main(String[] args) {

		int sum =0;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 while(sum <= 100) {
		 
				 System.out.println("Enter number: ");
		 		 int num = sc.nextInt();
		     sum = sum + num;
		 
		 }
		 


			System.out.println("sum = " + sum);

	}

}
