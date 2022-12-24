package Conditionsexm;

import java.util.Scanner;

public class exm6 {

	public static void main(String[] args) {
		
		
		 
		 //take input for id , age , usertype
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id");
			int id = sc.nextInt();
			
			System.out.println("Enter age");
			int age = sc.nextInt();
			
			System.out.println("Enter usertype");
			String usertype = sc.next();
		  
		  
		  if(id<0 ) {
				  System.out.println("invalid id");
			}else if(age < 18) {
		  	//id is valid
		    //age is in valid
		    System.out.println("Id is valid");
				System.out.println("Age is invalid");
		  }else if (!usertype.equals("admin")) {
		  //id is valid
		   //age is valid
		   System.out.println("id is valid");
				System.out.println("age is valid");
				System.out.println("usertype is invalid");
		  
		  }else {
		  System.out.println("id is valid");
				System.out.println("age is valid");
				System.out.println("usertype is valid");
		  }	
		
		

	}

}
