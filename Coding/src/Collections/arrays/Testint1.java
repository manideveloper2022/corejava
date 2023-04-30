package Collections.arrays;

import java.util.Scanner;

public class Testint1 {

	public static void main(String[] args) {
		
		int nums[] ={1,3,5,6,8};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int input= sc.nextInt();
		
	
		boolean found = false;
	
		for( int x : nums) {
			if(input == x) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		
		
		
		
		
	}
	
}












/*
for (int x : nums1) {
System.out.println(x);	
}*/
