package Oppsmethod;

import java.util.Scanner;

public class Testproduct3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			
			
			System.out.println("Enter ID:");
			int a1 = sc.nextInt();
			
			System.out.println("Enter Name:");
			String b1 = sc.next();
			
			System.out.println("Enter Catogry:");
			String c1 = sc.next();
			
			System.out.println("Enter Price:");
			float d1 = sc.nextFloat();
			
			Products p1 = new Products();
			

			p1.id= a1;
			p1.name=b1;
			p1.catogry = c1;
			p1.price = d1;
			
			System.out.println(p1.id);
			System.out.println(p1.name);
			System.out.println(p1.catogry);
			System.out.println(p1.price);
			
		}
		

	}

}
