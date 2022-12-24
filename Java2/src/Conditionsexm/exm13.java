package Conditionsexm;

import java.util.Scanner;

/*
Find big of three numbers.
 */


public class exm13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		 
		System.out.println("Enter Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Number 3: ");
		int num3= sc.nextInt();
		
		
		
		//approach 1
		
		if (num1>num2)
		{
			System.out.println("Number 1 is BIG");
		}else if (num2>num3)
		{
			System.out.println("Number 2 is BIG");
		}else
		{
			System.out.println("Number 3 is BIG");
		}
		
		
		
		//approach 2
		
		System.out.println("Enter three numbers ::");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
    int n4 = sc.nextInt();

    
    //process
		int big = n1;


	//compare with n2
		if(n2 > big) {
			big = n2;
		}
	
  
  //compare with n3
		if(n3 > big) {
			big = n3;
		}
    
    
    //compare with n4
		if (n4 > big) {
			big = n4;
		}
		
    
		//output
		System.out.println("Big = " + big);
		
		

	}

}
