package methods.passvalues;

import java.util.Scanner;

public class Product {

	String name;
	String color;
	int size;
	String brand;
	int price;
	int discount;
	int finalprice;
	
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name");
		String name = sc.next();
		
		System.out.println("Enter Product Color");
		String color = sc.next();
		
		System.out.println("Enter Product Size");
		int size = sc.nextInt();
		
		System.out.println("Enter Product Brand");
		String brand = sc.next();
		
		System.out.println("Enter Product Price");
		int price = sc.nextInt();
		
		System.out.println("Enter Product Discount");
		int discount = sc.nextInt();
		
	}
	
	public void finalprice() {
	    finalprice = price-(price*discount)/100;
		System.out.println("Final Price is " + finalprice);
	}
	 
}
