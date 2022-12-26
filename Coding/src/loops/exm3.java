package loops;

import java.util.Scanner;

/*
1.take the input for a number
2.print the factorial of a number
i/p: 5
o/p: 15 ( 1 + 2 + 3 + 4 +5)

*/


public class exm3 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number ::");
		int input = sc.nextInt();
		
		
	     int sum=0;
		 for(int i=1;i<=input;i++){
		    sum =i+ sum;
		 }
		 System.out.println("total is " +sum);
	}

}
