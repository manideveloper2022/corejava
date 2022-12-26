package Conditionsexm;

import java.util.Scanner;

public class exm4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int a = sc.nextInt();
		
		System.out.println("Enter age: ");
		int b = sc.nextInt();
		
		System.out.println("Enter Usertype: ");
		String c = sc.next();

		if( a>0) {
			System.out.println("valid id");
		}else {
			System.out.println("not valid id");
		}
		if( b>18) {
			System.out.println("valid id");
		}else {
			System.out.println("not valid id");
		}
		if (c.equals("admin"))
		{
			System.out.println("valid usertype");
		}else {
			
			System.out.println("not valid usertype");
		}
		
		
		
		
	}

}
