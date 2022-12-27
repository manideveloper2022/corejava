package loops;


/*
Reverse a number

i/p: 12345

o/p: 54321



ex:
int i= 1234;

int x = i/10; // 123 (quotient)
int y = i%10; //4 (remainder)


*/


import java.util.Scanner;

public class exm19 {

	public static void main(String[] args) {

		  //input
	  	Scanner sc = new  Scanner(System.in);
			System.out.println("enter a number: ");
			int num = sc.nextInt();
	  
	   	int reverse =0;
	    //process
	    
	    	while(num!=0) {
	         int rem = num%10;
	         reverse = reverse * 10 + rem;
	          
	          
	          num = num/10;
	        	System.out.println("Remainder == " +rem   +" ,  sofar reverse ="+reverse); 
	      
	      }
	  
	  
	  
	  //output
	  	System.out.println("Final == " + reverse);

	}

}
