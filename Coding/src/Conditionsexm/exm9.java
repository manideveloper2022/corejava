package Conditionsexm;

import java.util.Scanner;

public class exm9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter AGE");
		int age = sc.nextInt();
		System.out.println("Enter Usertype");
		String ut = sc.next();
		
		
		// Approch no 1
		
		 if(id>0) {
				if(age>18) {
					if(ut.equals("admin")) {
	        	System.out.println("valid data");
					}else {
						System.out.println("invalid data");
					}
				}else {
					System.out.println("invalid data");
				}
			}else {
				System.out.println("invalid data");
			}
		
		// approach2
		 if(id >0  && age >18 && ut.equals("admin")) {
				System.out.println("valid data");
			}else {
				System.out.println("invalid data");
			}
	    
	    
		// approach3
			if(id <=0  ||  age <18 || !ut.equals("admin")) {
				System.out.println("invalid data");
			}else {
				System.out.println("valid data");
			}
	    
	    
	    // approach4
			if (!(id > 0 && age > 18 && ut.equals("admin"))) {
				System.out.println("invalid data");
			} else {
				System.out.println("valid data");
			}
	    
	    
	    	// approach5
			if (!(id < 0 || age < 18 || !ut.equals("admin"))) {
				System.out.println("Valid data");
			} else {
				System.out.println("invalid data");
			}
		 
		 
	}

}
