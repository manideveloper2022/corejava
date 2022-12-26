package Conditionsexm;


/*
take cityname as input 
 
 if cityname is "hyderabad"  or "chennai" or "bangalore" or "mumbai" 
 o/p=> service is provided
 
 if cityname is other than what is mentioned above 
 o/p => service is not provided. 
 
 
 */

import java.util.Scanner;

public class exm11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	  System.out.println("Enter City name:");
		String cn = sc.next();
		
	  //approch 1
	  	switch (cn) {
	    
	    case "hyderabad":
				System.out.println("service is provided");
				break;
	      
	    case "chennai":
				System.out.println("service is provided");
				break;
	      
	    case "bangalore":
				System.out.println("service is provided");
				break;
	      
		case "mumbai":
				System.out.println("service is provided");
				break;
	      
			default:
				System.out.println("service is not provided");
				break;
	    
	    
	    }
	  	
	  	
	  	//approch 2
	  	if (cn.equals("hyderabad")) {
			System.out.println("Service can be Provided");
		} else if (cn.equals("bangalore")) {
			System.out.println("Service can be Provided");
		} else if (cn.equals("chennai")) {
			System.out.println("Service can be Provided");
		} else if (cn.equals("mumbai")) {
			System.out.println("Service can be Provided");
		} else {
			System.out.println("service cannot be provided");
		}
		
	  	
	  	//approch 3
	  	if(cn.equals("Hyderabad")   ||
				cn.equals("Bangalore")   ||
				cn.equals("Chennai")    ||
				cn.equals("Mumbai")){
			System.out.println("Product can be delivered");
		}else{
			System.out.println("Product cannot be delivered.");
		}
		
	}

}
