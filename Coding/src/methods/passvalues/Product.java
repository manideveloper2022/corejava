package methods.passvalues;

import java.util.Scanner;

public class Product {

	String name;
	String color;
	int size;
	String brand;
	float price;
	float discount;
	float finalprice;
	
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name");
		 name = sc.next();
		
		System.out.println("Enter Product Color");
		 color = sc.next();
		
		System.out.println("Enter Product Size");
		 size = sc.nextInt();
		
		System.out.println("Enter Product Brand");
		 brand = sc.next();
		
		System.out.println("Enter Product Price");
		 price = sc.nextFloat();
		
		System.out.println("Enter Product Discount");
		 discount = sc.nextFloat();
		
	}
	
	public void finalprice() {
	    finalprice = price-(price*discount/100);
		System.out.println("Final Price is " + finalprice);
	}
	 
}
